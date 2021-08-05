package typings.mjmlReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HrefProps extends StObject {
  
  var href: js.UndefOr[String] = js.undefined
  
  var rel: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object HrefProps {
  
  inline def apply(): HrefProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HrefProps]
  }
  
  extension [Self <: HrefProps](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
