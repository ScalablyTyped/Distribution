package typings.mockFs.filesystemMod

import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends js.Object {
  /**
    * The last file access time. Defaults to `new Date()`. Updated when
    * file contents are accessed.
    */
  var atime: js.UndefOr[Date] = js.undefined
  /**
    * The time of file creation. Defaults to `new Date()`.
    */
  var birthtime: js.UndefOr[Date] = js.undefined
  /** File contents */
  var content: js.UndefOr[String | Buffer] = js.undefined
  /**
    * The last file change time. Defaults to `new Date()`. Updated when
    * file owner or permissions change.
    */
  var ctime: js.UndefOr[Date] = js.undefined
  /** The group id. Defaults to `process.getgid()`. */
  var gid: js.UndefOr[Double] = js.undefined
  /** File mode (permission and sticky bits). Defaults to `0666`. */
  var mode: js.UndefOr[Double] = js.undefined
  /**
    * The last file modification time. Defaults to `new Date()`. Updated
    * when file contents change.
    */
  var mtime: js.UndefOr[Date] = js.undefined
  /** The user id. Defaults to `process.getuid()`. */
  var uid: js.UndefOr[Double] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply(
    atime: Date = null,
    birthtime: Date = null,
    content: String | Buffer = null,
    ctime: Date = null,
    gid: js.UndefOr[Double] = js.undefined,
    mode: js.UndefOr[Double] = js.undefined,
    mtime: Date = null,
    uid: js.UndefOr[Double] = js.undefined
  ): FileOptions = {
    val __obj = js.Dynamic.literal()
    if (atime != null) __obj.updateDynamic("atime")(atime.asInstanceOf[js.Any])
    if (birthtime != null) __obj.updateDynamic("birthtime")(birthtime.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (ctime != null) __obj.updateDynamic("ctime")(ctime.asInstanceOf[js.Any])
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions]
  }
}

