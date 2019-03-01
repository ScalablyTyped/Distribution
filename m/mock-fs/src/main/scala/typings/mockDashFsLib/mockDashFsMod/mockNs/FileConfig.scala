package typings
package mockDashFsLib.mockDashFsMod.mockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConfig extends CommonConfig {
  var content: java.lang.String | nodeLib.Buffer
}

object FileConfig {
  @scala.inline
  def apply(
    content: java.lang.String | nodeLib.Buffer,
    atime: stdLib.Date = null,
    birthtime: stdLib.Date = null,
    ctime: stdLib.Date = null,
    git: scala.Int | scala.Double = null,
    mode: scala.Int | scala.Double = null,
    mtime: stdLib.Date = null,
    uid: scala.Int | scala.Double = null
  ): FileConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (atime != null) __obj.updateDynamic("atime")(atime)
    if (birthtime != null) __obj.updateDynamic("birthtime")(birthtime)
    if (ctime != null) __obj.updateDynamic("ctime")(ctime)
    if (git != null) __obj.updateDynamic("git")(git.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime)
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConfig]
  }
}

