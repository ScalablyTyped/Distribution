package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever a piston moves a block.
  */
@js.native
trait IPistonMovedBlockEventData extends js.Object {
  /**
    * The position of the block that was moved
    */
  var block_position: VectorXYZ = js.native
  /**
    * The action the piston took, "extended" or "retracted"
    */
  var piston_action: String = js.native
  /**
    * The position of the piston that moved the block
    */
  var piston_position: VectorXYZ = js.native
}

object IPistonMovedBlockEventData {
  @scala.inline
  def apply(block_position: VectorXYZ, piston_action: String, piston_position: VectorXYZ): IPistonMovedBlockEventData = {
    val __obj = js.Dynamic.literal(block_position = block_position.asInstanceOf[js.Any], piston_action = piston_action.asInstanceOf[js.Any], piston_position = piston_position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPistonMovedBlockEventData]
  }
  @scala.inline
  implicit class IPistonMovedBlockEventDataOps[Self <: IPistonMovedBlockEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlock_position(value: VectorXYZ): Self = this.set("block_position", value.asInstanceOf[js.Any])
    @scala.inline
    def setPiston_action(value: String): Self = this.set("piston_action", value.asInstanceOf[js.Any])
    @scala.inline
    def setPiston_position(value: VectorXYZ): Self = this.set("piston_position", value.asInstanceOf[js.Any])
  }
  
}

