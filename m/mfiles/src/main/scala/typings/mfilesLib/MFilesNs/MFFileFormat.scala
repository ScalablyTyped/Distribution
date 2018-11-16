package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFFileFormat extends js.Object

@JSGlobal("MFiles.MFFileFormat")
@js.native
object MFFileFormat extends js.Object {
  @js.native
  sealed trait DisplayOnlyPDF
    extends mfilesLib.MFilesNs.MFFileFormat
  
  @js.native
  sealed trait Native
    extends mfilesLib.MFilesNs.MFFileFormat
  
  @js.native
  sealed trait PDF
    extends mfilesLib.MFilesNs.MFFileFormat
  
  /* 2 */ val DisplayOnlyPDF: DisplayOnlyPDF with scala.Double = js.native
  /* 0 */ val Native: Native with scala.Double = js.native
  /* 1 */ val PDF: PDF with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFFileFormat with scala.Double] = js.native
}

