package typings.mfiles.global.MFiles

import typings.mfiles.IEmailMessageInformation
import typings.mfiles.IFileInformation
import typings.mfiles.MFiles.MFFileInformationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.FileInformation")
@js.native
open class FileInformation ()
  extends StObject
     with IFileInformation {
  
  /* CompleteClass */
  override def Clear(): Unit = js.native
  
  /* CompleteClass */
  var EmailMessage: IEmailMessageInformation = js.native
  
  /* CompleteClass */
  override def ExtractFromFile(PathToFile: String): Unit = js.native
  
  /* CompleteClass */
  var FileType: MFFileInformationType = js.native
}
