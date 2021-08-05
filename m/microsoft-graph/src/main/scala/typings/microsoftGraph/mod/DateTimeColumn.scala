package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeColumn extends StObject {
  
  /**
    * How the value should be presented in the UX. Must be one of default, friendly, or standard. See below for more details.
    * If unspecified, treated as default.
    */
  var displayAs: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether the value should be presented as a date only or a date and time. Must be one of dateOnly or dateTime
  var format: js.UndefOr[NullableOption[String]] = js.undefined
}
object DateTimeColumn {
  
  inline def apply(): DateTimeColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeColumn]
  }
  
  extension [Self <: DateTimeColumn](x: Self) {
    
    inline def setDisplayAs(value: NullableOption[String]): Self = StObject.set(x, "displayAs", value.asInstanceOf[js.Any])
    
    inline def setDisplayAsNull: Self = StObject.set(x, "displayAs", null)
    
    inline def setDisplayAsUndefined: Self = StObject.set(x, "displayAs", js.undefined)
    
    inline def setFormat(value: NullableOption[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
