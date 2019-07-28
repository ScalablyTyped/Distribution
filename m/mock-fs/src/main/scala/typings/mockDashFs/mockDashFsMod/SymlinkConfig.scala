package typings.mockDashFs.mockDashFsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymlinkConfig extends CommonConfig {
  var path: String
}

object SymlinkConfig {
  @scala.inline
  def apply(
    path: String,
    atime: Date = null,
    birthtime: Date = null,
    ctime: Date = null,
    git: Int | Double = null,
    mode: Int | Double = null,
    mtime: Date = null,
    uid: Int | Double = null
  ): SymlinkConfig = {
    val __obj = js.Dynamic.literal(path = path)
    if (atime != null) __obj.updateDynamic("atime")(atime)
    if (birthtime != null) __obj.updateDynamic("birthtime")(birthtime)
    if (ctime != null) __obj.updateDynamic("ctime")(ctime)
    if (git != null) __obj.updateDynamic("git")(git.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime)
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymlinkConfig]
  }
}

