package typings.mfiles

import typings.mfiles.MFiles.MFFileInformationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileInformation extends StObject {
  
  def Clear(): Unit
  
  var EmailMessage: IEmailMessageInformation
  
  def ExtractFromFile(PathToFile: String): Unit
  
  var FileType: MFFileInformationType
}
object IFileInformation {
  
  inline def apply(
    Clear: () => Unit,
    EmailMessage: IEmailMessageInformation,
    ExtractFromFile: String => Unit,
    FileType: MFFileInformationType
  ): IFileInformation = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), EmailMessage = EmailMessage.asInstanceOf[js.Any], ExtractFromFile = js.Any.fromFunction1(ExtractFromFile), FileType = FileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileInformation]
  }
  
  extension [Self <: IFileInformation](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    inline def setEmailMessage(value: IEmailMessageInformation): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
    
    inline def setExtractFromFile(value: String => Unit): Self = StObject.set(x, "ExtractFromFile", js.Any.fromFunction1(value))
    
    inline def setFileType(value: MFFileInformationType): Self = StObject.set(x, "FileType", value.asInstanceOf[js.Any])
  }
}
