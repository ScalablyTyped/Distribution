package typings.mongodb

import typings.mongodb.mod.ExtractIdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon4[TSchema] extends js.Object {
  var _id: ExtractIdType[TSchema]
}

object Anon4 {
  @scala.inline
  def apply[TSchema](_id: ExtractIdType[TSchema]): Anon4[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon4[TSchema]]
  }
}

