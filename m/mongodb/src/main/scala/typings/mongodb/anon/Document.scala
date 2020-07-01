package typings.mongodb.anon

import typings.mongodb.mod.OptionalId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document[TSchema] extends js.Object {
  var document: OptionalId[TSchema]
}

object Document {
  @scala.inline
  def apply[TSchema](document: OptionalId[TSchema]): Document[TSchema] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document[TSchema]]
  }
}

