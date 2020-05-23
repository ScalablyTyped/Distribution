package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document[T] extends js.Object {
  var document: T
}

object Document {
  @scala.inline
  def apply[T](document: T): Document[T] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document[T]]
  }
}

