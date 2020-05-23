package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var description: String
  var label: String
  var width: Double
}

object Description {
  @scala.inline
  def apply(description: String, label: String, width: Double): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

