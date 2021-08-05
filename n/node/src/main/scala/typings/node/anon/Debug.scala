package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Debug extends StObject {
  
  var debug: Boolean
  
  var inspector: Boolean
  
  var ipv6: Boolean
  
  var tls: Boolean
  
  var tls_alpn: Boolean
  
  var tls_ocsp: Boolean
  
  var tls_sni: Boolean
  
  var uv: Boolean
}
object Debug {
  
  inline def apply(
    debug: Boolean,
    inspector: Boolean,
    ipv6: Boolean,
    tls: Boolean,
    tls_alpn: Boolean,
    tls_ocsp: Boolean,
    tls_sni: Boolean,
    uv: Boolean
  ): Debug = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], inspector = inspector.asInstanceOf[js.Any], ipv6 = ipv6.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any], tls_alpn = tls_alpn.asInstanceOf[js.Any], tls_ocsp = tls_ocsp.asInstanceOf[js.Any], tls_sni = tls_sni.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Debug]
  }
  
  extension [Self <: Debug](x: Self) {
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setInspector(value: Boolean): Self = StObject.set(x, "inspector", value.asInstanceOf[js.Any])
    
    inline def setIpv6(value: Boolean): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
    
    inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTls_alpn(value: Boolean): Self = StObject.set(x, "tls_alpn", value.asInstanceOf[js.Any])
    
    inline def setTls_ocsp(value: Boolean): Self = StObject.set(x, "tls_ocsp", value.asInstanceOf[js.Any])
    
    inline def setTls_sni(value: Boolean): Self = StObject.set(x, "tls_sni", value.asInstanceOf[js.Any])
    
    inline def setUv(value: Boolean): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
  }
}
