package typings.mongodb.anon

import typings.mongodb.mod.ExtractIdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[TSchema] extends js.Object {
  var _id: ExtractIdType[TSchema]
}

object `0` {
  @scala.inline
  def apply[TSchema](_id: ExtractIdType[TSchema]): `0`[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[TSchema]]
  }
}

