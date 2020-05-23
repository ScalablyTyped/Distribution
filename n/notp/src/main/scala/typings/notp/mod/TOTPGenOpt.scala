package typings.notp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TOTPGenOpt extends js.Object {
  /**
    * UNIX Epoch time (overwrite time in test environment, NODE_ENV=test)
    */
  var _t: js.UndefOr[Double] = js.undefined
  /**
    * The time step of the counter. This must be the same for every request and is
    * used to calculat C.
    *
    * Default - 30
    */
  var time: js.UndefOr[Double] = js.undefined
}

object TOTPGenOpt {
  @scala.inline
  def apply(_t: js.UndefOr[Double] = js.undefined, time: js.UndefOr[Double] = js.undefined): TOTPGenOpt = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_t)) __obj.updateDynamic("_t")(_t.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TOTPGenOpt]
  }
}

