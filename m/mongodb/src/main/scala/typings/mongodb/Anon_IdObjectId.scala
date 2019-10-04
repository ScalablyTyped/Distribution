package typings.mongodb

import typings.bson.bsonMod.ObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdObjectId extends js.Object {
  var _id: ObjectId
}

object Anon_IdObjectId {
  @scala.inline
  def apply(_id: ObjectId): Anon_IdObjectId = {
    val __obj = js.Dynamic.literal(_id = _id)
  
    __obj.asInstanceOf[Anon_IdObjectId]
  }
}

