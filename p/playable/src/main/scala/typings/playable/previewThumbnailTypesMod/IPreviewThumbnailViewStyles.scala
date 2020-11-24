package typings.playable.previewThumbnailTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPreviewThumbnailViewStyles extends js.Object {
  
  var container: String = js.native
  
  var empty: String = js.native
  
  var highQualityFrame: String = js.native
  
  var lowQualityFrame: String = js.native
  
  var thumbText: String = js.native
}
object IPreviewThumbnailViewStyles {
  
  @scala.inline
  def apply(
    container: String,
    empty: String,
    highQualityFrame: String,
    lowQualityFrame: String,
    thumbText: String
  ): IPreviewThumbnailViewStyles = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], highQualityFrame = highQualityFrame.asInstanceOf[js.Any], lowQualityFrame = lowQualityFrame.asInstanceOf[js.Any], thumbText = thumbText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPreviewThumbnailViewStyles]
  }
  
  @scala.inline
  implicit class IPreviewThumbnailViewStylesOps[Self <: IPreviewThumbnailViewStyles] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmpty(value: String): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighQualityFrame(value: String): Self = this.set("highQualityFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowQualityFrame(value: String): Self = this.set("lowQualityFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbText(value: String): Self = this.set("thumbText", value.asInstanceOf[js.Any])
  }
}
