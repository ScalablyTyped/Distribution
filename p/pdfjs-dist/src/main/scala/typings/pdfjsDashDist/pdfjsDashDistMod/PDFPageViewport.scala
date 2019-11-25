package typings.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFPageViewport extends js.Object {
  var height: Double
  var scale: Double
  var transforms: js.Array[Double]
  var width: Double
  def clone(options: PDFPageViewportOptions): PDFPageViewport
   // [x1, y1, x2, y2]
  def convertToPdfPoint(x: Double, y: Double): js.Array[Double]
  def convertToViewportPoint(x: Double, y: Double): js.Array[Double]
   // [x, y]
  def convertToViewportRectangle(rect: js.Array[Double]): js.Array[Double]
}

object PDFPageViewport {
  @scala.inline
  def apply(
    clone: PDFPageViewportOptions => PDFPageViewport,
    convertToPdfPoint: (Double, Double) => js.Array[Double],
    convertToViewportPoint: (Double, Double) => js.Array[Double],
    convertToViewportRectangle: js.Array[Double] => js.Array[Double],
    height: Double,
    scale: Double,
    transforms: js.Array[Double],
    width: Double
  ): PDFPageViewport = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone), convertToPdfPoint = js.Any.fromFunction2(convertToPdfPoint), convertToViewportPoint = js.Any.fromFunction2(convertToViewportPoint), convertToViewportRectangle = js.Any.fromFunction1(convertToViewportRectangle), height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PDFPageViewport]
  }
}

