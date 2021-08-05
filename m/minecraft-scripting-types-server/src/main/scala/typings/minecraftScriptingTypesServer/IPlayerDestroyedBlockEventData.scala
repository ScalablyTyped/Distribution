package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.VectorXYZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever a player destroys a block.
  */
trait IPlayerDestroyedBlockEventData extends StObject {
  
  /**
    * The identifier of the block that was destroyed
    */
  var block_identifier: String
  
  /**
    * The position of the block that was destroyed
    */
  var block_position: VectorXYZ
  
  /**
    * The player that destroyed the block
    */
  var player: IEntity
}
object IPlayerDestroyedBlockEventData {
  
  inline def apply(block_identifier: String, block_position: VectorXYZ, player: IEntity): IPlayerDestroyedBlockEventData = {
    val __obj = js.Dynamic.literal(block_identifier = block_identifier.asInstanceOf[js.Any], block_position = block_position.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayerDestroyedBlockEventData]
  }
  
  extension [Self <: IPlayerDestroyedBlockEventData](x: Self) {
    
    inline def setBlock_identifier(value: String): Self = StObject.set(x, "block_identifier", value.asInstanceOf[js.Any])
    
    inline def setBlock_position(value: VectorXYZ): Self = StObject.set(x, "block_position", value.asInstanceOf[js.Any])
    
    inline def setPlayer(value: IEntity): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
  }
}
