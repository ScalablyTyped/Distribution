package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationContextClassReference
  extends StObject
     with Entity {
  
  /**
    * A short explanation of the policies that are enforced by authenticationContextClassReference. This value should be used
    * to provide secondary text to describe the authentication context class reference when building user-facing admin
    * experiences. For example, a selection UX.
    */
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The display name is the friendly name of the authenticationContextClassReference object. This value should be used to
    * identify the authentication context class reference when building user-facing admin experiences. For example, a
    * selection UX.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Indicates whether the authenticationContextClassReference has been published by the security admin and is ready for use
    * by apps. When it is set to false, it should not be shown in authentication context selection UX, or used to protect app
    * resources. It will be shown and available for Conditional Access policy authoring. The default value is false. Supports
    * $filter (eq).
    */
  var isAvailable: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object AuthenticationContextClassReference {
  
  inline def apply(): AuthenticationContextClassReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationContextClassReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationContextClassReference] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsAvailable(value: NullableOption[Boolean]): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsAvailableNull: Self = StObject.set(x, "isAvailable", null)
    
    inline def setIsAvailableUndefined: Self = StObject.set(x, "isAvailable", js.undefined)
  }
}
