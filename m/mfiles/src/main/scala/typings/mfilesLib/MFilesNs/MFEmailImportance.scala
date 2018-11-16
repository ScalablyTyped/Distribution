package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFEmailImportance extends js.Object

@JSGlobal("MFiles.MFEmailImportance")
@js.native
object MFEmailImportance extends js.Object {
  @js.native
  sealed trait High
    extends mfilesLib.MFilesNs.MFEmailImportance
  
  @js.native
  sealed trait Low
    extends mfilesLib.MFilesNs.MFEmailImportance
  
  @js.native
  sealed trait Normal
    extends mfilesLib.MFilesNs.MFEmailImportance
  
  /* 2 */ val High: High with scala.Double = js.native
  /* 0 */ val Low: Low with scala.Double = js.native
  /* 1 */ val Normal: Normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFEmailImportance with scala.Double] = js.native
}

