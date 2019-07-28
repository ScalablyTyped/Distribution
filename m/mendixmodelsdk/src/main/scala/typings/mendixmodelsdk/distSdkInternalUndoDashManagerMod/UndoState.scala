package typings.mendixmodelsdk.distSdkInternalUndoDashManagerMod

import typings.mendixmodelsdk.distSdkInternalDeltasDeltaDashManagerMod.IDeltaManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/undo-manager", "UndoState")
@js.native
class UndoState protected () extends js.Object {
  def this(deltaManager: IDeltaManager) = this()
  val canRedo: Boolean = js.native
  val canUndo: Boolean = js.native
  var deltaManager: js.Any = js.native
  def clear(): Unit = js.native
  def redo(): Unit = js.native
  def undo(): Unit = js.native
}

