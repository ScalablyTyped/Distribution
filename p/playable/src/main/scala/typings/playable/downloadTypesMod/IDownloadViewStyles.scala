package typings.playable.downloadTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDownloadViewStyles extends js.Object {
  
  var buttonWrapper: String = js.native
  
  var downloadButton: String = js.native
  
  var hidden: String = js.native
}
object IDownloadViewStyles {
  
  @scala.inline
  def apply(buttonWrapper: String, downloadButton: String, hidden: String): IDownloadViewStyles = {
    val __obj = js.Dynamic.literal(buttonWrapper = buttonWrapper.asInstanceOf[js.Any], downloadButton = downloadButton.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDownloadViewStyles]
  }
  
  @scala.inline
  implicit class IDownloadViewStylesOps[Self <: IDownloadViewStyles] (val x: Self) extends AnyVal {
    
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
    def setButtonWrapper(value: String): Self = this.set("buttonWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadButton(value: String): Self = this.set("downloadButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
  }
}
