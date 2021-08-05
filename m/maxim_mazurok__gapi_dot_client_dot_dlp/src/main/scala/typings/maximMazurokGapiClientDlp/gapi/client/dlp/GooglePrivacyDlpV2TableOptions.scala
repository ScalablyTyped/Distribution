package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2TableOptions extends StObject {
  
  /**
    * The columns that are the primary keys for table objects included in ContentItem. A copy of this cell's value will stored alongside alongside each finding so that the finding can be
    * traced to the specific row it came from. No more than 3 may be provided.
    */
  var identifyingFields: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldId]] = js.undefined
}
object GooglePrivacyDlpV2TableOptions {
  
  inline def apply(): GooglePrivacyDlpV2TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TableOptions]
  }
  
  extension [Self <: GooglePrivacyDlpV2TableOptions](x: Self) {
    
    inline def setIdentifyingFields(value: js.Array[GooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "identifyingFields", value.asInstanceOf[js.Any])
    
    inline def setIdentifyingFieldsUndefined: Self = StObject.set(x, "identifyingFields", js.undefined)
    
    inline def setIdentifyingFieldsVarargs(value: GooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "identifyingFields", js.Array(value :_*))
  }
}
