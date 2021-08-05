package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVariablesResponse extends StObject {
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** All GTM Variables of a GTM Container. */
  var variable: js.UndefOr[js.Array[Variable]] = js.undefined
}
object ListVariablesResponse {
  
  inline def apply(): ListVariablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVariablesResponse]
  }
  
  extension [Self <: ListVariablesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setVariable(value: js.Array[Variable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    inline def setVariableVarargs(value: Variable*): Self = StObject.set(x, "variable", js.Array(value :_*))
  }
}
