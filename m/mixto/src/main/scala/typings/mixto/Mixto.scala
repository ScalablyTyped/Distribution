package typings.mixto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mixto {
  
  trait IMixinStatic extends StObject {
    
    def extend(`object`: js.Any): Unit
    
    def includeInto(constructor: js.Any): Unit
  }
  object IMixinStatic {
    
    @scala.inline
    def apply(extend: js.Any => Unit, includeInto: js.Any => Unit): IMixinStatic = {
      val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), includeInto = js.Any.fromFunction1(includeInto))
      __obj.asInstanceOf[IMixinStatic]
    }
    
    @scala.inline
    implicit class IMixinStaticMutableBuilder[Self <: IMixinStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtend(value: js.Any => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIncludeInto(value: js.Any => Unit): Self = StObject.set(x, "includeInto", js.Any.fromFunction1(value))
    }
  }
}
