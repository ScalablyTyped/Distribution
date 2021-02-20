package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.VectorXYZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever a player starts to destroy a block.
  */
@js.native
trait IBlockDestructionStartedEventData extends StObject {
  
  /**
    * The position of the block that is being destroyed
    */
  var block_position: VectorXYZ = js.native
  
  /**
    * The player that started destoying the block
    */
  var player: IEntity = js.native
}
object IBlockDestructionStartedEventData {
  
  @scala.inline
  def apply(block_position: VectorXYZ, player: IEntity): IBlockDestructionStartedEventData = {
    val __obj = js.Dynamic.literal(block_position = block_position.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBlockDestructionStartedEventData]
  }
  
  @scala.inline
  implicit class IBlockDestructionStartedEventDataMutableBuilder[Self <: IBlockDestructionStartedEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock_position(value: VectorXYZ): Self = StObject.set(x, "block_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayer(value: IEntity): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
  }
}
