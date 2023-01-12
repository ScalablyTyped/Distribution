package typings.multiaddr

import typings.multiaddr.multiaddrInts.`4`
import typings.multiaddr.multiaddrInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  trait MultiaddrObject extends StObject {
    
    var family: `4` | `6`
    
    var host: String
    
    var port: Double
    
    var transport: String
  }
  object MultiaddrObject {
    
    inline def apply(family: `4` | `6`, host: String, port: Double, transport: String): MultiaddrObject = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiaddrObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiaddrObject] (val x: Self) extends AnyVal {
      
      inline def setFamily(value: `4` | `6`): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
  
  trait Protocol extends StObject {
    
    var code: Double
    
    var name: String
    
    var path: js.UndefOr[Boolean] = js.undefined
    
    var resolvable: js.UndefOr[Boolean] = js.undefined
    
    var size: Double
  }
  object Protocol {
    
    inline def apply(code: Double, name: String, size: Double): Protocol = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Protocol]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Protocol] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Boolean): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setResolvable(value: Boolean): Self = StObject.set(x, "resolvable", value.asInstanceOf[js.Any])
      
      inline def setResolvableUndefined: Self = StObject.set(x, "resolvable", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
