package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashShared.IEntity
import typings.minecraftDashScriptingDashTypesDashShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever a player places a block.
  */
trait IPlayerPlacedBlockEventData extends js.Object {
  /**
    * The position of the block that was placed
    */
  var block_position: VectorXYZ
  /**
    * The player that placed the block
    */
  var player: IEntity
}

object IPlayerPlacedBlockEventData {
  @scala.inline
  def apply(block_position: VectorXYZ, player: IEntity): IPlayerPlacedBlockEventData = {
    val __obj = js.Dynamic.literal(block_position = block_position, player = player)
  
    __obj.asInstanceOf[IPlayerPlacedBlockEventData]
  }
}

