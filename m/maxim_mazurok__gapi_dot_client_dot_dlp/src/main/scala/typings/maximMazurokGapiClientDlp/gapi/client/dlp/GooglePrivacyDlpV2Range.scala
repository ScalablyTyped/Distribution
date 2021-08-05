package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Range extends StObject {
  
  /** Index of the last character of the range (exclusive). */
  var end: js.UndefOr[String] = js.undefined
  
  /** Index of the first character of the range (inclusive). */
  var start: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2Range {
  
  inline def apply(): GooglePrivacyDlpV2Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Range]
  }
  
  extension [Self <: GooglePrivacyDlpV2Range](x: Self) {
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
