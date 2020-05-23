package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.ILicenseStatus
import typings.mfiles.IServerLicenseManagementOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ServerLicenseManagementOperations")
@js.native
class ServerLicenseManagementOperations () extends IServerLicenseManagementOperations {
  /* CompleteClass */
  override def GetLicenseStatus(): ILicenseStatus = js.native
  /* CompleteClass */
  override def SetLicenseCodeAndSerialNumber(SerialNumber: String, LicenseCode: String): Unit = js.native
}

@JSGlobal("MFiles.ServerLicenseManagementOperations")
@js.native
object ServerLicenseManagementOperations extends Instantiable0[IServerLicenseManagementOperations]

