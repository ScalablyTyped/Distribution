package typings.mendixmodelsdk.undoManagerMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/UndoManager", "UndoManager")
@js.native
class UndoManager protected () extends js.Object {
  def this(_model: IAbstractModel) = this()
  
  val deltaManager: js.Any = js.native
  
  def getUndoState(modelUnitId: String): UndoState = js.native
  
  var onChangeCompleted: js.Any = js.native
  
  var onChangeDiscarded: js.Any = js.native
  
  var onNewDelta: js.Any = js.native
  
  var onUnitLoaded: js.Any = js.native
  
  def withoutUndo[T](performAction: js.Function0[T]): T = js.native
}
