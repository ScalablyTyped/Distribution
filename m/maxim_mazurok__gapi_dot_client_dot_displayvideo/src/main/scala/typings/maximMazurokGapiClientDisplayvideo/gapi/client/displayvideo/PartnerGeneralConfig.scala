package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnerGeneralConfig extends StObject {
  
  /** Immutable. Partner's currency in ISO 4217 format. */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /** Immutable. The standard TZ database name of the partner's time zone. For example, `America/New_York`. See more at: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones */
  var timeZone: js.UndefOr[String] = js.undefined
}
object PartnerGeneralConfig {
  
  inline def apply(): PartnerGeneralConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerGeneralConfig]
  }
  
  extension [Self <: PartnerGeneralConfig](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
