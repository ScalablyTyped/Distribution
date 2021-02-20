package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntSet extends StObject {
  
  def add(value: Double): Boolean = js.native
  
  var array: js.Array[Double] = js.native
  
  def clear(): Unit = js.native
  
  def contains(value: Double): Boolean = js.native
  
  def remove(value: Double): Unit = js.native
}
object IntSet {
  
  @scala.inline
  def apply(
    add: Double => Boolean,
    array: js.Array[Double],
    clear: () => Unit,
    contains: Double => Boolean,
    remove: Double => Unit
  ): IntSet = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), array = array.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[IntSet]
  }
  
  @scala.inline
  implicit class IntSetMutableBuilder[Self <: IntSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Double => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArray(value: js.Array[Double]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayVarargs(value: Double*): Self = StObject.set(x, "array", js.Array(value :_*))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContains(value: Double => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
