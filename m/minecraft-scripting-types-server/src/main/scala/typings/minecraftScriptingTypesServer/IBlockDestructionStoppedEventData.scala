package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever a player stops destroying a block.
  */
@js.native
trait IBlockDestructionStoppedEventData extends js.Object {
  
  /**
    * The position of the block that was being destroyed
    */
  var block_position: VectorXYZ = js.native
  
  /**
    * How far along the destruction was before it was stopped (0 - 1 range)
    */
  var destruction_progress: Double = js.native
  
  /**
    * The player that stopped destoying the block
    */
  var player: IEntity = js.native
}
object IBlockDestructionStoppedEventData {
  
  @scala.inline
  def apply(block_position: VectorXYZ, destruction_progress: Double, player: IEntity): IBlockDestructionStoppedEventData = {
    val __obj = js.Dynamic.literal(block_position = block_position.asInstanceOf[js.Any], destruction_progress = destruction_progress.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBlockDestructionStoppedEventData]
  }
  
  @scala.inline
  implicit class IBlockDestructionStoppedEventDataOps[Self <: IBlockDestructionStoppedEventData] (val x: Self) extends AnyVal {
    
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
    def setDestruction_progress(value: Double): Self = this.set("destruction_progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayer(value: IEntity): Self = this.set("player", value.asInstanceOf[js.Any])
  }
}
