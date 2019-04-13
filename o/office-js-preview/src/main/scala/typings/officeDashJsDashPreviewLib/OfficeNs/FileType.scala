package typings
package officeDashJsDashPreviewLib.OfficeNs

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
    extends officeDashJsDashPreviewLib.OfficeNs.FileType
  
  /**
    * Returns the entire document in PDF format as a byte array.
    */
  @js.native
  sealed trait Pdf
    extends officeDashJsDashPreviewLib.OfficeNs.FileType
  
  /**
    * Returns only the text of the document as a string. (Word only)
    */
  @js.native
  sealed trait Text
    extends officeDashJsDashPreviewLib.OfficeNs.FileType
  
  val Compressed: Compressed with java.lang.String = js.native
  val Pdf: Pdf with java.lang.String = js.native
  val Text: Text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.FileType with java.lang.String] = js.native
}

