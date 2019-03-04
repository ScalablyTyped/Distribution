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
    val __obj = js.Dynamic.literal(author = author, name = name, version = version, website = website)
  
    __obj.asInstanceOf[PopcornManifestAbout]
  }
}

