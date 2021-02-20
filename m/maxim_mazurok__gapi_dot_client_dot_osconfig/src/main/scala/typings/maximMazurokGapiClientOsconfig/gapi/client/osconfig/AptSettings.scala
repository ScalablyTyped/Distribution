package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AptSettings extends StObject {
  
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
  implicit class AptSettingsMutableBuilder[Self <: AptSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    @scala.inline
    def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value :_*))
    
    @scala.inline
    def setExclusivePackages(value: js.Array[String]): Self = StObject.set(x, "exclusivePackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusivePackagesUndefined: Self = StObject.set(x, "exclusivePackages", js.undefined)
    
    @scala.inline
    def setExclusivePackagesVarargs(value: String*): Self = StObject.set(x, "exclusivePackages", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
