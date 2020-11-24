package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileAttachment extends Attachment {
  
  // The base64-encoded contents of the file.
  var contentBytes: js.UndefOr[NullableOption[Double]] = js.native
  
  // The ID of the attachment in the Exchange store.
  var contentId: js.UndefOr[NullableOption[String]] = js.native
  
  // Do not use this property as it is not supported.
  var contentLocation: js.UndefOr[NullableOption[String]] = js.native
}
object FileAttachment {
  
  @scala.inline
  def apply(): FileAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileAttachment]
  }
  
  @scala.inline
  implicit class FileAttachmentOps[Self <: FileAttachment] (val x: Self) extends AnyVal {
    
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
    def setContentBytes(value: NullableOption[Double]): Self = this.set("contentBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentBytes: Self = this.set("contentBytes", js.undefined)
    
    @scala.inline
    def setContentBytesNull: Self = this.set("contentBytes", null)
    
    @scala.inline
    def setContentId(value: NullableOption[String]): Self = this.set("contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentId: Self = this.set("contentId", js.undefined)
    
    @scala.inline
    def setContentIdNull: Self = this.set("contentId", null)
    
    @scala.inline
    def setContentLocation(value: NullableOption[String]): Self = this.set("contentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLocation: Self = this.set("contentLocation", js.undefined)
    
    @scala.inline
    def setContentLocationNull: Self = this.set("contentLocation", null)
  }
}
