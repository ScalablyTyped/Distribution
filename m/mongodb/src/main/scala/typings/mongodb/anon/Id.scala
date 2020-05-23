package typings.mongodb.anon

import typings.bson.mod.ObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var _id: ObjectId
}

object Id {
  @scala.inline
  def apply(_id: ObjectId): Id = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

