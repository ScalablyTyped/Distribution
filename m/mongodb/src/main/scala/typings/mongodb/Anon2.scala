package typings.mongodb

import typings.mongodb.mod.ExtractIdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2[TSchema] extends js.Object {
  var _id: ExtractIdType[TSchema]
}

object Anon2 {
  @scala.inline
  def apply[TSchema](_id: ExtractIdType[TSchema]): Anon2[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon2[TSchema]]
  }
}

