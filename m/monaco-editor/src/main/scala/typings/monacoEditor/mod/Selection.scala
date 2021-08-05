package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("monaco-editor", "Selection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create with a direction.
    */
  inline def createWithDirection(
    startLineNumber: Double,
    startColumn: Double,
    endLineNumber: Double,
    endColumn: Double,
    direction: SelectionDirection
  ): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithDirection")(startLineNumber.asInstanceOf[js.Any], startColumn.asInstanceOf[js.Any], endLineNumber.asInstanceOf[js.Any], endColumn.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Selection]
  
  /**
    * Create a `Selection` from one or two positions
    */
  inline def fromPositions(start: IPosition): Selection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(start.asInstanceOf[js.Any]).asInstanceOf[Selection]
  inline def fromPositions(start: IPosition, end: IPosition): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Selection]
  
  /**
    * Test if `obj` is an `ISelection`.
    */
  inline def isISelection(obj: js.Any): /* is monaco-editor.monaco-editor.ISelection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISelection")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is monaco-editor.monaco-editor.ISelection */ Boolean]
  
  /**
    * Create a `Selection` from an `ISelection`.
    */
  inline def liftSelection(sel: ISelection): Selection = ^.asInstanceOf[js.Dynamic].applyDynamic("liftSelection")(sel.asInstanceOf[js.Any]).asInstanceOf[Selection]
  
  /**
    * `a` equals `b`.
    */
  inline def selectionsArrEqual(a: js.Array[ISelection], b: js.Array[ISelection]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectionsArrEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Test if the two selections are equal.
    */
  inline def selectionsEqual(a: ISelection, b: ISelection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectionsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
