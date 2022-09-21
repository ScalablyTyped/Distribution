package typings.mixto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mixto {
  
  trait IMixinStatic extends StObject {
    
    def extend(`object`: Any): Unit
    
    def includeInto(constructor: Any): Unit
  }
  object IMixinStatic {
    
    inline def apply(extend: Any => Unit, includeInto: Any => Unit): IMixinStatic = {
      val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), includeInto = js.Any.fromFunction1(includeInto))
      __obj.asInstanceOf[IMixinStatic]
    }
    
    extension [Self <: IMixinStatic](x: Self) {
      
      inline def setExtend(value: Any => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
      
      inline def setIncludeInto(value: Any => Unit): Self = StObject.set(x, "includeInto", js.Any.fromFunction1(value))
    }
  }
}
