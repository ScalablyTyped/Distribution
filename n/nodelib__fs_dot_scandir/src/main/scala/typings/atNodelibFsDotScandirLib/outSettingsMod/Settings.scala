package typings
package atNodelibFsDotScandirLib.outSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var _getValue: js.Any
  val _options: js.Any
  val followSymbolicLinks: scala.Boolean
  val fs: atNodelibFsDotScandirLib.outAdaptersFsMod.FileSystemAdapter
  val fsStatSettings: atNodelibFsDotStatLib.atNodelibFsDotStatMod.Settings
  val pathSegmentSeparator: java.lang.String
  val stats: scala.Boolean
  val throwErrorOnBrokenSymbolicLink: scala.Boolean
}

object Settings {
  @scala.inline
  def apply(
    _getValue: js.Any,
    _options: js.Any,
    followSymbolicLinks: scala.Boolean,
    fs: atNodelibFsDotScandirLib.outAdaptersFsMod.FileSystemAdapter,
    fsStatSettings: atNodelibFsDotStatLib.atNodelibFsDotStatMod.Settings,
    pathSegmentSeparator: java.lang.String,
    stats: scala.Boolean,
    throwErrorOnBrokenSymbolicLink: scala.Boolean
  ): Settings = {
    val __obj = js.Dynamic.literal(_getValue = _getValue, _options = _options, followSymbolicLinks = followSymbolicLinks, fs = fs, fsStatSettings = fsStatSettings, pathSegmentSeparator = pathSegmentSeparator, stats = stats, throwErrorOnBrokenSymbolicLink = throwErrorOnBrokenSymbolicLink)
  
    __obj.asInstanceOf[Settings]
  }
}

