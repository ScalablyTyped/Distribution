package typings.pinataSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pinata-sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configure(apiKey: String, privateApiKey: String): PinataConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(apiKey.asInstanceOf[js.Any], privateApiKey.asInstanceOf[js.Any])).asInstanceOf[PinataConfig]
  inline def configure(apiKey: String, privateApiKey: String, apiURL: String): PinataConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(apiKey.asInstanceOf[js.Any], privateApiKey.asInstanceOf[js.Any], apiURL.asInstanceOf[js.Any])).asInstanceOf[PinataConfig]
  
  inline def pinHashToIPFS(config: PinataConfig, hash: String): js.Promise[PinHashToIPFSResponseJS] = (^.asInstanceOf[js.Dynamic].applyDynamic("pinHashToIPFS")(config.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PinHashToIPFSResponseJS]]
  
  trait PinHashToIPFSResponseJS extends StObject {
    
    var ipfsHash: String
  }
  object PinHashToIPFSResponseJS {
    
    inline def apply(ipfsHash: String): PinHashToIPFSResponseJS = {
      val __obj = js.Dynamic.literal(ipfsHash = ipfsHash.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinHashToIPFSResponseJS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PinHashToIPFSResponseJS] (val x: Self) extends AnyVal {
      
      inline def setIpfsHash(value: String): Self = StObject.set(x, "ipfsHash", value.asInstanceOf[js.Any])
    }
  }
  
  trait PinataConfig extends StObject {
    
    var apiKey: String
    
    var apiURL: String
    
    var privateApiKey: String
  }
  object PinataConfig {
    
    inline def apply(apiKey: String, apiURL: String, privateApiKey: String): PinataConfig = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], apiURL = apiURL.asInstanceOf[js.Any], privateApiKey = privateApiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinataConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PinataConfig] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiURL(value: String): Self = StObject.set(x, "apiURL", value.asInstanceOf[js.Any])
      
      inline def setPrivateApiKey(value: String): Self = StObject.set(x, "privateApiKey", value.asInstanceOf[js.Any])
    }
  }
}
