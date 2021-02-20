package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevertVariableResponse extends StObject {
  
  /**
    * Variable as it appears in the latest container version since the last workspace synchronization operation. If no variable is present, that means the variable was deleted in the
    * latest container version.
    */
  var variable: js.UndefOr[Variable] = js.native
}
object RevertVariableResponse {
  
  @scala.inline
  def apply(): RevertVariableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertVariableResponse]
  }
  
  @scala.inline
  implicit class RevertVariableResponseMutableBuilder[Self <: RevertVariableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVariable(value: Variable): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
  }
}
