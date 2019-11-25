package typings.pacote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Directory extends js.Object {
  var directory: js.UndefOr[String] = js.undefined
  var `type`: String
  var url: String
}

object Anon_Directory {
  @scala.inline
  def apply(`type`: String, url: String, directory: String = null): Anon_Directory = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Directory]
  }
}

