package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2TimePartConfig extends StObject {
  
  /** The part of the time to keep. */
  var partToExtract: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2TimePartConfig {
  
  inline def apply(): GooglePrivacyDlpV2TimePartConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TimePartConfig]
  }
  
  extension [Self <: GooglePrivacyDlpV2TimePartConfig](x: Self) {
    
    inline def setPartToExtract(value: String): Self = StObject.set(x, "partToExtract", value.asInstanceOf[js.Any])
    
    inline def setPartToExtractUndefined: Self = StObject.set(x, "partToExtract", js.undefined)
  }
}
