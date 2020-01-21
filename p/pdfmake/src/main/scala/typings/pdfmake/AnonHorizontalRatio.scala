package typings.pdfmake

import typings.pdfmake.mod.PageOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHorizontalRatio extends js.Object {
  var horizontalRatio: Double
  var left: Double
  var pageNumber: Double
  var pageOrientation: PageOrientation
  var right: Double
  var verticalRatio: Double
}

object AnonHorizontalRatio {
  @scala.inline
  def apply(
    horizontalRatio: Double,
    left: Double,
    pageNumber: Double,
    pageOrientation: PageOrientation,
    right: Double,
    verticalRatio: Double
  ): AnonHorizontalRatio = {
    val __obj = js.Dynamic.literal(horizontalRatio = horizontalRatio.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageOrientation = pageOrientation.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], verticalRatio = verticalRatio.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHorizontalRatio]
  }
}

