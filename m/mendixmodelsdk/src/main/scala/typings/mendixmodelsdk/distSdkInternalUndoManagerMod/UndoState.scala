package typings.mendixmodelsdk.distSdkInternalUndoManagerMod

import typings.mendixmodelsdk.distSdkInternalDeltasDeltaManagerMod.IDeltaManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/UndoManager", "UndoState")
@js.native
class UndoState protected () extends js.Object {
  def this(deltaManager: IDeltaManager) = this()
  var deltaManager: js.Any = js.native
  def canRedo(): Boolean = js.native
  def canUndo(): Boolean = js.native
  def clear(): Unit = js.native
  def redo(): Unit = js.native
  def undo(): Unit = js.native
}

