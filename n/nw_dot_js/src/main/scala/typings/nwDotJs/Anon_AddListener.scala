package typings.nwDotJs

import typings.nwDotJs.nwDotJsMod._Global_.NWJS_Helpers.CookiesOnChangedCallbackChangeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddListener extends js.Object {
  /**
    * Add a new listener for onChanged event.
    *
    * @param callback {function(changeInfo?)} The callback when cookie has been changed.
    * - (Optional) changeInfo {Objet} Contains details about the cookie that's been changed.
    */
  def addListener(callback: js.Function1[/* changeInfo */ CookiesOnChangedCallbackChangeInfo, Unit]): Unit
}

object Anon_AddListener {
  @scala.inline
  def apply(addListener: js.Function1[/* changeInfo */ CookiesOnChangedCallbackChangeInfo, Unit] => Unit): Anon_AddListener = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
  
    __obj.asInstanceOf[Anon_AddListener]
  }
}

