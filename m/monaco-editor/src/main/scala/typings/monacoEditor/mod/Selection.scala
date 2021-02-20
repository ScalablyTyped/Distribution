package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
/* static members */
object Selection {
  
  /**
    * Create with a direction.
    */
  @JSImport("monaco-editor", "Selection.createWithDirection")
  @js.native
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
  @JSImport("monaco-editor", "Selection.fromPositions")
  @js.native
  def fromPositions(start: IPosition): Selection = js.native
  @JSImport("monaco-editor", "Selection.fromPositions")
  @js.native
  def fromPositions(start: IPosition, end: IPosition): Selection = js.native
  
  /**
    * Test if `obj` is an `ISelection`.
    */
  @JSImport("monaco-editor", "Selection.isISelection")
  @js.native
  def isISelection(obj: js.Any): /* is monaco-editor.monaco-editor.ISelection */ Boolean = js.native
  
  /**
    * Create a `Selection` from an `ISelection`.
    */
  @JSImport("monaco-editor", "Selection.liftSelection")
  @js.native
  def liftSelection(sel: ISelection): Selection = js.native
  
  /**
    * `a` equals `b`.
    */
  @JSImport("monaco-editor", "Selection.selectionsArrEqual")
  @js.native
  def selectionsArrEqual(a: js.Array[ISelection], b: js.Array[ISelection]): Boolean = js.native
  
  /**
    * Test if the two selections are equal.
    */
  @JSImport("monaco-editor", "Selection.selectionsEqual")
  @js.native
  def selectionsEqual(a: ISelection, b: ISelection): Boolean = js.native
}
