package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerLicenseManagementOperations extends js.Object {
  def GetLicenseStatus(): ILicenseStatus
  def SetLicenseCodeAndSerialNumber(SerialNumber: String, LicenseCode: String): Unit
}

object IServerLicenseManagementOperations {
  @scala.inline
  def apply(GetLicenseStatus: () => ILicenseStatus, SetLicenseCodeAndSerialNumber: (String, String) => Unit): IServerLicenseManagementOperations = {
    val __obj = js.Dynamic.literal(GetLicenseStatus = js.Any.fromFunction0(GetLicenseStatus), SetLicenseCodeAndSerialNumber = js.Any.fromFunction2(SetLicenseCodeAndSerialNumber))
  
    __obj.asInstanceOf[IServerLicenseManagementOperations]
  }
}

