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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2DataProfilePubSubCondition] (val x: Self) extends AnyVal {
    
    inline def setExpressions(value: GooglePrivacyDlpV2PubSubExpressions): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
  }
}
