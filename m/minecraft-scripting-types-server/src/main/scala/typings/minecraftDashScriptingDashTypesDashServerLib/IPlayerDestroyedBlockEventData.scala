package typings
package minecraftDashScriptingDashTypesDashServerLib

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
  var block_identifier: java.lang.String
  /**
    * The position of the block that was destroyed
    */
  var block_position: minecraftDashScriptingDashTypesDashSharedLib.VectorXYZ
  /**
    * The player that destroyed the block
    */
  var player: minecraftDashScriptingDashTypesDashSharedLib.IEntity
}

object IPlayerDestroyedBlockEventData {
  @scala.inline
  def apply(
    block_identifier: java.lang.String,
    block_position: minecraftDashScriptingDashTypesDashSharedLib.VectorXYZ,
    player: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  ): IPlayerDestroyedBlockEventData = {
    val __obj = js.Dynamic.literal(block_identifier = block_identifier, block_position = block_position, player = player)
  
    __obj.asInstanceOf[IPlayerDestroyedBlockEventData]
  }
}

