package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFEmailField extends js.Object

@JSGlobal("MFiles.MFEmailField")
@js.native
object MFEmailField extends js.Object {
  @js.native
  sealed trait Body
    extends mfilesLib.MFilesNs.MFEmailField
  
  @js.native
  sealed trait Cc
    extends mfilesLib.MFilesNs.MFEmailField
  
  @js.native
  sealed trait Date
    extends mfilesLib.MFilesNs.MFEmailField
  
  @js.native
  sealed trait From
    extends mfilesLib.MFilesNs.MFEmailField
  
  @js.native
  sealed trait Importance
    extends mfilesLib.MFilesNs.MFEmailField
  
  @js.native
  sealed trait Sensitivity
    extends mfilesLib.MFilesNs.MFEmailField
  
  @js.native
  sealed trait Subject
    extends mfilesLib.MFilesNs.MFEmailField
  
  @js.native
  sealed trait To
    extends mfilesLib.MFilesNs.MFEmailField
  
  @js.native
  sealed trait Undefined
    extends mfilesLib.MFilesNs.MFEmailField
  
  /* 5 */ val Body: Body with scala.Double = js.native
  /* 3 */ val Cc: Cc with scala.Double = js.native
  /* 6 */ val Date: Date with scala.Double = js.native
  /* 1 */ val From: From with scala.Double = js.native
  /* 7 */ val Importance: Importance with scala.Double = js.native
  /* 8 */ val Sensitivity: Sensitivity with scala.Double = js.native
  /* 4 */ val Subject: Subject with scala.Double = js.native
  /* 2 */ val To: To with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFEmailField with scala.Double] = js.native
}

