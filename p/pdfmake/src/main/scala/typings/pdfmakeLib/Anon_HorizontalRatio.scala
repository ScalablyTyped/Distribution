package typings
package pdfmakeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HorizontalRatio extends js.Object {
  var horizontalRatio: scala.Double
  var left: scala.Double
  var pageNumber: scala.Double
  var pageOrientation: pdfmakeLib.buildPdfmakeMod.PageOrientation
  var right: scala.Double
  var verticalRatio: scala.Double
}

object Anon_HorizontalRatio {
  @scala.inline
  def apply(
    horizontalRatio: scala.Double,
    left: scala.Double,
    pageNumber: scala.Double,
    pageOrientation: pdfmakeLib.buildPdfmakeMod.PageOrientation,
    right: scala.Double,
    verticalRatio: scala.Double
  ): Anon_HorizontalRatio = {
    val __obj = js.Dynamic.literal(horizontalRatio = horizontalRatio, left = left, pageNumber = pageNumber, pageOrientation = pageOrientation, right = right, verticalRatio = verticalRatio)
  
    __obj.asInstanceOf[Anon_HorizontalRatio]
  }
}

