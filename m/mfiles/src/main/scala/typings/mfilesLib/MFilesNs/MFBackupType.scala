package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFBackupType extends js.Object

@JSGlobal("MFiles.MFBackupType")
@js.native
object MFBackupType extends js.Object {
  @js.native
  sealed trait Differential
    extends mfilesLib.MFilesNs.MFBackupType
  
  @js.native
  sealed trait Full
    extends mfilesLib.MFilesNs.MFBackupType
  
  /* 1 */ val Differential: Differential with scala.Double = js.native
  /* 0 */ val Full: Full with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFBackupType with scala.Double] = js.native
}

