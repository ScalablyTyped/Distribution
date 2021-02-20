package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVariablesResponse extends StObject {
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** All GTM Variables of a GTM Container. */
  var variable: js.UndefOr[js.Array[Variable]] = js.native
}
object ListVariablesResponse {
  
  @scala.inline
  def apply(): ListVariablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVariablesResponse]
  }
  
  @scala.inline
  implicit class ListVariablesResponseMutableBuilder[Self <: ListVariablesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setVariable(value: js.Array[Variable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    @scala.inline
    def setVariableVarargs(value: Variable*): Self = StObject.set(x, "variable", js.Array(value :_*))
  }
}
