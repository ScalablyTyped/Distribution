package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFPageViewport extends js.Object {
  var fontScale: scala.Double
  var height: scala.Double
  var transforms: js.Array[scala.Double]
  var width: scala.Double
  def clone(options: PDFPageViewportOptions): PDFPageViewport
   // [x1, y1, x2, y2]
  def convertToPdfPoint(x: scala.Double, y: scala.Double): js.Array[scala.Double]
  def convertToViewportPoint(x: scala.Double, y: scala.Double): js.Array[scala.Double]
   // [x, y]
  def convertToViewportRectangle(rect: js.Array[scala.Double]): js.Array[scala.Double]
}

object PDFPageViewport {
  @scala.inline
  def apply(
    clone: PDFPageViewportOptions => PDFPageViewport,
    convertToPdfPoint: (scala.Double, scala.Double) => js.Array[scala.Double],
    convertToViewportPoint: (scala.Double, scala.Double) => js.Array[scala.Double],
    convertToViewportRectangle: js.Array[scala.Double] => js.Array[scala.Double],
    fontScale: scala.Double,
    height: scala.Double,
    transforms: js.Array[scala.Double],
    width: scala.Double
  ): PDFPageViewport = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone), convertToPdfPoint = js.Any.fromFunction2(convertToPdfPoint), convertToViewportPoint = js.Any.fromFunction2(convertToViewportPoint), convertToViewportRectangle = js.Any.fromFunction1(convertToViewportRectangle), fontScale = fontScale, height = height, transforms = transforms, width = width)
  
    __obj.asInstanceOf[PDFPageViewport]
  }
}

