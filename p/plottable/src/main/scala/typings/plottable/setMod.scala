package typings.plottable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setMod {
  
  @JSImport("plottable/build/src/utils/set", "Set")
  @js.native
  open class Set[T] () extends StObject {
    
    /* private */ var _es6Set: Any = js.native
    
    /* private */ var _values: Any = js.native
    
    def add(value: T): this.type = js.native
    
    def delete(value: T): Boolean = js.native
    
    def forEach(callback: js.Function3[/* value */ T, /* value2 */ T, /* set */ Set[T], Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ T, /* value2 */ T, /* set */ Set[T], Unit], thisArg: Any): Unit = js.native
    
    def has(value: T): Boolean = js.native
    
    var size: Double = js.native
  }
}
