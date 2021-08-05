package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTimeZone
  extends StObject
     with TimeZoneBase {
  
  /**
    * The time offset of the time zone from Coordinated Universal Time (UTC). This value is in minutes. Time zones that are
    * ahead of UTC have a positive offset; time zones that are behind UTC have a negative offset.
    */
  var bias: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Specifies when the time zone switches from standard time to daylight saving time.
  var daylightOffset: js.UndefOr[NullableOption[DaylightTimeZoneOffset]] = js.undefined
  
  // Specifies when the time zone switches from daylight saving time to standard time.
  var standardOffset: js.UndefOr[NullableOption[StandardTimeZoneOffset]] = js.undefined
}
object CustomTimeZone {
  
  inline def apply(): CustomTimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTimeZone]
  }
  
  extension [Self <: CustomTimeZone](x: Self) {
    
    inline def setBias(value: NullableOption[Double]): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    inline def setBiasNull: Self = StObject.set(x, "bias", null)
    
    inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    
    inline def setDaylightOffset(value: NullableOption[DaylightTimeZoneOffset]): Self = StObject.set(x, "daylightOffset", value.asInstanceOf[js.Any])
    
    inline def setDaylightOffsetNull: Self = StObject.set(x, "daylightOffset", null)
    
    inline def setDaylightOffsetUndefined: Self = StObject.set(x, "daylightOffset", js.undefined)
    
    inline def setStandardOffset(value: NullableOption[StandardTimeZoneOffset]): Self = StObject.set(x, "standardOffset", value.asInstanceOf[js.Any])
    
    inline def setStandardOffsetNull: Self = StObject.set(x, "standardOffset", null)
    
    inline def setStandardOffsetUndefined: Self = StObject.set(x, "standardOffset", js.undefined)
  }
}
