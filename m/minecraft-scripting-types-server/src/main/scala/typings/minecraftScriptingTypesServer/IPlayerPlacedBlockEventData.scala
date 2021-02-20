package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.VectorXYZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever a player places a block.
  */
@js.native
trait IPlayerPlacedBlockEventData extends StObject {
  
  /**
    * The position of the block that was placed
    */
  var block_position: VectorXYZ = js.native
  
  /**
    * The player that placed the block
    */
  var player: IEntity = js.native
}
object IPlayerPlacedBlockEventData {
  
  @scala.inline
  def apply(block_position: VectorXYZ, player: IEntity): IPlayerPlacedBlockEventData = {
    val __obj = js.Dynamic.literal(block_position = block_position.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayerPlacedBlockEventData]
  }
  
  @scala.inline
  implicit class IPlayerPlacedBlockEventDataMutableBuilder[Self <: IPlayerPlacedBlockEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock_position(value: VectorXYZ): Self = StObject.set(x, "block_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayer(value: IEntity): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
  }
}
