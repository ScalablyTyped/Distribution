package typings.pdfmake

import typings.pdfmake.interfacesMod.PageOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHorizontalRatio extends js.Object {
  var horizontalRatio: Double
  var left: Double
  var pageInnerHeight: Double
  var pageInnerWidth: Double
  var pageNumber: Double
  var pageOrientation: PageOrientation
  var top: Double
  var verticalRatio: Double
}

object AnonHorizontalRatio {
  @scala.inline
  def apply(
    horizontalRatio: Double,
    left: Double,
    pageInnerHeight: Double,
    pageInnerWidth: Double,
    pageNumber: Double,
    pageOrientation: PageOrientation,
    top: Double,
    verticalRatio: Double
  ): AnonHorizontalRatio = {
    val __obj = js.Dynamic.literal(horizontalRatio = horizontalRatio.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pageInnerHeight = pageInnerHeight.asInstanceOf[js.Any], pageInnerWidth = pageInnerWidth.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageOrientation = pageOrientation.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], verticalRatio = verticalRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHorizontalRatio]
  }
}

