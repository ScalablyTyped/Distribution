package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Dictk
import typings.octokitTypes.anon.Severity
import typings.octokitTypes.anon.Version
import typings.octokitTypes.octokitTypesStrings.`false positive`
import typings.octokitTypes.octokitTypesStrings.`used in tests`
import typings.octokitTypes.octokitTypesStrings.`wonApostrophet fix`
import typings.octokitTypes.octokitTypesStrings.dismissed
import typings.octokitTypes.octokitTypesStrings.fixed
import typings.octokitTypes.octokitTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeScanningUpdateAlertResponseData extends StObject {
  
  /**
    * The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var created_at: String
  
  /**
    * The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var dismissed_at: String
  
  var dismissed_by: Dictk | Null
  
  /**
    * **Required when the state is dismissed.** The reason for dismissing or closing the alert. Can be one of: `false positive`, `won't fix`, and `used in tests`.
    */
  var dismissed_reason: (`false positive`) | (`wonApostrophet fix`) | (`used in tests`) | Null
  
  /**
    * The GitHub URL of the alert resource.
    */
  var html_url: String
  
  var instances: js.Array[js.Any]
  
  /**
    * The code scanning alert number.
    */
  var number: Double
  
  var rule: Severity
  
  /**
    * State of a code scanning alert.
    */
  var state: open | dismissed | fixed
  
  var tool: Version
  
  /**
    * The REST API URL of the alert resource.
    */
  var url: String
}
object CodeScanningUpdateAlertResponseData {
  
  inline def apply(
    created_at: String,
    dismissed_at: String,
    html_url: String,
    instances: js.Array[js.Any],
    number: Double,
    rule: Severity,
    state: open | dismissed | fixed,
    tool: Version,
    url: String
  ): CodeScanningUpdateAlertResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], dismissed_at = dismissed_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], dismissed_by = null, dismissed_reason = null)
    __obj.asInstanceOf[CodeScanningUpdateAlertResponseData]
  }
  
  extension [Self <: CodeScanningUpdateAlertResponseData](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDismissed_at(value: String): Self = StObject.set(x, "dismissed_at", value.asInstanceOf[js.Any])
    
    inline def setDismissed_by(value: Dictk): Self = StObject.set(x, "dismissed_by", value.asInstanceOf[js.Any])
    
    inline def setDismissed_byNull: Self = StObject.set(x, "dismissed_by", null)
    
    inline def setDismissed_reason(value: (`false positive`) | (`wonApostrophet fix`) | (`used in tests`)): Self = StObject.set(x, "dismissed_reason", value.asInstanceOf[js.Any])
    
    inline def setDismissed_reasonNull: Self = StObject.set(x, "dismissed_reason", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setInstances(value: js.Array[js.Any]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesVarargs(value: js.Any*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setRule(value: Severity): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setState(value: open | dismissed | fixed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTool(value: Version): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
