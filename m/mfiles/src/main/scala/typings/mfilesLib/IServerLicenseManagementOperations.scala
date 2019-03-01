package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerLicenseManagementOperations extends js.Object {
  def GetLicenseStatus(): ILicenseStatus
  def SetLicenseCodeAndSerialNumber(SerialNumber: java.lang.String, LicenseCode: java.lang.String): scala.Unit
}

object IServerLicenseManagementOperations {
  @scala.inline
  def apply(
    GetLicenseStatus: js.Function0[ILicenseStatus],
    SetLicenseCodeAndSerialNumber: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): IServerLicenseManagementOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetLicenseStatus")(GetLicenseStatus)
    __obj.updateDynamic("SetLicenseCodeAndSerialNumber")(SetLicenseCodeAndSerialNumber)
    __obj.asInstanceOf[IServerLicenseManagementOperations]
  }
}

