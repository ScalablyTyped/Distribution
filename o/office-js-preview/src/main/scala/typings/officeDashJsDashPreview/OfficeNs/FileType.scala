package typings.officeDashJsDashPreview.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileType extends js.Object

/**
  * Specifies the format in which to return the document.
  *
  * @remarks
  * 
  * `FileType.Text` is only supported in Word, `FileType.Pdf` is only supported in Word on the web, Windows, and Mac, and PowerPoint.
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
    * Returns only the text of the document as a string. (Word only)
    */
  @js.native
  sealed trait Text extends FileType
  
  /* 1 */ val Compressed: typings.officeDashJsDashPreview.OfficeNs.FileType.Compressed with Double = js.native
  /* 2 */ val Pdf: typings.officeDashJsDashPreview.OfficeNs.FileType.Pdf with Double = js.native
  /* 0 */ val Text: typings.officeDashJsDashPreview.OfficeNs.FileType.Text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileType with Double] = js.native
}

