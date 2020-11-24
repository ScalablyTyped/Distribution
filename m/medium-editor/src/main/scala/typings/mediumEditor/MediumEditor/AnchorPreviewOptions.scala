package typings.mediumEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorPreviewOptions extends js.Object {
  
  var hideDelay: js.UndefOr[Double] = js.native
  
  var previewValueSelector: js.UndefOr[String] = js.native
  
  var showOnEmptyLinks: js.UndefOr[Boolean] = js.native
  
  var showWhenToolbarIsVisible: js.UndefOr[Boolean] = js.native
}
object AnchorPreviewOptions {
  
  @scala.inline
  def apply(): AnchorPreviewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorPreviewOptions]
  }
  
  @scala.inline
  implicit class AnchorPreviewOptionsOps[Self <: AnchorPreviewOptions] (val x: Self) extends AnyVal {
    
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
    def setHideDelay(value: Double): Self = this.set("hideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideDelay: Self = this.set("hideDelay", js.undefined)
    
    @scala.inline
    def setPreviewValueSelector(value: String): Self = this.set("previewValueSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewValueSelector: Self = this.set("previewValueSelector", js.undefined)
    
    @scala.inline
    def setShowOnEmptyLinks(value: Boolean): Self = this.set("showOnEmptyLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOnEmptyLinks: Self = this.set("showOnEmptyLinks", js.undefined)
    
    @scala.inline
    def setShowWhenToolbarIsVisible(value: Boolean): Self = this.set("showWhenToolbarIsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWhenToolbarIsVisible: Self = this.set("showWhenToolbarIsVisible", js.undefined)
  }
}
