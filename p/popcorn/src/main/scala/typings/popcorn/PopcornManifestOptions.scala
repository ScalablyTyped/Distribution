package typings.popcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopcornManifestOptions extends js.Object {
  var end: PopcornManifestOption
  var start: PopcornManifestOption
  var target: String
  var text: PopcornManifestOption
}

object PopcornManifestOptions {
  @scala.inline
  def apply(
    end: PopcornManifestOption,
    start: PopcornManifestOption,
    target: String,
    text: PopcornManifestOption
  ): PopcornManifestOptions = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PopcornManifestOptions]
  }
}

