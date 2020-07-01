package typings.nestdb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewDoc[T /* <: G */, G] extends js.Object {
  var newDoc: T
  var oldDoc: T
}

object NewDoc {
  @scala.inline
  def apply[/* <: G */ T, G](newDoc: T, oldDoc: T): NewDoc[T, G] = {
    val __obj = js.Dynamic.literal(newDoc = newDoc.asInstanceOf[js.Any], oldDoc = oldDoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewDoc[T, G]]
  }
}

