package typings.nedb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewDoc[T /* <: G */] extends js.Object {
  var newDoc: T
  var oldDoc: T
}

object Anon_NewDoc {
  @scala.inline
  def apply[T /* <: G */](newDoc: T, oldDoc: T): Anon_NewDoc[T] = {
    val __obj = js.Dynamic.literal(newDoc = newDoc.asInstanceOf[js.Any], oldDoc = oldDoc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NewDoc[T]]
  }
}

