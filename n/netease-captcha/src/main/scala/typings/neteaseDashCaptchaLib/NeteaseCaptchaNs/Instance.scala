package typings
package neteaseDashCaptchaLib.NeteaseCaptchaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /**
    * Available when the mode is set to 'popup' - opens the popup to accept verification
    */
  var popUp: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Destroy the current instance
    */
  def destroy(): scala.Unit
  /**
    * Refresh the instance to get new verification information
    */
  def refresh(): scala.Unit
}

object Instance {
  @scala.inline
  def apply(destroy: () => scala.Unit, refresh: () => scala.Unit, popUp: () => scala.Unit = null): Instance = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), refresh = js.Any.fromFunction0(refresh))
    if (popUp != null) __obj.updateDynamic("popUp")(js.Any.fromFunction0(popUp))
    __obj.asInstanceOf[Instance]
  }
}

