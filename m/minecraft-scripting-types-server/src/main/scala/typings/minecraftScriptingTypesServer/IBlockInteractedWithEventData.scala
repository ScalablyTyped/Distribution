package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.VectorXYZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever a player interacts with a block.
  */
@js.native
trait IBlockInteractedWithEventData extends StObject {
  
  /**
    * The position of the block that is being interacted with
    */
  var block_position: VectorXYZ = js.native
  
  /**
    * The player that interacted with the block
    */
  var player: IEntity = js.native
}
object IBlockInteractedWithEventData {
  
  @scala.inline
  def apply(block_position: VectorXYZ, player: IEntity): IBlockInteractedWithEventData = {
    val __obj = js.Dynamic.literal(block_position = block_position.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBlockInteractedWithEventData]
  }
  
  @scala.inline
  implicit class IBlockInteractedWithEventDataMutableBuilder[Self <: IBlockInteractedWithEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock_position(value: VectorXYZ): Self = StObject.set(x, "block_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayer(value: IEntity): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
  }
}
