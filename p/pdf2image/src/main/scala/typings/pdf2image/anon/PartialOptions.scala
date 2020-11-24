package typings.pdf2image.anon

import typings.pdf2image.mod.OutputFormat
import typings.pdf2image.pdf2imageStrings.Asterisk
import typings.pdf2image.pdf2imageStrings.Dotjpg
import typings.pdf2image.pdf2imageStrings.Dotpng
import typings.pdf2image.pdf2imageStrings.jpg
import typings.pdf2image.pdf2imageStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<pdf2image.pdf2image.Options> */
@js.native
trait PartialOptions extends js.Object {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var density: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var outputFormat: js.UndefOr[OutputFormat] = js.native
  
  var outputType: js.UndefOr[jpg | png | Dotjpg | Dotpng] = js.native
  
  var pages: js.UndefOr[Asterisk | String] = js.native
  
  var quality: js.UndefOr[Double] = js.native
  
  var singleProcess: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDensity: Self = this.set("density", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setOutputFormatFunction7(
      value: (/* pageNum */ Double, /* pageIndex */ Double, /* totalPagesProcessed */ Double, /* totalPDFPages */ Double, /* name */ String, /* path */ String, /* vm */ TypeofimportedVm) => String
    ): Self = this.set("outputFormat", js.Any.fromFunction7(value))
    
    @scala.inline
    def setOutputFormat(value: OutputFormat): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFormat: Self = this.set("outputFormat", js.undefined)
    
    @scala.inline
    def setOutputType(value: jpg | png | Dotjpg | Dotpng): Self = this.set("outputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputType: Self = this.set("outputType", js.undefined)
    
    @scala.inline
    def setPages(value: Asterisk | String): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setSingleProcess(value: Boolean): Self = this.set("singleProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleProcess: Self = this.set("singleProcess", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
