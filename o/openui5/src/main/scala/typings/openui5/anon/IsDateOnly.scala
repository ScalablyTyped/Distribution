package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDateOnly extends StObject {
  
  /**
    * If `true`, only the date part is used, the time part is always 00:00:00 and the time zone is UTC to avoid
    * time-zone-related problems
    */
  var isDateOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the value `null` is accepted
    */
  var nullable: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * The number of decimal places allowed in the seconds portion of a valid string value (OData V4 only);
    * only integer values between 0 and 12 are valid (since 1.37.0)
    */
  var precision: js.UndefOr[Boolean] = js.undefined
}
object IsDateOnly {
  
  inline def apply(): IsDateOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsDateOnly]
  }
  
  extension [Self <: IsDateOnly](x: Self) {
    
    inline def setIsDateOnly(value: Boolean): Self = StObject.set(x, "isDateOnly", value.asInstanceOf[js.Any])
    
    inline def setIsDateOnlyUndefined: Self = StObject.set(x, "isDateOnly", js.undefined)
    
    inline def setNullable(value: Boolean | String): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setPrecision(value: Boolean): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
  }
}
