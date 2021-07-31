package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindThreatMatchesResponse extends StObject {
  
  /** The threat list matches. */
  var matches: js.UndefOr[js.Array[ThreatMatch]] = js.undefined
}
object FindThreatMatchesResponse {
  
  @scala.inline
  def apply(): FindThreatMatchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindThreatMatchesResponse]
  }
  
  @scala.inline
  implicit class FindThreatMatchesResponseMutableBuilder[Self <: FindThreatMatchesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatches(value: js.Array[ThreatMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    @scala.inline
    def setMatchesVarargs(value: ThreatMatch*): Self = StObject.set(x, "matches", js.Array(value :_*))
  }
}
