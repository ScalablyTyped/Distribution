package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents custom settings for a task pane or content add-in that are stored in the host document as name/value pairs.
  *
  * @remarks
  * <table><tr><td>Hosts</td><td>Access, Excel, PowerPoint, Word</td></tr>
  *
  * <tr><td>Requirement Sets</td><td>Settings</td></tr></table>
  * 
  * The settings created by using the methods of the Settings object are saved per add-in and per document. 
  * That is, they are available only to the add-in that created them, and only from the document in which they are saved.
  *
  * The name of a setting is a string, while the value can be a string, number, boolean, null, object, or array.
  *
  * The Settings object is automatically loaded as part of the Document object, and is available by calling the settings property of that object 
  * when the add-in is activated. 
  * 
  * The developer is responsible for calling the saveAsync method after adding or deleting settings to save the settings in the document.
  */
@js.native
trait Settings extends js.Object {
  /**
    * Adds an event handler for the settingsChanged event.
    *
    * **Important**: Your add-in's code can register a handler for the settingsChanged event when the add-in is running with any Excel client, but 
    * the event will fire only when the add-in is loaded with a spreadsheet that is opened in Excel Online, and more than one user is editing the 
    * spreadsheet (co-authoring). Therefore, effectively the settingsChanged event is supported only in Excel Online in co-authoring scenarios.
    *
    * @remarks
    *
    * <table><tr><td>Requirement Sets</td><td>Settings</td></tr></table>
    * 
    * You can add multiple event handlers for the specified eventType as long as the name of each event handler function is unique.
    *
    * @param eventType Specifies the type of event to add. Required.
    * @param handler The event handler function to add, whose only parameter is of type {@link Office.SettingsChangedEventArgs}. Required.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    * 
    * <table>
    *   <tr>
    *     <th>Property</th>
    *     <th>Use to...</th>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.value</td>
    *     <td>Always returns undefined because there is no data or object to retrieve when adding an event handler.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.status</td>
    *     <td>Determine the success or failure of the operation.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.error</td>
    *     <td>Access an Error object that provides error information if the operation failed.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.asyncContext</td>
    *     <td>A user-defined item of any type that is returned in the AsyncResult object without being altered.</td>
    *   </tr>
    * </table>
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                         </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
    *   <tr><td><strong> Access </strong></td><td>                            </td><td> Y                          </td><td>                 </td></tr>
    *   <tr><td><strong> Excel  </strong></td><td>                            </td><td> Y                          </td><td>                 </td></tr>
    *  </table>
    */
  def addHandlerAsync(eventType: EventType, handler: js.Any): scala.Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Any,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def addHandlerAsync(eventType: EventType, handler: js.Any, options: AsyncContextOptions): scala.Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Any,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Retrieves the specified setting.
    *
    * @remarks
    * <table><tr><td>Requirement Sets</td><td>Settings</td></tr></table>
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *  </table>
    *
    * @param settingName The case-sensitive name of the setting to retrieve.
    * @returns An object that has property names mapped to JSON serialized values.
    */
  def get(name: java.lang.String): js.Any = js.native
  /**
    * Reads all settings persisted in the document and refreshes the content or task pane add-in's copy of those settings held in memory.
    *
    * @remarks
    * 
    * <table><tr><td>Requirement Sets</td><td>Settings</td></tr></table>
    * 
    * This method is useful in Excel, Word, and PowerPoint coauthoring scenarios when multiple instances of the same add-in are working against 
    * the same document. Because each add-in is working against an in-memory copy of the settings loaded from the document at the time the user 
    * opened it, the settings values used by each user can get out of sync. This can happen whenever an instance of the add-in calls the 
    * Settings.saveAsync method to persist all of that user's settings to the document. Calling the refreshAsync method from the event handler 
    * for the settingsChanged event of the add-in will refresh the settings values for all users.
    *
    * In the callback function passed to the refreshAsync method, you can use the properties of the AsyncResult object to return the following 
    * information.
    * 
    * <table>
    *   <tr>
    *     <th>Property</th>
    *     <th>Use to...</th>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.value</td>
    *     <td>Access a Settings object with the refreshed values.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.status</td>
    *     <td>Determine the success or failure of the operation.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.error</td>
    *     <td>Access an Error object that provides error information if the operation failed.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.asyncContext</td>
    *     <td>A user-defined item of any type that is returned in the AsyncResult object without being altered.</td>
    *   </tr>
    * </table>
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
    *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td></tr>
    *  </table>
    *
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is an {@link Office.Settings} object with the refreshed values.
    */
  def refreshAsync(): scala.Unit = js.native
  def refreshAsync(callback: js.Function1[/* result */ AsyncResult[this.type], scala.Unit]): scala.Unit = js.native
  /**
    * Removes the specified setting.
    *
    * **Important**: Be aware that the Settings.remove method affects only the in-memory copy of the settings property bag. To persist the removal of 
    * the specified setting in the document, at some point after calling the Settings.remove method and before the add-in is closed, you must 
    * call the Settings.saveAsync method.
    *
    * @remarks
    * <table><tr><td>Requirement Sets</td><td>Settings</td></tr></table>
    * 
    * null is a valid value for a setting. Therefore, assigning null to the setting will not remove it from the settings property bag.
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *  </table>
    *
    * @param settingName The case-sensitive name of the setting to remove.
    */
  def remove(name: java.lang.String): scala.Unit = js.native
  /**
    * Removes an event handler for the settingsChanged event.
    *
    * @remarks
    *
    * <table><tr><td>Requirement Sets</td><td>Settings</td></tr></table>
    * 
    * If the optional handler parameter is omitted when calling the removeHandlerAsync method, all event handlers for the specified eventType 
    * will be removed.
    * 
    * When the function you passed to the callback parameter executes, it receives an AsyncResult object that you can access from the callback 
    * function's only parameter.
    * 
    * In the callback function passed to the removeHandlerAsync method, you can use the properties of the AsyncResult object to return the 
    * following information.
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                         </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
    *   <tr><td><strong> Access </strong></td><td>                            </td><td> Y                          </td><td>                 </td></tr>
    *   <tr><td><strong> Excel  </strong></td><td>                            </td><td> Y                          </td><td>                 </td></tr>
    *  </table>
    *
    * @param eventType Specifies the type of event to remove. Required.
    * @param options Provides options to determine which event handler or handlers are removed.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def removeHandlerAsync(eventType: EventType): scala.Unit = js.native
  def removeHandlerAsync(eventType: EventType, callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]): scala.Unit = js.native
  def removeHandlerAsync(eventType: EventType, options: RemoveHandlerOptions): scala.Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    options: RemoveHandlerOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Persists the in-memory copy of the settings property bag in the document.
    * 
    * @remarks
    * Any settings previously saved by an add-in are loaded when it is initialized, so during the lifetime of the session you can just use the 
    * set and get methods to work with the in-memory copy of the settings property bag. When you want to persist the settings so that they are 
    * available the next time the add-in is used, use the saveAsync method.
    *
    * **Note**: The saveAsync method persists the in-memory settings property bag into the document file. However, the changes to the document file 
    * itself are saved only when the user (or AutoRecover setting) saves the document to the file system. The refreshAsync method is only useful 
    * in coauthoring scenarios when other instances of the same add-in might change the settings and those changes should be made available to 
    * all instances.
    * 
    * <table>
    *   <tr>
    *     <th>Property</th>
    *     <th>Use to...</th>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.value</td>
    *     <td>Always returns undefined because there is no object or data to retrieve.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.status</td>
    *     <td>Determine the success or failure of the operation.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.error</td>
    *     <td>Access an Error object that provides error information if the operation failed.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.asyncContext</td>
    *     <td>A user-defined item of any type that is returned in the AsyncResult object without being altered.</td>
    *   </tr>
    * </table>
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *  </table>
    * 
    * @param options Provides options for saving settings.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def saveAsync(): scala.Unit = js.native
  def saveAsync(callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]): scala.Unit = js.native
  def saveAsync(options: SaveSettingsOptions): scala.Unit = js.native
  def saveAsync(
    options: SaveSettingsOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets or creates the specified setting.
    *
    * **Important**: Be aware that the Settings.set method affects only the in-memory copy of the settings property bag. 
    * To make sure that additions or changes to settings will be available to your add-in the next time the document is opened, at some point 
    * after calling the Settings.set method and before the add-in is closed, you must call the Settings.saveAsync method to persist settings in 
    * the document.
    *
    * @remarks
    * <table><tr><td>Requirement Sets</td><td>Settings</td></tr></table>
    * 
    * The set method creates a new setting of the specified name if it does not already exist, or sets an existing setting of the specified name 
    * in the in-memory copy of the settings property bag. After you call the Settings.saveAsync method, the value is stored in the document as 
    * the serialized JSON representation of its data type. A maximum of 2MB is available for the settings of each add-in.
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td> Y              </td></tr>
    *  </table>
    * 
    * @param settingName The case-sensitive name of the setting to set or create.
    * @param value Specifies the value to be stored.
    */
  def set(name: java.lang.String, value: js.Any): scala.Unit = js.native
}

