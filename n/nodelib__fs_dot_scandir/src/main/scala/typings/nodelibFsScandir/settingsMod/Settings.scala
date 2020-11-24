package typings.nodelibFsScandir.settingsMod

import typings.nodelibFsScandir.fsMod.FileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  var _getValue: js.Any = js.native
  
  val _options: js.Any = js.native
  
  val followSymbolicLinks: Boolean = js.native
  
  val fs: FileSystemAdapter = js.native
  
  val fsStatSettings: typings.nodelibFsStat.mod.Settings = js.native
  
  val pathSegmentSeparator: String = js.native
  
  val stats: Boolean = js.native
  
  val throwErrorOnBrokenSymbolicLink: Boolean = js.native
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
    def setFollowSymbolicLinks(value: Boolean): Self = this.set("followSymbolicLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFs(value: FileSystemAdapter): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsStatSettings(value: typings.nodelibFsStat.mod.Settings): Self = this.set("fsStatSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegmentSeparator(value: String): Self = this.set("pathSegmentSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Boolean): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = this.set("throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
  }
}
