package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPageSize extends PageSize {
  var height: Double | auto
  var width: Double
}

object CustomPageSize {
  @scala.inline
  def apply(height: Double | auto, width: Double): CustomPageSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPageSize]
  }
}

