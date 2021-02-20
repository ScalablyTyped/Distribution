package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivacyProfile extends StObject {
  
  // A valid smtp email address for the privacy statement contact. Not required.
  var contactEmail: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * A valid URL format that begins with http:// or https://. Maximum length is 255 characters. The URL that directs to the
    * company's privacy statement. Not required.
    */
  var statementUrl: js.UndefOr[NullableOption[String]] = js.native
}
object PrivacyProfile {
  
  @scala.inline
  def apply(): PrivacyProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivacyProfile]
  }
  
  @scala.inline
  implicit class PrivacyProfileMutableBuilder[Self <: PrivacyProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactEmail(value: NullableOption[String]): Self = StObject.set(x, "contactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactEmailNull: Self = StObject.set(x, "contactEmail", null)
    
    @scala.inline
    def setContactEmailUndefined: Self = StObject.set(x, "contactEmail", js.undefined)
    
    @scala.inline
    def setStatementUrl(value: NullableOption[String]): Self = StObject.set(x, "statementUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementUrlNull: Self = StObject.set(x, "statementUrl", null)
    
    @scala.inline
    def setStatementUrlUndefined: Self = StObject.set(x, "statementUrl", js.undefined)
  }
}
