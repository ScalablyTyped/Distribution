package typings.pdfmake.anon

import typings.pdfmake.interfacesMod.PageOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HorizontalRatio extends js.Object {
  var horizontalRatio: Double
  var left: Double
  var pageInnerHeight: Double
  var pageInnerWidth: Double
  var pageNumber: Double
  var pageOrientation: PageOrientation
  var top: Double
  var verticalRatio: Double
}

object HorizontalRatio {
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
  ): HorizontalRatio = {
    val __obj = js.Dynamic.literal(horizontalRatio = horizontalRatio.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pageInnerHeight = pageInnerHeight.asInstanceOf[js.Any], pageInnerWidth = pageInnerWidth.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageOrientation = pageOrientation.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], verticalRatio = verticalRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalRatio]
  }
}

