package typings.pacote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreated extends js.Object {
  var created: String
  var modified: String
}

object AnonCreated {
  @scala.inline
  def apply(created: String, modified: String): AnonCreated = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCreated]
  }
}

