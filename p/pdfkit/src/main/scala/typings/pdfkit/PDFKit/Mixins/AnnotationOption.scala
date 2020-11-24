package typings.pdfkit.PDFKit.Mixins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationOption extends js.Object {
  
  var A: js.UndefOr[js.Any] = js.native
  
  var B: js.UndefOr[js.Any] = js.native
  
  var Border: js.UndefOr[js.Array[Double]] = js.native
  
  var C: js.UndefOr[js.Any] = js.native
  
  var Contents: js.UndefOr[String] = js.native
  
  var DA: js.UndefOr[String] = js.native
  
  var L: js.UndefOr[js.Any] = js.native
  
  var Name: js.UndefOr[String] = js.native
  
  var QuadPoints: js.UndefOr[js.Array[Double]] = js.native
  
  var Rect: js.UndefOr[js.Any] = js.native
  
  var SubType: js.UndefOr[String] = js.native
  
  var Type: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
}
object AnnotationOption {
  
  @scala.inline
  def apply(): AnnotationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationOption]
  }
  
  @scala.inline
  implicit class AnnotationOptionOps[Self <: AnnotationOption] (val x: Self) extends AnyVal {
    
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
    def setA(value: js.Any): Self = this.set("A", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA: Self = this.set("A", js.undefined)
    
    @scala.inline
    def setB(value: js.Any): Self = this.set("B", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteB: Self = this.set("B", js.undefined)
    
    @scala.inline
    def setBorderVarargs(value: Double*): Self = this.set("Border", js.Array(value :_*))
    
    @scala.inline
    def setBorder(value: js.Array[Double]): Self = this.set("Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("Border", js.undefined)
    
    @scala.inline
    def setC(value: js.Any): Self = this.set("C", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC: Self = this.set("C", js.undefined)
    
    @scala.inline
    def setContents(value: String): Self = this.set("Contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContents: Self = this.set("Contents", js.undefined)
    
    @scala.inline
    def setDA(value: String): Self = this.set("DA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDA: Self = this.set("DA", js.undefined)
    
    @scala.inline
    def setL(value: js.Any): Self = this.set("L", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL: Self = this.set("L", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setQuadPointsVarargs(value: Double*): Self = this.set("QuadPoints", js.Array(value :_*))
    
    @scala.inline
    def setQuadPoints(value: js.Array[Double]): Self = this.set("QuadPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuadPoints: Self = this.set("QuadPoints", js.undefined)
    
    @scala.inline
    def setRect(value: js.Any): Self = this.set("Rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRect: Self = this.set("Rect", js.undefined)
    
    @scala.inline
    def setSubType(value: String): Self = this.set("SubType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubType: Self = this.set("SubType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
}
