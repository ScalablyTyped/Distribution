package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dismissed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instancesurl extends StObject {
  
  /**
    * Format: date-time
    * @description The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ.`
    */
  var created_at: String | Null
  
  /** @description The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. */
  var dismissed_at: (Record[String, Any]) | Null
  
  var dismissed_by: (Record[String, Any]) | Null
  
  var dismissed_comment: js.UndefOr[String | Null] = js.undefined
  
  /** @description The reason for dismissing or closing the alert. Can be one of: `false positive`, `won't fix`, and `used in tests`. */
  var dismissed_reason: (Record[String, Any]) | Null
  
  var fixed_at: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
  
  /**
    * Format: uri
    * @description The GitHub URL of the alert resource.
    */
  var html_url: String
  
  var instances_url: js.UndefOr[String] = js.undefined
  
  /** Alert Instance */
  var most_recent_instance: js.UndefOr[Classifications | Null] = js.undefined
  
  /** @description The code scanning alert number. */
  var number: Double
  
  var rule: Help
  
  /**
    * @description State of a code scanning alert.
    * @enum {string}
    */
  var state: open | dismissed
  
  var tool: GuidNameVersion | Null
  
  var updated_at: js.UndefOr[String | Null] = js.undefined
  
  /** Format: uri */
  var url: String
}
object Instancesurl {
  
  inline def apply(html_url: String, number: Double, rule: Help, state: open | dismissed, url: String): Instancesurl = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], created_at = null, dismissed_at = null, dismissed_by = null, dismissed_reason = null, tool = null)
    __obj.asInstanceOf[Instancesurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Instancesurl] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atNull: Self = StObject.set(x, "created_at", null)
    
    inline def setDismissed_at(value: Record[String, Any]): Self = StObject.set(x, "dismissed_at", value.asInstanceOf[js.Any])
    
    inline def setDismissed_atNull: Self = StObject.set(x, "dismissed_at", null)
    
    inline def setDismissed_by(value: Record[String, Any]): Self = StObject.set(x, "dismissed_by", value.asInstanceOf[js.Any])
    
    inline def setDismissed_byNull: Self = StObject.set(x, "dismissed_by", null)
    
    inline def setDismissed_comment(value: String): Self = StObject.set(x, "dismissed_comment", value.asInstanceOf[js.Any])
    
    inline def setDismissed_commentNull: Self = StObject.set(x, "dismissed_comment", null)
    
    inline def setDismissed_commentUndefined: Self = StObject.set(x, "dismissed_comment", js.undefined)
    
    inline def setDismissed_reason(value: Record[String, Any]): Self = StObject.set(x, "dismissed_reason", value.asInstanceOf[js.Any])
    
    inline def setDismissed_reasonNull: Self = StObject.set(x, "dismissed_reason", null)
    
    inline def setFixed_at(value: Record[String, Any]): Self = StObject.set(x, "fixed_at", value.asInstanceOf[js.Any])
    
    inline def setFixed_atNull: Self = StObject.set(x, "fixed_at", null)
    
    inline def setFixed_atUndefined: Self = StObject.set(x, "fixed_at", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setInstances_url(value: String): Self = StObject.set(x, "instances_url", value.asInstanceOf[js.Any])
    
    inline def setInstances_urlUndefined: Self = StObject.set(x, "instances_url", js.undefined)
    
    inline def setMost_recent_instance(value: Classifications): Self = StObject.set(x, "most_recent_instance", value.asInstanceOf[js.Any])
    
    inline def setMost_recent_instanceNull: Self = StObject.set(x, "most_recent_instance", null)
    
    inline def setMost_recent_instanceUndefined: Self = StObject.set(x, "most_recent_instance", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setRule(value: Help): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setState(value: open | dismissed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTool(value: GuidNameVersion): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setToolNull: Self = StObject.set(x, "tool", null)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
