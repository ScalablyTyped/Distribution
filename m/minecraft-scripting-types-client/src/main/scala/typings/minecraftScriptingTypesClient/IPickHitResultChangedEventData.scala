package typings.minecraftScriptingTypesClient

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever the mouse pointer changes from pointing at a block or air to pointing at an entity and the other way around. Up to 1000 blocks away.
  */
@js.native
trait IPickHitResultChangedEventData extends js.Object {
  /**
    * The entity that was hit or null if it fired when moving off of an entity
    */
  var entity: IEntity = js.native
  /**
    * The position of the entity that was hit or null if it fired when moving off an entity
    */
  var position: VectorXYZ | Null = js.native
}

object IPickHitResultChangedEventData {
  @scala.inline
  def apply(entity: IEntity): IPickHitResultChangedEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPickHitResultChangedEventData]
  }
  @scala.inline
  implicit class IPickHitResultChangedEventDataOps[Self <: IPickHitResultChangedEventData] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
  }
  
}

