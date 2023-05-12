package typings.opossum

import typings.opossum.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait State extends StObject {
    
    var state: typings.opossum.mod.State
    
    var status: Stats
  }
  object State {
    
    inline def apply(state: typings.opossum.mod.State, status: Stats): State = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setState(value: typings.opossum.mod.State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Stats): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
