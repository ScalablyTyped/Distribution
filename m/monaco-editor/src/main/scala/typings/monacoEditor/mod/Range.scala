package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "Range")
@js.native
class Range protected () extends StObject {
  def this(startLineNumber: Double, startColumn: Double, endLineNumber: Double, endColumn: Double) = this()
  
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
  
  /**
    * Column on which the range ends in line `endLineNumber`.
    */
  val endColumn: Double = js.native
  
  /**
    * Line number on which the range ends.
    */
  val endLineNumber: Double = js.native
  
  /**
    * Test if this range equals other.
    */
  def equalsRange(): Boolean = js.native
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
  
  /**
    * Column on which the range starts in line `startLineNumber` (starts at 1).
    */
  val startColumn: Double = js.native
  
  /**
    * Line number on which the range starts (starts at 1).
    */
  val startLineNumber: Double = js.native
  
  /**
    * Test if `range` is strictly in this range. `range` must start after and end before this range for the result to be true.
    */
  def strictContainsRange(range: IRange): Boolean = js.native
}
/* static members */
object Range {
  
  /**
    * Test if the two ranges are intersecting. If the ranges are touching it returns true.
    */
  @JSImport("monaco-editor", "Range.areIntersecting")
  @js.native
  def areIntersecting(a: IRange, b: IRange): Boolean = js.native
  
  /**
    * Test if the two ranges are touching in any way.
    */
  @JSImport("monaco-editor", "Range.areIntersectingOrTouching")
  @js.native
  def areIntersectingOrTouching(a: IRange, b: IRange): Boolean = js.native
  
  /**
    * Create a new empty range using this range's start position.
    */
  @JSImport("monaco-editor", "Range.collapseToStart")
  @js.native
  def collapseToStart(range: IRange): Range = js.native
  
  /**
    * A function that compares ranges, useful for sorting ranges
    * It will first compare ranges on the endPosition and then on the startPosition
    */
  @JSImport("monaco-editor", "Range.compareRangesUsingEnds")
  @js.native
  def compareRangesUsingEnds(a: IRange, b: IRange): Double = js.native
  
  /**
    * A function that compares ranges, useful for sorting ranges
    * It will first compare ranges on the startPosition and then on the endPosition
    */
  @JSImport("monaco-editor", "Range.compareRangesUsingStarts")
  @js.native
  def compareRangesUsingStarts(): Double = js.native
  @JSImport("monaco-editor", "Range.compareRangesUsingStarts")
  @js.native
  def compareRangesUsingStarts(a: js.UndefOr[scala.Nothing], b: IRange): Double = js.native
  @JSImport("monaco-editor", "Range.compareRangesUsingStarts")
  @js.native
  def compareRangesUsingStarts(a: Null, b: IRange): Double = js.native
  @JSImport("monaco-editor", "Range.compareRangesUsingStarts")
  @js.native
  def compareRangesUsingStarts(a: IRange): Double = js.native
  @JSImport("monaco-editor", "Range.compareRangesUsingStarts")
  @js.native
  def compareRangesUsingStarts(a: IRange, b: IRange): Double = js.native
  
  /**
    * Test if `position` is in `range`. If the position is at the edges, will return true.
    */
  @JSImport("monaco-editor", "Range.containsPosition")
  @js.native
  def containsPosition(range: IRange, position: IPosition): Boolean = js.native
  
  /**
    * Test if `otherRange` is in `range`. If the ranges are equal, will return true.
    */
  @JSImport("monaco-editor", "Range.containsRange")
  @js.native
  def containsRange(range: IRange, otherRange: IRange): Boolean = js.native
  
  /**
    * Test if range `a` equals `b`.
    */
  @JSImport("monaco-editor", "Range.equalsRange")
  @js.native
  def equalsRange(): Boolean = js.native
  @JSImport("monaco-editor", "Range.equalsRange")
  @js.native
  def equalsRange(a: Null, b: IRange): Boolean = js.native
  @JSImport("monaco-editor", "Range.equalsRange")
  @js.native
  def equalsRange(a: IRange): Boolean = js.native
  @JSImport("monaco-editor", "Range.equalsRange")
  @js.native
  def equalsRange(a: IRange, b: IRange): Boolean = js.native
  
  @JSImport("monaco-editor", "Range.fromPositions")
  @js.native
  def fromPositions(start: IPosition): Range = js.native
  @JSImport("monaco-editor", "Range.fromPositions")
  @js.native
  def fromPositions(start: IPosition, end: IPosition): Range = js.native
  
  /**
    * Return the end position (which will be after or equal to the start position)
    */
  @JSImport("monaco-editor", "Range.getEndPosition")
  @js.native
  def getEndPosition(range: IRange): Position = js.native
  
  /**
    * Return the start position (which will be before or equal to the end position)
    */
  @JSImport("monaco-editor", "Range.getStartPosition")
  @js.native
  def getStartPosition(range: IRange): Position = js.native
  
  /**
    * A intersection of the two ranges.
    */
  @JSImport("monaco-editor", "Range.intersectRanges")
  @js.native
  def intersectRanges(a: IRange, b: IRange): Range | Null = js.native
  
  /**
    * Test if `range` is empty.
    */
  @JSImport("monaco-editor", "Range.isEmpty")
  @js.native
  def isEmpty(range: IRange): Boolean = js.native
  
  /**
    * Test if `obj` is an `IRange`.
    */
  @JSImport("monaco-editor", "Range.isIRange")
  @js.native
  def isIRange(obj: js.Any): /* is monaco-editor.monaco-editor.IRange */ Boolean = js.native
  
  /**
    * Create a `Range` from an `IRange`.
    */
  @JSImport("monaco-editor", "Range.lift")
  @js.native
  def lift(): Null = js.native
  @JSImport("monaco-editor", "Range.lift")
  @js.native
  def lift(range: IRange): Range = js.native
  
  /**
    * A reunion of the two ranges.
    * The smallest position will be used as the start point, and the largest one as the end point.
    */
  @JSImport("monaco-editor", "Range.plusRange")
  @js.native
  def plusRange(a: IRange, b: IRange): Range = js.native
  
  /**
    * Test if the range spans multiple lines.
    */
  @JSImport("monaco-editor", "Range.spansMultipleLines")
  @js.native
  def spansMultipleLines(range: IRange): Boolean = js.native
  
  /**
    * Test if `otherRange` is strinctly in `range` (must start after, and end before). If the ranges are equal, will return false.
    */
  @JSImport("monaco-editor", "Range.strictContainsRange")
  @js.native
  def strictContainsRange(range: IRange, otherRange: IRange): Boolean = js.native
}
