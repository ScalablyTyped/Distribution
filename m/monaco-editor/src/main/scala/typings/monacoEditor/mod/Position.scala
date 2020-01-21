package typings.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "Position")
@js.native
class Position protected () extends js.Object {
  def this(lineNumber: Double, column: Double) = this()
  /**
    * column (the first character in a line is between column 1 and column 2)
    */
  val column: Double = js.native
  /**
    * line number (starts at 1)
    */
  val lineNumber: Double = js.native
  /**
    * Derive a new position from this position.
    *
    * @param deltaLineNumber line number delta
    * @param deltaColumn column delta
    */
  def delta(): Position = js.native
  def delta(deltaLineNumber: Double): Position = js.native
  def delta(deltaLineNumber: Double, deltaColumn: Double): Position = js.native
  /**
    * Test if this position equals other position
    */
  def equals(other: IPosition): Boolean = js.native
  /**
    * Test if this position is before other position.
    * If the two positions are equal, the result will be false.
    */
  def isBefore(other: IPosition): Boolean = js.native
  /**
    * Test if this position is before other position.
    * If the two positions are equal, the result will be true.
    */
  def isBeforeOrEqual(other: IPosition): Boolean = js.native
  /**
    * Create a new position from this position.
    *
    * @param newLineNumber new line number
    * @param newColumn new column
    */
  def `with`(): Position = js.native
  def `with`(newLineNumber: Double): Position = js.native
  def `with`(newLineNumber: Double, newColumn: Double): Position = js.native
}

/* static members */
@JSImport("monaco-editor", "Position")
@js.native
object Position extends js.Object {
  /**
    * A function that compares positions, useful for sorting
    */
  def compare(a: IPosition, b: IPosition): Double = js.native
  def equals(): Boolean = js.native
  def equals(a: Null, b: IPosition): Boolean = js.native
  def equals(a: IPosition): Boolean = js.native
  /**
    * Test if position `a` equals position `b`
    */
  def equals(a: IPosition, b: IPosition): Boolean = js.native
  /**
    * Test if position `a` is before position `b`.
    * If the two positions are equal, the result will be false.
    */
  def isBefore(a: IPosition, b: IPosition): Boolean = js.native
  /**
    * Test if position `a` is before position `b`.
    * If the two positions are equal, the result will be true.
    */
  def isBeforeOrEqual(a: IPosition, b: IPosition): Boolean = js.native
  /**
    * Test if `obj` is an `IPosition`.
    */
  def isIPosition(obj: js.Any): /* is monaco-editor.monaco-editor.IPosition */ Boolean = js.native
  /**
    * Create a `Position` from an `IPosition`.
    */
  def lift(pos: IPosition): Position = js.native
}

