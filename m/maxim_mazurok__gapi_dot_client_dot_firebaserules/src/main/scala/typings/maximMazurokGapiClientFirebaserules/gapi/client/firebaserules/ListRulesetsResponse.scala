package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRulesetsResponse extends StObject {
  
  /** The pagination token to retrieve the next page of results. If the value is empty, no further results remain. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of `Ruleset` instances. */
  var rulesets: js.UndefOr[js.Array[Ruleset]] = js.native
}
object ListRulesetsResponse {
  
  @scala.inline
  def apply(): ListRulesetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRulesetsResponse]
  }
  
  @scala.inline
  implicit class ListRulesetsResponseMutableBuilder[Self <: ListRulesetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRulesets(value: js.Array[Ruleset]): Self = StObject.set(x, "rulesets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesetsUndefined: Self = StObject.set(x, "rulesets", js.undefined)
    
    @scala.inline
    def setRulesetsVarargs(value: Ruleset*): Self = StObject.set(x, "rulesets", js.Array(value :_*))
  }
}
