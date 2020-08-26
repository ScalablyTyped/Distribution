package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFPageViewport extends js.Object {
  var height: Double = js.native
  var scale: Double = js.native
  var transforms: js.Array[Double] = js.native
  var width: Double = js.native
  def clone(options: PDFPageViewportOptions): PDFPageViewport = js.native
   // [x1, y1, x2, y2]
  def convertToPdfPoint(x: Double, y: Double): js.Array[Double] = js.native
  def convertToViewportPoint(x: Double, y: Double): js.Array[Double] = js.native
   // [x, y]
  def convertToViewportRectangle(rect: js.Array[Double]): js.Array[Double] = js.native
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
  @scala.inline
  implicit class PDFPageViewportOps[Self <: PDFPageViewport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClone(value: PDFPageViewportOptions => PDFPageViewport): Self = this.set("clone", js.Any.fromFunction1(value))
    @scala.inline
    def setConvertToPdfPoint(value: (Double, Double) => js.Array[Double]): Self = this.set("convertToPdfPoint", js.Any.fromFunction2(value))
    @scala.inline
    def setConvertToViewportPoint(value: (Double, Double) => js.Array[Double]): Self = this.set("convertToViewportPoint", js.Any.fromFunction2(value))
    @scala.inline
    def setConvertToViewportRectangle(value: js.Array[Double] => js.Array[Double]): Self = this.set("convertToViewportRectangle", js.Any.fromFunction1(value))
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformsVarargs(value: Double*): Self = this.set("transforms", js.Array(value :_*))
    @scala.inline
    def setTransforms(value: js.Array[Double]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

