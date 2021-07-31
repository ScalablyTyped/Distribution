package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.VectorXYZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever a piston moves a block.
  */
trait IPistonMovedBlockEventData extends StObject {
  
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
    val __obj = js.Dynamic.literal(block_position = block_position.asInstanceOf[js.Any], piston_action = piston_action.asInstanceOf[js.Any], piston_position = piston_position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPistonMovedBlockEventData]
  }
  
  @scala.inline
  implicit class IPistonMovedBlockEventDataMutableBuilder[Self <: IPistonMovedBlockEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock_position(value: VectorXYZ): Self = StObject.set(x, "block_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPiston_action(value: String): Self = StObject.set(x, "piston_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPiston_position(value: VectorXYZ): Self = StObject.set(x, "piston_position", value.asInstanceOf[js.Any])
  }
}
