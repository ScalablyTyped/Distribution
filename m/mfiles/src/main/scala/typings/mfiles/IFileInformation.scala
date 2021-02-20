package typings.mfiles

import typings.mfiles.MFiles.MFFileInformationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileInformation extends StObject {
  
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
  implicit class IFileInformationMutableBuilder[Self <: IFileInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmailMessage(value: IEmailMessageInformation): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractFromFile(value: String => Unit): Self = StObject.set(x, "ExtractFromFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFileType(value: MFFileInformationType): Self = StObject.set(x, "FileType", value.asInstanceOf[js.Any])
  }
}
