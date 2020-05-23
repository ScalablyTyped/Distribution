package typings.officeJs.global.Office

import typings.officeJs.Office.AsyncResult
import typings.officeJs.Office.Binding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.select")
@js.native
object select extends js.Object {
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
    *   <tr><th>                         </th><th> Office on Windows </th><th> Office in web browser </th><th> Office on iPad </th></tr>
    *   <tr><td><strong> Excel  </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td></tr>
    *   <tr><td><strong> Word   </strong></td><td> Y                 </td><td>                       </td><td> Y              </td></tr>
    *  </table>
    */
  def apply(expression: String): Binding = js.native
  def apply(expression: String, callback: js.Function1[/* result */ AsyncResult[_], Unit]): Binding = js.native
}

