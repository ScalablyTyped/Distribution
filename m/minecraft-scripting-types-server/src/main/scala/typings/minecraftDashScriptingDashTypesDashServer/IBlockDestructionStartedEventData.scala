package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashShared.IEntity
import typings.minecraftDashScriptingDashTypesDashShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever a player starts to destroy a block.
  */
trait IBlockDestructionStartedEventData extends js.Object {
  /**
    * The position of the block that is being destroyed
    */
  var block_position: VectorXYZ
  /**
    * The player that started destoying the block
    */
  var player: IEntity
}

object IBlockDestructionStartedEventData {
  @scala.inline
  def apply(block_position: VectorXYZ, player: IEntity): IBlockDestructionStartedEventData = {
    val __obj = js.Dynamic.literal(block_position = block_position.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBlockDestructionStartedEventData]
  }
}

