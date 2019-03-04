package typings
package popcornLib

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
    val __obj = js.Dynamic.literal(about = about, options = options)
  
    __obj.asInstanceOf[PopcornManifest]
  }
}

