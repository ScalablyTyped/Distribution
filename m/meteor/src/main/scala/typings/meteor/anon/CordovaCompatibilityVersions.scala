package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaCompatibilityVersions extends js.Object {
  
  var PUBLIC_SETTINGS: js.Any = js.native
  
  var cordovaCompatibilityVersions: js.UndefOr[js.Any] = js.native
  
  var format: String = js.native
  
  var manifest: js.Any = js.native
  
  var version: String = js.native
}
object CordovaCompatibilityVersions {
  
  @scala.inline
  def apply(PUBLIC_SETTINGS: js.Any, format: String, manifest: js.Any, version: String): CordovaCompatibilityVersions = {
    val __obj = js.Dynamic.literal(PUBLIC_SETTINGS = PUBLIC_SETTINGS.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaCompatibilityVersions]
  }
  
  @scala.inline
  implicit class CordovaCompatibilityVersionsOps[Self <: CordovaCompatibilityVersions] (val x: Self) extends AnyVal {
    
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
    def setPUBLIC_SETTINGS(value: js.Any): Self = this.set("PUBLIC_SETTINGS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifest(value: js.Any): Self = this.set("manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCordovaCompatibilityVersions(value: js.Any): Self = this.set("cordovaCompatibilityVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCordovaCompatibilityVersions: Self = this.set("cordovaCompatibilityVersions", js.undefined)
  }
}
