package typings.nodelibFsStat.settingsMod

import typings.nodelibFsStat.fsMod.FileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var _getValue: js.Any = js.native
  val _options: js.Any = js.native
  val followSymbolicLink: Boolean = js.native
  val fs: FileSystemAdapter = js.native
  val markSymbolicLink: Boolean = js.native
  val throwErrorOnBrokenSymbolicLink: Boolean = js.native
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
    val __obj = js.Dynamic.literal(_getValue = _getValue.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], followSymbolicLink = followSymbolicLink.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], markSymbolicLink = markSymbolicLink.asInstanceOf[js.Any], throwErrorOnBrokenSymbolicLink = throwErrorOnBrokenSymbolicLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_getValue(value: js.Any): Self = this.set("_getValue", value.asInstanceOf[js.Any])
    @scala.inline
    def set_options(value: js.Any): Self = this.set("_options", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowSymbolicLink(value: Boolean): Self = this.set("followSymbolicLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setFs(value: FileSystemAdapter): Self = this.set("fs", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkSymbolicLink(value: Boolean): Self = this.set("markSymbolicLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = this.set("throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
  }
  
}

