package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomTimeZone extends TimeZoneBase {
  
  /**
    * The time offset of the time zone from Coordinated Universal Time (UTC). This value is in minutes. Time zones that are
    * ahead of UTC have a positive offset; time zones that are behind UTC have a negative offset.
    */
  var bias: js.UndefOr[NullableOption[Double]] = js.native
  
  // Specifies when the time zone switches from standard time to daylight saving time.
  var daylightOffset: js.UndefOr[NullableOption[DaylightTimeZoneOffset]] = js.native
  
  // Specifies when the time zone switches from daylight saving time to standard time.
  var standardOffset: js.UndefOr[NullableOption[StandardTimeZoneOffset]] = js.native
}
object CustomTimeZone {
  
  @scala.inline
  def apply(): CustomTimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTimeZone]
  }
  
  @scala.inline
  implicit class CustomTimeZoneMutableBuilder[Self <: CustomTimeZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBias(value: NullableOption[Double]): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasNull: Self = StObject.set(x, "bias", null)
    
    @scala.inline
    def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    
    @scala.inline
    def setDaylightOffset(value: NullableOption[DaylightTimeZoneOffset]): Self = StObject.set(x, "daylightOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaylightOffsetNull: Self = StObject.set(x, "daylightOffset", null)
    
    @scala.inline
    def setDaylightOffsetUndefined: Self = StObject.set(x, "daylightOffset", js.undefined)
    
    @scala.inline
    def setStandardOffset(value: NullableOption[StandardTimeZoneOffset]): Self = StObject.set(x, "standardOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardOffsetNull: Self = StObject.set(x, "standardOffset", null)
    
    @scala.inline
    def setStandardOffsetUndefined: Self = StObject.set(x, "standardOffset", js.undefined)
  }
}
