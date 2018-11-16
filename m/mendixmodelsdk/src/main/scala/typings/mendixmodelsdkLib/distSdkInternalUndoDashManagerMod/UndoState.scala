package typings
package mendixmodelsdkLib.distSdkInternalUndoDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/undo-manager", "UndoState")
@js.native
class UndoState protected () extends js.Object {
  def this(deltaManager: mendixmodelsdkLib.distSdkInternalDeltasDeltaDashManagerMod.IDeltaManager) = this()
  val canRedo: scala.Boolean = js.native
  val canUndo: scala.Boolean = js.native
  var deltaManager: js.Any = js.native
  def clear(): scala.Unit = js.native
  def redo(): scala.Unit = js.native
  def undo(): scala.Unit = js.native
}

