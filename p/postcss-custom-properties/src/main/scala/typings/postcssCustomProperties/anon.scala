package typings.postcssCustomProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Preserve extends StObject {
    
    var preserve: js.UndefOr[Boolean] = js.undefined
  }
  object Preserve {
    
    inline def apply(): Preserve = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Preserve]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Preserve] (val x: Self) extends AnyVal {
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
    }
  }
}
