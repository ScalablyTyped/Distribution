package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Export extends StObject {
  
  /** Store all table and column profiles in an existing table or a new table in an existing dataset. Each re-generation will result in a new row in BigQuery. */
  var profileTable: js.UndefOr[GooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object GooglePrivacyDlpV2Export {
  
  inline def apply(): GooglePrivacyDlpV2Export = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Export]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2Export] (val x: Self) extends AnyVal {
    
    inline def setProfileTable(value: GooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "profileTable", value.asInstanceOf[js.Any])
    
    inline def setProfileTableUndefined: Self = StObject.set(x, "profileTable", js.undefined)
  }
}
