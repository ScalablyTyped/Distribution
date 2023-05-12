package typings.mongodbClientEncryption.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GCPEncryptionKeyOptions extends StObject {
  
  /**
    * KMS URL, defaults to `https://www.googleapis.com/auth/cloudkms`
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * Key name
    */
  var keyName: String
  
  /**
    * Key ring name
    */
  var keyRing: String
  
  /**
    * Key version
    */
  var keyVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Location name (e.g. "global")
    */
  var location: String
  
  /**
    * GCP project ID
    */
  var projectId: String
}
object GCPEncryptionKeyOptions {
  
  inline def apply(keyName: String, keyRing: String, location: String, projectId: String): GCPEncryptionKeyOptions = {
    val __obj = js.Dynamic.literal(keyName = keyName.asInstanceOf[js.Any], keyRing = keyRing.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GCPEncryptionKeyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GCPEncryptionKeyOptions] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setKeyRing(value: String): Self = StObject.set(x, "keyRing", value.asInstanceOf[js.Any])
    
    inline def setKeyVersion(value: String): Self = StObject.set(x, "keyVersion", value.asInstanceOf[js.Any])
    
    inline def setKeyVersionUndefined: Self = StObject.set(x, "keyVersion", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
