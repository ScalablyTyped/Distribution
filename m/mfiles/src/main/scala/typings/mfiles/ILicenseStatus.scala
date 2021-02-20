package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILicenseStatus extends StObject {
  
  def ClearLicenseCode(): Unit = js.native
  
  val EvaluationDaysLeft: Double = js.native
  
  val EvaluationMode: Boolean = js.native
  
  val Expired: Boolean = js.native
  
  val LicenseCode: String = js.native
  
  val NumOfConcurrentUserLicenses: Double = js.native
  
  val NumOfNamedUserLicenses: Double = js.native
  
  val NumOfReadonlyLicenses: Double = js.native
  
  val SerialNumber: String = js.native
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
  implicit class ILicenseStatusMutableBuilder[Self <: ILicenseStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearLicenseCode(value: () => Unit): Self = StObject.set(x, "ClearLicenseCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEvaluationDaysLeft(value: Double): Self = StObject.set(x, "EvaluationDaysLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationMode(value: Boolean): Self = StObject.set(x, "EvaluationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpired(value: Boolean): Self = StObject.set(x, "Expired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseCode(value: String): Self = StObject.set(x, "LicenseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumOfConcurrentUserLicenses(value: Double): Self = StObject.set(x, "NumOfConcurrentUserLicenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumOfNamedUserLicenses(value: Double): Self = StObject.set(x, "NumOfNamedUserLicenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumOfReadonlyLicenses(value: Double): Self = StObject.set(x, "NumOfReadonlyLicenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
  }
}
