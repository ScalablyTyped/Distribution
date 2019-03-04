package typings
package postmanDashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  var file: java.lang.String
  var formdata: java.lang.String
  var raw: java.lang.String
  var urlencoded: java.lang.String
}

object Anon_File {
  @scala.inline
  def apply(
    file: java.lang.String,
    formdata: java.lang.String,
    raw: java.lang.String,
    urlencoded: java.lang.String
  ): Anon_File = {
    val __obj = js.Dynamic.literal(file = file, formdata = formdata, raw = raw, urlencoded = urlencoded)
  
    __obj.asInstanceOf[Anon_File]
  }
}

