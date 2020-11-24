package typings.playable.anon

import typings.playable.previewServiceTypesMod.IPreviewService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewServiceIPreviewService extends js.Object {
  
  var previewService: IPreviewService = js.native
}
object PreviewServiceIPreviewService {
  
  @scala.inline
  def apply(previewService: IPreviewService): PreviewServiceIPreviewService = {
    val __obj = js.Dynamic.literal(previewService = previewService.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewServiceIPreviewService]
  }
  
  @scala.inline
  implicit class PreviewServiceIPreviewServiceOps[Self <: PreviewServiceIPreviewService] (val x: Self) extends AnyVal {
    
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
  }
}
