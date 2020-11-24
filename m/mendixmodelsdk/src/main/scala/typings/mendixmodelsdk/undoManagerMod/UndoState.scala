package typings.mendixmodelsdk.undoManagerMod

import typings.mendixmodelsdk.deltaManagerMod.IDeltaManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/UndoManager", "UndoState")
@js.native
class UndoState protected () extends js.Object {
  def this(deltaManager: IDeltaManager) = this()
  
  def canRedo: Boolean = js.native
  
  def canUndo: Boolean = js.native
  
  def clear(): Unit = js.native
  
  var deltaManager: js.Any = js.native
  
  def redo(): Unit = js.native
  
  def undo(): Unit = js.native
}
