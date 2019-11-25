package typings.popcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopcornManifest extends js.Object {
  var about: PopcornManifestAbout
  var options: PopcornManifestOptions
}

object PopcornManifest {
  @scala.inline
  def apply(about: PopcornManifestAbout, options: PopcornManifestOptions): PopcornManifest = {
    val __obj = js.Dynamic.literal(about = about.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PopcornManifest]
  }
}

