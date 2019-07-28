package typings.postmanDashCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  var file: String
  var formdata: String
  var raw: String
  var urlencoded: String
}

object Anon_File {
  @scala.inline
  def apply(file: String, formdata: String, raw: String, urlencoded: String): Anon_File = {
    val __obj = js.Dynamic.literal(file = file, formdata = formdata, raw = raw, urlencoded = urlencoded)
  
    __obj.asInstanceOf[Anon_File]
  }
}

