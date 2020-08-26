package typings.notp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TOTPGenOpt extends js.Object {
  /**
    * UNIX Epoch time (overwrite time in test environment, NODE_ENV=test)
    */
  var _t: js.UndefOr[Double] = js.native
  /**
    * The time step of the counter. This must be the same for every request and is
    * used to calculat C.
    *
    * Default - 30
    */
  var time: js.UndefOr[Double] = js.native
}

object TOTPGenOpt {
  @scala.inline
  def apply(): TOTPGenOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TOTPGenOpt]
  }
  @scala.inline
  implicit class TOTPGenOptOps[Self <: TOTPGenOpt] (val x: Self) extends AnyVal {
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
    def set_t(value: Double): Self = this.set("_t", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_t: Self = this.set("_t", js.undefined)
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

