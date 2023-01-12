package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFormat extends StObject {
  
  /**
    * The date format
    */
  var dateFormat: String
  
  /**
    * The corresponding Gregorian date
    */
  var gregDate: String
  
  /**
    * The Islamic date
    */
  var islamicMonthStart: String
}
object DateFormat {
  
  inline def apply(dateFormat: String, gregDate: String, islamicMonthStart: String): DateFormat = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], gregDate = gregDate.asInstanceOf[js.Any], islamicMonthStart = islamicMonthStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateFormat] (val x: Self) extends AnyVal {
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setGregDate(value: String): Self = StObject.set(x, "gregDate", value.asInstanceOf[js.Any])
    
    inline def setIslamicMonthStart(value: String): Self = StObject.set(x, "islamicMonthStart", value.asInstanceOf[js.Any])
  }
}
