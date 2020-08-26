package typings.notp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TOTPVerifyOpt extends TOTPGenOpt {
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
  var window: js.UndefOr[Double] = js.native
}

object TOTPVerifyOpt {
  @scala.inline
  def apply(): TOTPVerifyOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TOTPVerifyOpt]
  }
  @scala.inline
  implicit class TOTPVerifyOptOps[Self <: TOTPVerifyOpt] (val x: Self) extends AnyVal {
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
    def setWindow(value: Double): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
  
}

