package typings
package popcornLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopcornManifestOption extends js.Object {
  var elem: java.lang.String
  var label: java.lang.String
  var `type`: java.lang.String
}

object PopcornManifestOption {
  @scala.inline
  def apply(elem: java.lang.String, label: java.lang.String, `type`: java.lang.String): PopcornManifestOption = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("elem")(elem)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[PopcornManifestOption]
  }
}

