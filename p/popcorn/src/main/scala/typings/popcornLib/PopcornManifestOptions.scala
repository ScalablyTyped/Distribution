package typings
package popcornLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopcornManifestOptions extends js.Object {
  var end: PopcornManifestOption
  var start: PopcornManifestOption
  var target: java.lang.String
  var text: PopcornManifestOption
}

object PopcornManifestOptions {
  @scala.inline
  def apply(
    end: PopcornManifestOption,
    start: PopcornManifestOption,
    target: java.lang.String,
    text: PopcornManifestOption
  ): PopcornManifestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[PopcornManifestOptions]
  }
}

