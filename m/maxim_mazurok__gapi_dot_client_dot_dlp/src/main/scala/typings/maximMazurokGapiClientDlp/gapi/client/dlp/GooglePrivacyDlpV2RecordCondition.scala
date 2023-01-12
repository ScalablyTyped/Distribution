package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2RecordCondition extends StObject {
  
  /** An expression. */
  var expressions: js.UndefOr[GooglePrivacyDlpV2Expressions] = js.undefined
}
object GooglePrivacyDlpV2RecordCondition {
  
  inline def apply(): GooglePrivacyDlpV2RecordCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RecordCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2RecordCondition] (val x: Self) extends AnyVal {
    
    inline def setExpressions(value: GooglePrivacyDlpV2Expressions): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
  }
}
