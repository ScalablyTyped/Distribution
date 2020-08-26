package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationFromKeyboard extends js.Object {
  var navigationFromKeyboard: js.UndefOr[String] = js.native
  var navigationToKeyboard: js.UndefOr[String] = js.native
  var navigationToTouch: js.UndefOr[String] = js.native
  var newMessage: js.UndefOr[String] = js.native
}

object NavigationFromKeyboard {
  @scala.inline
  def apply(): NavigationFromKeyboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationFromKeyboard]
  }
  @scala.inline
  implicit class NavigationFromKeyboardOps[Self <: NavigationFromKeyboard] (val x: Self) extends AnyVal {
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
    def setNavigationFromKeyboard(value: String): Self = this.set("navigationFromKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationFromKeyboard: Self = this.set("navigationFromKeyboard", js.undefined)
    @scala.inline
    def setNavigationToKeyboard(value: String): Self = this.set("navigationToKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationToKeyboard: Self = this.set("navigationToKeyboard", js.undefined)
    @scala.inline
    def setNavigationToTouch(value: String): Self = this.set("navigationToTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationToTouch: Self = this.set("navigationToTouch", js.undefined)
    @scala.inline
    def setNewMessage(value: String): Self = this.set("newMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewMessage: Self = this.set("newMessage", js.undefined)
  }
  
}

