package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossOriginInjection extends StObject {
  
  var crossOriginInjection: js.UndefOr[Boolean] = js.undefined
  
  var sameOriginInjection: js.UndefOr[Boolean] = js.undefined
}
object CrossOriginInjection {
  
  inline def apply(): CrossOriginInjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossOriginInjection]
  }
  
  extension [Self <: CrossOriginInjection](x: Self) {
    
    inline def setCrossOriginInjection(value: Boolean): Self = StObject.set(x, "crossOriginInjection", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginInjectionUndefined: Self = StObject.set(x, "crossOriginInjection", js.undefined)
    
    inline def setSameOriginInjection(value: Boolean): Self = StObject.set(x, "sameOriginInjection", value.asInstanceOf[js.Any])
    
    inline def setSameOriginInjectionUndefined: Self = StObject.set(x, "sameOriginInjection", js.undefined)
  }
}
