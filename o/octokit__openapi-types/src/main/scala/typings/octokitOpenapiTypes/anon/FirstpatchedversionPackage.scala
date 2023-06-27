package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstpatchedversionPackage extends StObject {
  
  @JSName("package")
  var _package: EcosystemString
  
  var first_patched_version: `545` | Null
  
  var severity: String
  
  var vulnerable_version_range: String
}
object FirstpatchedversionPackage {
  
  inline def apply(_package: EcosystemString, severity: String, vulnerable_version_range: String): FirstpatchedversionPackage = {
    val __obj = js.Dynamic.literal(severity = severity.asInstanceOf[js.Any], vulnerable_version_range = vulnerable_version_range.asInstanceOf[js.Any], first_patched_version = null)
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstpatchedversionPackage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstpatchedversionPackage] (val x: Self) extends AnyVal {
    
    inline def setFirst_patched_version(value: `545`): Self = StObject.set(x, "first_patched_version", value.asInstanceOf[js.Any])
    
    inline def setFirst_patched_versionNull: Self = StObject.set(x, "first_patched_version", null)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setVulnerable_version_range(value: String): Self = StObject.set(x, "vulnerable_version_range", value.asInstanceOf[js.Any])
    
    inline def set_package(value: EcosystemString): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
