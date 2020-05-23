package typings.nyaapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var file: String
  var magnet: String
  var page: String
}

object File {
  @scala.inline
  def apply(file: String, magnet: String, page: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], magnet = magnet.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

