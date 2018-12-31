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

