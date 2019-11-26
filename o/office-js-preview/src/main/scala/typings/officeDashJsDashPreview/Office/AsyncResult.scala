package typings.officeDashJsDashPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Objects
/**
  * An object which encapsulates the result of an asynchronous request, including status and error information if the request failed.
  *
  * When the function you pass to the `callback` parameter of an "Async" method executes, it receives an AsyncResult object that you can access 
  * from the `callback` function's only parameter.
  */
trait AsyncResult[T] extends js.Object {
  /**
    * Gets the user-defined item passed to the optional `asyncContext` parameter of the invoked method in the same state as it was passed in. 
    * This returns the user-defined item (which can be of any JavaScript type: String, Number, Boolean, Object, Array, Null, or Undefined) passed 
    * to the optional `asyncContext` parameter of the invoked method. Returns Undefined, if you didn't pass anything to the asyncContext parameter.
    */
  var asyncContext: js.Any
  /**
    * Gets an object that may provide additional information if an {@link Office.Error | error} occurred.
    *
    * @remarks
    * 
    * This property returns additional information if the following errors occur with these supported APIs.
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
    */
  var error: Error
  /**
    * Gets the {@link Office.AsyncResultStatus} of the asynchronous operation.
    */
  var status: AsyncResultStatus
  /**
    * Gets the payload or content of this asynchronous operation, if any.
    * 
    * @remarks
    * 
    * You access the AsyncResult object in the function passed as the argument to the callback parameter of an "Async" method, such as the 
    * `getSelectedDataAsync` and `setSelectedDataAsync` methods of the {@link Office.Document | Document} object.
    *
    * **Note**: What the value property returns for a particular "Async" method varies depending on the purpose and context of that method. 
    * To determine what is returned by the value property for an "Async" method, refer to the "Callback value" section of the method's topic.
    */
  var value: T
}

object AsyncResult {
  @scala.inline
  def apply[T](asyncContext: js.Any, diagnostics: js.Any, error: Error, status: AsyncResultStatus, value: T): AsyncResult[T] = {
    val __obj = js.Dynamic.literal(asyncContext = asyncContext.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsyncResult[T]]
  }
}

