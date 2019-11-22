package typings.mendixmodelsdk.distSdkInternalUndoManagerMod

import typings.mendixmodelsdk.distSdkInternalDeltasDeltaManagerMod.IDeltaManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/UndoManager", "UndoState")
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

