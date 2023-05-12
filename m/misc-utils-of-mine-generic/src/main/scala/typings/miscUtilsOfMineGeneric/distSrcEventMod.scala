package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEventMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/event", "Emitter")
  @js.native
  open class Emitter[E, L /* <: Listener[E] */] () extends StObject {
    
    def add(l: L): Unit = js.native
    
    def emit(e: E): Unit = js.native
    
    /* private */ var l: Any = js.native
    
    def remove(l: L): Unit = js.native
  }
  
  type Listener[E] = js.Function1[/* e */ E, Unit]
}
