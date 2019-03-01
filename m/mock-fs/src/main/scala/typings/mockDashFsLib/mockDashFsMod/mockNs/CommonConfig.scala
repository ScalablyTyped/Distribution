package typings
package mockDashFsLib.mockDashFsMod.mockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonConfig extends js.Object {
  var atime: js.UndefOr[stdLib.Date] = js.undefined
  var birthtime: js.UndefOr[stdLib.Date] = js.undefined
  var ctime: js.UndefOr[stdLib.Date] = js.undefined
  var git: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
  var mtime: js.UndefOr[stdLib.Date] = js.undefined
  var uid: js.UndefOr[scala.Double] = js.undefined
}

object CommonConfig {
  @scala.inline
  def apply(
    atime: stdLib.Date = null,
    birthtime: stdLib.Date = null,
    ctime: stdLib.Date = null,
    git: scala.Int | scala.Double = null,
    mode: scala.Int | scala.Double = null,
    mtime: stdLib.Date = null,
    uid: scala.Int | scala.Double = null
  ): CommonConfig = {
    val __obj = js.Dynamic.literal()
    if (atime != null) __obj.updateDynamic("atime")(atime)
    if (birthtime != null) __obj.updateDynamic("birthtime")(birthtime)
    if (ctime != null) __obj.updateDynamic("ctime")(ctime)
    if (git != null) __obj.updateDynamic("git")(git.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime)
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonConfig]
  }
}

