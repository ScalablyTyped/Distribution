package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerLicenseManagementOperations extends js.Object {
  def GetLicenseStatus(): ILicenseStatus
  def SetLicenseCodeAndSerialNumber(SerialNumber: java.lang.String, LicenseCode: java.lang.String): scala.Unit
}

