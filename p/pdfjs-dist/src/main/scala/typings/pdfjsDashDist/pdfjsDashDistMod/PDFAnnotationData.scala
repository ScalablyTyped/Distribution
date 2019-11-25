package typings.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFAnnotationData extends js.Object {
   // [x1, y1, x2, y2]
  var annotationFlags: js.Any
   // [r,g,b]
  var borderWidth: Double
   // todo
  var color: js.Array[Double]
  var hasAppearance: Boolean
  var rect: js.Array[Double]
  var subtype: String
}

object PDFAnnotationData {
  @scala.inline
  def apply(
    annotationFlags: js.Any,
    borderWidth: Double,
    color: js.Array[Double],
    hasAppearance: Boolean,
    rect: js.Array[Double],
    subtype: String
  ): PDFAnnotationData = {
    val __obj = js.Dynamic.literal(annotationFlags = annotationFlags.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], hasAppearance = hasAppearance.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PDFAnnotationData]
  }
}

