package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRulesetsResponse extends StObject {
  
  /** The pagination token to retrieve the next page of results. If the value is empty, no further results remain. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of `Ruleset` instances. */
  var rulesets: js.UndefOr[js.Array[Ruleset]] = js.undefined
}
object ListRulesetsResponse {
  
  inline def apply(): ListRulesetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRulesetsResponse]
  }
  
  extension [Self <: ListRulesetsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRulesets(value: js.Array[Ruleset]): Self = StObject.set(x, "rulesets", value.asInstanceOf[js.Any])
    
    inline def setRulesetsUndefined: Self = StObject.set(x, "rulesets", js.undefined)
    
    inline def setRulesetsVarargs(value: Ruleset*): Self = StObject.set(x, "rulesets", js.Array(value :_*))
  }
}
