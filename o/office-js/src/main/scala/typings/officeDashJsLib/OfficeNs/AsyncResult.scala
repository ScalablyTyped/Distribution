package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Objects
/**
  * An object which encapsulates the result of an asynchronous request, including status and error information if the request failed.
  *
  * @remarks
  * <table><tr><td>Hosts</td><td>Access, Excel, Outlook, PowerPoint, Project, Word</td></tr></table>
  *
  * When the function you pass to the `callback` parameter of an "Async" method executes, it receives an AsyncResult object that you can access 
  * from the `callback` function's only parameter.
  */
trait AsyncResult[T] extends js.Object {
  /**
    * Gets the user-defined item passed to the optional `asyncContext` parameter of the invoked method in the same state as it was passed in. 
    * This returns the user-defined item (which can be of any JavaScript type: String, Number, Boolean, Object, Array, Null, or Undefined) passed 
    * to the optional `asyncContext` parameter of the invoked method. Returns Undefined, if you didn't pass anything to the asyncContext parameter.
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
    *   <tr><td><strong> Access     </strong></td><td> Y                          </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Outlook    </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Project    </strong></td><td>                            </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *  </table>
    */
  var asyncContext: js.Any
  /**
    * Gets an object that may provide additional information if an error occurred.
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
    *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> OWA for Devices </th><th> Office for Mac </th></tr>
    *   <tr><td><strong>Outlook</strong></td><td> Y (Mailbox Preview)    </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
    *  </table>
    * 
    * *Supported APIs*
    * 
    * `Office.context.mailbox.item.getCallbackTokenAsync`, `Office.context.mailbox.item.getUserIdentityTokenAsync`
    * 
    * *Supported errors*
    * <table>
    *   <tr><th>`AsyncResult.error.name`            </th><th>`AsyncResult.error.message`                                                                       </th><th>Description of diagnostics object returned                                                                                          </th></tr>
    *   <tr><td><strong>HTTPRequestFailure</strong> </td><td>The request has failed. Please look at the diagnostics object for the HTTP error code.            </td><td>The HTTP error code in a JSON object e.g., `{"HTTPCode":"401"}`                                                                     </td></tr>
    *   <tr><td><strong>InternalServerError</strong></td><td>The Exchange server returned an error. Please look at the diagnostics object for more information.</td><td>The error message from the Exchange server in a JSON object e.g., `{"ErrorText": "The mailbox database is temporarily unavailable"}`</td></tr>
    * </table>
    */
  var diagnostics: js.Any
  /**
    * Gets an {@link Office.Error} object that provides a description of the error, if any error occurred.
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
  var error: Error
  /**
    * Gets the {@link Office.AsyncResultStatus} of the asynchronous operation.
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
    *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th><th> OWA for Devices </th><th> Office for Mac </th></tr>
    *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Outlook    </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td><td> Y               </td><td> Y              </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                            </td><td>                 </td><td>                 </td><td>                </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td><td>                 </td><td>                </td></tr>
    *  </table>
    */
  var status: AsyncResultStatus
  /**
    * Gets the payload or content of this asynchronous operation, if any.
    * 
    * @remarks
    * You access the AsyncResult object in the function passed as the argument to the callback parameter of an "Async" method, such as the 
    * `getSelectedDataAsync` and `setSelectedDataAsync` methods of the {@link Office.Document | Document} object.
    *
    * **Note**: What the value property returns for a particular "Async" method varies depending on the purpose and context of that method. 
    * To determine what is returned by the value property for an "Async" method, refer to the "Callback value" section of the method's topic.
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
  var value: T
}

object AsyncResult {
  @scala.inline
  def apply[T](asyncContext: js.Any, diagnostics: js.Any, error: Error, status: AsyncResultStatus, value: T): AsyncResult[T] = {
    val __obj = js.Dynamic.literal(asyncContext = asyncContext, diagnostics = diagnostics, error = error, status = status, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsyncResult[T]]
  }
}

