package typings
package minecraftDashScriptingDashTypesDashServerLib

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
  var block_position: minecraftDashScriptingDashTypesDashSharedLib.VectorXYZ
  /**
    * How far along the destruction was before it was stopped (0 - 1 range)
    */
  var destruction_progress: scala.Double
  /**
    * The player that stopped destoying the block
    */
  var player: minecraftDashScriptingDashTypesDashSharedLib.IEntity
}

object IBlockDestructionStoppedEventData {
  @scala.inline
  def apply(
    block_position: minecraftDashScriptingDashTypesDashSharedLib.VectorXYZ,
    destruction_progress: scala.Double,
    player: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  ): IBlockDestructionStoppedEventData = {
    val __obj = js.Dynamic.literal(block_position = block_position, destruction_progress = destruction_progress, player = player)
  
    __obj.asInstanceOf[IBlockDestructionStoppedEventData]
  }
}

