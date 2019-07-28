package typings.mongodb

import typings.bson.bsonMod.ObjectID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdObjectID extends js.Object {
  var _id: ObjectID
}

object Anon_IdObjectID {
  @scala.inline
  def apply(_id: ObjectID): Anon_IdObjectID = {
    val __obj = js.Dynamic.literal(_id = _id)
  
    __obj.asInstanceOf[Anon_IdObjectID]
  }
}

