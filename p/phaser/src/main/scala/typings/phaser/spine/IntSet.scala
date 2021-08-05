package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntSet extends StObject {
  
  def add(value: Double): Boolean
  
  var array: js.Array[Double]
  
  def clear(): Unit
  
  def contains(value: Double): Boolean
  
  def remove(value: Double): Unit
}
object IntSet {
  
  inline def apply(
    add: Double => Boolean,
    array: js.Array[Double],
    clear: () => Unit,
    contains: Double => Boolean,
    remove: Double => Unit
  ): IntSet = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), array = array.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[IntSet]
  }
  
  extension [Self <: IntSet](x: Self) {
    
    inline def setAdd(value: Double => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setArray(value: js.Array[Double]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: Double*): Self = StObject.set(x, "array", js.Array(value :_*))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setContains(value: Double => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
