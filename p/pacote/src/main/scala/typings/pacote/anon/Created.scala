package typings.pacote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Created extends js.Object {
  var created: String
  var modified: String
}

object Created {
  @scala.inline
  def apply(created: String, modified: String): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
}

