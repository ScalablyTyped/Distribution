package typings.officeJsPreview.global.Office

import typings.officeJsPreview.Office.Actions
import typings.officeJsPreview.Office.Addin
import typings.officeJsPreview.Office.AsyncResult
import typings.officeJsPreview.Office.Auth
import typings.officeJsPreview.Office.Binding
import typings.officeJsPreview.Office.Context
import typings.officeJsPreview.Office.IPromiseConstructor
import typings.officeJsPreview.Office.Ribbon
import typings.officeJsPreview.anon.Host
import typings.officeJsPreview.global.Office.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Promise_=(x: IPromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])

/**
  * Provides a method for associating action names with functions that carry out an action.
  */
inline def actions: Actions = ^.asInstanceOf[js.Dynamic].selectDynamic("actions").asInstanceOf[Actions]

/**
  * Represents the add-in.
  */
inline def addin: Addin = ^.asInstanceOf[js.Dynamic].selectDynamic("addin").asInstanceOf[Addin]

/**
  * Represents the Auth interface.
  */
inline def auth: Auth = ^.asInstanceOf[js.Dynamic].selectDynamic("auth").asInstanceOf[Auth]

/**
  * Gets the Context object that represents the runtime environment of the add-in and provides access to the top-level objects of the API.
  *
  * @remarks
  *
  * **Support details**
  *
  * For more information about Office application and server requirements, see
  * {@link https://learn.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
  *
  * *Supported applications, by platform*
  *  <table>
  *   <tr><th>                             </th><th> Office on Windows </th><th> Office in web browser </th><th> Office on iPad </th><th> Outlook on mobile devices </th><th> Office on Mac </th></tr>
  *   <tr><td><strong> Excel      </strong></td><td> Supported         </td><td> Supported             </td><td> Supported      </td><td>                           </td><td> Supported     </td></tr>
  *   <tr><td><strong> Outlook    </strong></td><td> Supported         </td><td> Supported             </td><td>                </td><td> Supported                 </td><td> Supported     </td></tr>
  *   <tr><td><strong> PowerPoint </strong></td><td> Supported         </td><td> Supported             </td><td> Supported      </td><td>                           </td><td> Supported     </td></tr>
  *   <tr><td><strong> Project    </strong></td><td> Supported         </td><td>                       </td><td>                </td><td>                           </td><td> Supported     </td></tr>
  *   <tr><td><strong> Word       </strong></td><td> Supported         </td><td> Supported             </td><td> Supported      </td><td>                           </td><td> Supported     </td></tr>
  *  </table>
  */
inline def context: Context = ^.asInstanceOf[js.Dynamic].selectDynamic("context").asInstanceOf[Context]
inline def context_=(x: Context): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("context")(x.asInstanceOf[js.Any])

/**
  * Occurs when the runtime environment is loaded and the add-in is ready to start interacting with the application and hosted document.
  *
  * The reason parameter of the initialize event listener function returns an `InitializationReason` enumeration value that specifies how
  * initialization occurred. A task pane or content add-in can be initialized in two ways:
  *
  *  - The user just inserted it from Recently Used Add-ins section of the Add-in drop-down list on the Insert tab of the ribbon in the Office
  * application, or from Insert add-in dialog box.
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
  * For more information about Office application and server requirements, see
  * {@link https://learn.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
  *
  * *Supported applications, by platform*
  *  <table>
  *   <tr><th>                             </th><th> Office on Windows </th><th> Office in web browser </th><th> Office on iPad </th><th> Outlook on mobile devices </th><th> Office on Mac </th></tr>
  *   <tr><td><strong> Excel      </strong></td><td> Supported         </td><td> Supported             </td><td> Supported      </td><td>                           </td><td> Supported     </td></tr>
  *   <tr><td><strong> Outlook    </strong></td><td> Supported         </td><td> Supported             </td><td>                </td><td> Supported                 </td><td> Supported     </td></tr>
  *   <tr><td><strong> PowerPoint </strong></td><td> Supported         </td><td> Supported             </td><td> Supported      </td><td>                           </td><td> Supported     </td></tr>
  *   <tr><td><strong> Project    </strong></td><td> Supported         </td><td>                       </td><td>                </td><td>                           </td><td> Supported     </td></tr>
  *   <tr><td><strong> Word       </strong></td><td> Supported         </td><td> Supported             </td><td> Supported      </td><td>                           </td><td> Supported     </td></tr>
  *  </table>
  *
  * @param reason Indicates how the app was initialized.
  */
