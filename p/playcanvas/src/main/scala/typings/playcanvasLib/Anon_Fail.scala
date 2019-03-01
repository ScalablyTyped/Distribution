package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fail extends js.Object {
  var fail: js.UndefOr[scala.Double] = js.undefined
  var func: js.UndefOr[scala.Double] = js.undefined
  var readMask: js.UndefOr[scala.Double] = js.undefined
  var ref: js.UndefOr[scala.Double] = js.undefined
  var writeMask: js.UndefOr[scala.Double] = js.undefined
  var zfail: js.UndefOr[scala.Double] = js.undefined
  var zpass: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Fail {
  @scala.inline
  def apply(
    fail: scala.Int | scala.Double = null,
    func: scala.Int | scala.Double = null,
    readMask: scala.Int | scala.Double = null,
    ref: scala.Int | scala.Double = null,
    writeMask: scala.Int | scala.Double = null,
    zfail: scala.Int | scala.Double = null,
    zpass: scala.Int | scala.Double = null
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

