package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2TimeZone extends StObject {
  
  /** Set only if the offset can be determined. Positive for time ahead of UTC. E.g. For "UTC-9", this value is -540. */
  var offsetMinutes: js.UndefOr[Double] = js.undefined
}
object GooglePrivacyDlpV2TimeZone {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2TimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TimeZone]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2TimeZoneMutableBuilder[Self <: GooglePrivacyDlpV2TimeZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffsetMinutes(value: Double): Self = StObject.set(x, "offsetMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetMinutesUndefined: Self = StObject.set(x, "offsetMinutes", js.undefined)
  }
}
