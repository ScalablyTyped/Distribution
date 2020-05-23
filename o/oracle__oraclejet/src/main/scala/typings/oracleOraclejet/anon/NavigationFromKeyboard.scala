package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationFromKeyboard extends js.Object {
  var navigationFromKeyboard: js.UndefOr[String] = js.undefined
  var navigationToKeyboard: js.UndefOr[String] = js.undefined
  var navigationToTouch: js.UndefOr[String] = js.undefined
  var newMessage: js.UndefOr[String] = js.undefined
}

object NavigationFromKeyboard {
  @scala.inline
  def apply(
    navigationFromKeyboard: String = null,
    navigationToKeyboard: String = null,
    navigationToTouch: String = null,
    newMessage: String = null
  ): NavigationFromKeyboard = {
    val __obj = js.Dynamic.literal()
    if (navigationFromKeyboard != null) __obj.updateDynamic("navigationFromKeyboard")(navigationFromKeyboard.asInstanceOf[js.Any])
    if (navigationToKeyboard != null) __obj.updateDynamic("navigationToKeyboard")(navigationToKeyboard.asInstanceOf[js.Any])
    if (navigationToTouch != null) __obj.updateDynamic("navigationToTouch")(navigationToTouch.asInstanceOf[js.Any])
    if (newMessage != null) __obj.updateDynamic("newMessage")(newMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFromKeyboard]
  }
}

