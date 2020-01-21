package typings.mongodb

import typings.bson.mod.ObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdObjectId extends js.Object {
  var _id: ObjectId
}

object AnonIdObjectId {
  @scala.inline
  def apply(_id: ObjectId): AnonIdObjectId = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdObjectId]
  }
}

