package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AptSettings extends js.Object {
  
  /** List of packages to exclude from update. These packages will be excluded */
  var excludes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field cannot be
    * specified with any other patch configuration fields.
    */
  var exclusivePackages: js.UndefOr[js.Array[String]] = js.native
  
  /** By changing the type to DIST, the patching is performed using `apt-get dist-upgrade` instead. */
  var `type`: js.UndefOr[String] = js.native
}
object AptSettings {
  
  @scala.inline
  def apply(): AptSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AptSettings]
  }
  
  @scala.inline
  implicit class AptSettingsOps[Self <: AptSettings] (val x: Self) extends AnyVal {
    
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
    def setExcludesVarargs(value: String*): Self = this.set("excludes", js.Array(value :_*))
    
    @scala.inline
    def setExcludes(value: js.Array[String]): Self = this.set("excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludes: Self = this.set("excludes", js.undefined)
    
    @scala.inline
    def setExclusivePackagesVarargs(value: String*): Self = this.set("exclusivePackages", js.Array(value :_*))
    
    @scala.inline
    def setExclusivePackages(value: js.Array[String]): Self = this.set("exclusivePackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusivePackages: Self = this.set("exclusivePackages", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
