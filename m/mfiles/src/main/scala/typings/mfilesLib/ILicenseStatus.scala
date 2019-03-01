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
    ClearLicenseCode: js.Function0[scala.Unit],
    EvaluationDaysLeft: scala.Double,
    EvaluationMode: scala.Boolean,
    Expired: scala.Boolean,
    LicenseCode: java.lang.String,
    NumOfConcurrentUserLicenses: scala.Double,
    NumOfNamedUserLicenses: scala.Double,
    NumOfReadonlyLicenses: scala.Double,
    SerialNumber: java.lang.String
  ): ILicenseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ClearLicenseCode")(ClearLicenseCode)
    __obj.updateDynamic("EvaluationDaysLeft")(EvaluationDaysLeft)
    __obj.updateDynamic("EvaluationMode")(EvaluationMode)
    __obj.updateDynamic("Expired")(Expired)
    __obj.updateDynamic("LicenseCode")(LicenseCode)
    __obj.updateDynamic("NumOfConcurrentUserLicenses")(NumOfConcurrentUserLicenses)
    __obj.updateDynamic("NumOfNamedUserLicenses")(NumOfNamedUserLicenses)
    __obj.updateDynamic("NumOfReadonlyLicenses")(NumOfReadonlyLicenses)
    __obj.updateDynamic("SerialNumber")(SerialNumber)
    __obj.asInstanceOf[ILicenseStatus]
  }
}

