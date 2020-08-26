package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity dies. This won't be triggered when an entity is removed (such as when using destroyEntity).
  */
@js.native
trait IEntityDeathEventData extends js.Object {
  /**
    * The entity that died
    */
  var entity: IEntity = js.native
}

object IEntityDeathEventData {
  @scala.inline
  def apply(entity: IEntity): IEntityDeathEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityDeathEventData]
  }
  @scala.inline
  implicit class IEntityDeathEventDataOps[Self <: IEntityDeathEventData] (val x: Self) extends AnyVal {
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

