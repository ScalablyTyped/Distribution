package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2QuasiIdentifierField extends StObject {
  
  /**
    * A column can be tagged with a custom tag. In this case, the user must indicate an auxiliary table that contains statistical information on the possible values of this column
    * (below).
    */
  var customTag: js.UndefOr[String] = js.undefined
  
  /** Identifies the column. */
  var field: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.undefined
}
object GooglePrivacyDlpV2QuasiIdentifierField {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2QuasiIdentifierField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2QuasiIdentifierField]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2QuasiIdentifierFieldMutableBuilder[Self <: GooglePrivacyDlpV2QuasiIdentifierField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomTag(value: String): Self = StObject.set(x, "customTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTagUndefined: Self = StObject.set(x, "customTag", js.undefined)
    
    @scala.inline
    def setField(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
