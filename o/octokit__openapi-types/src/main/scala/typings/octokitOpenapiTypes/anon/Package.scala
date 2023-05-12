package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.critical
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.high
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.low
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Package extends StObject {
  
  @JSName("package")
  val _package: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-package'] */ js.Any
  
  /** @description Details pertaining to the package version that patches this vulnerability. */
  val first_patched_version: IdentifierString | Null
  
  /**
    * @description The severity of the vulnerability.
    * @enum {string}
    */
  val severity: low | medium | high | critical
  
  /** @description Conditions that identify vulnerable versions of this vulnerability's package. */
  val vulnerable_version_range: String
}
object Package {
  
  inline def apply(
    _package: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-package'] */ js.Any,
    severity: low | medium | high | critical,
    vulnerable_version_range: String
  ): Package = {
    val __obj = js.Dynamic.literal(severity = severity.asInstanceOf[js.Any], vulnerable_version_range = vulnerable_version_range.asInstanceOf[js.Any], first_patched_version = null)
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
    
    inline def setFirst_patched_version(value: IdentifierString): Self = StObject.set(x, "first_patched_version", value.asInstanceOf[js.Any])
    
    inline def setFirst_patched_versionNull: Self = StObject.set(x, "first_patched_version", null)
    
    inline def setSeverity(value: low | medium | high | critical): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setVulnerable_version_range(value: String): Self = StObject.set(x, "vulnerable_version_range", value.asInstanceOf[js.Any])
    
    inline def set_package(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-package'] */ js.Any
    ): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
