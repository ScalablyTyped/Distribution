package typings.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TControlOptions extends js.Object {
  
  var anchor: js.UndefOr[ControlAnchor] = js.native
  
  var attachToViewer: js.UndefOr[Boolean] = js.native
  
  var autoFade: js.UndefOr[Boolean] = js.native
}
object TControlOptions {
  
  @scala.inline
  def apply(): TControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TControlOptions]
  }
  
  @scala.inline
  implicit class TControlOptionsOps[Self <: TControlOptions] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: ControlAnchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setAttachToViewer(value: Boolean): Self = this.set("attachToViewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachToViewer: Self = this.set("attachToViewer", js.undefined)
    
    @scala.inline
    def setAutoFade(value: Boolean): Self = this.set("autoFade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFade: Self = this.set("autoFade", js.undefined)
  }
}
