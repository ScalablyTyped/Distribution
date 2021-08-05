package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILicenseStatus extends StObject {
  
  def ClearLicenseCode(): Unit
  
  val EvaluationDaysLeft: Double
  
  val EvaluationMode: Boolean
  
  val Expired: Boolean
  
  val LicenseCode: String
  
  val NumOfConcurrentUserLicenses: Double
  
  val NumOfNamedUserLicenses: Double
  
  val NumOfReadonlyLicenses: Double
  
  val SerialNumber: String
}
object ILicenseStatus {
  
  inline def apply(
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
  
  extension [Self <: ILicenseStatus](x: Self) {
    
    inline def setClearLicenseCode(value: () => Unit): Self = StObject.set(x, "ClearLicenseCode", js.Any.fromFunction0(value))
    
    inline def setEvaluationDaysLeft(value: Double): Self = StObject.set(x, "EvaluationDaysLeft", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMode(value: Boolean): Self = StObject.set(x, "EvaluationMode", value.asInstanceOf[js.Any])
    
    inline def setExpired(value: Boolean): Self = StObject.set(x, "Expired", value.asInstanceOf[js.Any])
    
    inline def setLicenseCode(value: String): Self = StObject.set(x, "LicenseCode", value.asInstanceOf[js.Any])
    
    inline def setNumOfConcurrentUserLicenses(value: Double): Self = StObject.set(x, "NumOfConcurrentUserLicenses", value.asInstanceOf[js.Any])
    
    inline def setNumOfNamedUserLicenses(value: Double): Self = StObject.set(x, "NumOfNamedUserLicenses", value.asInstanceOf[js.Any])
    
    inline def setNumOfReadonlyLicenses(value: Double): Self = StObject.set(x, "NumOfReadonlyLicenses", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
  }
}
