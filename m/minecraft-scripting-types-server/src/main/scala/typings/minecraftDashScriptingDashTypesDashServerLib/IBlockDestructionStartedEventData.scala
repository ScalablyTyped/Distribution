package typings
package minecraftDashScriptingDashTypesDashServerLib

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
  var block_position: minecraftDashScriptingDashTypesDashSharedLib.VectorXYZ
  /**
    * The player that started destoying the block
    */
  var player: minecraftDashScriptingDashTypesDashSharedLib.IEntity
}

object IBlockDestructionStartedEventData {
  @scala.inline
  def apply(
    block_position: minecraftDashScriptingDashTypesDashSharedLib.VectorXYZ,
    player: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  ): IBlockDestructionStartedEventData = {
    val __obj = js.Dynamic.literal(block_position = block_position, player = player)
  
    __obj.asInstanceOf[IBlockDestructionStartedEventData]
  }
}

