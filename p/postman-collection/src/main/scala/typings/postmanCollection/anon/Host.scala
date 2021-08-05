package typings.postmanCollection.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Host extends StObject {
  
  var host: String
  
  var path: RegExp
  
  var protocols: js.Array[String]
}
object Host {
  
  inline def apply(host: String, path: RegExp, protocols: js.Array[String]): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
  
  extension [Self <: Host](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPath(value: RegExp): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value :_*))
  }
}
