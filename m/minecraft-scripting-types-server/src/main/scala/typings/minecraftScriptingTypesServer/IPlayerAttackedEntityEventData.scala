package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever a player attacks an entity.
  */
@js.native
trait IPlayerAttackedEntityEventData extends StObject {
  
  /**
    * The entity that was attacked by the player
    */
  var attacked_entity: IEntity = js.native
  
  /**
    * The player that attacked an entity
    */
  var player: IEntity = js.native
}
object IPlayerAttackedEntityEventData {
  
  @scala.inline
  def apply(attacked_entity: IEntity, player: IEntity): IPlayerAttackedEntityEventData = {
    val __obj = js.Dynamic.literal(attacked_entity = attacked_entity.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayerAttackedEntityEventData]
  }
  
  @scala.inline
  implicit class IPlayerAttackedEntityEventDataMutableBuilder[Self <: IPlayerAttackedEntityEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttacked_entity(value: IEntity): Self = StObject.set(x, "attacked_entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayer(value: IEntity): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
  }
}
