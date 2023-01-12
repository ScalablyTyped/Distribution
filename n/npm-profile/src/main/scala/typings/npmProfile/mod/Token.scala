package typings.npmProfile.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token extends StObject {
  
  /**
    * An array of CIDR ranges that this token is allowed to be used from.
    */
  var cidr_whitelist: js.Array[String]
  
  /**
    * The date and time the token was created
    */
  var created: js.Date | String
  
  /**
    * A sha512 that can be used to remove this token.
    */
  var key: String
  
  /**
    * If true, this token can only be used to download private modules. Critically, it CAN NOT be used to publish.
    */
  var readonly: Boolean
  
  /**
    * The first six characters of the token UUID. This should be used by the user to identify which token this is.
    */
  var token: String | Null
  
  /**
    * The date and time the token was updated
    */
  var updated: js.Date | String
}
object Token {
  
  inline def apply(
    cidr_whitelist: js.Array[String],
    created: js.Date | String,
    key: String,
    readonly: Boolean,
    updated: js.Date | String
  ): Token = {
    val __obj = js.Dynamic.literal(cidr_whitelist = cidr_whitelist.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], token = null)
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
    
    inline def setCidr_whitelist(value: js.Array[String]): Self = StObject.set(x, "cidr_whitelist", value.asInstanceOf[js.Any])
    
    inline def setCidr_whitelistVarargs(value: String*): Self = StObject.set(x, "cidr_whitelist", js.Array(value*))
    
    inline def setCreated(value: js.Date | String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setUpdated(value: js.Date | String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
