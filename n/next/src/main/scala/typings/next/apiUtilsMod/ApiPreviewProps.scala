package typings.next.apiUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiPreviewProps extends js.Object {
  
  var previewModeEncryptionKey: String = js.native
  
  var previewModeId: String = js.native
  
  var previewModeSigningKey: String = js.native
}
object ApiPreviewProps {
  
  @scala.inline
  def apply(previewModeEncryptionKey: String, previewModeId: String, previewModeSigningKey: String): ApiPreviewProps = {
    val __obj = js.Dynamic.literal(previewModeEncryptionKey = previewModeEncryptionKey.asInstanceOf[js.Any], previewModeId = previewModeId.asInstanceOf[js.Any], previewModeSigningKey = previewModeSigningKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiPreviewProps]
  }
  
  @scala.inline
  implicit class ApiPreviewPropsOps[Self <: ApiPreviewProps] (val x: Self) extends AnyVal {
    
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
    def setPreviewModeEncryptionKey(value: String): Self = this.set("previewModeEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewModeId(value: String): Self = this.set("previewModeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewModeSigningKey(value: String): Self = this.set("previewModeSigningKey", value.asInstanceOf[js.Any])
  }
}
