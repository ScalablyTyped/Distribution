package typings.nyaapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends js.Object {
  var file: String
  var magnet: String
  var page: String
}

object AnonFile {
  @scala.inline
  def apply(file: String, magnet: String, page: String): AnonFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], magnet = magnet.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFile]
  }
}

