package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppRole extends StObject {
  
  /**
    * Specifies whether this app role can be assigned to users and groups (by setting to ['User']), to other application's
    * (by setting to ['Application'], or both (by setting to ['User', 'Application']). App roles supporting assignment to
    * other applications' service principals are also known as application permissions. The 'Application' value is only
    * supported for app roles defined on application entities.
    */
  var allowedMemberTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The description for the app role. This is displayed when the app role is being assigned and, if the app role functions
    * as an application permission, during consent experiences.
    */
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Display name for the permission that appears in the app role assignment and consent experiences.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Unique role identifier inside the appRoles collection. When creating a new app role, a new Guid identifier must be
    * provided.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * When creating or updating an app role, this must be set to true (which is the default). To delete a role, this must
    * first be set to false. At that point, in a subsequent call, this role may be removed.
    */
  var isEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies if the app role is defined on the application object or on the servicePrincipal entity. Must not be included
    * in any POST or PATCH requests. Read-only.
    */
  var origin: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Specifies the value to include in the roles claim in ID tokens and access tokens authenticating an assigned user or
    * service principal. Must not exceed 120 characters in length. Allowed characters are : ! # $ % &amp; ' ( ) * + , - . / :
    * ; = ? @ [ ] ^ + _ { } ~, as well as characters in the ranges 0-9, A-Z and a-z. Any other character, including the space
    * character, are not allowed.
    */
  var value: js.UndefOr[NullableOption[String]] = js.native
}
object AppRole {
  
  @scala.inline
  def apply(): AppRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRole]
  }
  
  @scala.inline
  implicit class AppRoleMutableBuilder[Self <: AppRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedMemberTypes(value: js.Array[String]): Self = StObject.set(x, "allowedMemberTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedMemberTypesUndefined: Self = StObject.set(x, "allowedMemberTypes", js.undefined)
    
    @scala.inline
    def setAllowedMemberTypesVarargs(value: String*): Self = StObject.set(x, "allowedMemberTypes", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    @scala.inline
    def setOrigin(value: NullableOption[String]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginNull: Self = StObject.set(x, "origin", null)
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
