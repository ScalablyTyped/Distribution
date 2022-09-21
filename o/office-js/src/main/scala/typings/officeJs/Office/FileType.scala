package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileType extends StObject
/**
  * Specifies the format in which to return the document.
  *
  */
@JSGlobal("Office.FileType")
@js.native
object FileType extends StObject {
  
  /**
    * Returns the entire document (.pptx, .docx, .xlsx, or .xlsm) in Office Open XML (OOXML) format as a byte array.
    * 
    * Note: The .xslm file type is supported in Excel on Windows and Mac. It's not supported in Excel on the web.
    * In Excel on Windows, the file slices from the `getFileAsync` method include the VBA signature files for .xslm file types. The VBA signature files are vbaProjectSignature.bin, vbaProbjectSignatureAgile.bin, and vbaProjectSignatureV3.bin. 
    * In Excel on Mac, the file slices from the `getFileAsync` method don't include the VBA signature files, because this platform doesn't support the VBA signature feature.
    */
  @js.native
  sealed trait Compressed
    extends StObject
       with FileType
  
  /**
    * Returns the entire document in PDF format as a byte array.
    */
  @js.native
  sealed trait Pdf
    extends StObject
       with FileType
  
  /**
    * Returns only the text of the document as a string.
    */
  @js.native
  sealed trait Text
    extends StObject
       with FileType
}
