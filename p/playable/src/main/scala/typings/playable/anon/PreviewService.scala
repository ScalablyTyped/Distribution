package typings.playable.anon

import typings.playable.previewServiceTypesMod.IPreviewService
import typings.playable.rootContainerTypesMod.IRootContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewService extends js.Object {
  
  var previewService: IPreviewService = js.native
  
  var rootContainer: IRootContainer = js.native
}
object PreviewService {
  
  @scala.inline
  def apply(previewService: IPreviewService, rootContainer: IRootContainer): PreviewService = {
    val __obj = js.Dynamic.literal(previewService = previewService.asInstanceOf[js.Any], rootContainer = rootContainer.asInstanceOf[js.Any])
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
    def setPreviewService(value: IPreviewService): Self = this.set("previewService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootContainer(value: IRootContainer): Self = this.set("rootContainer", value.asInstanceOf[js.Any])
  }
}
