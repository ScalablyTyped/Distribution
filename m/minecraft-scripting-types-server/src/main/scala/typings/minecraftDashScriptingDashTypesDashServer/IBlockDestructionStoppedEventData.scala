package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashShared.IEntity
import typings.minecraftDashScriptingDashTypesDashShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever a player stops destroying a block.
  */
trait IBlockDestructionStoppedEventData extends js.Object {
  /**
    * The position of the block that was being destroyed
    */
  var block_position: VectorXYZ
  /**
    * How far along the destruction was before it was stopped (0 - 1 range)
    */
  var destruction_progress: Double
  /**
    * The player that stopped destoying the block
    */
  var player: IEntity
}

object IBlockDestructionStoppedEventData {
  @scala.inline
  def apply(block_position: VectorXYZ, destruction_progress: Double, player: IEntity): IBlockDestructionStoppedEventData = {
    val __obj = js.Dynamic.literal(block_position = block_position.asInstanceOf[js.Any], destruction_progress = destruction_progress.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBlockDestructionStoppedEventData]
  }
}

