package typings.popcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopcornManifestAbout extends js.Object {
  var author: String
  var name: String
  var version: String
  var website: String
}

object PopcornManifestAbout {
  @scala.inline
  def apply(author: String, name: String, version: String, website: String): PopcornManifestAbout = {
    val __obj = js.Dynamic.literal(author = author, name = name, version = version, website = website)
  
    __obj.asInstanceOf[PopcornManifestAbout]
  }
}

