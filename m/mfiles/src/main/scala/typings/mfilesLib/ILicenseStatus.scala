package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILicenseStatus extends js.Object {
  val EvaluationDaysLeft: scala.Double
  val EvaluationMode: scala.Boolean
  val Expired: scala.Boolean
  val LicenseCode: java.lang.String
  val NumOfConcurrentUserLicenses: scala.Double
  val NumOfNamedUserLicenses: scala.Double
  val NumOfReadonlyLicenses: scala.Double
  val SerialNumber: java.lang.String
  def ClearLicenseCode(): scala.Unit
}

object ILicenseStatus {
  @scala.inline
  def apply(
    ClearLicenseCode: () => scala.Unit,
    EvaluationDaysLeft: scala.Double,
    EvaluationMode: scala.Boolean,
    Expired: scala.Boolean,
    LicenseCode: java.lang.String,
    NumOfConcurrentUserLicenses: scala.Double,
    NumOfNamedUserLicenses: scala.Double,
    NumOfReadonlyLicenses: scala.Double,
    SerialNumber: java.lang.String
  ): ILicenseStatus = {
    val __obj = js.Dynamic.literal(ClearLicenseCode = js.Any.fromFunction0(ClearLicenseCode), EvaluationDaysLeft = EvaluationDaysLeft, EvaluationMode = EvaluationMode, Expired = Expired, LicenseCode = LicenseCode, NumOfConcurrentUserLicenses = NumOfConcurrentUserLicenses, NumOfNamedUserLicenses = NumOfNamedUserLicenses, NumOfReadonlyLicenses = NumOfReadonlyLicenses, SerialNumber = SerialNumber)
  
    __obj.asInstanceOf[ILicenseStatus]
  }
}

