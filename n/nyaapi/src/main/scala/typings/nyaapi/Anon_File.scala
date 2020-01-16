package typings.nyaapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  var file: String
  var magnet: String
  var page: String
}

object Anon_File {
  @scala.inline
  def apply(file: String, magnet: String, page: String): Anon_File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], magnet = magnet.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_File]
  }
}

