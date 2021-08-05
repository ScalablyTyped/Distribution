package typings.microsoftAjax.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a culture definition that can be applied to objects that accept a culture-related setting.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb384004(v=vs.100).aspx}
  */
trait CultureInfo extends StObject {
  
  /**
    * Gets an object that contains an array of culture-sensitive formatting and parsing string values that can be applied to Date type extensions.
    * Use the dateTimeFormat field to retrieve an object that contains an array of formatting strings that are based on the current culture or on the invariant culture.
    * Each formatting string can be used to specify how to format Date type extensions.
    * @return An object that contains an array of culture-sensitive formatting strings.
    */
  var dateTimeFormat: js.Array[String]
  
  /**
    * Gets the culture value (locale) that represents a language and region.
    * @return The culture value (locale) that represents a language and region.
    */
  var name: String
  
  //#endregion
  //#region Properties
  /**
    * Gets an object that contains an array of culture-sensitive formatting and parsing strings values that can be applied to Number type extensions.
    * Use the numberFormat field to retrieve an object that contains an array of formatting strings that are based on the current culture or on the invariant culture.
    * Each formatting string can be used to specify how to format Number type extensions.
    * @return An object that contains an array of culture-sensitive formatting strings.
    */
  var numberFormat: js.Array[String]
}
object CultureInfo {
  
  inline def apply(dateTimeFormat: js.Array[String], name: String, numberFormat: js.Array[String]): CultureInfo = {
    val __obj = js.Dynamic.literal(dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[CultureInfo]
  }
  
  extension [Self <: CultureInfo](x: Self) {
    
    inline def setDateTimeFormat(value: js.Array[String]): Self = StObject.set(x, "dateTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setDateTimeFormatVarargs(value: String*): Self = StObject.set(x, "dateTimeFormat", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumberFormat(value: js.Array[String]): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatVarargs(value: String*): Self = StObject.set(x, "numberFormat", js.Array(value :_*))
  }
}
