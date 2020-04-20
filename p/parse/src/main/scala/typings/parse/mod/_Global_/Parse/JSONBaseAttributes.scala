package typings.parse.mod._Global_.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONBaseAttributes extends js.Object {
  var createdAt: String
  var objectId: String
  var updatedAt: String
}

object JSONBaseAttributes {
  @scala.inline
  def apply(createdAt: String, objectId: String, updatedAt: String): JSONBaseAttributes = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONBaseAttributes]
  }
}

