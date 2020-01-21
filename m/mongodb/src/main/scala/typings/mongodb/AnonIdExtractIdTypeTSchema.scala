package typings.mongodb

import typings.mongodb.mod.ExtractIdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdExtractIdTypeTSchema[TSchema] extends js.Object {
  var _id: ExtractIdType[TSchema]
}

object AnonIdExtractIdTypeTSchema {
  @scala.inline
  def apply[TSchema](_id: ExtractIdType[TSchema]): AnonIdExtractIdTypeTSchema[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdExtractIdTypeTSchema[TSchema]]
  }
}

