package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeWeightedDigraph extends StObject {
  
  def add(start: Double, end: Double, weight: Double): Unit = js.native
  
  def e(): Double = js.native
  
  def v(): Double = js.native
}
object EdgeWeightedDigraph {
  
  @scala.inline
  def apply(add: (Double, Double, Double) => Unit, e: () => Double, v: () => Double): EdgeWeightedDigraph = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), e = js.Any.fromFunction0(e), v = js.Any.fromFunction0(v))
    __obj.asInstanceOf[EdgeWeightedDigraph]
  }
  
  @scala.inline
  implicit class EdgeWeightedDigraphMutableBuilder[Self <: EdgeWeightedDigraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
    
    @scala.inline
    def setE(value: () => Double): Self = StObject.set(x, "e", js.Any.fromFunction0(value))
    
    @scala.inline
    def setV(value: () => Double): Self = StObject.set(x, "v", js.Any.fromFunction0(value))
  }
}
