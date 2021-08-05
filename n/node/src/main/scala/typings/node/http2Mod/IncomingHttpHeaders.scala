package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingHttpHeaders
  extends StObject
     with typings.node.httpMod.IncomingHttpHeaders {
  
  @JSName(":authority")
  var Colonauthority: js.UndefOr[String] = js.undefined
  
  @JSName(":method")
  var Colonmethod: js.UndefOr[String] = js.undefined
  
  @JSName(":path")
  var Colonpath: js.UndefOr[String] = js.undefined
  
  @JSName(":scheme")
  var Colonscheme: js.UndefOr[String] = js.undefined
}
object IncomingHttpHeaders {
  
  inline def apply(): IncomingHttpHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncomingHttpHeaders]
  }
  
  extension [Self <: IncomingHttpHeaders](x: Self) {
    
    inline def setColonauthority(value: String): Self = StObject.set(x, ":authority", value.asInstanceOf[js.Any])
    
    inline def setColonauthorityUndefined: Self = StObject.set(x, ":authority", js.undefined)
    
    inline def setColonmethod(value: String): Self = StObject.set(x, ":method", value.asInstanceOf[js.Any])
    
    inline def setColonmethodUndefined: Self = StObject.set(x, ":method", js.undefined)
    
    inline def setColonpath(value: String): Self = StObject.set(x, ":path", value.asInstanceOf[js.Any])
    
    inline def setColonpathUndefined: Self = StObject.set(x, ":path", js.undefined)
    
    inline def setColonscheme(value: String): Self = StObject.set(x, ":scheme", value.asInstanceOf[js.Any])
    
    inline def setColonschemeUndefined: Self = StObject.set(x, ":scheme", js.undefined)
  }
}
