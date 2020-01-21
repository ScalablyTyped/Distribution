package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.ui method when 'name' is set to
  * 'signin'.
  */
trait ISignInProperties extends IUIProperties {
  /**
    * Defines the brand, or type of icon, to be used with the Live Connect
    * sign-in button.
    * @default "windows"
    */
  var brand: js.UndefOr[String] = js.undefined
  /**
    * Specifies the function to call whenever there is any error while the
    * sign-in control is initializing or while the user is signing in.
    */
  var onerror: js.UndefOr[js.Function] = js.undefined
  /**
    * Specifies the function to call after the user completes the sign-in
    * process.
    */
  var onloggedin: js.UndefOr[js.Function] = js.undefined
  /**
    * Specifies the function to call after the user completes the sign-out
    * process.
    */
  var onloggedout: js.UndefOr[js.Function] = js.undefined
  /**
    * If the value of the type property is set to "custom", this value
    * specifies the sign-in text to be displayed in the button.
    */
  var sign_in_text: js.UndefOr[String] = js.undefined
  /**
    * If the value of the type property is "custom", this value specifies
    * the sign-out text to be displayed in the button.
    */
  var sign_out_text: js.UndefOr[String] = js.undefined
  /**
    * Defines the color pallette used for the sign-in button. For Windows
    * Store apps using JavaScript, valid values are "dark" and "light".
    * For web apps, valid values are "blue" and "white".
    */
  var theme: js.UndefOr[String] = js.undefined
  /**
    * Defines the type of button.
    * @default "signin"
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ISignInProperties {
  @scala.inline
  def apply(
    element: String,
    name: String,
    brand: String = null,
    onerror: js.Function = null,
    onloggedin: js.Function = null,
    onloggedout: js.Function = null,
    sign_in_text: String = null,
    sign_out_text: String = null,
    state: String = null,
    theme: String = null,
    `type`: String = null
  ): ISignInProperties = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(onerror.asInstanceOf[js.Any])
    if (onloggedin != null) __obj.updateDynamic("onloggedin")(onloggedin.asInstanceOf[js.Any])
    if (onloggedout != null) __obj.updateDynamic("onloggedout")(onloggedout.asInstanceOf[js.Any])
    if (sign_in_text != null) __obj.updateDynamic("sign_in_text")(sign_in_text.asInstanceOf[js.Any])
    if (sign_out_text != null) __obj.updateDynamic("sign_out_text")(sign_out_text.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignInProperties]
  }
}

