package typings.postmanCollection.mod

import typings.postmanCollection.anon.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyConfigDefinition
  extends StObject
     with PropertyDefinition {
  
  var host: js.UndefOr[String] = js.undefined
  
  var `match`: js.UndefOr[String | Pattern | UrlMatchPattern] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var tunnel: js.UndefOr[Boolean] = js.undefined
}
object ProxyConfigDefinition {
  
  inline def apply(): ProxyConfigDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyConfigDefinition]
  }
  
  extension [Self <: ProxyConfigDefinition](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setMatch(value: String | Pattern | UrlMatchPattern): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setTunnel(value: Boolean): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
    
    inline def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
  }
}
