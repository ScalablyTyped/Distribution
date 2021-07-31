package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutateResponses extends StObject {
  
  var mutate_response: js.UndefOr[js.Array[MutateResponse]] = js.undefined
}
object MutateResponses {
  
  @scala.inline
  def apply(): MutateResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutateResponses]
  }
  
  @scala.inline
  implicit class MutateResponsesMutableBuilder[Self <: MutateResponses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMutate_response(value: js.Array[MutateResponse]): Self = StObject.set(x, "mutate_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutate_responseUndefined: Self = StObject.set(x, "mutate_response", js.undefined)
    
    @scala.inline
    def setMutate_responseVarargs(value: MutateResponse*): Self = StObject.set(x, "mutate_response", js.Array(value :_*))
  }
}
