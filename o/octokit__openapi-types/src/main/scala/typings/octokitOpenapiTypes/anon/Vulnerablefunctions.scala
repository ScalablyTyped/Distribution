package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vulnerablefunctions extends StObject {
  
  /** @description The name of the package affected by the vulnerability. */
  @JSName("package")
  var _package: `521` | Null
  
  /** @description The package version(s) that resolve the vulnerability. */
  var patched_versions: String | Null
  
  /** @description The functions in the package that are affected. */
  var vulnerable_functions: js.Array[String] | Null
  
  /** @description The range of the package versions affected by the vulnerability. */
  var vulnerable_version_range: String | Null
}
object Vulnerablefunctions {
  
  inline def apply(): Vulnerablefunctions = {
    val __obj = js.Dynamic.literal(patched_versions = null, vulnerable_functions = null, vulnerable_version_range = null)
    __obj.updateDynamic("package")(null)
    __obj.asInstanceOf[Vulnerablefunctions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Vulnerablefunctions] (val x: Self) extends AnyVal {
    
    inline def setPatched_versions(value: String): Self = StObject.set(x, "patched_versions", value.asInstanceOf[js.Any])
    
    inline def setPatched_versionsNull: Self = StObject.set(x, "patched_versions", null)
    
    inline def setVulnerable_functions(value: js.Array[String]): Self = StObject.set(x, "vulnerable_functions", value.asInstanceOf[js.Any])
    
    inline def setVulnerable_functionsNull: Self = StObject.set(x, "vulnerable_functions", null)
    
    inline def setVulnerable_functionsVarargs(value: String*): Self = StObject.set(x, "vulnerable_functions", js.Array(value*))
    
    inline def setVulnerable_version_range(value: String): Self = StObject.set(x, "vulnerable_version_range", value.asInstanceOf[js.Any])
    
    inline def setVulnerable_version_rangeNull: Self = StObject.set(x, "vulnerable_version_range", null)
    
    inline def set_package(value: `521`): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageNull: Self = StObject.set(x, "package", null)
  }
}
