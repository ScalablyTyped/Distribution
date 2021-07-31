package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2FieldId extends StObject {
  
  /** Name describing the field. */
  var name: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2FieldId {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2FieldId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2FieldId]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2FieldIdMutableBuilder[Self <: GooglePrivacyDlpV2FieldId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
