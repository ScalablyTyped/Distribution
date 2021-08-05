package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YumSettings extends StObject {
  
  /** List of packages to exclude from update. These packages are excluded by using the yum `--exclude` flag. */
  var excludes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field must not be
    * specified with any other patch configuration fields.
    */
  var exclusivePackages: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Will cause patch to run `yum update-minimal` instead. */
  var minimal: js.UndefOr[Boolean] = js.undefined
  
  /** Adds the `--security` flag to `yum update`. Not supported on all platforms. */
  var security: js.UndefOr[Boolean] = js.undefined
}
object YumSettings {
  
  inline def apply(): YumSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YumSettings]
  }
  
  extension [Self <: YumSettings](x: Self) {
    
    inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value :_*))
    
    inline def setExclusivePackages(value: js.Array[String]): Self = StObject.set(x, "exclusivePackages", value.asInstanceOf[js.Any])
    
    inline def setExclusivePackagesUndefined: Self = StObject.set(x, "exclusivePackages", js.undefined)
    
    inline def setExclusivePackagesVarargs(value: String*): Self = StObject.set(x, "exclusivePackages", js.Array(value :_*))
    
    inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
    
    inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
    
    inline def setSecurity(value: Boolean): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
  }
}
