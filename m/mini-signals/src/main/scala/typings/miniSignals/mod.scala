package typings.miniSignals

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mini-signals", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with MiniSignal
  
  @js.native
  trait MiniSignal extends StObject {
    
    def add(fn: js.Function): MiniSignalBinding = js.native
    def add(fn: js.Function, thisArg: js.Any): MiniSignalBinding = js.native
    
    def detach(node: MiniSignalBinding): MiniSignal = js.native
    
    def detachAll(): MiniSignal = js.native
    
    def dispatch(args: js.Any*): Boolean = js.native
    
    def handlers(): js.Array[MiniSignalBinding] | Boolean = js.native
    def handlers(exists: Boolean): js.Array[MiniSignalBinding] | Boolean = js.native
    
    def has(node: MiniSignalBinding): Boolean = js.native
    
    def once(fn: js.Function): MiniSignalBinding = js.native
    def once(fn: js.Function, thisArg: js.Any): MiniSignalBinding = js.native
  }
  
  trait MiniSignalBinding extends StObject {
    
    def detach(): Boolean
  }
  object MiniSignalBinding {
    
    @scala.inline
    def apply(detach: () => Boolean): MiniSignalBinding = {
      val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach))
      __obj.asInstanceOf[MiniSignalBinding]
    }
    
    @scala.inline
    implicit class MiniSignalBindingMutableBuilder[Self <: MiniSignalBinding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetach(value: () => Boolean): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    }
  }
}
