package typings.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFPageViewportOptions extends js.Object {
  var dontFlip: Boolean
  var offsetX: Double
  var offsetY: Double
  var rotation: Double
  var scale: Double
  var viewBox: js.Any
}

object PDFPageViewportOptions {
  @scala.inline
  def apply(
    dontFlip: Boolean,
    offsetX: Double,
    offsetY: Double,
    rotation: Double,
    scale: Double,
    viewBox: js.Any
  ): PDFPageViewportOptions = {
    val __obj = js.Dynamic.literal(dontFlip = dontFlip, offsetX = offsetX, offsetY = offsetY, rotation = rotation, scale = scale, viewBox = viewBox)
  
    __obj.asInstanceOf[PDFPageViewportOptions]
  }
}

