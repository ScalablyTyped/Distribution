package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2KindExpression extends StObject {
  
  /** The name of the kind. */
  var name: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2KindExpression {
  
  inline def apply(): GooglePrivacyDlpV2KindExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2KindExpression]
  }
  
  extension [Self <: GooglePrivacyDlpV2KindExpression](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
