package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`false positive`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`used in tests`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dismissed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.fixed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dismissedby extends StObject {
  
  var created_at: String
  
  var dismissed_at: String | Null
  
  var dismissed_by: Avatarurl | Null
  
  var dismissed_comment: js.UndefOr[String | Null] = js.undefined
  
  var dismissed_reason: Null | (`false positive`) | (/* won't fix */ String) | (`used in tests`)
  
  var fixed_at: js.UndefOr[String | Null] = js.undefined
  
  var html_url: String
  
  var instances_url: String
  
  var most_recent_instance: Category
  
  var number: Double
  
  var rule: Severity
  
  var state: open | closed | dismissed | fixed
  
  var tool: Version
  
  var updated_at: js.UndefOr[String] = js.undefined
  
  var url: String
}
object Dismissedby {
  
  inline def apply(
    created_at: String,
    html_url: String,
    instances_url: String,
    most_recent_instance: Category,
    number: Double,
    rule: Severity,
    state: open | closed | dismissed | fixed,
    tool: Version,
    url: String
  ): Dismissedby = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], instances_url = instances_url.asInstanceOf[js.Any], most_recent_instance = most_recent_instance.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], dismissed_at = null, dismissed_by = null, dismissed_reason = null)
    __obj.asInstanceOf[Dismissedby]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dismissedby] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDismissed_at(value: String): Self = StObject.set(x, "dismissed_at", value.asInstanceOf[js.Any])
    
    inline def setDismissed_atNull: Self = StObject.set(x, "dismissed_at", null)
    
    inline def setDismissed_by(value: Avatarurl): Self = StObject.set(x, "dismissed_by", value.asInstanceOf[js.Any])
    
    inline def setDismissed_byNull: Self = StObject.set(x, "dismissed_by", null)
    
    inline def setDismissed_comment(value: String): Self = StObject.set(x, "dismissed_comment", value.asInstanceOf[js.Any])
    
    inline def setDismissed_commentNull: Self = StObject.set(x, "dismissed_comment", null)
    
    inline def setDismissed_commentUndefined: Self = StObject.set(x, "dismissed_comment", js.undefined)
    
    inline def setDismissed_reason(value: (`false positive`) | (/* won't fix */ String) | (`used in tests`)): Self = StObject.set(x, "dismissed_reason", value.asInstanceOf[js.Any])
    
    inline def setDismissed_reasonNull: Self = StObject.set(x, "dismissed_reason", null)
    
    inline def setFixed_at(value: String): Self = StObject.set(x, "fixed_at", value.asInstanceOf[js.Any])
    
    inline def setFixed_atNull: Self = StObject.set(x, "fixed_at", null)
    
    inline def setFixed_atUndefined: Self = StObject.set(x, "fixed_at", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setInstances_url(value: String): Self = StObject.set(x, "instances_url", value.asInstanceOf[js.Any])
    
    inline def setMost_recent_instance(value: Category): Self = StObject.set(x, "most_recent_instance", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setRule(value: Severity): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setState(value: open | closed | dismissed | fixed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTool(value: Version): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
