package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFFileInformationType extends js.Object

@JSGlobal("MFiles.MFFileInformationType")
@js.native
object MFFileInformationType extends js.Object {
  @js.native
  sealed trait EmailMessage
    extends mfilesLib.MFilesNs.MFFileInformationType
  
  @js.native
  sealed trait Unknown
    extends mfilesLib.MFilesNs.MFFileInformationType
  
  /* 1 */ val EmailMessage: EmailMessage with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFFileInformationType with scala.Double] = js.native
}

