package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFPageViewportOptions extends js.Object {
  var dontFlip: scala.Boolean
  var offsetX: scala.Double
  var offsetY: scala.Double
  var rotation: scala.Double
  var scale: scala.Double
  var viewBox: js.Any
}

object PDFPageViewportOptions {
  @scala.inline
  def apply(
    dontFlip: scala.Boolean,
    offsetX: scala.Double,
    offsetY: scala.Double,
    rotation: scala.Double,
    scale: scala.Double,
    viewBox: js.Any
  ): PDFPageViewportOptions = {
    val __obj = js.Dynamic.literal(dontFlip = dontFlip, offsetX = offsetX, offsetY = offsetY, rotation = rotation, scale = scale, viewBox = viewBox)
  
    __obj.asInstanceOf[PDFPageViewportOptions]
  }
}

