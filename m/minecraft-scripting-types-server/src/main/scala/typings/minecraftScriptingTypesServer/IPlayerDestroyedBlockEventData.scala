package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever a player destroys a block.
  */
trait IPlayerDestroyedBlockEventData extends js.Object {
  /**
    * The identifier of the block that was destroyed
    */
  var block_identifier: String
  /**
    * The position of the block that was destroyed
    */
  var block_position: VectorXYZ
  /**
    * The player that destroyed the block
    */
  var player: IEntity
}

object IPlayerDestroyedBlockEventData {
  @scala.inline
  def apply(block_identifier: String, block_position: VectorXYZ, player: IEntity): IPlayerDestroyedBlockEventData = {
    val __obj = js.Dynamic.literal(block_identifier = block_identifier.asInstanceOf[js.Any], block_position = block_position.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayerDestroyedBlockEventData]
  }
}

