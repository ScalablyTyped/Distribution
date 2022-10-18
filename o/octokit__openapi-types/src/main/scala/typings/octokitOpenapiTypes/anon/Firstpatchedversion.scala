package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Firstpatchedversion extends StObject {
  
  @JSName("package")
  var _package: EcosystemName
  
  var first_patched_version: Identifier | Null
  
  var severity: String
  
  var vulnerable_version_range: String
}
object Firstpatchedversion {
  
  inline def apply(_package: EcosystemName, severity: String, vulnerable_version_range: String): Firstpatchedversion = {
    val __obj = js.Dynamic.literal(severity = severity.asInstanceOf[js.Any], vulnerable_version_range = vulnerable_version_range.asInstanceOf[js.Any], first_patched_version = null)
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstpatchedversion]
  }
  
  extension [Self <: Firstpatchedversion](x: Self) {
    
    inline def setFirst_patched_version(value: Identifier): Self = StObject.set(x, "first_patched_version", value.asInstanceOf[js.Any])
    
    inline def setFirst_patched_versionNull: Self = StObject.set(x, "first_patched_version", null)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setVulnerable_version_range(value: String): Self = StObject.set(x, "vulnerable_version_range", value.asInstanceOf[js.Any])
    
    inline def set_package(value: EcosystemName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
