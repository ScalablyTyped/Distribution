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

