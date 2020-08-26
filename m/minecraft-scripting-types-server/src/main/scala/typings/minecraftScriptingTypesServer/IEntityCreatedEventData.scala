package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity is added to the world.
  */
@js.native
trait IEntityCreatedEventData extends js.Object {
  /**
    * The entity that was just created
    */
  var entity: IEntity = js.native
}

object IEntityCreatedEventData {
  @scala.inline
  def apply(entity: IEntity): IEntityCreatedEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityCreatedEventData]
  }
  @scala.inline
  implicit class IEntityCreatedEventDataOps[Self <: IEntityCreatedEventData] (val x: Self) extends AnyVal {
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
  }
  
}

