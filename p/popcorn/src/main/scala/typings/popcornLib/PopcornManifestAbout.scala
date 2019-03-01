package typings
package popcornLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopcornManifestAbout extends js.Object {
  var author: java.lang.String
  var name: java.lang.String
  var version: java.lang.String
  var website: java.lang.String
}

object PopcornManifestAbout {
  @scala.inline
  def apply(
    author: java.lang.String,
    name: java.lang.String,
    version: java.lang.String,
    website: java.lang.String
  ): PopcornManifestAbout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[PopcornManifestAbout]
  }
}

