package typings.pdf2image.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertedFile extends js.Object {
  var index: Double
  var name: String
  var page: Double
  var path: String
}

object ConvertedFile {
  @scala.inline
  def apply(index: Double, name: String, page: Double, path: String): ConvertedFile = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertedFile]
  }
}

