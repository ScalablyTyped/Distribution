package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/range/
@js.native
trait Range extends js.Object {
  
  def compare(other: Range): Double = js.native
  
  def containsIndex(index: Double): Boolean = js.native
  
  def containsRange(other: Range): Boolean = js.native
  
  var empty: Boolean = js.native
  
  var end: Double = js.native
  
  def intersection(other: Range): Range = js.native
  
  def intersectsRange(other: Range): Boolean = js.native
  
  def isEqual(other: Range): Boolean = js.native
  
  var length: Double = js.native
  
  var start: Double = js.native
  
  def union(other: Range): Range = js.native
}
object Range {
  
  @scala.inline
  def apply(
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
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompare(value: Range => Double): Self = this.set("compare", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsIndex(value: Double => Boolean): Self = this.set("containsIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsRange(value: Range => Boolean): Self = this.set("containsRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersection(value: Range => Range): Self = this.set("intersection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntersectsRange(value: Range => Boolean): Self = this.set("intersectsRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEqual(value: Range => Boolean): Self = this.set("isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnion(value: Range => Range): Self = this.set("union", js.Any.fromFunction1(value))
  }
}
