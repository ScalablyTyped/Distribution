package typings.nodeBarion.mod

import typings.nodeBarion.nodeBarionStrings.CZK
import typings.nodeBarion.nodeBarionStrings.EUR
import typings.nodeBarion.nodeBarionStrings.HUF
import typings.nodeBarion.nodeBarionStrings.USD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatementDownloadRequest extends StObject {
  
  var Currency: CZK | EUR | HUF | USD
  
  var Day: js.UndefOr[Double] = js.undefined
  
  var Month: Double
  
  var Password: String
  
  var UserName: String
  
  var Year: Double
}
object StatementDownloadRequest {
  
  inline def apply(Currency: CZK | EUR | HUF | USD, Month: Double, Password: String, UserName: String, Year: Double): StatementDownloadRequest = {
    val __obj = js.Dynamic.literal(Currency = Currency.asInstanceOf[js.Any], Month = Month.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any], Year = Year.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatementDownloadRequest]
  }
  
  extension [Self <: StatementDownloadRequest](x: Self) {
    
    inline def setCurrency(value: CZK | EUR | HUF | USD): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
    
    inline def setDay(value: Double): Self = StObject.set(x, "Day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "Day", js.undefined)
    
    inline def setMonth(value: Double): Self = StObject.set(x, "Month", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "Year", value.asInstanceOf[js.Any])
  }
}
