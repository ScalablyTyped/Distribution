package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityType extends js.Object {
  var entityType: String = js.native
  var name: String = js.native
  var parentFrame: String = js.native
  var uuid: String = js.native
}

object EntityType {
  @scala.inline
  def apply(entityType: String, name: String, parentFrame: String, uuid: String): EntityType = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentFrame = parentFrame.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityType]
  }
  @scala.inline
  implicit class EntityTypeOps[Self <: EntityType] (val x: Self) extends AnyVal {
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
    def setEntityType(value: String): Self = this.set("entityType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentFrame(value: String): Self = this.set("parentFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
  
}

