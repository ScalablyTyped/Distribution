package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requiredapprovingreviewcount extends StObject {
  
  var _links: Self
  
  var commit: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit'] */ js.Any
  
  var name: String
  
  /** @example "mas*" */
  var pattern: js.UndefOr[String] = js.undefined
  
  var `protected`: Boolean
  
  var protection: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['branch-protection'] */ js.Any
  
  /** Format: uri */
  var protection_url: String
  
  /** @example 1 */
  var required_approving_review_count: js.UndefOr[Double] = js.undefined
}
object Requiredapprovingreviewcount {
  
  inline def apply(
    _links: Self,
    commit: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit'] */ js.Any,
    name: String,
    `protected`: Boolean,
    protection: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['branch-protection'] */ js.Any,
    protection_url: String
  ): Requiredapprovingreviewcount = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], protection_url = protection_url.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requiredapprovingreviewcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Requiredapprovingreviewcount] (val x: Self) extends AnyVal {
    
    inline def setCommit(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['commit'] */ js.Any
    ): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtection(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['branch-protection'] */ js.Any
    ): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtection_url(value: String): Self = StObject.set(x, "protection_url", value.asInstanceOf[js.Any])
    
    inline def setRequired_approving_review_count(value: Double): Self = StObject.set(x, "required_approving_review_count", value.asInstanceOf[js.Any])
    
    inline def setRequired_approving_review_countUndefined: Self = StObject.set(x, "required_approving_review_count", js.undefined)
    
    inline def set_links(value: typings.octokitOpenapiTypes.anon.Self): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
