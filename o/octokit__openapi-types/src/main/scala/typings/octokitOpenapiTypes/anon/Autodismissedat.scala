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

trait Autodismissedat extends StObject {
  
  var auto_dismissed_at: js.UndefOr[String | Null] = js.undefined
  
  var created_at: String
  
  /** @description Details for the vulnerable dependency. */
  var dependency: Manifestpath
  
  var dismissed_at: String | Null
  
  var dismissed_by: Avatarurl | Null
  
  /** @description An optional comment associated with the alert's dismissal. */
  var dismissed_comment: String | Null
  
  /**
    * @description The reason that the alert was dismissed.
    * @enum {string|null}
    */
  var dismissed_reason: fix_started | inaccurate | no_bandwidth | not_used | tolerable_risk | Null
  
  var fixed_at: String | Null
  
  var html_url: String
  
  var number: Double
  
  var repository: Assigneesurl
  
  var security_advisory: Cvss
  
  var security_vulnerability: Package
  
  /**
    * @description The state of the Dependabot alert.
    * @enum {string}
    */
  var state: auto_dismissed | dismissed | fixed | open
  
  var updated_at: String
  
  var url: String
}
object Autodismissedat {
  
  inline def apply(
    created_at: String,
    dependency: Manifestpath,
    html_url: String,
    number: Double,
    repository: Assigneesurl,
    security_advisory: Cvss,
    security_vulnerability: Package,
    state: auto_dismissed | dismissed | fixed | open,
    updated_at: String,
    url: String
  ): Autodismissedat = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], dependency = dependency.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], security_advisory = security_advisory.asInstanceOf[js.Any], security_vulnerability = security_vulnerability.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], dismissed_at = null, dismissed_by = null, dismissed_comment = null, dismissed_reason = null, fixed_at = null)
    __obj.asInstanceOf[Autodismissedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Autodismissedat] (val x: Self) extends AnyVal {
    
    inline def setAuto_dismissed_at(value: String): Self = StObject.set(x, "auto_dismissed_at", value.asInstanceOf[js.Any])
    
    inline def setAuto_dismissed_atNull: Self = StObject.set(x, "auto_dismissed_at", null)
    
    inline def setAuto_dismissed_atUndefined: Self = StObject.set(x, "auto_dismissed_at", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDependency(value: Manifestpath): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDismissed_at(value: String): Self = StObject.set(x, "dismissed_at", value.asInstanceOf[js.Any])
    
    inline def setDismissed_atNull: Self = StObject.set(x, "dismissed_at", null)
    
    inline def setDismissed_by(value: Avatarurl): Self = StObject.set(x, "dismissed_by", value.asInstanceOf[js.Any])
    
    inline def setDismissed_byNull: Self = StObject.set(x, "dismissed_by", null)
    
    inline def setDismissed_comment(value: String): Self = StObject.set(x, "dismissed_comment", value.asInstanceOf[js.Any])
    
    inline def setDismissed_commentNull: Self = StObject.set(x, "dismissed_comment", null)
    
    inline def setDismissed_reason(value: fix_started | inaccurate | no_bandwidth | not_used | tolerable_risk): Self = StObject.set(x, "dismissed_reason", value.asInstanceOf[js.Any])
    
    inline def setDismissed_reasonNull: Self = StObject.set(x, "dismissed_reason", null)
    
    inline def setFixed_at(value: String): Self = StObject.set(x, "fixed_at", value.asInstanceOf[js.Any])
    
    inline def setFixed_atNull: Self = StObject.set(x, "fixed_at", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Assigneesurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSecurity_advisory(value: Cvss): Self = StObject.set(x, "security_advisory", value.asInstanceOf[js.Any])
    
    inline def setSecurity_vulnerability(value: Package): Self = StObject.set(x, "security_vulnerability", value.asInstanceOf[js.Any])
    
    inline def setState(value: auto_dismissed | dismissed | fixed | open): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
