package typings.pdfkit.PDFKit.Mixins

import typings.pdfkit.pdfkitStrings.bottom
import typings.pdfkit.pdfkitStrings.center
import typings.pdfkit.pdfkitStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageOption extends js.Object {
  
  var align: js.UndefOr[center | right] = js.native
  
  var cover: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var destination: js.UndefOr[String] = js.native
  
  /** Two elements array specifying dimensions(w,h)  */
  var fit: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var goTo: js.UndefOr[AnnotationOption] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var link: js.UndefOr[AnnotationOption] = js.native
  
  /** Scale percentage */
  var scale: js.UndefOr[Double] = js.native
  
  var valign: js.UndefOr[center | bottom] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ImageOption {
  
  @scala.inline
  def apply(): ImageOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOption]
  }
  
  @scala.inline
  implicit class ImageOptionOps[Self <: ImageOption] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: center | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setCover(value: js.Tuple2[Double, Double]): Self = this.set("cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCover: Self = this.set("cover", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setFit(value: js.Tuple2[Double, Double]): Self = this.set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    
    @scala.inline
    def setGoTo(value: AnnotationOption): Self = this.set("goTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoTo: Self = this.set("goTo", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLink(value: AnnotationOption): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setValign(value: center | bottom): Self = this.set("valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValign: Self = this.set("valign", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
