package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Organizer extends js.Object {
  /**
    * Gets the organizer value of an appointment as an {@link Office.EmailAddressDetails} in the asyncResult.value property.
    * 
    * [Api set: Mailbox 1.7]
    * 
    * @remarks
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    * 
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr></table>
    * 
    * @param options An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback When the method completes, the function passed in the callback parameter is called with a single parameter, asyncResult, which is an AsyncResult object.
    *                  The `value` property of the result is message's organizer value, as an EmailAddressDetails object.
    */
  def getAsync(): scala.Unit = js.native
  def getAsync(options: AsyncContextOptions): scala.Unit = js.native
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[EmailAddressDetails], scala.Unit]
  ): scala.Unit = js.native
}

