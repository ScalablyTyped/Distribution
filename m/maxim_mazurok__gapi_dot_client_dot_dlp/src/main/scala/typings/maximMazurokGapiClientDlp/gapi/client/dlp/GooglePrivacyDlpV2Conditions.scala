package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Conditions extends StObject {
  
  /** A collection of conditions. */
  var conditions: js.UndefOr[js.Array[GooglePrivacyDlpV2Condition]] = js.undefined
}
object GooglePrivacyDlpV2Conditions {
  
  inline def apply(): GooglePrivacyDlpV2Conditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Conditions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2Conditions] (val x: Self) extends AnyVal {
    
    inline def setConditions(value: js.Array[GooglePrivacyDlpV2Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: GooglePrivacyDlpV2Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
  }
}
