package typings.oidcProvider.anon

import typings.oidcProvider.mod.AsymmetricSigningAlgorithm
import typings.oidcProvider.mod.EncryptionAlgValues
import typings.oidcProvider.mod.EncryptionEncValues
import typings.oidcProvider.mod.SigningAlgorithm
import typings.oidcProvider.mod.SigningAlgorithmWithNone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationEncryptionAlgValues extends StObject {
  
  var authorizationEncryptionAlgValues: js.UndefOr[js.Array[EncryptionAlgValues]] = js.undefined
  
  var authorizationEncryptionEncValues: js.UndefOr[js.Array[EncryptionEncValues]] = js.undefined
  
  var authorizationSigningAlgValues: js.UndefOr[js.Array[SigningAlgorithm]] = js.undefined
  
  var dPoPSigningAlgValues: js.UndefOr[js.Array[AsymmetricSigningAlgorithm]] = js.undefined
  
  var idTokenEncryptionAlgValues: js.UndefOr[js.Array[EncryptionAlgValues]] = js.undefined
  
  var idTokenEncryptionEncValues: js.UndefOr[js.Array[EncryptionEncValues]] = js.undefined
  
  var idTokenSigningAlgValues: js.UndefOr[js.Array[SigningAlgorithmWithNone]] = js.undefined
  
  var introspectionEncryptionAlgValues: js.UndefOr[js.Array[EncryptionAlgValues]] = js.undefined
  
  var introspectionEncryptionEncValues: js.UndefOr[js.Array[EncryptionEncValues]] = js.undefined
  
  var introspectionSigningAlgValues: js.UndefOr[js.Array[SigningAlgorithmWithNone]] = js.undefined
  
  var requestObjectEncryptionAlgValues: js.UndefOr[js.Array[EncryptionAlgValues]] = js.undefined
  
  var requestObjectEncryptionEncValues: js.UndefOr[js.Array[EncryptionEncValues]] = js.undefined
  
  var requestObjectSigningAlgValues: js.UndefOr[js.Array[SigningAlgorithmWithNone]] = js.undefined
  
  var tokenEndpointAuthSigningAlgValues: js.UndefOr[js.Array[SigningAlgorithm]] = js.undefined
  
  var userinfoEncryptionAlgValues: js.UndefOr[js.Array[EncryptionAlgValues]] = js.undefined
  
  var userinfoEncryptionEncValues: js.UndefOr[js.Array[EncryptionEncValues]] = js.undefined
  
  var userinfoSigningAlgValues: js.UndefOr[js.Array[SigningAlgorithmWithNone]] = js.undefined
}
object AuthorizationEncryptionAlgValues {
  
  inline def apply(): AuthorizationEncryptionAlgValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationEncryptionAlgValues]
  }
  
  extension [Self <: AuthorizationEncryptionAlgValues](x: Self) {
    
    inline def setAuthorizationEncryptionAlgValues(value: js.Array[EncryptionAlgValues]): Self = StObject.set(x, "authorizationEncryptionAlgValues", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationEncryptionAlgValuesUndefined: Self = StObject.set(x, "authorizationEncryptionAlgValues", js.undefined)
    
    inline def setAuthorizationEncryptionAlgValuesVarargs(value: EncryptionAlgValues*): Self = StObject.set(x, "authorizationEncryptionAlgValues", js.Array(value*))
    
    inline def setAuthorizationEncryptionEncValues(value: js.Array[EncryptionEncValues]): Self = StObject.set(x, "authorizationEncryptionEncValues", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationEncryptionEncValuesUndefined: Self = StObject.set(x, "authorizationEncryptionEncValues", js.undefined)
    
    inline def setAuthorizationEncryptionEncValuesVarargs(value: EncryptionEncValues*): Self = StObject.set(x, "authorizationEncryptionEncValues", js.Array(value*))
    
    inline def setAuthorizationSigningAlgValues(value: js.Array[SigningAlgorithm]): Self = StObject.set(x, "authorizationSigningAlgValues", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationSigningAlgValuesUndefined: Self = StObject.set(x, "authorizationSigningAlgValues", js.undefined)
    
    inline def setAuthorizationSigningAlgValuesVarargs(value: SigningAlgorithm*): Self = StObject.set(x, "authorizationSigningAlgValues", js.Array(value*))
    
    inline def setDPoPSigningAlgValues(value: js.Array[AsymmetricSigningAlgorithm]): Self = StObject.set(x, "dPoPSigningAlgValues", value.asInstanceOf[js.Any])
    
    inline def setDPoPSigningAlgValuesUndefined: Self = StObject.set(x, "dPoPSigningAlgValues", js.undefined)
    
    inline def setDPoPSigningAlgValuesVarargs(value: AsymmetricSigningAlgorithm*): Self = StObject.set(x, "dPoPSigningAlgValues", js.Array(value*))
    
    inline def setIdTokenEncryptionAlgValues(value: js.Array[EncryptionAlgValues]): Self = StObject.set(x, "idTokenEncryptionAlgValues", value.asInstanceOf[js.Any])
    
    inline def setIdTokenEncryptionAlgValuesUndefined: Self = StObject.set(x, "idTokenEncryptionAlgValues", js.undefined)
    
    inline def setIdTokenEncryptionAlgValuesVarargs(value: EncryptionAlgValues*): Self = StObject.set(x, "idTokenEncryptionAlgValues", js.Array(value*))
    
    inline def setIdTokenEncryptionEncValues(value: js.Array[EncryptionEncValues]): Self = StObject.set(x, "idTokenEncryptionEncValues", value.asInstanceOf[js.Any])
    
    inline def setIdTokenEncryptionEncValuesUndefined: Self = StObject.set(x, "idTokenEncryptionEncValues", js.undefined)
    
    inline def setIdTokenEncryptionEncValuesVarargs(value: EncryptionEncValues*): Self = StObject.set(x, "idTokenEncryptionEncValues", js.Array(value*))
    
    inline def setIdTokenSigningAlgValues(value: js.Array[SigningAlgorithmWithNone]): Self = StObject.set(x, "idTokenSigningAlgValues", value.asInstanceOf[js.Any])
    
    inline def setIdTokenSigningAlgValuesUndefined: Self = StObject.set(x, "idTokenSigningAlgValues", js.undefined)
    
    inline def setIdTokenSigningAlgValuesVarargs(value: SigningAlgorithmWithNone*): Self = StObject.set(x, "idTokenSigningAlgValues", js.Array(value*))
    
    inline def setIntrospectionEncryptionAlgValues(value: js.Array[EncryptionAlgValues]): Self = StObject.set(x, "introspectionEncryptionAlgValues", value.asInstanceOf[js.Any])
    
    inline def setIntrospectionEncryptionAlgValuesUndefined: Self = StObject.set(x, "introspectionEncryptionAlgValues", js.undefined)
    
    inline def setIntrospectionEncryptionAlgValuesVarargs(value: EncryptionAlgValues*): Self = StObject.set(x, "introspectionEncryptionAlgValues", js.Array(value*))
    
    inline def setIntrospectionEncryptionEncValues(value: js.Array[EncryptionEncValues]): Self = StObject.set(x, "introspectionEncryptionEncValues", value.asInstanceOf[js.Any])
    
    inline def setIntrospectionEncryptionEncValuesUndefined: Self = StObject.set(x, "introspectionEncryptionEncValues", js.undefined)
    
    inline def setIntrospectionEncryptionEncValuesVarargs(value: EncryptionEncValues*): Self = StObject.set(x, "introspectionEncryptionEncValues", js.Array(value*))
    
    inline def setIntrospectionSigningAlgValues(value: js.Array[SigningAlgorithmWithNone]): Self = StObject.set(x, "introspectionSigningAlgValues", value.asInstanceOf[js.Any])
    
    inline def setIntrospectionSigningAlgValuesUndefined: Self = StObject.set(x, "introspectionSigningAlgValues", js.undefined)
    
    inline def setIntrospectionSigningAlgValuesVarargs(value: SigningAlgorithmWithNone*): Self = StObject.set(x, "introspectionSigningAlgValues", js.Array(value*))
    
    inline def setRequestObjectEncryptionAlgValues(value: js.Array[EncryptionAlgValues]): Self = StObject.set(x, "requestObjectEncryptionAlgValues", value.asInstanceOf[js.Any])
    
    inline def setRequestObjectEncryptionAlgValuesUndefined: Self = StObject.set(x, "requestObjectEncryptionAlgValues", js.undefined)
    
    inline def setRequestObjectEncryptionAlgValuesVarargs(value: EncryptionAlgValues*): Self = StObject.set(x, "requestObjectEncryptionAlgValues", js.Array(value*))
    
    inline def setRequestObjectEncryptionEncValues(value: js.Array[EncryptionEncValues]): Self = StObject.set(x, "requestObjectEncryptionEncValues", value.asInstanceOf[js.Any])
    
    inline def setRequestObjectEncryptionEncValuesUndefined: Self = StObject.set(x, "requestObjectEncryptionEncValues", js.undefined)
    
    inline def setRequestObjectEncryptionEncValuesVarargs(value: EncryptionEncValues*): Self = StObject.set(x, "requestObjectEncryptionEncValues", js.Array(value*))
    
    inline def setRequestObjectSigningAlgValues(value: js.Array[SigningAlgorithmWithNone]): Self = StObject.set(x, "requestObjectSigningAlgValues", value.asInstanceOf[js.Any])
    
    inline def setRequestObjectSigningAlgValuesUndefined: Self = StObject.set(x, "requestObjectSigningAlgValues", js.undefined)
    
    inline def setRequestObjectSigningAlgValuesVarargs(value: SigningAlgorithmWithNone*): Self = StObject.set(x, "requestObjectSigningAlgValues", js.Array(value*))
    
    inline def setTokenEndpointAuthSigningAlgValues(value: js.Array[SigningAlgorithm]): Self = StObject.set(x, "tokenEndpointAuthSigningAlgValues", value.asInstanceOf[js.Any])
    
    inline def setTokenEndpointAuthSigningAlgValuesUndefined: Self = StObject.set(x, "tokenEndpointAuthSigningAlgValues", js.undefined)
    
    inline def setTokenEndpointAuthSigningAlgValuesVarargs(value: SigningAlgorithm*): Self = StObject.set(x, "tokenEndpointAuthSigningAlgValues", js.Array(value*))
    
    inline def setUserinfoEncryptionAlgValues(value: js.Array[EncryptionAlgValues]): Self = StObject.set(x, "userinfoEncryptionAlgValues", value.asInstanceOf[js.Any])
    
    inline def setUserinfoEncryptionAlgValuesUndefined: Self = StObject.set(x, "userinfoEncryptionAlgValues", js.undefined)
    
    inline def setUserinfoEncryptionAlgValuesVarargs(value: EncryptionAlgValues*): Self = StObject.set(x, "userinfoEncryptionAlgValues", js.Array(value*))
    
    inline def setUserinfoEncryptionEncValues(value: js.Array[EncryptionEncValues]): Self = StObject.set(x, "userinfoEncryptionEncValues", value.asInstanceOf[js.Any])
    
    inline def setUserinfoEncryptionEncValuesUndefined: Self = StObject.set(x, "userinfoEncryptionEncValues", js.undefined)
    
    inline def setUserinfoEncryptionEncValuesVarargs(value: EncryptionEncValues*): Self = StObject.set(x, "userinfoEncryptionEncValues", js.Array(value*))
    
    inline def setUserinfoSigningAlgValues(value: js.Array[SigningAlgorithmWithNone]): Self = StObject.set(x, "userinfoSigningAlgValues", value.asInstanceOf[js.Any])
    
    inline def setUserinfoSigningAlgValuesUndefined: Self = StObject.set(x, "userinfoSigningAlgValues", js.undefined)
    
    inline def setUserinfoSigningAlgValuesVarargs(value: SigningAlgorithmWithNone*): Self = StObject.set(x, "userinfoSigningAlgValues", js.Array(value*))
  }
}
