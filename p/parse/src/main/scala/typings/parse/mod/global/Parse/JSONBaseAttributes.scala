package typings.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONBaseAttributes extends js.Object {
  var createdAt: String = js.native
  var objectId: String = js.native
  var updatedAt: String = js.native
}

object JSONBaseAttributes {
  @scala.inline
  def apply(createdAt: String, objectId: String, updatedAt: String): JSONBaseAttributes = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONBaseAttributes]
  }
  @scala.inline
  implicit class JSONBaseAttributesOps[Self <: JSONBaseAttributes] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedAt(value: String): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
  }
  
}

