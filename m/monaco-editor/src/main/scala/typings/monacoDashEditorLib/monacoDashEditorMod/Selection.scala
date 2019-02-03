package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "Selection")
@js.native
class Selection protected () extends Range {
  def this(selectionStartLineNumber: scala.Double, selectionStartColumn: scala.Double, positionLineNumber: scala.Double, positionColumn: scala.Double) = this()
  /**
    * The column on `positionLineNumber` where the selection has ended.
    */
  val positionColumn: scala.Double = js.native
  /**
    * The line number on which the selection has ended.
    */
  val positionLineNumber: scala.Double = js.native
  /**
    * The column on `selectionStartLineNumber` where the selection has started.
    */
  val selectionStartColumn: scala.Double = js.native
  /**
    * The line number on which the selection has started.
    */
  val selectionStartLineNumber: scala.Double = js.native
  /**
    * Test if equals other selection.
    */
  def equalsSelection(other: ISelection): scala.Boolean = js.native
  /**
    * Get directions (LTR or RTL).
    */
  def getDirection(): SelectionDirection = js.native
  /**
    * Get the position at `positionLineNumber` and `positionColumn`.
    */
  def getPosition(): Position = js.native
}

/* static members */
@JSImport("monaco-editor", "Selection")
@js.native
object Selection extends js.Object {
  /**
    * Create with a direction.
    */
  def createWithDirection(
    startLineNumber: scala.Double,
    startColumn: scala.Double,
    endLineNumber: scala.Double,
    endColumn: scala.Double,
    direction: monacoDashEditorLib.monacoDashEditorMod.SelectionDirection
  ): monacoDashEditorLib.monacoDashEditorMod.Selection = js.native
  /**
    * Create a `Selection` from one or two positions
    */
  def fromPositions(start: monacoDashEditorLib.monacoDashEditorMod.IPosition): monacoDashEditorLib.monacoDashEditorMod.Selection = js.native
  def fromPositions(
    start: monacoDashEditorLib.monacoDashEditorMod.IPosition,
    end: monacoDashEditorLib.monacoDashEditorMod.IPosition
  ): monacoDashEditorLib.monacoDashEditorMod.Selection = js.native
  /**
    * Test if `obj` is an `ISelection`.
    */
  def isISelection(obj: js.Any): /* is monaco-editor.monaco-editor.ISelection */ scala.Boolean = js.native
  /**
    * Create a `Selection` from an `ISelection`.
    */
  def liftSelection(sel: monacoDashEditorLib.monacoDashEditorMod.ISelection): monacoDashEditorLib.monacoDashEditorMod.Selection = js.native
  /**
    * `a` equals `b`.
    */
  def selectionsArrEqual(
    a: js.Array[monacoDashEditorLib.monacoDashEditorMod.ISelection],
    b: js.Array[monacoDashEditorLib.monacoDashEditorMod.ISelection]
  ): scala.Boolean = js.native
  /**
    * Test if the two selections are equal.
    */
  def selectionsEqual(
    a: monacoDashEditorLib.monacoDashEditorMod.ISelection,
    b: monacoDashEditorLib.monacoDashEditorMod.ISelection
  ): scala.Boolean = js.native
}

