package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "Range")
@js.native
open class Range protected () extends StObject {
  def this(startLineNumber: Double, startColumn: Double, endLineNumber: Double, endColumn: Double) = this()
  
  /**
    * Create a new empty range using this range's end position.
    */
  def collapseToEnd(): Range = js.native
  
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
    * Moves the range by the given amount of lines.
    */
  def delta(lineCount: Double): Range = js.native
  
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
  
  def toJSON(): IRange = js.native
}
/* static members */
object Range {
  
  @JSImport("monaco-editor", "Range")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Test if the two ranges are intersecting. If the ranges are touching it returns true.
    */
  inline def areIntersecting(a: IRange, b: IRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areIntersecting")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Test if the two ranges are touching in any way.
    */
  inline def areIntersectingOrTouching(a: IRange, b: IRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areIntersectingOrTouching")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Create a new empty range using this range's end position.
    */
  inline def collapseToEnd(range: IRange): Range = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseToEnd")(range.asInstanceOf[js.Any]).asInstanceOf[Range]
  
  /**
    * Create a new empty range using this range's start position.
    */
  inline def collapseToStart(range: IRange): Range = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseToStart")(range.asInstanceOf[js.Any]).asInstanceOf[Range]
  
  /**
    * A function that compares ranges, useful for sorting ranges
    * It will first compare ranges on the endPosition and then on the startPosition
    */
  inline def compareRangesUsingEnds(a: IRange, b: IRange): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareRangesUsingEnds")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * A function that compares ranges, useful for sorting ranges
    * It will first compare ranges on the startPosition and then on the endPosition
    */
  inline def compareRangesUsingStarts(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("compareRangesUsingStarts")().asInstanceOf[Double]
  inline def compareRangesUsingStarts(a: Null, b: IRange): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareRangesUsingStarts")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareRangesUsingStarts(a: Unit, b: IRange): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareRangesUsingStarts")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareRangesUsingStarts(a: IRange): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("compareRangesUsingStarts")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def compareRangesUsingStarts(a: IRange, b: IRange): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareRangesUsingStarts")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Test if `position` is in `range`. If the position is at the edges, will return true.
    */
  inline def containsPosition(range: IRange, position: IPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsPosition")(range.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Test if `otherRange` is in `range`. If the ranges are equal, will return true.
    */
  inline def containsRange(range: IRange, otherRange: IRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsRange")(range.asInstanceOf[js.Any], otherRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Test if range `a` equals `b`.
    */
  inline def equalsRange(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsRange")().asInstanceOf[Boolean]
  inline def equalsRange(a: Null, b: IRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsRange")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsRange(a: Unit, b: IRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsRange")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsRange(a: IRange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsRange")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equalsRange(a: IRange, b: IRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsRange")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fromPositions(start: IPosition): Range = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(start.asInstanceOf[js.Any]).asInstanceOf[Range]
  inline def fromPositions(start: IPosition, end: IPosition): Range = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Range]
  
  /**
    * Return the end position (which will be after or equal to the start position)
    */
  inline def getEndPosition(range: IRange): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndPosition")(range.asInstanceOf[js.Any]).asInstanceOf[Position]
  
  /**
    * Return the start position (which will be before or equal to the end position)
    */
  inline def getStartPosition(range: IRange): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("getStartPosition")(range.asInstanceOf[js.Any]).asInstanceOf[Position]
  
  /**
    * A intersection of the two ranges.
    */
  inline def intersectRanges(a: IRange, b: IRange): Range | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectRanges")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Range | Null]
  
  /**
    * Test if `range` is empty.
    */
  inline def isEmpty(range: IRange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(range.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Test if `obj` is an `IRange`.
    */
  inline def isIRange(obj: Any): /* is monaco-editor.monaco-editor.IRange */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIRange")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is monaco-editor.monaco-editor.IRange */ Boolean]
  
  /**
    * Create a `Range` from an `IRange`.
    */
  inline def lift(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("lift")().asInstanceOf[Null]
  inline def lift(range: IRange): Range | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("lift")(range.asInstanceOf[js.Any]).asInstanceOf[Range | Null]
  
  inline def lift_Range(range: IRange): Range = ^.asInstanceOf[js.Dynamic].applyDynamic("lift")(range.asInstanceOf[js.Any]).asInstanceOf[Range]
  
  inline def lift_Union(): Range | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("lift")().asInstanceOf[Range | Null]
  
  /**
    * A reunion of the two ranges.
    * The smallest position will be used as the start point, and the largest one as the end point.
    */
  inline def plusRange(a: IRange, b: IRange): Range = (^.asInstanceOf[js.Dynamic].applyDynamic("plusRange")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Range]
  
  /**
    * Test if the range spans multiple lines.
    */
  inline def spansMultipleLines(range: IRange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("spansMultipleLines")(range.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Test if `otherRange` is strictly in `range` (must start after, and end before). If the ranges are equal, will return false.
    */
  inline def strictContainsRange(range: IRange, otherRange: IRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictContainsRange")(range.asInstanceOf[js.Any], otherRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
