package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFAnnotationData extends js.Object {
  
   // [x1, y1, x2, y2]
  var annotationFlags: js.Any = js.native
  
   // [r,g,b]
  var borderWidth: Double = js.native
  
   // todo
  var color: js.Array[Double] = js.native
  
  var hasAppearance: Boolean = js.native
  
  var rect: js.Array[Double] = js.native
  
  var subtype: String = js.native
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
  
  @scala.inline
  implicit class PDFAnnotationDataOps[Self <: PDFAnnotationData] (val x: Self) extends AnyVal {
    
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
    def setAnnotationFlags(value: js.Any): Self = this.set("annotationFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: js.Array[Double]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAppearance(value: Boolean): Self = this.set("hasAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectVarargs(value: Double*): Self = this.set("rect", js.Array(value :_*))
    
    @scala.inline
    def setRect(value: js.Array[Double]): Self = this.set("rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtype(value: String): Self = this.set("subtype", value.asInstanceOf[js.Any])
  }
}
