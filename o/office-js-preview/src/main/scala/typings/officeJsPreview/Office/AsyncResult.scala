package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Objects
/**
  * An object which encapsulates the result of an asynchronous request, including status and error information if the request failed.
  *
  * When the function you pass to the `callback` parameter of an "Async" method executes, it receives an AsyncResult object that you can access
  * from the `callback` function's only parameter.
  */
@js.native
trait AsyncResult[T] extends js.Object {
  
  /**
    * Gets the user-defined item passed to the optional `asyncContext` parameter of the invoked method in the same state as it was passed in.
    * This returns the user-defined item (which can be of any JavaScript type: String, Number, Boolean, Object, Array, Null, or Undefined) passed
    * to the optional `asyncContext` parameter of the invoked method. Returns Undefined, if you didn't pass anything to the asyncContext parameter.
    */
  var asyncContext: js.Any = js.native
  
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
  var diagnostics: js.Any = js.native
  
  /**
    * Gets an {@link Office.Error} object that provides a description of the error, if any error occurred.
    */
  var error: Error = js.native
  
  /**
    * Gets the {@link Office.AsyncResultStatus} of the asynchronous operation.
    */
  var status: AsyncResultStatus = js.native
  
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
  var value: T = js.native
}
object AsyncResult {
  
  @scala.inline
  def apply[T](asyncContext: js.Any, diagnostics: js.Any, error: Error, status: AsyncResultStatus, value: T): AsyncResult[T] = {
    val __obj = js.Dynamic.literal(asyncContext = asyncContext.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncResult[T]]
  }
  
  @scala.inline
  implicit class AsyncResultOps[Self <: AsyncResult[_], T] (val x: Self with AsyncResult[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAsyncContext(value: js.Any): Self = this.set("asyncContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnostics(value: js.Any): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AsyncResultStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
