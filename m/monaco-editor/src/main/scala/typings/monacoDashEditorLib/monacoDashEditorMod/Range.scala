package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "Range")
@js.native
class Range protected () extends js.Object {
  def this(startLineNumber: scala.Double, startColumn: scala.Double, endLineNumber: scala.Double, endColumn: scala.Double) = this()
  /**
       * Column on which the range ends in line `endLineNumber`.
       */
  val endColumn: scala.Double = js.native
  /**
       * Line number on which the range ends.
       */
  val endLineNumber: scala.Double = js.native
  /**
       * Column on which the range starts in line `startLineNumber` (starts at 1).
       */
  val startColumn: scala.Double = js.native
  /**
       * Line number on which the range starts (starts at 1).
       */
  val startLineNumber: scala.Double = js.native
  /**
       * Create a new empty range using this range's start position.
       */
  def collapseToStart(): Range = js.native
  /**
       * Test if position is in this range. If the position is at the edges, will return true.
       */
  def containsPosition(position: IPosition): scala.Boolean = js.native
  /**
       * Test if range is in this range. If the range is equal to this range, will return true.
       */
  def containsRange(range: IRange): scala.Boolean = js.native
  /**
       * Test if this range equals other.
       */
  def equalsRange(): scala.Boolean = js.native
  /**
       * Test if this range equals other.
       */
  def equalsRange(other: IRange): scala.Boolean = js.native
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
  def intersectRanges(range: IRange): Range | scala.Null = js.native
  /**
       * Test if this range is empty.
       */
  def isEmpty(): scala.Boolean = js.native
  /**
       * A reunion of the two ranges.
       * The smallest position will be used as the start point, and the largest one as the end point.
       */
  def plusRange(range: IRange): Range = js.native
  /**
       * Create a new range using this range's start position, and using endLineNumber and endColumn as the end position.
       */
  def setEndPosition(endLineNumber: scala.Double, endColumn: scala.Double): Range = js.native
  /**
       * Create a new range using this range's end position, and using startLineNumber and startColumn as the start position.
       */
  def setStartPosition(startLineNumber: scala.Double, startColumn: scala.Double): Range = js.native
}

