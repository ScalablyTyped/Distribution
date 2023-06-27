package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackagePatchedversions extends StObject {
  
  /** @description The name of the package affected by the vulnerability. */
  @JSName("package")
  var _package: `761`
  
  /** @description The package version(s) that resolve the vulnerability. */
  var patched_versions: js.UndefOr[String | Null] = js.undefined
  
  /** @description The functions in the package that are affected. */
  var vulnerable_functions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** @description The range of the package versions affected by the vulnerability. */
  var vulnerable_version_range: js.UndefOr[String | Null] = js.undefined
}
object PackagePatchedversions {
  
  inline def apply(_package: `761`): PackagePatchedversions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackagePatchedversions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackagePatchedversions] (val x: Self) extends AnyVal {
    
    inline def setPatched_versions(value: String): Self = StObject.set(x, "patched_versions", value.asInstanceOf[js.Any])
    
    inline def setPatched_versionsNull: Self = StObject.set(x, "patched_versions", null)
    
    inline def setPatched_versionsUndefined: Self = StObject.set(x, "patched_versions", js.undefined)
    
    inline def setVulnerable_functions(value: js.Array[String]): Self = StObject.set(x, "vulnerable_functions", value.asInstanceOf[js.Any])
    
    inline def setVulnerable_functionsNull: Self = StObject.set(x, "vulnerable_functions", null)
    
    inline def setVulnerable_functionsUndefined: Self = StObject.set(x, "vulnerable_functions", js.undefined)
    
    inline def setVulnerable_functionsVarargs(value: String*): Self = StObject.set(x, "vulnerable_functions", js.Array(value*))
    
    inline def setVulnerable_version_range(value: String): Self = StObject.set(x, "vulnerable_version_range", value.asInstanceOf[js.Any])
    
    inline def setVulnerable_version_rangeNull: Self = StObject.set(x, "vulnerable_version_range", null)
    
    inline def setVulnerable_version_rangeUndefined: Self = StObject.set(x, "vulnerable_version_range", js.undefined)
    
    inline def set_package(value: `761`): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
