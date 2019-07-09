package typings
package atNodelibFsDotStatLib.outSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var _getValue: js.Any
  val _options: js.Any
  val followSymbolicLink: scala.Boolean
  val fs: atNodelibFsDotStatLib.outAdaptersFsMod.FileSystemAdapter
  val markSymbolicLink: scala.Boolean
  val throwErrorOnBrokenSymbolicLink: scala.Boolean
}

object Settings {
  @scala.inline
  def apply(
    _getValue: js.Any,
    _options: js.Any,
    followSymbolicLink: scala.Boolean,
    fs: atNodelibFsDotStatLib.outAdaptersFsMod.FileSystemAdapter,
    markSymbolicLink: scala.Boolean,
    throwErrorOnBrokenSymbolicLink: scala.Boolean
  ): Settings = {
    val __obj = js.Dynamic.literal(_getValue = _getValue, _options = _options, followSymbolicLink = followSymbolicLink, fs = fs, markSymbolicLink = markSymbolicLink, throwErrorOnBrokenSymbolicLink = throwErrorOnBrokenSymbolicLink)
  
    __obj.asInstanceOf[Settings]
  }
}

