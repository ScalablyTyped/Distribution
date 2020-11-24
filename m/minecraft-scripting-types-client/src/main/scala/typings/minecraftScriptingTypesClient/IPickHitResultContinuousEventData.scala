package typings.minecraftScriptingTypesClient

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered every update and tells you what entity the mouse pointer is pointing to in the world up to 1000 blocks away.
  */
@js.native
trait IPickHitResultContinuousEventData extends js.Object {
  
  /**
    * The entity that was hit or null if it not pointing at an entity
    */
  var entity: IEntity = js.native
  
  /**
    * The position of the entity that was hit or block that was hit
    */
  var position: VectorXYZ = js.native
}
object IPickHitResultContinuousEventData {
  
  @scala.inline
  def apply(entity: IEntity, position: VectorXYZ): IPickHitResultContinuousEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPickHitResultContinuousEventData]
  }
  
  @scala.inline
  implicit class IPickHitResultContinuousEventDataOps[Self <: IPickHitResultContinuousEventData] (val x: Self) extends AnyVal {
    
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
    def setEntity(value: IEntity): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: VectorXYZ): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
