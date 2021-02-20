package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBuiltInVariableResponse extends StObject {
  
  /** List of created built-in variables. */
  var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.native
}
object CreateBuiltInVariableResponse {
  
  @scala.inline
  def apply(): CreateBuiltInVariableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBuiltInVariableResponse]
  }
  
  @scala.inline
  implicit class CreateBuiltInVariableResponseMutableBuilder[Self <: CreateBuiltInVariableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuiltInVariable(value: js.Array[BuiltInVariable]): Self = StObject.set(x, "builtInVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltInVariableUndefined: Self = StObject.set(x, "builtInVariable", js.undefined)
    
    @scala.inline
    def setBuiltInVariableVarargs(value: BuiltInVariable*): Self = StObject.set(x, "builtInVariable", js.Array(value :_*))
  }
}
