package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemporaryAccessPassAuthenticationMethodConfiguration
  extends StObject
     with AuthenticationMethodConfiguration {
  
  // Default length in characters of a Temporary Access Pass object. Must be between 8 and 48 characters.
  var defaultLength: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Default lifetime in minutes for a Temporary Access Pass. Value can be any integer between the minimumLifetimeInMinutes
    * and maximumLifetimeInMinutes.
    */
  var defaultLifetimeInMinutes: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // A collection of users or groups who are enabled to use the authentication method.
  var includeTargets: js.UndefOr[NullableOption[js.Array[AuthenticationMethodTarget]]] = js.undefined
  
  /**
    * If true, all the passes in the tenant will be restricted to one-time use. If false, passes in the tenant can be created
    * to be either one-time use or reusable.
    */
  var isUsableOnce: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Maximum lifetime in minutes for any Temporary Access Pass created in the tenant. Value can be between 10 and 43200
    * minutes (equivalent to 30 days).
    */
  var maximumLifetimeInMinutes: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Minimum lifetime in minutes for any Temporary Access Pass created in the tenant. Value can be between 10 and 43200
    * minutes (equivalent to 30 days).
    */
  var minimumLifetimeInMinutes: js.UndefOr[NullableOption[Double]] = js.undefined
}
object TemporaryAccessPassAuthenticationMethodConfiguration {
  
  inline def apply(): TemporaryAccessPassAuthenticationMethodConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemporaryAccessPassAuthenticationMethodConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemporaryAccessPassAuthenticationMethodConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDefaultLength(value: NullableOption[Double]): Self = StObject.set(x, "defaultLength", value.asInstanceOf[js.Any])
    
    inline def setDefaultLengthNull: Self = StObject.set(x, "defaultLength", null)
    
    inline def setDefaultLengthUndefined: Self = StObject.set(x, "defaultLength", js.undefined)
    
    inline def setDefaultLifetimeInMinutes(value: NullableOption[Double]): Self = StObject.set(x, "defaultLifetimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setDefaultLifetimeInMinutesNull: Self = StObject.set(x, "defaultLifetimeInMinutes", null)
    
    inline def setDefaultLifetimeInMinutesUndefined: Self = StObject.set(x, "defaultLifetimeInMinutes", js.undefined)
    
    inline def setIncludeTargets(value: NullableOption[js.Array[AuthenticationMethodTarget]]): Self = StObject.set(x, "includeTargets", value.asInstanceOf[js.Any])
    
    inline def setIncludeTargetsNull: Self = StObject.set(x, "includeTargets", null)
    
    inline def setIncludeTargetsUndefined: Self = StObject.set(x, "includeTargets", js.undefined)
    
    inline def setIncludeTargetsVarargs(value: AuthenticationMethodTarget*): Self = StObject.set(x, "includeTargets", js.Array(value*))
    
    inline def setIsUsableOnce(value: NullableOption[Boolean]): Self = StObject.set(x, "isUsableOnce", value.asInstanceOf[js.Any])
    
    inline def setIsUsableOnceNull: Self = StObject.set(x, "isUsableOnce", null)
    
    inline def setIsUsableOnceUndefined: Self = StObject.set(x, "isUsableOnce", js.undefined)
    
    inline def setMaximumLifetimeInMinutes(value: NullableOption[Double]): Self = StObject.set(x, "maximumLifetimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setMaximumLifetimeInMinutesNull: Self = StObject.set(x, "maximumLifetimeInMinutes", null)
    
    inline def setMaximumLifetimeInMinutesUndefined: Self = StObject.set(x, "maximumLifetimeInMinutes", js.undefined)
    
    inline def setMinimumLifetimeInMinutes(value: NullableOption[Double]): Self = StObject.set(x, "minimumLifetimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setMinimumLifetimeInMinutesNull: Self = StObject.set(x, "minimumLifetimeInMinutes", null)
    
    inline def setMinimumLifetimeInMinutesUndefined: Self = StObject.set(x, "minimumLifetimeInMinutes", js.undefined)
  }
}
