package typings.ntlmClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Buffer extends StObject {
    
    var buffer: typings.node.Buffer
    
    var parsed: DNS
  }
  object Buffer {
    
    @scala.inline
    def apply(buffer: typings.node.Buffer, parsed: DNS): Buffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffer]
    }
    
    @scala.inline
    implicit class BufferMutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: typings.node.Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsed(value: DNS): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(DNS: String, DOMAIN: String, FQDN: String, PARENT_DNS: String, SERVER: String): DNS = {
      val __obj = js.Dynamic.literal(DNS = DNS.asInstanceOf[js.Any], DOMAIN = DOMAIN.asInstanceOf[js.Any], FQDN = FQDN.asInstanceOf[js.Any], PARENT_DNS = PARENT_DNS.asInstanceOf[js.Any], SERVER = SERVER.asInstanceOf[js.Any])
      __obj.asInstanceOf[DNS]
    }
    
    @scala.inline
    implicit class DNSMutableBuilder[Self <: DNS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDNS(value: String): Self = StObject.set(x, "DNS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDOMAIN(value: String): Self = StObject.set(x, "DOMAIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFQDN(value: String): Self = StObject.set(x, "FQDN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPARENT_DNS(value: String): Self = StObject.set(x, "PARENT_DNS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSERVER(value: String): Self = StObject.set(x, "SERVER", value.asInstanceOf[js.Any])
    }
  }
}