@JSImport("monaco-editor", "Range")
@js.native
object Range extends js.Object {
  /**
       * Test if the two ranges are intersecting. If the ranges are touching it returns true.
       */
  def areIntersecting(
    a: monacoDashEditorLib.monacoDashEditorMod.IRange,
    b: monacoDashEditorLib.monacoDashEditorMod.IRange
  ): scala.Boolean = js.native
  /**
       * Test if the two ranges are touching in any way.
       */
  def areIntersectingOrTouching(
    a: monacoDashEditorLib.monacoDashEditorMod.IRange,
    b: monacoDashEditorLib.monacoDashEditorMod.IRange
  ): scala.Boolean = js.native
  /**
       * Create a new empty range using this range's start position.
       */
  def collapseToStart(range: monacoDashEditorLib.monacoDashEditorMod.IRange): monacoDashEditorLib.monacoDashEditorMod.Range = js.native
  /**
       * A function that compares ranges, useful for sorting ranges
       * It will first compare ranges on the endPosition and then on the startPosition
       */
  def compareRangesUsingEnds(
    a: monacoDashEditorLib.monacoDashEditorMod.IRange,
    b: monacoDashEditorLib.monacoDashEditorMod.IRange
  ): scala.Double = js.native
  /**
       * A function that compares ranges, useful for sorting ranges
       * It will first compare ranges on the startPosition and then on the endPosition
       */
  def compareRangesUsingStarts(): scala.Double = js.native
  /**
       * A function that compares ranges, useful for sorting ranges
       * It will first compare ranges on the startPosition and then on the endPosition
       */
  def compareRangesUsingStarts(a: js.UndefOr[scala.Nothing], b: monacoDashEditorLib.monacoDashEditorMod.IRange): scala.Double = js.native
  /**
       * A function that compares ranges, useful for sorting ranges
       * It will first compare ranges on the startPosition and then on the endPosition
       */
  def compareRangesUsingStarts(a: monacoDashEditorLib.monacoDashEditorMod.IRange): scala.Double = js.native
  /**
       * A function that compares ranges, useful for sorting ranges
       * It will first compare ranges on the startPosition and then on the endPosition
       */
  def compareRangesUsingStarts(
    a: monacoDashEditorLib.monacoDashEditorMod.IRange,
    b: monacoDashEditorLib.monacoDashEditorMod.IRange
  ): scala.Double = js.native
  /**
       * A function that compares ranges, useful for sorting ranges
       * It will first compare ranges on the startPosition and then on the endPosition
       */
  def compareRangesUsingStarts(a: scala.Null, b: monacoDashEditorLib.monacoDashEditorMod.IRange): scala.Double = js.native
  /**
       * Test if `position` is in `range`. If the position is at the edges, will return true.
       */
  def containsPosition(
    range: monacoDashEditorLib.monacoDashEditorMod.IRange,
    position: monacoDashEditorLib.monacoDashEditorMod.IPosition
  ): scala.Boolean = js.native
  /**
       * Test if `otherRange` is in `range`. If the ranges are equal, will return true.
       */
  def containsRange(
    range: monacoDashEditorLib.monacoDashEditorMod.IRange,
    otherRange: monacoDashEditorLib.monacoDashEditorMod.IRange
  ): scala.Boolean = js.native
  /**
       * Test if range `a` equals `b`.
       */
  def equalsRange(): scala.Boolean = js.native
  /**
       * Test if range `a` equals `b`.
       */
  def equalsRange(a: monacoDashEditorLib.monacoDashEditorMod.IRange): scala.Boolean = js.native
  /**
       * Test if range `a` equals `b`.
       */
  def equalsRange(
    a: monacoDashEditorLib.monacoDashEditorMod.IRange,
    b: monacoDashEditorLib.monacoDashEditorMod.IRange
  ): scala.Boolean = js.native
  /**
       * Test if range `a` equals `b`.
       */
  def equalsRange(a: scala.Null, b: monacoDashEditorLib.monacoDashEditorMod.IRange): scala.Boolean = js.native
  def fromPositions(start: monacoDashEditorLib.monacoDashEditorMod.IPosition): monacoDashEditorLib.monacoDashEditorMod.Range = js.native
  def fromPositions(
    start: monacoDashEditorLib.monacoDashEditorMod.IPosition,
    end: monacoDashEditorLib.monacoDashEditorMod.IPosition
  ): monacoDashEditorLib.monacoDashEditorMod.Range = js.native
  /**
       * A intersection of the two ranges.
       */
  def intersectRanges(
    a: monacoDashEditorLib.monacoDashEditorMod.IRange,
    b: monacoDashEditorLib.monacoDashEditorMod.IRange
  ): monacoDashEditorLib.monacoDashEditorMod.Range | scala.Null = js.native
  /**
       * Test if `range` is empty.
       */
  def isEmpty(range: monacoDashEditorLib.monacoDashEditorMod.IRange): scala.Boolean = js.native
  /**
       * Test if `obj` is an `IRange`.
       */
  def isIRange(obj: js.Any): /* is IRange */scala.Boolean = js.native
  /**
       * Create a `Range` from an `IRange`.
       */
  def lift(): scala.Null = js.native
  def lift(range: monacoDashEditorLib.monacoDashEditorMod.IRange): monacoDashEditorLib.monacoDashEditorMod.Range = js.native
  /**
       * A reunion of the two ranges.
       * The smallest position will be used as the start point, and the largest one as the end point.
       */
  def plusRange(
    a: monacoDashEditorLib.monacoDashEditorMod.IRange,
    b: monacoDashEditorLib.monacoDashEditorMod.IRange
  ): monacoDashEditorLib.monacoDashEditorMod.Range = js.native
  /**
       * Test if the range spans multiple lines.
       */
  def spansMultipleLines(range: monacoDashEditorLib.monacoDashEditorMod.IRange): scala.Boolean = js.native
}

