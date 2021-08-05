package typings.multimap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Done extends StObject {
    
    var done: Boolean
    
    var value: js.Any
  }
  object Done {
    
    inline def apply(done: Boolean, value: js.Any): Done = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done]
    }
    
    extension [Self <: Done](x: Self) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Iterator extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[js.Any] = js.native
    
    def next(): Done = js.native
  }
}
