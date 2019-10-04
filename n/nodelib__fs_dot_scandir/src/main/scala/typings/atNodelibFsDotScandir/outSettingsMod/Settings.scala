package typings.atNodelibFsDotScandir.outSettingsMod

import typings.atNodelibFsDotScandir.outAdaptersFsMod.FileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var _getValue: js.Any
  val _options: js.Any
  val followSymbolicLinks: Boolean
  val fs: FileSystemAdapter
  val fsStatSettings: Settings
  val pathSegmentSeparator: String
  val stats: Boolean
  val throwErrorOnBrokenSymbolicLink: Boolean
}

object Settings {
  @scala.inline
  def apply(
    _getValue: js.Any,
    _options: js.Any,
    followSymbolicLinks: Boolean,
    fs: FileSystemAdapter,
    fsStatSettings: Settings,
    pathSegmentSeparator: String,
    stats: Boolean,
    throwErrorOnBrokenSymbolicLink: Boolean
  ): Settings = {
    val __obj = js.Dynamic.literal(_getValue = _getValue, _options = _options, followSymbolicLinks = followSymbolicLinks, fs = fs, fsStatSettings = fsStatSettings, pathSegmentSeparator = pathSegmentSeparator, stats = stats, throwErrorOnBrokenSymbolicLink = throwErrorOnBrokenSymbolicLink)
  
    __obj.asInstanceOf[Settings]
  }
}

