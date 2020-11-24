package typings.pdfImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var convertExtension: js.UndefOr[String] = js.native
  
  var convertOptions: js.UndefOr[ConvertOptions] = js.native
  
  var graphicsMagick: js.UndefOr[Boolean] = js.native
  
  var outputDirectory: js.UndefOr[String] = js.native
  
  var pdfFileBaseName: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setConvertExtension(value: String): Self = this.set("convertExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertExtension: Self = this.set("convertExtension", js.undefined)
    
    @scala.inline
    def setConvertOptions(value: ConvertOptions): Self = this.set("convertOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertOptions: Self = this.set("convertOptions", js.undefined)
    
    @scala.inline
    def setGraphicsMagick(value: Boolean): Self = this.set("graphicsMagick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphicsMagick: Self = this.set("graphicsMagick", js.undefined)
    
    @scala.inline
    def setOutputDirectory(value: String): Self = this.set("outputDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputDirectory: Self = this.set("outputDirectory", js.undefined)
    
    @scala.inline
    def setPdfFileBaseName(value: String): Self = this.set("pdfFileBaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdfFileBaseName: Self = this.set("pdfFileBaseName", js.undefined)
  }
}
