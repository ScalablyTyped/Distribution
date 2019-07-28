package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fail extends js.Object {
  var fail: js.UndefOr[Double] = js.undefined
  var func: js.UndefOr[Double] = js.undefined
  var readMask: js.UndefOr[Double] = js.undefined
  var ref: js.UndefOr[Double] = js.undefined
  var writeMask: js.UndefOr[Double] = js.undefined
  var zfail: js.UndefOr[Double] = js.undefined
  var zpass: js.UndefOr[Double] = js.undefined
}

object Anon_Fail {
  @scala.inline
  def apply(
    fail: Int | Double = null,
    func: Int | Double = null,
    readMask: Int | Double = null,
    ref: Int | Double = null,
    writeMask: Int | Double = null,
    zfail: Int | Double = null,
    zpass: Int | Double = null
  ): Anon_Fail = {
    val __obj = js.Dynamic.literal()
    if (fail != null) __obj.updateDynamic("fail")(fail.asInstanceOf[js.Any])
    if (func != null) __obj.updateDynamic("func")(func.asInstanceOf[js.Any])
    if (readMask != null) __obj.updateDynamic("readMask")(readMask.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (writeMask != null) __obj.updateDynamic("writeMask")(writeMask.asInstanceOf[js.Any])
    if (zfail != null) __obj.updateDynamic("zfail")(zfail.asInstanceOf[js.Any])
    if (zpass != null) __obj.updateDynamic("zpass")(zpass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Fail]
  }
}

