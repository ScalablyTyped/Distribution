package typings.nwJs

import typings.nwJs.mod._Global_.NWJSHelpers.CookiesOnChangedCallbackChangeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddListener extends js.Object {
  /**
    * Add a new listener for onChanged event.
    *
    * @param callback {function(changeInfo?)} The callback when cookie has been changed.
    * - (Optional) changeInfo {Objet} Contains details about the cookie that's been changed.
    */
  def addListener(callback: js.Function1[/* changeInfo */ CookiesOnChangedCallbackChangeInfo, Unit]): Unit
}

object AnonAddListener {
  @scala.inline
  def apply(addListener: js.Function1[/* changeInfo */ CookiesOnChangedCallbackChangeInfo, Unit] => Unit): AnonAddListener = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
    __obj.asInstanceOf[AnonAddListener]
  }
}

