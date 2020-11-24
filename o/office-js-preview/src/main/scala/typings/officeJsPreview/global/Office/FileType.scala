package typings.officeJsPreview.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the format in which to return the document.
  */
@JSGlobal("Office.FileType")
@js.native
object FileType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJsPreview.Office.FileType with Double] = js.native
  
  /* 1 */ val Compressed: typings.officeJsPreview.Office.FileType.Compressed with Double = js.native
  
  /* 2 */ val Pdf: typings.officeJsPreview.Office.FileType.Pdf with Double = js.native
  
  /* 0 */ val Text: typings.officeJsPreview.Office.FileType.Text with Double = js.native
}
