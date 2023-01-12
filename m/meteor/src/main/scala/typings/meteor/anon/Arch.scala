package typings.meteor.anon

import typings.meteor.meteorStrings.webDotbrowser
import typings.meteor.meteorStrings.webDotbrowserDotlegacy
import typings.meteor.meteorStrings.webDotcordova
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arch extends StObject {
  
  var arch: webDotbrowser | webDotbrowserDotlegacy | webDotcordova
  
  var encodedCurrentConfig: String
  
  var request: IncomingMessage
  
  var updated: Boolean
}
object Arch {
  
  inline def apply(
    arch: webDotbrowser | webDotbrowserDotlegacy | webDotcordova,
    encodedCurrentConfig: String,
    request: IncomingMessage,
    updated: Boolean
  ): Arch = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], encodedCurrentConfig = encodedCurrentConfig.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arch] (val x: Self) extends AnyVal {
    
    inline def setArch(value: webDotbrowser | webDotbrowserDotlegacy | webDotcordova): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setEncodedCurrentConfig(value: String): Self = StObject.set(x, "encodedCurrentConfig", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IncomingMessage): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: Boolean): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
