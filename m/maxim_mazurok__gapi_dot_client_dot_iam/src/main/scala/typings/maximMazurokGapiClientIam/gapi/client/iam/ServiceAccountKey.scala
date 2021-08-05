package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAccountKey extends StObject {
  
  /** Specifies the algorithm (and possibly key size) for the key. */
  var keyAlgorithm: js.UndefOr[String] = js.undefined
  
  /** The key origin. */
  var keyOrigin: js.UndefOr[String] = js.undefined
  
  /** The key type. */
  var keyType: js.UndefOr[String] = js.undefined
  
  /** The resource name of the service account key in the following format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The private key data. Only provided in `CreateServiceAccountKey` responses. Make sure to keep the private key data secure because it allows for the assertion of the service account
    * identity. When base64 decoded, the private key data can be used to authenticate with Google API client libraries and with gcloud auth activate-service-account.
    */
  var privateKeyData: js.UndefOr[String] = js.undefined
  
  /**
    * The output format for the private key. Only provided in `CreateServiceAccountKey` responses, not in `GetServiceAccountKey` or `ListServiceAccountKey` responses. Google never exposes
    * system-managed private keys, and never retains user-managed private keys.
    */
  var privateKeyType: js.UndefOr[String] = js.undefined
  
  /** The public key data. Only provided in `GetServiceAccountKey` responses. */
  var publicKeyData: js.UndefOr[String] = js.undefined
  
  /** The key can be used after this timestamp. */
  var validAfterTime: js.UndefOr[String] = js.undefined
  
  /**
    * The key can be used before this timestamp. For system-managed key pairs, this timestamp is the end time for the private key signing operation. The public key could still be used for
    * verification for a few hours after this time.
    */
  var validBeforeTime: js.UndefOr[String] = js.undefined
}
object ServiceAccountKey {
  
  inline def apply(): ServiceAccountKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccountKey]
  }
  
  extension [Self <: ServiceAccountKey](x: Self) {
    
    inline def setKeyAlgorithm(value: String): Self = StObject.set(x, "keyAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyAlgorithmUndefined: Self = StObject.set(x, "keyAlgorithm", js.undefined)
    
    inline def setKeyOrigin(value: String): Self = StObject.set(x, "keyOrigin", value.asInstanceOf[js.Any])
    
    inline def setKeyOriginUndefined: Self = StObject.set(x, "keyOrigin", js.undefined)
    
    inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrivateKeyData(value: String): Self = StObject.set(x, "privateKeyData", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyDataUndefined: Self = StObject.set(x, "privateKeyData", js.undefined)
    
    inline def setPrivateKeyType(value: String): Self = StObject.set(x, "privateKeyType", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyTypeUndefined: Self = StObject.set(x, "privateKeyType", js.undefined)
    
    inline def setPublicKeyData(value: String): Self = StObject.set(x, "publicKeyData", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyDataUndefined: Self = StObject.set(x, "publicKeyData", js.undefined)
    
    inline def setValidAfterTime(value: String): Self = StObject.set(x, "validAfterTime", value.asInstanceOf[js.Any])
    
    inline def setValidAfterTimeUndefined: Self = StObject.set(x, "validAfterTime", js.undefined)
    
    inline def setValidBeforeTime(value: String): Self = StObject.set(x, "validBeforeTime", value.asInstanceOf[js.Any])
    
    inline def setValidBeforeTimeUndefined: Self = StObject.set(x, "validBeforeTime", js.undefined)
  }
}
