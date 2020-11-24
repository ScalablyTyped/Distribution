package typings.pdf2image.mod

import typings.pdf2image.anon.TypeofimportedVm
import typings.pdf2image.pdf2imageStrings.Asterisk
import typings.pdf2image.pdf2imageStrings.Dotjpg
import typings.pdf2image.pdf2imageStrings.Dotpng
import typings.pdf2image.pdf2imageStrings.jpg
import typings.pdf2image.pdf2imageStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var backgroundColor: String = js.native
  
  var density: Double = js.native
  
  var height: Double = js.native
  
      // #ffffff
  var outputFormat: OutputFormat = js.native
  
  var outputType: jpg | png | Dotjpg | Dotpng = js.native
  
  var pages: Asterisk | String = js.native
  
  var quality: Double = js.native
  
      // * | even | odd | '/1,/3,5-6,-8, 9-'
  var singleProcess: Boolean = js.native
  
  var width: Double = js.native
}
object Options {
  
  @scala.inline
  def apply(
    backgroundColor: String,
    density: Double,
    height: Double,
    outputFormat: OutputFormat,
    outputType: jpg | png | Dotjpg | Dotpng,
    pages: Asterisk | String,
    quality: Double,
    singleProcess: Boolean,
    width: Double
  ): Options = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], outputFormat = outputFormat.asInstanceOf[js.Any], outputType = outputType.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], singleProcess = singleProcess.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFormatFunction7(
      value: (/* pageNum */ Double, /* pageIndex */ Double, /* totalPagesProcessed */ Double, /* totalPDFPages */ Double, /* name */ String, /* path */ String, /* vm */ TypeofimportedVm) => String
    ): Self = this.set("outputFormat", js.Any.fromFunction7(value))
    
    @scala.inline
    def setOutputFormat(value: OutputFormat): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputType(value: jpg | png | Dotjpg | Dotpng): Self = this.set("outputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: Asterisk | String): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleProcess(value: Boolean): Self = this.set("singleProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
