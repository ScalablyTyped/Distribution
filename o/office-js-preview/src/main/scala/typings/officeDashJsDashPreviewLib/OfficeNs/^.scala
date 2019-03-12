package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office")
@js.native
object ^ extends js.Object {
  /** A Promise object. Promises can be chained via ".then", and errors can be caught via ".catch". 
    * When a browser-provided native Promise implementation is available, Office.Promise will switch to use the native Promise instead.
    */
  var Promise: IPromiseConstructor = js.native
  /**
    * Gets the Context object that represents the runtime environment of the add-in and provides access to the top-level objects of the API.
    * 
    * @remarks
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this property is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this enumeration.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> OWA for Devices </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Outlook    </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *  </table>
    */
  var context: Context = js.native
  /**
    * Occurs when the runtime environment is loaded and the add-in is ready to start interacting with the application and hosted document. 
    * 
    * The reason parameter of the initialize event listener function returns an `InitializationReason` enumeration value that specifies how 
    * initialization occurred. A task pane or content add-in can be initialized in two ways:
    * 
    *  - The user just inserted it from Recently Used Add-ins section of the Add-in drop-down list on the Insert tab of the ribbon in the Office 
    * host application, or from Insert add-in dialog box.
    * 
    *  - The user opened a document that already contains the add-in.
    * 
    * *Note*: The reason parameter of the initialize event listener function only returns an `InitializationReason` enumeration value for task pane 
    * and content add-ins. It does not return a value for Outlook add-ins.
    * 
    * @remarks
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
    *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> OWA for Devices </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Outlook    </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *  </table>
    * 
    * @param reason Indicates how the app was initialized.
    */
  def initialize(reason: InitializationReason): scala.Unit = js.native
  /**
    * Ensures that the Office JavaScript APIs are ready to be called by the add-in. If the framework hasn't initialized yet, the callback or promise 
    * will wait until the Office host is ready to accept API calls. Note that though this API is intended to be used inside an Office add-in, it can 
    * also be used outside the add-in. In that case, once Office.js determines that it is running outside of an Office host application, it will call 
    * the callback and resolve the promise with "null" for both the host and platform.
    * 
    * @param callback - An optional callback method, that will receive the host and platform info. 
    *                   Alternatively, rather than use a callback, an add-in may simply wait for the Promise returned by the function to resolve.
    * @returns A Promise that contains the host and platform info, once initialization is completed.
    */
  def onReady(): js.Promise[officeDashJsDashPreviewLib.Anon_Host] = js.native
  def onReady(callback: js.Function1[/* info */ officeDashJsDashPreviewLib.Anon_Host, _]): js.Promise[officeDashJsDashPreviewLib.Anon_Host] = js.native
  /**
    * Returns a promise of an object described in the expression. Callback is invoked only if method fails.
    * 
    * @param expression The object to be retrieved. Example "bindings#BindingName", retrieves a binding promise for a binding named 'BindingName'
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    * 
    * @remarks
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
    *   <tr><td><strong> Excel  </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
    *   <tr><td><strong> Word   </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
    *  </table>
    */
  def select(expression: java.lang.String): Binding = js.native
  def select(expression: java.lang.String, callback: js.Function1[/* result */ AsyncResult[_], scala.Unit]): Binding = js.native
  /**
    * Toggles on and off the `Office` alias for the full `Microsoft.Office.WebExtension` namespace.
    * 
    * @remarks
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
    *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> OWA for Devices </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Outlook    </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *  </table>
    * 
    * @param useShortNamespace True to use the shortcut alias; otherwise false to disable it. The default is true.
    */
  def useShortNamespace(useShortNamespace: scala.Boolean): scala.Unit = js.native
}

