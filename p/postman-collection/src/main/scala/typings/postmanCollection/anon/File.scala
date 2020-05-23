package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var file: String
  var formdata: String
  var raw: String
  var urlencoded: String
}

object File {
  @scala.inline
  def apply(file: String, formdata: String, raw: String, urlencoded: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], urlencoded = urlencoded.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

