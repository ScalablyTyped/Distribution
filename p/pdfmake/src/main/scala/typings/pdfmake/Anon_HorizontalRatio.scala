package typings.pdfmake

import typings.pdfmake.buildPdfmakeMod.PageOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HorizontalRatio extends js.Object {
  var horizontalRatio: Double
  var left: Double
  var pageNumber: Double
  var pageOrientation: PageOrientation
  var right: Double
  var verticalRatio: Double
}

object Anon_HorizontalRatio {
  @scala.inline
  def apply(
    horizontalRatio: Double,
    left: Double,
    pageNumber: Double,
    pageOrientation: PageOrientation,
    right: Double,
    verticalRatio: Double
  ): Anon_HorizontalRatio = {
    val __obj = js.Dynamic.literal(horizontalRatio = horizontalRatio, left = left, pageNumber = pageNumber, pageOrientation = pageOrientation, right = right, verticalRatio = verticalRatio)
  
    __obj.asInstanceOf[Anon_HorizontalRatio]
  }
}

