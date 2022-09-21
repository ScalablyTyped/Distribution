package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageSubject
  extends StObject
     with Entity {
  
  // The connected organization of the subject. Read-only. Nullable.
  var connectedOrganization: js.UndefOr[NullableOption[ConnectedOrganization]] = js.undefined
  
  // The display name of the subject.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The email address of the subject.
  var email: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The object identifier of the subject. null if the subject is not yet a user in the tenant.
  var objectId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A string representation of the principal's security identifier, if known, or null if the subject does not have a
    * security identifier.
    */
  var onPremisesSecurityIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The principal name, if known, of the subject.
  var principalName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The resource type of the subject. The possible values are: notSpecified, user, servicePrincipal, unknownFutureValue.
  var subjectType: js.UndefOr[NullableOption[AccessPackageSubjectType]] = js.undefined
}
object AccessPackageSubject {
  
  inline def apply(): AccessPackageSubject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageSubject]
  }
  
  extension [Self <: AccessPackageSubject](x: Self) {
    
    inline def setConnectedOrganization(value: NullableOption[ConnectedOrganization]): Self = StObject.set(x, "connectedOrganization", value.asInstanceOf[js.Any])
    
    inline def setConnectedOrganizationNull: Self = StObject.set(x, "connectedOrganization", null)
    
    inline def setConnectedOrganizationUndefined: Self = StObject.set(x, "connectedOrganization", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: NullableOption[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setObjectId(value: NullableOption[String]): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setOnPremisesSecurityIdentifier(value: NullableOption[String]): Self = StObject.set(x, "onPremisesSecurityIdentifier", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesSecurityIdentifierNull: Self = StObject.set(x, "onPremisesSecurityIdentifier", null)
    
    inline def setOnPremisesSecurityIdentifierUndefined: Self = StObject.set(x, "onPremisesSecurityIdentifier", js.undefined)
    
    inline def setPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "principalName", value.asInstanceOf[js.Any])
    
    inline def setPrincipalNameNull: Self = StObject.set(x, "principalName", null)
    
    inline def setPrincipalNameUndefined: Self = StObject.set(x, "principalName", js.undefined)
    
    inline def setSubjectType(value: NullableOption[AccessPackageSubjectType]): Self = StObject.set(x, "subjectType", value.asInstanceOf[js.Any])
    
    inline def setSubjectTypeNull: Self = StObject.set(x, "subjectType", null)
    
    inline def setSubjectTypeUndefined: Self = StObject.set(x, "subjectType", js.undefined)
  }
}
