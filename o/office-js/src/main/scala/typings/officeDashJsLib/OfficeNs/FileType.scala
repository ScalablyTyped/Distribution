package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileType extends js.Object

/**
  * Specifies the format in which to return the document.
  *
  * @remarks
  * `FileType.Text` is only supported in Word, `FileType.Pdf` is only supported in Word for Windows, Word for Mac, Word Online, and PowerPoint.
  */
@JSGlobal("Office.FileType")
@js.native
object FileType extends js.Object {
  /**
    * Returns the entire document (.pptx, .docx, or .xlsx) in Office Open XML (OOXML) format as a byte array.
    */
  @js.native
  sealed trait Compressed
    extends officeDashJsLib.OfficeNs.FileType
  
  /**
    * Returns the entire document in PDF format as a byte array.
    */
  @js.native
  sealed trait Pdf
    extends officeDashJsLib.OfficeNs.FileType
  
  /**
    * Returns only the text of the document as a string. (Word only)
    */
  @js.native
  sealed trait Text
    extends officeDashJsLib.OfficeNs.FileType
  
  /* 1 */ val Compressed: Compressed with scala.Double = js.native
  /* 2 */ val Pdf: Pdf with scala.Double = js.native
  /* 0 */ val Text: Text with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsLib.OfficeNs.FileType with scala.Double] = js.native
}

