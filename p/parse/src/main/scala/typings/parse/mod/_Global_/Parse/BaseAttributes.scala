package typings.parse.mod._Global_.Parse

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseAttributes extends js.Object {
  var createdAt: Date
  var objectId: String
  var updatedAt: Date
}

object BaseAttributes {
  @scala.inline
  def apply(createdAt: Date, objectId: String, updatedAt: Date): BaseAttributes = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseAttributes]
  }
}

