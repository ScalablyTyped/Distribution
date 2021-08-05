package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivacyProfile extends StObject {
  
  // A valid smtp email address for the privacy statement contact. Not required.
  var contactEmail: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A valid URL format that begins with http:// or https://. Maximum length is 255 characters. The URL that directs to the
    * company's privacy statement. Not required.
    */
  var statementUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object PrivacyProfile {
  
  inline def apply(): PrivacyProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivacyProfile]
  }
  
  extension [Self <: PrivacyProfile](x: Self) {
    
    inline def setContactEmail(value: NullableOption[String]): Self = StObject.set(x, "contactEmail", value.asInstanceOf[js.Any])
    
    inline def setContactEmailNull: Self = StObject.set(x, "contactEmail", null)
    
    inline def setContactEmailUndefined: Self = StObject.set(x, "contactEmail", js.undefined)
    
    inline def setStatementUrl(value: NullableOption[String]): Self = StObject.set(x, "statementUrl", value.asInstanceOf[js.Any])
    
    inline def setStatementUrlNull: Self = StObject.set(x, "statementUrl", null)
    
    inline def setStatementUrlUndefined: Self = StObject.set(x, "statementUrl", js.undefined)
  }
}
