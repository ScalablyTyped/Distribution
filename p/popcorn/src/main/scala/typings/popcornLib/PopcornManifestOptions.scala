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
    val __obj = js.Dynamic.literal(end = end, start = start, target = target, text = text)
  
    __obj.asInstanceOf[PopcornManifestOptions]
  }
}

