package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

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
  var brand: js.UndefOr[java.lang.String] = js.undefined
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
  var sign_in_text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the value of the type property is "custom", this value specifies
    * the sign-out text to be displayed in the button.
    */
  var sign_out_text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the color pallette used for the sign-in button. For Windows
    * Store apps using JavaScript, valid values are "dark" and "light".
    * For web apps, valid values are "blue" and "white".
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the type of button.
    * @default "signin"
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ISignInProperties {
  @scala.inline
  def apply(
    element: java.lang.String,
    name: java.lang.String,
    brand: java.lang.String = null,
    onerror: js.Function = null,
    onloggedin: js.Function = null,
    onloggedout: js.Function = null,
    sign_in_text: java.lang.String = null,
    sign_out_text: java.lang.String = null,
    state: java.lang.String = null,
    theme: java.lang.String = null,
    `type`: java.lang.String = null
  ): ISignInProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("name")(name)
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (onerror != null) __obj.updateDynamic("onerror")(onerror)
    if (onloggedin != null) __obj.updateDynamic("onloggedin")(onloggedin)
    if (onloggedout != null) __obj.updateDynamic("onloggedout")(onloggedout)
    if (sign_in_text != null) __obj.updateDynamic("sign_in_text")(sign_in_text)
    if (sign_out_text != null) __obj.updateDynamic("sign_out_text")(sign_out_text)
    if (state != null) __obj.updateDynamic("state")(state)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ISignInProperties]
  }
}

