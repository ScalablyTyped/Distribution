package typings.notp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HOTPVerifyOpt extends HOTPGenOpt {
  /**
    * The allowable margin for the counter. The function will check 'W' codes in
    * the future against the provided passcode. Note, it is the calling
    * applications responsibility to keep track of 'W' and increment it for each
    * password check, and also to adjust it accordingly in the case where the
    * client and server become out of sync (second argument returns non zero).
    *
    * E.g. if W = 100, and C = 5, this function will check the passcode against
    * all One Time Passcodes between 5 and 105.
    *
    * Default - 50
    */
  var window: js.UndefOr[Double] = js.undefined
}

object HOTPVerifyOpt {
  @scala.inline
  def apply(counter: Int | Double = null, window: Int | Double = null): HOTPVerifyOpt = {
    val __obj = js.Dynamic.literal()
    if (counter != null) __obj.updateDynamic("counter")(counter.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[HOTPVerifyOpt]
  }
}

