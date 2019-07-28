package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NavigationFromKeyboard extends js.Object {
  var navigationFromKeyboard: js.UndefOr[String] = js.undefined
  var navigationToKeyboard: js.UndefOr[String] = js.undefined
  var navigationToTouch: js.UndefOr[String] = js.undefined
  var newMessage: js.UndefOr[String] = js.undefined
}

object Anon_NavigationFromKeyboard {
  @scala.inline
  def apply(
    navigationFromKeyboard: String = null,
    navigationToKeyboard: String = null,
    navigationToTouch: String = null,
    newMessage: String = null
  ): Anon_NavigationFromKeyboard = {
    val __obj = js.Dynamic.literal()
    if (navigationFromKeyboard != null) __obj.updateDynamic("navigationFromKeyboard")(navigationFromKeyboard)
    if (navigationToKeyboard != null) __obj.updateDynamic("navigationToKeyboard")(navigationToKeyboard)
    if (navigationToTouch != null) __obj.updateDynamic("navigationToTouch")(navigationToTouch)
    if (newMessage != null) __obj.updateDynamic("newMessage")(newMessage)
    __obj.asInstanceOf[Anon_NavigationFromKeyboard]
  }
}

