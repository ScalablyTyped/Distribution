package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`false positive`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`used in tests`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.fixed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatedatDismissedat extends StObject {
  
  /**
    * Format: date-time
    * @description The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ.`
    */
  var created_at: String
  
  /**
    * Format: date-time
    * @description The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var dismissed_at: String | Null
  
  /** User */
  var dismissed_by: Deleted | Null
  
  /**
    * @description The reason for dismissing or closing the alert. Can be one of: `false positive`, `won't fix`, and `used in tests`.
    * @enum {string|null}
    */
  var dismissed_reason: (`false positive`) | (/* won't fix */ String) | (`used in tests`) | _empty | Null
  
  /**
    * Format: uri
    * @description The GitHub URL of the alert resource.
    */
  var html_url: String
  
  /** Format: uri */
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
  var state: fixed
  
  var tool: GuidNameVersion
  
  /** Format: uri */
  var url: String
}
object CreatedatDismissedat {
  
  inline def apply(
    created_at: String,
    html_url: String,
    number: Double,
    rule: Help,
    tool: GuidNameVersion,
    url: String
  ): CreatedatDismissedat = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], state = "fixed", tool = tool.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], dismissed_at = null, dismissed_by = null, dismissed_reason = null)
    __obj.asInstanceOf[CreatedatDismissedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatedatDismissedat] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDismissed_at(value: String): Self = StObject.set(x, "dismissed_at", value.asInstanceOf[js.Any])
    
    inline def setDismissed_atNull: Self = StObject.set(x, "dismissed_at", null)
    
    inline def setDismissed_by(value: Deleted): Self = StObject.set(x, "dismissed_by", value.asInstanceOf[js.Any])
    
    inline def setDismissed_byNull: Self = StObject.set(x, "dismissed_by", null)
    
    inline def setDismissed_reason(value: (`false positive`) | (/* won't fix */ String) | (`used in tests`) | _empty): Self = StObject.set(x, "dismissed_reason", value.asInstanceOf[js.Any])
    
    inline def setDismissed_reasonNull: Self = StObject.set(x, "dismissed_reason", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setInstances_url(value: String): Self = StObject.set(x, "instances_url", value.asInstanceOf[js.Any])
    
    inline def setInstances_urlUndefined: Self = StObject.set(x, "instances_url", js.undefined)
    
    inline def setMost_recent_instance(value: Classifications): Self = StObject.set(x, "most_recent_instance", value.asInstanceOf[js.Any])
    
    inline def setMost_recent_instanceNull: Self = StObject.set(x, "most_recent_instance", null)
    
    inline def setMost_recent_instanceUndefined: Self = StObject.set(x, "most_recent_instance", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setRule(value: Help): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setState(value: fixed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTool(value: GuidNameVersion): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
