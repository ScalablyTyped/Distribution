package typings.popcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopcornManifestOption extends js.Object {
  var elem: String
  var label: String
  var `type`: String
}

object PopcornManifestOption {
  @scala.inline
  def apply(elem: String, label: String, `type`: String): PopcornManifestOption = {
    val __obj = js.Dynamic.literal(elem = elem, label = label)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PopcornManifestOption]
  }
}

