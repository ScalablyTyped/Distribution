package typings.nodelibFsScandir.settingsMod

import typings.nodelibFsScandir.fsMod.FileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var _getValue: js.Any
  val _options: js.Any
  val followSymbolicLinks: Boolean
  val fs: FileSystemAdapter
  val fsStatSettings: typings.nodelibFsStat.mod.Settings
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
    fsStatSettings: typings.nodelibFsStat.mod.Settings,
    pathSegmentSeparator: String,
    stats: Boolean,
    throwErrorOnBrokenSymbolicLink: Boolean
  ): Settings = {
    val __obj = js.Dynamic.literal(_getValue = _getValue.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], followSymbolicLinks = followSymbolicLinks.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], fsStatSettings = fsStatSettings.asInstanceOf[js.Any], pathSegmentSeparator = pathSegmentSeparator.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], throwErrorOnBrokenSymbolicLink = throwErrorOnBrokenSymbolicLink.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Settings]
  }
}