inline def initialize(reason: typings.officeJsPreview.Office.InitializationReason): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(reason.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Checks if the specified requirement set is supported by the Office application.
  * @param name - Set name; e.g., "MatrixBindings".
  * @param minVersion - The minimum required version; e.g., "1.4".
  */
inline def isSetSupported(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSetSupported")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isSetSupported(name: String, minVersion: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSetSupported")(name.asInstanceOf[js.Any], minVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Ensures that the Office JavaScript APIs are ready to be called by the add-in. If the framework hasn't initialized yet, the callback or promise
  * will wait until the Office application is ready to accept API calls. Note that though this API is intended to be used inside an Office add-in, it can
  * also be used outside the add-in. In that case, once Office.js determines that it is running outside of an Office application, it will call
  * the callback and resolve the promise with "null" for both the application and platform.
  *
  * @param callback - An optional callback function, that will receive the application and platform info.
  *                   Alternatively, rather than use a callback, an add-in may simply wait for the Promise returned by the function to resolve.
  * @returns A Promise that contains the application and platform info, once initialization is completed.
  */
inline def onReady(): js.Promise[Host] = ^.asInstanceOf[js.Dynamic].applyDynamic("onReady")().asInstanceOf[js.Promise[Host]]
inline def onReady(callback: js.Function1[/* info */ Host, Any]): js.Promise[Host] = ^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Host]]

/**
  * Represents the ribbon associated with the Office application.
  */
inline def ribbon: Ribbon = ^.asInstanceOf[js.Dynamic].selectDynamic("ribbon").asInstanceOf[Ribbon]

/**
  * Returns a promise of an object described in the expression. Callback is invoked only if the function fails.
  *
  * @param expression The object to be retrieved. Example "bindings#BindingName", retrieves a binding promise for a binding named 'BindingName'
  * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
  *
  * @remarks
  *
  * **Support details**
  *
  * For more information about Office application and server requirements, see
  * {@link https://learn.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
  *
  * *Supported applications, by platform*
  *  <table>
  *   <tr><th>                         </th><th> Office on Windows </th><th> Office in web browser </th><th> Office on iPad </th></tr>
  *   <tr><td><strong> Excel  </strong></td><td> Supported         </td><td> Supported             </td><td> Supported      </td></tr>
  *   <tr><td><strong> Word   </strong></td><td> Supported         </td><td>                       </td><td> Supported      </td></tr>
  *  </table>
  */
inline def select(expression: String): Binding = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(expression.asInstanceOf[js.Any]).asInstanceOf[Binding]
inline def select(expression: String, callback: js.Function1[/* result */ AsyncResult[Any], Unit]): Binding = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(expression.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Binding]

/**
  * Toggles on and off the `Office` alias for the full `Microsoft.Office.WebExtension` namespace.
  *
  * @remarks
  *
  * **Support details**
  *
  * For more information about Office application and server requirements, see
  * {@link https://learn.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
  *
  * *Supported applications, by platform*
  *  <table>
  *   <tr><th>                             </th><th> Office on Windows </th><th> Office in web browser </th><th> Office on iPad </th><th> Outlook on mobile devices </th><th> Office on Mac </th></tr>
  *   <tr><td><strong> Excel      </strong></td><td> Supported         </td><td> Supported             </td><td> Supported      </td><td>                           </td><td>               </td></tr>
  *   <tr><td><strong> Outlook    </strong></td><td> Supported         </td><td> Supported             </td><td>                </td><td> Supported                 </td><td> Supported     </td></tr>
  *   <tr><td><strong> PowerPoint </strong></td><td> Supported         </td><td> Supported             </td><td> Supported      </td><td>                           </td><td>               </td></tr>
  *   <tr><td><strong> Project    </strong></td><td> Supported         </td><td>                       </td><td>                </td><td>                           </td><td>               </td></tr>
  *   <tr><td><strong> Word       </strong></td><td> Supported         </td><td> Supported             </td><td> Supported      </td><td>                           </td><td>               </td></tr>
  *  </table>
  *
  * @param useShortNamespace True to use the shortcut alias; otherwise false to disable it. The default is true.
  */
inline def useShortNamespace(useShortNamespace: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useShortNamespace")(useShortNamespace.asInstanceOf[js.Any]).asInstanceOf[Unit]
