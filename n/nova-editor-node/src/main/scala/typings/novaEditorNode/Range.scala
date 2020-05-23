package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/range/
trait Range extends js.Object {
  var empty: Boolean
  var end: Double
  var length: Double
  var start: Double
  def compare(other: Range): Double
  def containsIndex(index: Double): Boolean
  def containsRange(other: Range): Boolean
  def intersection(other: Range): Range
  def intersectsRange(other: Range): Boolean
  def isEqual(other: Range): Boolean
  def union(other: Range): Range
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
}

