package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFEmailSensitivity extends js.Object

@JSGlobal("MFiles.MFEmailSensitivity")
@js.native
object MFEmailSensitivity extends js.Object {
  @js.native
  sealed trait Confidential
    extends mfilesLib.MFilesNs.MFEmailSensitivity
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFEmailSensitivity
  
  @js.native
  sealed trait Normal
    extends mfilesLib.MFilesNs.MFEmailSensitivity
  
  @js.native
  sealed trait Personal
    extends mfilesLib.MFilesNs.MFEmailSensitivity
  
  @js.native
  sealed trait Private
    extends mfilesLib.MFilesNs.MFEmailSensitivity
  
  /* 4 */ val Confidential: Confidential with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Normal: Normal with scala.Double = js.native
  /* 2 */ val Personal: Personal with scala.Double = js.native
  /* 3 */ val Private: Private with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFEmailSensitivity with scala.Double] = js.native
}

