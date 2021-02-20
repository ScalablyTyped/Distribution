package typings.multimap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Done extends StObject {
    
    var done: Boolean = js.native
    
    var value: js.Any = js.native
  }
  object Done {
    
    @scala.inline
    def apply(done: Boolean, value: js.Any): Done = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done]
    }
    
    @scala.inline
    implicit class DoneMutableBuilder[Self <: Done] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Iterator extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[_] = js.native
    
    def next(): Done = js.native
  }
}
