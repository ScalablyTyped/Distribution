package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFLicenseType extends js.Object

@JSGlobal("MFiles.MFLicenseType")
@js.native
object MFLicenseType extends js.Object {
  @js.native
  sealed trait ConcurrentUserLicense
    extends mfilesLib.MFilesNs.MFLicenseType
  
  @js.native
  sealed trait NamedUserLicense
    extends mfilesLib.MFilesNs.MFLicenseType
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFLicenseType
  
  @js.native
  sealed trait ReadOnlyLicense
    extends mfilesLib.MFilesNs.MFLicenseType
  
  /* 2 */ val ConcurrentUserLicense: ConcurrentUserLicense with scala.Double = js.native
  /* 1 */ val NamedUserLicense: NamedUserLicense with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val ReadOnlyLicense: ReadOnlyLicense with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFLicenseType with scala.Double] = js.native
}

