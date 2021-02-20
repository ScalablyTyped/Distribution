package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEnabledBuiltInVariablesResponse extends StObject {
  
  /** All GTM BuiltInVariables of a GTM container. */
  var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.native
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListEnabledBuiltInVariablesResponse {
  
  @scala.inline
  def apply(): ListEnabledBuiltInVariablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnabledBuiltInVariablesResponse]
  }
  
  @scala.inline
  implicit class ListEnabledBuiltInVariablesResponseMutableBuilder[Self <: ListEnabledBuiltInVariablesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuiltInVariable(value: js.Array[BuiltInVariable]): Self = StObject.set(x, "builtInVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltInVariableUndefined: Self = StObject.set(x, "builtInVariable", js.undefined)
    
    @scala.inline
    def setBuiltInVariableVarargs(value: BuiltInVariable*): Self = StObject.set(x, "builtInVariable", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
