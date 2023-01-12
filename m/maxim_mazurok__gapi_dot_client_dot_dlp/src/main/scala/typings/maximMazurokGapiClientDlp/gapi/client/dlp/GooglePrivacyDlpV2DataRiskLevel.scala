package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DataRiskLevel extends StObject {
  
  /** The score applied to the resource. */
  var score: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2DataRiskLevel {
  
  inline def apply(): GooglePrivacyDlpV2DataRiskLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DataRiskLevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2DataRiskLevel] (val x: Self) extends AnyVal {
    
    inline def setScore(value: String): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
