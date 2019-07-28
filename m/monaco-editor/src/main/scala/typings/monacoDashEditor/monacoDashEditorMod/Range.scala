package typings.monacoDashEditor.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "Range")
@js.native
class Range protected () extends js.Object {
  def this(startLineNumber: Double, startColumn: Double, endLineNumber: Double, endColumn: Double) = this()
  /**
    * Column on which the range ends in line `endLineNumber`.
    */
  val endColumn: Double = js.native
  /**
    * Line number on which the range ends.
    */
  val endLineNumber: Double = js.native
  /**
    * Column on which the range starts in line `startLineNumber` (starts at 1).
    */
  val startColumn: Double = js.native
  /**
    * Line number on which the range starts (starts at 1).
    */
  val startLineNumber: Double = js.native
  /**
    * Create a new empty range using this range's start position.
    */
  def collapseToStart(): Range = js.native
  /**
    * Test if position is in this range. If the position is at the edges, will return true.
    */
  def containsPosition(position: IPosition): Boolean = js.native
  /**
    * Test if range is in this range. If the range is equal to this range, will return true.
    */
  def containsRange(range: IRange): Boolean = js.native
  def equalsRange(): Boolean = js.native
  /**
    * Test if this range equals other.
    */
  def equalsRange(other: IRange): Boolean = js.native
  /**
    * Return the end position (which will be after or equal to the start position)
    */
  def getEndPosition(): Position = js.native
  /**
    * Return the start position (which will be before or equal to the end position)
    */
  def getStartPosition(): Position = js.native
  /**
    * A intersection of the two ranges.
    */
  def intersectRanges(range: IRange): Range | Null = js.native
  /**
    * Test if this range is empty.
    */
  def isEmpty(): Boolean = js.native
  /**
    * A reunion of the two ranges.
    * The smallest position will be used as the start point, and the largest one as the end point.
    */
  def plusRange(range: IRange): Range = js.native
  /**
    * Create a new range using this range's start position, and using endLineNumber and endColumn as the end position.
    */
  def setEndPosition(endLineNumber: Double, endColumn: Double): Range = js.native
  /**
    * Create a new range using this range's end position, and using startLineNumber and startColumn as the start position.
    */
  def setStartPosition(startLineNumber: Double, startColumn: Double): Range = js.native
}

/* static members */
@JSImport("monaco-editor", "Range")
@js.native
object Range extends js.Object {
  /**
    * Test if the two ranges are intersecting. If the ranges are touching it returns true.
    */
  def areIntersecting(a: IRange, b: IRange): Boolean = js.native
  /**
    * Test if the two ranges are touching in any way.
    */
  def areIntersectingOrTouching(a: IRange, b: IRange): Boolean = js.native
  /**
    * Create a new empty range using this range's start position.
    */
  def collapseToStart(range: IRange): Range = js.native
  /**
    * A function that compares ranges, useful for sorting ranges
    * It will first compare ranges on the endPosition and then on the startPosition
    */
  def compareRangesUsingEnds(a: IRange, b: IRange): Double = js.native
  def compareRangesUsingStarts(): Double = js.native
  def compareRangesUsingStarts(a: js.UndefOr[scala.Nothing], b: IRange): Double = js.native
  def compareRangesUsingStarts(a: Null, b: IRange): Double = js.native
  def compareRangesUsingStarts(a: IRange): Double = js.native
  /**
    * A function that compares ranges, useful for sorting ranges
    * It will first compare ranges on the startPosition and then on the endPosition
    */
  def compareRangesUsingStarts(a: IRange, b: IRange): Double = js.native
  /**
    * Test if `position` is in `range`. If the position is at the edges, will return true.
    */
  def containsPosition(range: IRange, position: IPosition): Boolean = js.native
  /**
    * Test if `otherRange` is in `range`. If the ranges are equal, will return true.
    */
  def containsRange(range: IRange, otherRange: IRange): Boolean = js.native
  def equalsRange(): Boolean = js.native
  def equalsRange(a: Null, b: IRange): Boolean = js.native
  def equalsRange(a: IRange): Boolean = js.native
  /**
    * Test if range `a` equals `b`.
    */
  def equalsRange(a: IRange, b: IRange): Boolean = js.native
  def fromPositions(start: IPosition): Range = js.native
  def fromPositions(start: IPosition, end: IPosition): Range = js.native
  /**
    * A intersection of the two ranges.
    */
  def intersectRanges(a: IRange, b: IRange): Range | Null = js.native
  /**
    * Test if `range` is empty.
    */
  def isEmpty(range: IRange): Boolean = js.native
  /**
    * Test if `obj` is an `IRange`.
    */
  def isIRange(obj: js.Any): /* is monaco-editor.monaco-editor.IRange */ Boolean = js.native
  /**
    * Create a `Range` from an `IRange`.
    */
  def lift(): Null = js.native
  def lift(range: IRange): Range = js.native
  /**
    * A reunion of the two ranges.
    * The smallest position will be used as the start point, and the largest one as the end point.
    */
  def plusRange(a: IRange, b: IRange): Range = js.native
  /**
    * Test if the range spans multiple lines.
    */
  def spansMultipleLines(range: IRange): Boolean = js.native
}

