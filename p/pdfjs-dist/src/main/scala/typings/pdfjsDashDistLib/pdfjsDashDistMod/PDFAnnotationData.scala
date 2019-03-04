package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFAnnotationData extends js.Object {
   // [x1, y1, x2, y2]
  var annotationFlags: js.Any
   // [r,g,b]
  var borderWidth: scala.Double
   // todo
  var color: js.Array[scala.Double]
  var hasAppearance: scala.Boolean
  var rect: js.Array[scala.Double]
  var subtype: java.lang.String
}

object PDFAnnotationData {
  @scala.inline
  def apply(
    annotationFlags: js.Any,
    borderWidth: scala.Double,
    color: js.Array[scala.Double],
    hasAppearance: scala.Boolean,
    rect: js.Array[scala.Double],
    subtype: java.lang.String
  ): PDFAnnotationData = {
    val __obj = js.Dynamic.literal(annotationFlags = annotationFlags, borderWidth = borderWidth, color = color, hasAppearance = hasAppearance, rect = rect, subtype = subtype)
  
    __obj.asInstanceOf[PDFAnnotationData]
  }
}

