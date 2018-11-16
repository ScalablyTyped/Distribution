package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFApplicationLicenseStatus extends js.Object

@JSGlobal("MFiles.MFApplicationLicenseStatus")
@js.native
object MFApplicationLicenseStatus extends js.Object {
  @js.native
  sealed trait FormatError
    extends mfilesLib.MFilesNs.MFApplicationLicenseStatus
  
  @js.native
  sealed trait GracePeriod
    extends mfilesLib.MFilesNs.MFApplicationLicenseStatus
  
  @js.native
  sealed trait Installed
    extends mfilesLib.MFilesNs.MFApplicationLicenseStatus
  
  @js.native
  sealed trait Invalid
    extends mfilesLib.MFilesNs.MFApplicationLicenseStatus
  
  @js.native
  sealed trait NotInstalled
    extends mfilesLib.MFilesNs.MFApplicationLicenseStatus
  
  @js.native
  sealed trait NotNeeded
    extends mfilesLib.MFilesNs.MFApplicationLicenseStatus
  
  @js.native
  sealed trait Trial
    extends mfilesLib.MFilesNs.MFApplicationLicenseStatus
  
  @js.native
  sealed trait Unknown
    extends mfilesLib.MFilesNs.MFApplicationLicenseStatus
  
  @js.native
  sealed trait Valid
    extends mfilesLib.MFilesNs.MFApplicationLicenseStatus
  
  /* 6 */ val FormatError: FormatError with scala.Double = js.native
  /* 8 */ val GracePeriod: GracePeriod with scala.Double = js.native
  /* 3 */ val Installed: Installed with scala.Double = js.native
  /* 5 */ val Invalid: Invalid with scala.Double = js.native
  /* 2 */ val NotInstalled: NotInstalled with scala.Double = js.native
  /* 1 */ val NotNeeded: NotNeeded with scala.Double = js.native
  /* 7 */ val Trial: Trial with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  /* 4 */ val Valid: Valid with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFApplicationLicenseStatus with scala.Double] = js.native
}

