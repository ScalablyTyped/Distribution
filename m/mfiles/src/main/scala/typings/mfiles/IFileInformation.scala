package typings.mfiles

import typings.mfiles.MFiles.MFFileInformationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileInformation extends js.Object {
  
  def Clear(): Unit = js.native
  
  var EmailMessage: IEmailMessageInformation = js.native
  
  def ExtractFromFile(PathToFile: String): Unit = js.native
  
  var FileType: MFFileInformationType = js.native
}
object IFileInformation {
  
  @scala.inline
  def apply(
    Clear: () => Unit,
    EmailMessage: IEmailMessageInformation,
    ExtractFromFile: String => Unit,
    FileType: MFFileInformationType
  ): IFileInformation = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), EmailMessage = EmailMessage.asInstanceOf[js.Any], ExtractFromFile = js.Any.fromFunction1(ExtractFromFile), FileType = FileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileInformation]
  }
  
  @scala.inline
  implicit class IFileInformationOps[Self <: IFileInformation] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmailMessage(value: IEmailMessageInformation): Self = this.set("EmailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractFromFile(value: String => Unit): Self = this.set("ExtractFromFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFileType(value: MFFileInformationType): Self = this.set("FileType", value.asInstanceOf[js.Any])
  }
}
