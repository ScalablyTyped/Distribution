package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/range/
trait Range
  extends StObject
     with _Transferrable {
  
  def compare(other: Range): Double
  
  def containsIndex(index: Double): Boolean
  
  def containsRange(other: Range): Boolean
  
  var empty: Boolean
  
  var end: Double
  
  def intersection(other: Range): Range
  
  def intersectsRange(other: Range): Boolean
  
  def isEqual(other: Range): Boolean
  
  var length: Double
  
  var start: Double
  
  def union(other: Range): Range
}
object Range {
  
  inline def apply(
    compare: Range => Double,
    containsIndex: Double => Boolean,
    containsRange: Range => Boolean,
    empty: Boolean,
    end: Double,
    intersection: Range => Range,
    intersectsRange: Range => Boolean,
    isEqual: Range => Boolean,
    length: Double,
    start: Double,
    union: Range => Range
  ): Range = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction1(compare), containsIndex = js.Any.fromFunction1(containsIndex), containsRange = js.Any.fromFunction1(containsRange), empty = empty.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], intersection = js.Any.fromFunction1(intersection), intersectsRange = js.Any.fromFunction1(intersectsRange), isEqual = js.Any.fromFunction1(isEqual), length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], union = js.Any.fromFunction1(union))
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    inline def setCompare(value: Range => Double): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
    
    inline def setContainsIndex(value: Double => Boolean): Self = StObject.set(x, "containsIndex", js.Any.fromFunction1(value))
    
    inline def setContainsRange(value: Range => Boolean): Self = StObject.set(x, "containsRange", js.Any.fromFunction1(value))
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setIntersection(value: Range => Range): Self = StObject.set(x, "intersection", js.Any.fromFunction1(value))
    
    inline def setIntersectsRange(value: Range => Boolean): Self = StObject.set(x, "intersectsRange", js.Any.fromFunction1(value))
    
    inline def setIsEqual(value: Range => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setUnion(value: Range => Range): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
  }
}
