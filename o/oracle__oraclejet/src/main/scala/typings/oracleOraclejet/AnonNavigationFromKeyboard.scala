package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNavigationFromKeyboard extends js.Object {
  var navigationFromKeyboard: js.UndefOr[String] = js.undefined
  var navigationToKeyboard: js.UndefOr[String] = js.undefined
  var navigationToTouch: js.UndefOr[String] = js.undefined
  var newMessage: js.UndefOr[String] = js.undefined
}

object AnonNavigationFromKeyboard {
  @scala.inline
  def apply(
    navigationFromKeyboard: String = null,
    navigationToKeyboard: String = null,
    navigationToTouch: String = null,
    newMessage: String = null
  ): AnonNavigationFromKeyboard = {
    val __obj = js.Dynamic.literal()
    if (navigationFromKeyboard != null) __obj.updateDynamic("navigationFromKeyboard")(navigationFromKeyboard.asInstanceOf[js.Any])
    if (navigationToKeyboard != null) __obj.updateDynamic("navigationToKeyboard")(navigationToKeyboard.asInstanceOf[js.Any])
    if (navigationToTouch != null) __obj.updateDynamic("navigationToTouch")(navigationToTouch.asInstanceOf[js.Any])
    if (newMessage != null) __obj.updateDynamic("newMessage")(newMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNavigationFromKeyboard]
  }
}

