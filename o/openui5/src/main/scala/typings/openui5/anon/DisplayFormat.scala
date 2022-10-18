package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayFormat extends StObject {
  
  /**
    * may be "Date", in this case only the date part is used, the time part is always 00:00:00 and the time
    * zone is UTC to avoid time-zone-related problems
    */
  var displayFormat: js.UndefOr[String] = js.undefined
  
  /**
    * if `true`, the value `null` is accepted
    */
  var nullable: js.UndefOr[Boolean | String] = js.undefined
}
object DisplayFormat {
  
  inline def apply(): DisplayFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayFormat]
  }
  
  extension [Self <: DisplayFormat](x: Self) {
    
    inline def setDisplayFormat(value: String): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
    
    inline def setDisplayFormatUndefined: Self = StObject.set(x, "displayFormat", js.undefined)
    
    inline def setNullable(value: Boolean | String): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
  }
}
