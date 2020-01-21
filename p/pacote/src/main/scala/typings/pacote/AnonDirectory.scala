package typings.pacote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectory extends js.Object {
  var directory: js.UndefOr[String] = js.undefined
  var `type`: String
  var url: String
}

object AnonDirectory {
  @scala.inline
  def apply(`type`: String, url: String, directory: String = null): AnonDirectory = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirectory]
  }
}

