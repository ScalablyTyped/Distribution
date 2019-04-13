package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ServerLicenseManagementOperations")
@js.native
class ServerLicenseManagementOperations ()
  extends mfilesLib.IServerLicenseManagementOperations {
  /* CompleteClass */
  override def GetLicenseStatus(): mfilesLib.ILicenseStatus = js.native
  /* CompleteClass */
  override def SetLicenseCodeAndSerialNumber(SerialNumber: java.lang.String, LicenseCode: java.lang.String): scala.Unit = js.native
}

@JSGlobal("MFiles.ServerLicenseManagementOperations")
@js.native
object ServerLicenseManagementOperations
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IServerLicenseManagementOperations]

