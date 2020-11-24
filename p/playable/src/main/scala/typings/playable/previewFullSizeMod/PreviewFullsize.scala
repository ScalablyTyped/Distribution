package typings.playable.previewFullSizeMod

import typings.playable.previewFullSizeTypesMod.IPreviewFullSize
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewFullsize extends IPreviewFullSize {
  
  var _currentFrame: js.Any = js.native
  
  var _initUI: js.Any = js.native
  
  var _previewService: js.Any = js.native
  
  var view: typings.playable.previewFullSizeViewMod.default = js.native
}
object PreviewFullsize {
  
  @scala.inline
  def apply(
    _currentFrame: js.Any,
    _initUI: js.Any,
    _previewService: js.Any,
    destroy: () => Unit,
    getElement: () => HTMLElement,
    hide: () => Unit,
    showAt: Double => Unit,
    view: typings.playable.previewFullSizeViewMod.default
  ): PreviewFullsize = {
    val __obj = js.Dynamic.literal(_currentFrame = _currentFrame.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _previewService = _previewService.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), showAt = js.Any.fromFunction1(showAt), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewFullsize]
  }
  
  @scala.inline
  implicit class PreviewFullsizeOps[Self <: PreviewFullsize] (val x: Self) extends AnyVal {
    
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
    def set_currentFrame(value: js.Any): Self = this.set("_currentFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initUI(value: js.Any): Self = this.set("_initUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_previewService(value: js.Any): Self = this.set("_previewService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: typings.playable.previewFullSizeViewMod.default): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
