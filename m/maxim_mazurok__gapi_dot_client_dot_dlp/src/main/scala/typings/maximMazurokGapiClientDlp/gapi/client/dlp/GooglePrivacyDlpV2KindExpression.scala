package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2KindExpression extends StObject {
  
  /** The name of the kind. */
  var name: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2KindExpression {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2KindExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2KindExpression]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2KindExpressionMutableBuilder[Self <: GooglePrivacyDlpV2KindExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
