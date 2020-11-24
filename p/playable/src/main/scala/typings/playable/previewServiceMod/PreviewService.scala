package typings.playable.previewServiceMod

import typings.playable.previewServiceTypesMod.IFramesData
import typings.playable.previewServiceTypesMod.INormalizedFramesQuality
import typings.playable.previewServiceTypesMod.IPreviewService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewService extends IPreviewService {
  
  var _engine: js.Any = js.native
  
  var _framesMap: js.Any = js.native
}
object PreviewService {
  
  @scala.inline
  def apply(
    _engine: js.Any,
    _framesMap: js.Any,
    destroy: () => Unit,
    getAt: Double => js.Array[INormalizedFramesQuality],
    setFramesMap: IFramesData => Unit
  ): PreviewService = {
    val __obj = js.Dynamic.literal(_engine = _engine.asInstanceOf[js.Any], _framesMap = _framesMap.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getAt = js.Any.fromFunction1(getAt), setFramesMap = js.Any.fromFunction1(setFramesMap))
    __obj.asInstanceOf[PreviewService]
  }
  
  @scala.inline
  implicit class PreviewServiceOps[Self <: PreviewService] (val x: Self) extends AnyVal {
    
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
    def set_engine(value: js.Any): Self = this.set("_engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_framesMap(value: js.Any): Self = this.set("_framesMap", value.asInstanceOf[js.Any])
  }
}
