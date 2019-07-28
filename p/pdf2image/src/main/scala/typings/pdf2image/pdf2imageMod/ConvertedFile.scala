package typings.pdf2image.pdf2imageMod

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
    val __obj = js.Dynamic.literal(index = index, name = name, page = page, path = path)
  
    __obj.asInstanceOf[ConvertedFile]
  }
}

