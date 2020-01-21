package typings.mendixmodelsdk.internalMod

import typings.mendixmodelsdk.deltaManagerMod.IDeltaManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "UndoState")
@js.native
class UndoState protected ()
  extends typings.mendixmodelsdk.undoManagerMod.UndoState {
  def this(deltaManager: IDeltaManager) = this()
}

