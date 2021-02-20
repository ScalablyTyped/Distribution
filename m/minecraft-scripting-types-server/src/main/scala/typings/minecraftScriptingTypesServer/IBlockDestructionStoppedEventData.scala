package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.VectorXYZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever a player stops destroying a block.
  */
@js.native
trait IBlockDestructionStoppedEventData extends StObject {
  
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
  implicit class IBlockDestructionStoppedEventDataMutableBuilder[Self <: IBlockDestructionStoppedEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock_position(value: VectorXYZ): Self = StObject.set(x, "block_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestruction_progress(value: Double): Self = StObject.set(x, "destruction_progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayer(value: IEntity): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
  }
}
