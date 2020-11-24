package typings.openjscad.OpenJsCad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessorOptions extends IViewerOptions {
  
  var verbose: js.UndefOr[Boolean] = js.native
  
  var viewerheight: js.UndefOr[Double] = js.native
  
  var viewerheightratio: js.UndefOr[Double] = js.native
  
  var viewerwidth: js.UndefOr[Double] = js.native
}
object ProcessorOptions {
  
  @scala.inline
  def apply(): ProcessorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessorOptions]
  }
  
  @scala.inline
  implicit class ProcessorOptionsOps[Self <: ProcessorOptions] (val x: Self) extends AnyVal {
    
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
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    
    @scala.inline
    def setViewerheight(value: Double): Self = this.set("viewerheight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewerheight: Self = this.set("viewerheight", js.undefined)
    
    @scala.inline
    def setViewerheightratio(value: Double): Self = this.set("viewerheightratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewerheightratio: Self = this.set("viewerheightratio", js.undefined)
    
    @scala.inline
    def setViewerwidth(value: Double): Self = this.set("viewerwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewerwidth: Self = this.set("viewerwidth", js.undefined)
  }
}
