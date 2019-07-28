package typings.atNodelibFsDotStat.outSettingsMod

import typings.atNodelibFsDotStat.outAdaptersFsMod.FileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var _getValue: js.Any
  val _options: js.Any
  val followSymbolicLink: Boolean
  val fs: FileSystemAdapter
  val markSymbolicLink: Boolean
  val throwErrorOnBrokenSymbolicLink: Boolean
}

object Settings {
  @scala.inline
  def apply(
    _getValue: js.Any,
    _options: js.Any,
    followSymbolicLink: Boolean,
    fs: FileSystemAdapter,
    markSymbolicLink: Boolean,
    throwErrorOnBrokenSymbolicLink: Boolean
  ): Settings = {
    val __obj = js.Dynamic.literal(_getValue = _getValue, _options = _options, followSymbolicLink = followSymbolicLink, fs = fs, markSymbolicLink = markSymbolicLink, throwErrorOnBrokenSymbolicLink = throwErrorOnBrokenSymbolicLink)
  
    __obj.asInstanceOf[Settings]
  }
}

