package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFVaultConnectionTestResult extends js.Object

@JSGlobal("MFiles.MFVaultConnectionTestResult")
@js.native
object MFVaultConnectionTestResult extends js.Object {
  @js.native
  sealed trait OK
    extends mfilesLib.MFilesNs.MFVaultConnectionTestResult
  
  @js.native
  sealed trait UserCancelledLoginAttempt
    extends mfilesLib.MFilesNs.MFVaultConnectionTestResult
  
  /* 0 */ val OK: OK with scala.Double = js.native
  /* 1 */ val UserCancelledLoginAttempt: UserCancelledLoginAttempt with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFVaultConnectionTestResult with scala.Double] = js.native
}

