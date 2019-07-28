package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashShared.IEntity
import typings.minecraftDashScriptingDashTypesDashShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever a player interacts with a block.
  */
trait IBlockInteractedWithEventData extends js.Object {
  /**
    * The position of the block that is being interacted with
    */
  var block_position: VectorXYZ
  /**
    * The player that interacted with the block
    */
  var player: IEntity
}

object IBlockInteractedWithEventData {
  @scala.inline
  def apply(block_position: VectorXYZ, player: IEntity): IBlockInteractedWithEventData = {
    val __obj = js.Dynamic.literal(block_position = block_position, player = player)
  
    __obj.asInstanceOf[IBlockInteractedWithEventData]
  }
}

