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
  def apply(_t: Int | Double = null, time: Int | Double = null): TOTPGenOpt = {
    val __obj = js.Dynamic.literal()
    if (_t != null) __obj.updateDynamic("_t")(_t.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TOTPGenOpt]
  }
}

