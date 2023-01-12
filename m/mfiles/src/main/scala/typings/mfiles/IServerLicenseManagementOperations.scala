package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServerLicenseManagementOperations extends StObject {
  
  def GetLicenseStatus(): ILicenseStatus
  
  def SetLicenseCodeAndSerialNumber(SerialNumber: String, LicenseCode: String): Unit
}
object IServerLicenseManagementOperations {
  
  inline def apply(GetLicenseStatus: () => ILicenseStatus, SetLicenseCodeAndSerialNumber: (String, String) => Unit): IServerLicenseManagementOperations = {
    val __obj = js.Dynamic.literal(GetLicenseStatus = js.Any.fromFunction0(GetLicenseStatus), SetLicenseCodeAndSerialNumber = js.Any.fromFunction2(SetLicenseCodeAndSerialNumber))
    __obj.asInstanceOf[IServerLicenseManagementOperations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IServerLicenseManagementOperations] (val x: Self) extends AnyVal {
    
    inline def setGetLicenseStatus(value: () => ILicenseStatus): Self = StObject.set(x, "GetLicenseStatus", js.Any.fromFunction0(value))
    
    inline def setSetLicenseCodeAndSerialNumber(value: (String, String) => Unit): Self = StObject.set(x, "SetLicenseCodeAndSerialNumber", js.Any.fromFunction2(value))
  }
}
