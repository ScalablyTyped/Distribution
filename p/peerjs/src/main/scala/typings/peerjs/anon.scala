package typings.peerjs

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Chrome extends StObject {
    
    var Chrome: Double
    
    var chrome: Double
  }
  object Chrome {
    
    inline def apply(Chrome: Double, chrome: Double): Chrome = {
      val __obj = js.Dynamic.literal(Chrome = Chrome.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chrome]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Chrome] (val x: Self) extends AnyVal {
      
      inline def setChrome(value: Double): Self = StObject.set(x, "Chrome", value.asInstanceOf[js.Any])
    }
  }
  
  trait Credential extends StObject {
    
    var credential: Unit
    
    var urls: String
    
    var username: Unit
  }
  object Credential {
    
    inline def apply(credential: Unit, urls: String, username: Unit): Credential = {
      val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credential]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Credential] (val x: Self) extends AnyVal {
      
      inline def setCredential(value: Unit): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setUrls(value: String): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: Unit): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var __peerData: Double
    
    var data: Blob
    
    var n: Double
    
    var total: Double
  }
  object Data {
    
    inline def apply(__peerData: Double, data: Blob, n: Double, total: Double): Data = {
      val __obj = js.Dynamic.literal(__peerData = __peerData.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: Blob): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def set__peerData(value: Double): Self = StObject.set(x, "__peerData", value.asInstanceOf[js.Any])
    }
  }
  
  trait IceServers extends StObject {
    
    var iceServers: js.Array[Credential | Urls]
    
    var sdpSemantics: String
  }
  object IceServers {
    
    inline def apply(iceServers: js.Array[Credential | Urls], sdpSemantics: String): IceServers = {
      val __obj = js.Dynamic.literal(iceServers = iceServers.asInstanceOf[js.Any], sdpSemantics = sdpSemantics.asInstanceOf[js.Any])
      __obj.asInstanceOf[IceServers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IceServers] (val x: Self) extends AnyVal {
      
      inline def setIceServers(value: js.Array[Credential | Urls]): Self = StObject.set(x, "iceServers", value.asInstanceOf[js.Any])
      
      inline def setIceServersVarargs(value: (Credential | Urls)*): Self = StObject.set(x, "iceServers", js.Array(value*))
      
      inline def setSdpSemantics(value: String): Self = StObject.set(x, "sdpSemantics", value.asInstanceOf[js.Any])
    }
  }
  
  trait Urls extends StObject {
    
    var credential: String
    
    var urls: js.Array[String]
    
    var username: String
  }
  object Urls {
    
    inline def apply(credential: String, urls: js.Array[String], username: String): Urls = {
      val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Urls]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Urls] (val x: Self) extends AnyVal {
      
      inline def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
