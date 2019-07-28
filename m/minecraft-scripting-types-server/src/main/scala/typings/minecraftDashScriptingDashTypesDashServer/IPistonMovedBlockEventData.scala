package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever a piston moves a block.
  */
trait IPistonMovedBlockEventData extends js.Object {
  /**
    * The position of the block that was moved
    */
  var block_position: VectorXYZ
  /**
    * The action the piston took, "extended" or "retracted"
    */
  var piston_action: String
  /**
    * The position of the piston that moved the block
    */
  var piston_position: VectorXYZ
}

object IPistonMovedBlockEventData {
  @scala.inline
  def apply(block_position: VectorXYZ, piston_action: String, piston_position: VectorXYZ): IPistonMovedBlockEventData = {
    val __obj = js.Dynamic.literal(block_position = block_position, piston_action = piston_action, piston_position = piston_position)
  
    __obj.asInstanceOf[IPistonMovedBlockEventData]
  }
}

