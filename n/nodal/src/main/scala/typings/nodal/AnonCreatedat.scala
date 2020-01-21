package typings.nodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreatedat extends js.Object {
  var created_at: String
  var id: String
  var updated_at: String
}

object AnonCreatedat {
  @scala.inline
  def apply(created_at: String, id: String, updated_at: String): AnonCreatedat = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCreatedat]
  }
}

