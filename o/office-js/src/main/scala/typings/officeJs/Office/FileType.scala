package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileType extends js.Object
/**
  * Specifies the format in which to return the document.
  *
  */
@JSGlobal("Office.FileType")
@js.native
object FileType extends js.Object {
  
  /**
    * Returns the entire document (.pptx, .docx, or .xlsx) in Office Open XML (OOXML) format as a byte array.
    */
  @js.native
  sealed trait Compressed extends FileType
  
  /**
    * Returns the entire document in PDF format as a byte array.
    */
  @js.native
  sealed trait Pdf extends FileType
  
  /**
    * Returns only the text of the document as a string.
    */
  @js.native
  sealed trait Text extends FileType
}
