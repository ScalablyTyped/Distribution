package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlternativeSecurityId extends StObject {
  
  // For internal use only
  var identityProvider: js.UndefOr[NullableOption[String]] = js.undefined
  
  // For internal use only
  var key: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // For internal use only
  var `type`: js.UndefOr[NullableOption[Double]] = js.undefined
}
object AlternativeSecurityId {
  
  @scala.inline
  def apply(): AlternativeSecurityId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlternativeSecurityId]
  }
  
  @scala.inline
  implicit class AlternativeSecurityIdMutableBuilder[Self <: AlternativeSecurityId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityProvider(value: NullableOption[String]): Self = StObject.set(x, "identityProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityProviderNull: Self = StObject.set(x, "identityProvider", null)
    
    @scala.inline
    def setIdentityProviderUndefined: Self = StObject.set(x, "identityProvider", js.undefined)
    
    @scala.inline
    def setKey(value: NullableOption[Double]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[Double]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
