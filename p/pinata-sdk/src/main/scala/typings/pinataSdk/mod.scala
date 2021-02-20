package typings.pinataSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pinata-sdk", "configure")
  @js.native
  def configure(apiKey: String, privateApiKey: String): PinataConfig = js.native
  @JSImport("pinata-sdk", "configure")
  @js.native
  def configure(apiKey: String, privateApiKey: String, apiURL: String): PinataConfig = js.native
  
  @JSImport("pinata-sdk", "pinHashToIPFS")
  @js.native
  def pinHashToIPFS(config: PinataConfig, hash: String): js.Promise[PinHashToIPFSResponseJS] = js.native
  
  @js.native
  trait PinHashToIPFSResponseJS extends StObject {
    
    var ipfsHash: String = js.native
  }
  object PinHashToIPFSResponseJS {
    
    @scala.inline
    def apply(ipfsHash: String): PinHashToIPFSResponseJS = {
      val __obj = js.Dynamic.literal(ipfsHash = ipfsHash.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinHashToIPFSResponseJS]
    }
    
    @scala.inline
    implicit class PinHashToIPFSResponseJSMutableBuilder[Self <: PinHashToIPFSResponseJS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIpfsHash(value: String): Self = StObject.set(x, "ipfsHash", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PinataConfig extends StObject {
    
    var apiKey: String = js.native
    
    var apiURL: String = js.native
    
    var privateApiKey: String = js.native
  }
  object PinataConfig {
    
    @scala.inline
    def apply(apiKey: String, apiURL: String, privateApiKey: String): PinataConfig = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], apiURL = apiURL.asInstanceOf[js.Any], privateApiKey = privateApiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinataConfig]
    }
    
    @scala.inline
    implicit class PinataConfigMutableBuilder[Self <: PinataConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiURL(value: String): Self = StObject.set(x, "apiURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateApiKey(value: String): Self = StObject.set(x, "privateApiKey", value.asInstanceOf[js.Any])
    }
  }
}
