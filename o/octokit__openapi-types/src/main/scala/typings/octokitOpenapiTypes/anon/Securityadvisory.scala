package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.auto_dismissed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dismissed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.fix_started
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.fixed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.inaccurate
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.no_bandwidth
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.not_used
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.tolerable_risk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Securityadvisory extends StObject {
  
  var auto_dismissed_at: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-auto-dismissed-at'] */ js.Any
  ] = js.undefined
  
  var created_at: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-created-at'] */ js.Any
  
  /** @description Details for the vulnerable dependency. */
  var dependency: ManifestpathPackage
  
  var dismissed_at: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-dismissed-at'] */ js.Any
  
  var dismissed_by: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  
  /** @description An optional comment associated with the alert's dismissal. */
  var dismissed_comment: String | Null
  
  /**
    * @description The reason that the alert was dismissed.
    * @enum {string|null}
    */
  var dismissed_reason: fix_started | inaccurate | no_bandwidth | not_used | tolerable_risk | Null
  
  var fixed_at: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-fixed-at'] */ js.Any
  
  var html_url: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-html-url'] */ js.Any
  
  var number: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-number'] */ js.Any
  
  var security_advisory: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-security-advisory'] */ js.Any
  
  var security_vulnerability: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-security-vulnerability'] */ js.Any
  
  /**
    * @description The state of the Dependabot alert.
    * @enum {string}
    */
  var state: auto_dismissed | dismissed | fixed | open
  
  var updated_at: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-updated-at'] */ js.Any
  
  var url: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-url'] */ js.Any
}
object Securityadvisory {
  
  inline def apply(
    created_at: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-created-at'] */ js.Any,
    dependency: ManifestpathPackage,
    dismissed_at: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-dismissed-at'] */ js.Any,
    dismissed_by: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any,
    fixed_at: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-fixed-at'] */ js.Any,
    html_url: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-html-url'] */ js.Any,
    number: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-number'] */ js.Any,
    security_advisory: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-security-advisory'] */ js.Any,
    security_vulnerability: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-security-vulnerability'] */ js.Any,
    state: auto_dismissed | dismissed | fixed | open,
    updated_at: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-updated-at'] */ js.Any,
    url: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-url'] */ js.Any
  ): Securityadvisory = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], dependency = dependency.asInstanceOf[js.Any], dismissed_at = dismissed_at.asInstanceOf[js.Any], dismissed_by = dismissed_by.asInstanceOf[js.Any], fixed_at = fixed_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], security_advisory = security_advisory.asInstanceOf[js.Any], security_vulnerability = security_vulnerability.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], dismissed_comment = null, dismissed_reason = null)
    __obj.asInstanceOf[Securityadvisory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Securityadvisory] (val x: Self) extends AnyVal {
    
    inline def setAuto_dismissed_at(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-auto-dismissed-at'] */ js.Any
    ): Self = StObject.set(x, "auto_dismissed_at", value.asInstanceOf[js.Any])
    
    inline def setAuto_dismissed_atUndefined: Self = StObject.set(x, "auto_dismissed_at", js.undefined)
    
    inline def setCreated_at(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-created-at'] */ js.Any
    ): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDependency(value: ManifestpathPackage): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDismissed_at(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-dismissed-at'] */ js.Any
    ): Self = StObject.set(x, "dismissed_at", value.asInstanceOf[js.Any])
    
    inline def setDismissed_by(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "dismissed_by", value.asInstanceOf[js.Any])
    
    inline def setDismissed_comment(value: String): Self = StObject.set(x, "dismissed_comment", value.asInstanceOf[js.Any])
    
    inline def setDismissed_commentNull: Self = StObject.set(x, "dismissed_comment", null)
    
    inline def setDismissed_reason(value: fix_started | inaccurate | no_bandwidth | not_used | tolerable_risk): Self = StObject.set(x, "dismissed_reason", value.asInstanceOf[js.Any])
    
    inline def setDismissed_reasonNull: Self = StObject.set(x, "dismissed_reason", null)
    
    inline def setFixed_at(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-fixed-at'] */ js.Any
    ): Self = StObject.set(x, "fixed_at", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-html-url'] */ js.Any
    ): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setNumber(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-number'] */ js.Any
    ): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setSecurity_advisory(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-security-advisory'] */ js.Any
    ): Self = StObject.set(x, "security_advisory", value.asInstanceOf[js.Any])
    
    inline def setSecurity_vulnerability(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['dependabot-alert-security-vulnerability'] */ js.Any
    ): Self = StObject.set(x, "security_vulnerability", value.asInstanceOf[js.Any])
    
    inline def setState(value: auto_dismissed | dismissed | fixed | open): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-updated-at'] */ js.Any
    ): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-url'] */ js.Any
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
