package typings.pollyjsPersister

import typings.std.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Blocked extends StObject {
    
    var blocked: Double
    
    var connect: Double
    
    var dns: Double
    
    var receive: Double
    
    var send: Double
    
    var ssl: Double
    
    @JSName("wait")
    var wait_FBlocked: Double
  }
  object Blocked {
    
    inline def apply(
      blocked: Double,
      connect: Double,
      dns: Double,
      receive: Double,
      send: Double,
      ssl: Double,
      wait_ : Double
    ): Blocked = {
      val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], connect = connect.asInstanceOf[js.Any], dns = dns.asInstanceOf[js.Any], receive = receive.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any])
      __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blocked]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Blocked] (val x: Self) extends AnyVal {
      
      inline def setBlocked(value: Double): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
      
      inline def setConnect(value: Double): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setDns(value: Double): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
      
      inline def setReceive(value: Double): Self = StObject.set(x, "receive", value.asInstanceOf[js.Any])
      
      inline def setSend(value: Double): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
      
      inline def setSsl(value: Double): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var mimeType: String
    
    var size: js.UndefOr[Double] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Encoding {
    
    inline def apply(mimeType: String): Encoding = {
      val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait MimeType extends StObject {
    
    var mimeType: String
    
    var params: js.Array[Any]
    
    var text: js.UndefOr[String] = js.undefined
  }
  object MimeType {
    
    inline def apply(mimeType: String, params: js.Array[Any]): MimeType = {
      val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[MimeType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MimeType] (val x: Self) extends AnyVal {
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var recordings: js.Array[Request]
  }
  object Name {
    
    inline def apply(name: String, recordings: js.Array[Request]): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], recordings = recordings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRecordings(value: js.Array[Request]): Self = StObject.set(x, "recordings", value.asInstanceOf[js.Any])
      
      inline def setRecordingsVarargs(value: Request*): Self = StObject.set(x, "recordings", js.Array(value*))
    }
  }
}
