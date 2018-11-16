package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "Position")
@js.native
class Position protected () extends js.Object {
  def this(lineNumber: scala.Double, column: scala.Double) = this()
  /**
       * column (the first character in a line is between column 1 and column 2)
       */
  val column: scala.Double = js.native
  /**
       * line number (starts at 1)
       */
  val lineNumber: scala.Double = js.native
  /**
       * Test if this position equals other position
       */
  def equals(other: IPosition): scala.Boolean = js.native
  /**
       * Test if this position is before other position.
       * If the two positions are equal, the result will be false.
       */
  def isBefore(other: IPosition): scala.Boolean = js.native
  /**
       * Test if this position is before other position.
       * If the two positions are equal, the result will be true.
       */
  def isBeforeOrEqual(other: IPosition): scala.Boolean = js.native
}

@JSImport("monaco-editor", "Position")
@js.native
object Position extends js.Object {
  /**
       * A function that compares positions, useful for sorting
       */
  def compare(
    a: monacoDashEditorLib.monacoDashEditorMod.IPosition,
    b: monacoDashEditorLib.monacoDashEditorMod.IPosition
  ): scala.Double = js.native
  /**
       * Test if position `a` equals position `b`
       */
  def equals(
    a: monacoDashEditorLib.monacoDashEditorMod.IPosition,
    b: monacoDashEditorLib.monacoDashEditorMod.IPosition
  ): scala.Boolean = js.native
  /**
       * Test if position `a` is before position `b`.
       * If the two positions are equal, the result will be false.
       */
  def isBefore(
    a: monacoDashEditorLib.monacoDashEditorMod.IPosition,
    b: monacoDashEditorLib.monacoDashEditorMod.IPosition
  ): scala.Boolean = js.native
  /**
       * Test if position `a` is before position `b`.
       * If the two positions are equal, the result will be true.
       */
  def isBeforeOrEqual(
    a: monacoDashEditorLib.monacoDashEditorMod.IPosition,
    b: monacoDashEditorLib.monacoDashEditorMod.IPosition
  ): scala.Boolean = js.native
  /**
       * Test if `obj` is an `IPosition`.
       */
  def isIPosition(obj: js.Any): /* is IPosition */scala.Boolean = js.native
  /**
       * Create a `Position` from an `IPosition`.
       */
  def lift(pos: monacoDashEditorLib.monacoDashEditorMod.IPosition): monacoDashEditorLib.monacoDashEditorMod.Position = js.native
}

