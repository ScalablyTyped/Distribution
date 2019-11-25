package typings.nodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Createdat extends js.Object {
  var created_at: String
  var id: String
  var updated_at: String
}

object Anon_Createdat {
  @scala.inline
  def apply(created_at: String, id: String, updated_at: String): Anon_Createdat = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Createdat]
  }
}

