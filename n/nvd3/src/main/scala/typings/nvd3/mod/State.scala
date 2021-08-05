package typings.nvd3.mod

import typings.d3Dispatch.mod.Dispatch_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var dispatch: Dispatch_[js.Object]
}
object State {
  
  inline def apply(dispatch: Dispatch_[js.Object]): State = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setDispatch(value: Dispatch_[js.Object]): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
  }
}
