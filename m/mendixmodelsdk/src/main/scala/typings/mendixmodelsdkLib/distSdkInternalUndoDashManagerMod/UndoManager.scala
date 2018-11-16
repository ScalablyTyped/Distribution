package typings
package mendixmodelsdkLib.distSdkInternalUndoDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/undo-manager", "UndoManager")
@js.native
class UndoManager protected () extends js.Object {
  def this(_model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel) = this()
  val deltaManager: js.Any = js.native
  var onChangeCompleted: js.Any = js.native
  var onNewDelta: js.Any = js.native
  var onUnitLoaded: js.Any = js.native
  def getUndoState(modelUnitId: java.lang.String): UndoState = js.native
  def withoutUndo[T](performAction: js.Function0[T]): T = js.native
}

