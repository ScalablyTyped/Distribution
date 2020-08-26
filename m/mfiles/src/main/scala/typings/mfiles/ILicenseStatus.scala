package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILicenseStatus extends js.Object {
  val EvaluationDaysLeft: Double = js.native
  val EvaluationMode: Boolean = js.native
  val Expired: Boolean = js.native
  val LicenseCode: String = js.native
  val NumOfConcurrentUserLicenses: Double = js.native
  val NumOfNamedUserLicenses: Double = js.native
  val NumOfReadonlyLicenses: Double = js.native
  val SerialNumber: String = js.native
  def ClearLicenseCode(): Unit = js.native
}

object ILicenseStatus {
  @scala.inline
  def apply(
    ClearLicenseCode: () => Unit,
    EvaluationDaysLeft: Double,
    EvaluationMode: Boolean,
    Expired: Boolean,
    LicenseCode: String,
    NumOfConcurrentUserLicenses: Double,
    NumOfNamedUserLicenses: Double,
    NumOfReadonlyLicenses: Double,
    SerialNumber: String
  ): ILicenseStatus = {
    val __obj = js.Dynamic.literal(ClearLicenseCode = js.Any.fromFunction0(ClearLicenseCode), EvaluationDaysLeft = EvaluationDaysLeft.asInstanceOf[js.Any], EvaluationMode = EvaluationMode.asInstanceOf[js.Any], Expired = Expired.asInstanceOf[js.Any], LicenseCode = LicenseCode.asInstanceOf[js.Any], NumOfConcurrentUserLicenses = NumOfConcurrentUserLicenses.asInstanceOf[js.Any], NumOfNamedUserLicenses = NumOfNamedUserLicenses.asInstanceOf[js.Any], NumOfReadonlyLicenses = NumOfReadonlyLicenses.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILicenseStatus]
  }
  @scala.inline
  implicit class ILicenseStatusOps[Self <: ILicenseStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClearLicenseCode(value: () => Unit): Self = this.set("ClearLicenseCode", js.Any.fromFunction0(value))
    @scala.inline
    def setEvaluationDaysLeft(value: Double): Self = this.set("EvaluationDaysLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvaluationMode(value: Boolean): Self = this.set("EvaluationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpired(value: Boolean): Self = this.set("Expired", value.asInstanceOf[js.Any])
    @scala.inline
    def setLicenseCode(value: String): Self = this.set("LicenseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumOfConcurrentUserLicenses(value: Double): Self = this.set("NumOfConcurrentUserLicenses", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumOfNamedUserLicenses(value: Double): Self = this.set("NumOfNamedUserLicenses", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumOfReadonlyLicenses(value: Double): Self = this.set("NumOfReadonlyLicenses", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("SerialNumber", value.asInstanceOf[js.Any])
  }
  
}

