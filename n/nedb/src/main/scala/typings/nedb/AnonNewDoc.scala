package typings.nedb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewDoc[T /* <: G */, G] extends js.Object {
  var newDoc: T
  var oldDoc: T
}

object AnonNewDoc {
  @scala.inline
  def apply[T /* <: G */, G](newDoc: T, oldDoc: T): AnonNewDoc[T, G] = {
    val __obj = js.Dynamic.literal(newDoc = newDoc.asInstanceOf[js.Any], oldDoc = oldDoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewDoc[T, G]]
  }
}

