package typings.obliviousSet

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("oblivious-set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("oblivious-set", "ObliviousSet")
  @js.native
  open class ObliviousSet[T] protected () extends StObject {
    def this(ttl: Double) = this()
    
    /**
      * Creating calls to setTimeout() is expensive,
      * so we only do that if there is not timeout already open.
      */
    var _to: Boolean = js.native
    
    def add(value: T): Unit = js.native
    
    def clear(): Unit = js.native
    
    def has(value: T): Boolean = js.native
    
    val map: Map[Any, Any] = js.native
    
    val ttl: Double = js.native
  }
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def removeTooOldValues(obliviousSet: ObliviousSet[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTooOldValues")(obliviousSet.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
