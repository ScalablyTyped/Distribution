package typings.ntlmClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Buffer extends StObject {
    
    var buffer: typings.node.bufferMod.global.Buffer
    
    var parsed: DNS
  }
  object Buffer {
    
    inline def apply(buffer: typings.node.bufferMod.global.Buffer, parsed: DNS): Buffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: typings.node.bufferMod.global.Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setParsed(value: DNS): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    }
  }
  
  trait DNS extends StObject {
    
    var DNS: String
    
    var DOMAIN: String
    
    var FQDN: String
    
    var PARENT_DNS: String
    
    var SERVER: String
  }
  object DNS {
    
    inline def apply(DNS: String, DOMAIN: String, FQDN: String, PARENT_DNS: String, SERVER: String): DNS = {
      val __obj = js.Dynamic.literal(DNS = DNS.asInstanceOf[js.Any], DOMAIN = DOMAIN.asInstanceOf[js.Any], FQDN = FQDN.asInstanceOf[js.Any], PARENT_DNS = PARENT_DNS.asInstanceOf[js.Any], SERVER = SERVER.asInstanceOf[js.Any])
      __obj.asInstanceOf[DNS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DNS] (val x: Self) extends AnyVal {
      
      inline def setDNS(value: String): Self = StObject.set(x, "DNS", value.asInstanceOf[js.Any])
      
      inline def setDOMAIN(value: String): Self = StObject.set(x, "DOMAIN", value.asInstanceOf[js.Any])
      
      inline def setFQDN(value: String): Self = StObject.set(x, "FQDN", value.asInstanceOf[js.Any])
      
      inline def setPARENT_DNS(value: String): Self = StObject.set(x, "PARENT_DNS", value.asInstanceOf[js.Any])
      
      inline def setSERVER(value: String): Self = StObject.set(x, "SERVER", value.asInstanceOf[js.Any])
    }
  }
}
