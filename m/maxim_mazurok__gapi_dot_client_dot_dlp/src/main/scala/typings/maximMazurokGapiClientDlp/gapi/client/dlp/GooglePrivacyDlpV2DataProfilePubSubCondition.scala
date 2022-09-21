package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DataProfilePubSubCondition extends StObject {
  
  /** An expression. */
  var expressions: js.UndefOr[GooglePrivacyDlpV2PubSubExpressions] = js.undefined
}
object GooglePrivacyDlpV2DataProfilePubSubCondition {
  
  inline def apply(): GooglePrivacyDlpV2DataProfilePubSubCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DataProfilePubSubCondition]
  }
  
  extension [Self <: GooglePrivacyDlpV2DataProfilePubSubCondition](x: Self) {
    
    inline def setExpressions(value: GooglePrivacyDlpV2PubSubExpressions): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
  }
}
