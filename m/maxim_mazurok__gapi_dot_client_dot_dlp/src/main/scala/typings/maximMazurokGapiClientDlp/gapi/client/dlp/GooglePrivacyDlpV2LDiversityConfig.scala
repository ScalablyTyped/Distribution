package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2LDiversityConfig extends StObject {
  
  /**
    * Set of quasi-identifiers indicating how equivalence classes are defined for the l-diversity computation. When multiple fields are specified, they are considered a single composite
    * key.
    */
  var quasiIds: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldId]] = js.undefined
  
  /** Sensitive field for computing the l-value. */
  var sensitiveAttribute: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.undefined
}
object GooglePrivacyDlpV2LDiversityConfig {
  
  inline def apply(): GooglePrivacyDlpV2LDiversityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2LDiversityConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2LDiversityConfig] (val x: Self) extends AnyVal {
    
    inline def setQuasiIds(value: js.Array[GooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "quasiIds", value.asInstanceOf[js.Any])
    
    inline def setQuasiIdsUndefined: Self = StObject.set(x, "quasiIds", js.undefined)
    
    inline def setQuasiIdsVarargs(value: GooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "quasiIds", js.Array(value*))
    
    inline def setSensitiveAttribute(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "sensitiveAttribute", value.asInstanceOf[js.Any])
    
    inline def setSensitiveAttributeUndefined: Self = StObject.set(x, "sensitiveAttribute", js.undefined)
  }
}
