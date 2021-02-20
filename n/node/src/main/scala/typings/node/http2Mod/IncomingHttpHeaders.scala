package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncomingHttpHeaders
  extends typings.node.httpMod.IncomingHttpHeaders {
  
  @JSName(":authority")
  var Colonauthority: js.UndefOr[String] = js.native
  
  @JSName(":method")
  var Colonmethod: js.UndefOr[String] = js.native
  
  @JSName(":path")
  var Colonpath: js.UndefOr[String] = js.native
  
  @JSName(":scheme")
  var Colonscheme: js.UndefOr[String] = js.native
}
object IncomingHttpHeaders {
  
  @scala.inline
  def apply(): IncomingHttpHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncomingHttpHeaders]
  }
  
  @scala.inline
  implicit class IncomingHttpHeadersMutableBuilder[Self <: IncomingHttpHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColonauthority(value: String): Self = StObject.set(x, ":authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColonauthorityUndefined: Self = StObject.set(x, ":authority", js.undefined)
    
    @scala.inline
    def setColonmethod(value: String): Self = StObject.set(x, ":method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColonmethodUndefined: Self = StObject.set(x, ":method", js.undefined)
    
    @scala.inline
    def setColonpath(value: String): Self = StObject.set(x, ":path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColonpathUndefined: Self = StObject.set(x, ":path", js.undefined)
    
    @scala.inline
    def setColonscheme(value: String): Self = StObject.set(x, ":scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColonschemeUndefined: Self = StObject.set(x, ":scheme", js.undefined)
  }
}
