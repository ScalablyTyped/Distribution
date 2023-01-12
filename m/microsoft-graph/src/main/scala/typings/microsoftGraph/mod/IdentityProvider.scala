package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProvider
  extends StObject
     with Entity {
  
  /**
    * The client ID for the application. This is the client ID obtained when registering the application with the identity
    * provider. Required. Not nullable.
    */
  var clientId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The client secret for the application. This is the client secret obtained when registering the application with the
    * identity provider. This is write-only. A read operation will return ****. Required. Not nullable.
    */
  var clientSecret: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name of the identity provider. Not nullable.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The identity provider type is a required field. For B2B scenario: Google, Facebook. For B2C scenario: Microsoft,
    * Google, Amazon, LinkedIn, Facebook, GitHub, Twitter, Weibo, QQ, WeChat, OpenIDConnect. Not nullable.
    */
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object IdentityProvider {
  
  inline def apply(): IdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityProvider] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: NullableOption[String]): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientSecret(value: NullableOption[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretNull: Self = StObject.set(x, "clientSecret", null)
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
