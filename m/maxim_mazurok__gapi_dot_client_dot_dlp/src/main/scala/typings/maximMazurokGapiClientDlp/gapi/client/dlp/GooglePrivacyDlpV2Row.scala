package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Row extends StObject {
  
  /** Individual cells. */
  var values: js.UndefOr[js.Array[GooglePrivacyDlpV2Value]] = js.native
}
object GooglePrivacyDlpV2Row {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Row]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RowMutableBuilder[Self <: GooglePrivacyDlpV2Row] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[GooglePrivacyDlpV2Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: GooglePrivacyDlpV2Value*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
