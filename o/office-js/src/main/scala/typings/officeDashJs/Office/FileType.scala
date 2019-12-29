package typings.officeDashJs.Office

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileType with Double] = js.native
  /* 1 */ @js.native
  object Compressed extends TopLevel[Compressed with Double]
  
  /* 2 */ @js.native
  object Pdf extends TopLevel[Pdf with Double]
  
  /* 0 */ @js.native
  object Text extends TopLevel[Text with Double]
  
}

