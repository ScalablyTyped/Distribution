package typings.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "Selection")
@js.native
class Selection protected () extends Range {
  def this(
    selectionStartLineNumber: Double,
    selectionStartColumn: Double,
    positionLineNumber: Double,
    positionColumn: Double
  ) = this()
  /**
    * The column on `positionLineNumber` where the selection has ended.
    */
  val positionColumn: Double = js.native
  /**
    * The line number on which the selection has ended.
    */
  val positionLineNumber: Double = js.native
  /**
    * The column on `selectionStartLineNumber` where the selection has started.
    */
  val selectionStartColumn: Double = js.native
  /**
    * The line number on which the selection has started.
    */
  val selectionStartLineNumber: Double = js.native
  /**
    * Test if equals other selection.
    */
  def equalsSelection(other: ISelection): Boolean = js.native
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
    startLineNumber: Double,
    startColumn: Double,
    endLineNumber: Double,
    endColumn: Double,
    direction: SelectionDirection
  ): Selection = js.native
  /**
    * Create a `Selection` from one or two positions
    */
  def fromPositions(start: IPosition): Selection = js.native
  def fromPositions(start: IPosition, end: IPosition): Selection = js.native
  /**
    * Test if `obj` is an `ISelection`.
    */
  def isISelection(obj: js.Any): /* is monaco-editor.monaco-editor.ISelection */ Boolean = js.native
  /**
    * Create a `Selection` from an `ISelection`.
    */
  def liftSelection(sel: ISelection): Selection = js.native
  /**
    * `a` equals `b`.
    */
  def selectionsArrEqual(a: js.Array[ISelection], b: js.Array[ISelection]): Boolean = js.native
  /**
    * Test if the two selections are equal.
    */
  def selectionsEqual(a: ISelection, b: ISelection): Boolean = js.native
}

