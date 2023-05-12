package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dismissed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.fixed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Affectedrange extends StObject {
  
  var affected_package_name: String
  
  var affected_range: String
  
  var created_at: String
  
  var dismiss_comment: js.UndefOr[String | Null] = js.undefined
  
  var dismiss_reason: js.UndefOr[String] = js.undefined
  
  var dismissed_at: js.UndefOr[String] = js.undefined
  
  /** User */
  var dismisser: js.UndefOr[Deleted | Null] = js.undefined
  
  var external_identifier: String
  
  /** Format: uri */
  var external_reference: String | Null
  
  var fix_reason: js.UndefOr[String] = js.undefined
  
  /** Format: date-time */
  var fixed_at: js.UndefOr[String] = js.undefined
  
  var fixed_in: js.UndefOr[String] = js.undefined
  
  var ghsa_id: String
  
  var id: Double
  
  var node_id: String
  
  var number: Double
  
  var severity: String
  
  /** @enum {string} */
  var state: open | dismissed | fixed
}
object Affectedrange {
  
  inline def apply(
    affected_package_name: String,
    affected_range: String,
    created_at: String,
    external_identifier: String,
    ghsa_id: String,
    id: Double,
    node_id: String,
    number: Double,
    severity: String,
    state: open | dismissed | fixed
  ): Affectedrange = {
    val __obj = js.Dynamic.literal(affected_package_name = affected_package_name.asInstanceOf[js.Any], affected_range = affected_range.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], external_identifier = external_identifier.asInstanceOf[js.Any], ghsa_id = ghsa_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], external_reference = null)
    __obj.asInstanceOf[Affectedrange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Affectedrange] (val x: Self) extends AnyVal {
    
    inline def setAffected_package_name(value: String): Self = StObject.set(x, "affected_package_name", value.asInstanceOf[js.Any])
    
    inline def setAffected_range(value: String): Self = StObject.set(x, "affected_range", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDismiss_comment(value: String): Self = StObject.set(x, "dismiss_comment", value.asInstanceOf[js.Any])
    
    inline def setDismiss_commentNull: Self = StObject.set(x, "dismiss_comment", null)
    
    inline def setDismiss_commentUndefined: Self = StObject.set(x, "dismiss_comment", js.undefined)
    
    inline def setDismiss_reason(value: String): Self = StObject.set(x, "dismiss_reason", value.asInstanceOf[js.Any])
    
    inline def setDismiss_reasonUndefined: Self = StObject.set(x, "dismiss_reason", js.undefined)
    
    inline def setDismissed_at(value: String): Self = StObject.set(x, "dismissed_at", value.asInstanceOf[js.Any])
    
    inline def setDismissed_atUndefined: Self = StObject.set(x, "dismissed_at", js.undefined)
    
    inline def setDismisser(value: Deleted): Self = StObject.set(x, "dismisser", value.asInstanceOf[js.Any])
    
    inline def setDismisserNull: Self = StObject.set(x, "dismisser", null)
    
    inline def setDismisserUndefined: Self = StObject.set(x, "dismisser", js.undefined)
    
    inline def setExternal_identifier(value: String): Self = StObject.set(x, "external_identifier", value.asInstanceOf[js.Any])
    
    inline def setExternal_reference(value: String): Self = StObject.set(x, "external_reference", value.asInstanceOf[js.Any])
    
    inline def setExternal_referenceNull: Self = StObject.set(x, "external_reference", null)
    
    inline def setFix_reason(value: String): Self = StObject.set(x, "fix_reason", value.asInstanceOf[js.Any])
    
    inline def setFix_reasonUndefined: Self = StObject.set(x, "fix_reason", js.undefined)
    
    inline def setFixed_at(value: String): Self = StObject.set(x, "fixed_at", value.asInstanceOf[js.Any])
    
    inline def setFixed_atUndefined: Self = StObject.set(x, "fixed_at", js.undefined)
    
    inline def setFixed_in(value: String): Self = StObject.set(x, "fixed_in", value.asInstanceOf[js.Any])
    
    inline def setFixed_inUndefined: Self = StObject.set(x, "fixed_in", js.undefined)
    
    inline def setGhsa_id(value: String): Self = StObject.set(x, "ghsa_id", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setState(value: open | dismissed | fixed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
