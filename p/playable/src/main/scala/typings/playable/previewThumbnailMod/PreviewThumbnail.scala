package typings.playable.previewThumbnailMod

import typings.playable.previewThumbnailTypesMod.IPreviewThumbnail
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewThumbnail extends IPreviewThumbnail {
  
  var _currentFrames: js.Any = js.native
  
  var _initUI: js.Any = js.native
  
  var _previewService: js.Any = js.native
  
  var view: typings.playable.previewThumbnailViewMod.default = js.native
}
object PreviewThumbnail {
  
  @scala.inline
  def apply(
    _currentFrames: js.Any,
    _initUI: js.Any,
    _previewService: js.Any,
    destroy: () => Unit,
    getElement: () => HTMLElement,
    setTime: String => Unit,
    showAt: Double => Unit,
    view: typings.playable.previewThumbnailViewMod.default
  ): PreviewThumbnail = {
    val __obj = js.Dynamic.literal(_currentFrames = _currentFrames.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _previewService = _previewService.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), setTime = js.Any.fromFunction1(setTime), showAt = js.Any.fromFunction1(showAt), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewThumbnail]
  }
  
  @scala.inline
  implicit class PreviewThumbnailOps[Self <: PreviewThumbnail] (val x: Self) extends AnyVal {
    
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
    def set_currentFrames(value: js.Any): Self = this.set("_currentFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initUI(value: js.Any): Self = this.set("_initUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_previewService(value: js.Any): Self = this.set("_previewService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: typings.playable.previewThumbnailViewMod.default): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
