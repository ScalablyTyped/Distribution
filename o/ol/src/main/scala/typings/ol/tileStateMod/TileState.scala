package typings.ol.tileStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TileState extends js.Object

@JSImport("ol/TileState", "TileState")
@js.native
object TileState extends js.Object {
  @js.native
  sealed trait ABORT extends TileState
  
  @js.native
  sealed trait EMPTY extends TileState
  
  @js.native
  sealed trait ERROR extends TileState
  
  @js.native
  sealed trait IDLE extends TileState
  
  @js.native
  sealed trait LOADED extends TileState
  
  @js.native
  sealed trait LOADING extends TileState
  
}

