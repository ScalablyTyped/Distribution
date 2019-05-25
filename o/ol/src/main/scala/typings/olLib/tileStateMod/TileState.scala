package typings
package olLib.tileStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TileState extends js.Object

@JSImport("ol/TileState", "TileState")
@js.native
object TileState extends js.Object {
  @js.native
  sealed trait ABORT
    extends olLib.tileStateMod.TileState
  
  @js.native
  sealed trait EMPTY
    extends olLib.tileStateMod.TileState
  
  @js.native
  sealed trait ERROR
    extends olLib.tileStateMod.TileState
  
  @js.native
  sealed trait IDLE
    extends olLib.tileStateMod.TileState
  
  @js.native
  sealed trait LOADED
    extends olLib.tileStateMod.TileState
  
  @js.native
  sealed trait LOADING
    extends olLib.tileStateMod.TileState
  
}

