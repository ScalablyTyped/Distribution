package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedContact extends StObject {
  
  // Indicates whether the user has been consented to access student data.
  var accessConsent: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Name of the contact. Required.
  var displayName: js.UndefOr[String] = js.undefined
  
  // Primary email address of the contact. Required.
  var emailAddress: js.UndefOr[String] = js.undefined
  
  // Mobile phone number of the contact.
  var mobilePhone: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Relationship to the user. Possible values are: parent, relative, aide, doctor, guardian, child, other,
    * unknownFutureValue.
    */
  var relationship: js.UndefOr[ContactRelationship] = js.undefined
}
object RelatedContact {
  
  inline def apply(): RelatedContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedContact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelatedContact] (val x: Self) extends AnyVal {
    
    inline def setAccessConsent(value: NullableOption[Boolean]): Self = StObject.set(x, "accessConsent", value.asInstanceOf[js.Any])
    
    inline def setAccessConsentNull: Self = StObject.set(x, "accessConsent", null)
    
    inline def setAccessConsentUndefined: Self = StObject.set(x, "accessConsent", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setMobilePhone(value: NullableOption[String]): Self = StObject.set(x, "mobilePhone", value.asInstanceOf[js.Any])
    
    inline def setMobilePhoneNull: Self = StObject.set(x, "mobilePhone", null)
    
    inline def setMobilePhoneUndefined: Self = StObject.set(x, "mobilePhone", js.undefined)
    
    inline def setRelationship(value: ContactRelationship): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
  }
}
