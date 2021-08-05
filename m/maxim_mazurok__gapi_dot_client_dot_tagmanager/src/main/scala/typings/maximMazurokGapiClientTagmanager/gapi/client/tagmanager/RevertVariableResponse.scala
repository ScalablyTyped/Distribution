package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevertVariableResponse extends StObject {
  
  /**
    * Variable as it appears in the latest container version since the last workspace synchronization operation. If no variable is present, that means the variable was deleted in the
    * latest container version.
    */
  var variable: js.UndefOr[Variable] = js.undefined
}
object RevertVariableResponse {
  
  inline def apply(): RevertVariableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertVariableResponse]
  }
  
  extension [Self <: RevertVariableResponse](x: Self) {
    
    inline def setVariable(value: Variable): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
  }
}
