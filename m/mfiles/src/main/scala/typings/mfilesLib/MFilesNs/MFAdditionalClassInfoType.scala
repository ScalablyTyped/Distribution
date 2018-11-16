package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFAdditionalClassInfoType extends js.Object

@JSGlobal("MFiles.MFAdditionalClassInfoType")
@js.native
object MFAdditionalClassInfoType extends js.Object {
  @js.native
  sealed trait Assignment
    extends mfilesLib.MFilesNs.MFAdditionalClassInfoType
  
  @js.native
  sealed trait Unknown
    extends mfilesLib.MFilesNs.MFAdditionalClassInfoType
  
  /* 1 */ val Assignment: Assignment with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFAdditionalClassInfoType with scala.Double] = js.native
}

