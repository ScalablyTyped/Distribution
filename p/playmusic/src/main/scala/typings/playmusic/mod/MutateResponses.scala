package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutateResponses extends StObject {
  
  var mutate_response: js.UndefOr[js.Array[MutateResponse]] = js.undefined
}
object MutateResponses {
  
  inline def apply(): MutateResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutateResponses]
  }
  
  extension [Self <: MutateResponses](x: Self) {
    
    inline def setMutate_response(value: js.Array[MutateResponse]): Self = StObject.set(x, "mutate_response", value.asInstanceOf[js.Any])
    
    inline def setMutate_responseUndefined: Self = StObject.set(x, "mutate_response", js.undefined)
    
    inline def setMutate_responseVarargs(value: MutateResponse*): Self = StObject.set(x, "mutate_response", js.Array(value :_*))
  }
}
