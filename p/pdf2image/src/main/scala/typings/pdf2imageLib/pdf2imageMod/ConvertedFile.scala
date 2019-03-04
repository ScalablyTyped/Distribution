package typings
package pdf2imageLib.pdf2imageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertedFile extends js.Object {
  var index: scala.Double
  var name: java.lang.String
  var page: scala.Double
  var path: java.lang.String
}

object ConvertedFile {
  @scala.inline
  def apply(index: scala.Double, name: java.lang.String, page: scala.Double, path: java.lang.String): ConvertedFile = {
    val __obj = js.Dynamic.literal(index = index, name = name, page = page, path = path)
  
    __obj.asInstanceOf[ConvertedFile]
  }
}

