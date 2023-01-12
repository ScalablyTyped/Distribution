package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2TimeZone extends StObject {
  
  /** Set only if the offset can be determined. Positive for time ahead of UTC. E.g. For "UTC-9", this value is -540. */
  var offsetMinutes: js.UndefOr[Double] = js.undefined
}
object GooglePrivacyDlpV2TimeZone {
  
  inline def apply(): GooglePrivacyDlpV2TimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TimeZone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2TimeZone] (val x: Self) extends AnyVal {
    
    inline def setOffsetMinutes(value: Double): Self = StObject.set(x, "offsetMinutes", value.asInstanceOf[js.Any])
    
    inline def setOffsetMinutesUndefined: Self = StObject.set(x, "offsetMinutes", js.undefined)
  }
}
