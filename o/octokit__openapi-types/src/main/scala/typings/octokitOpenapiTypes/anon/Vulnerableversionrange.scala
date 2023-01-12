package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vulnerableversionrange extends StObject {
  
  @JSName("package")
  var _package: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-package'] */ js.Any
  ] = js.undefined
  
  var first_patched_version: js.UndefOr[`390`] = js.undefined
  
  var severity: js.UndefOr[String] = js.undefined
  
  var vulnerable_version_range: js.UndefOr[String] = js.undefined
}
object Vulnerableversionrange {
  
  inline def apply(): Vulnerableversionrange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vulnerableversionrange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Vulnerableversionrange] (val x: Self) extends AnyVal {
    
    inline def setFirst_patched_version(value: `390`): Self = StObject.set(x, "first_patched_version", value.asInstanceOf[js.Any])
    
    inline def setFirst_patched_versionUndefined: Self = StObject.set(x, "first_patched_version", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setVulnerable_version_range(value: String): Self = StObject.set(x, "vulnerable_version_range", value.asInstanceOf[js.Any])
    
    inline def setVulnerable_version_rangeUndefined: Self = StObject.set(x, "vulnerable_version_range", js.undefined)
    
    inline def set_package(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-package'] */ js.Any
    ): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
