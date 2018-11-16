package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFValidationType extends js.Object

@JSGlobal("MFiles.MFValidationType")
@js.native
object MFValidationType extends js.Object {
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFValidationType
  
  @js.native
  sealed trait RegularExpression
    extends mfilesLib.MFilesNs.MFValidationType
  
  @js.native
  sealed trait VBScript
    extends mfilesLib.MFilesNs.MFValidationType
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val RegularExpression: RegularExpression with scala.Double = js.native
  /* 2 */ val VBScript: VBScript with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFValidationType with scala.Double] = js.native
}

