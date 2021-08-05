package typings.overlayscrollbars.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I extends StObject {
  
  var i: Boolean
  
  var n: Boolean
}
object I {
  
  inline def apply(i: Boolean, n: Boolean): I = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[I]
  }
  
  extension [Self <: I](x: Self) {
    
    inline def setI(value: Boolean): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    inline def setN(value: Boolean): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
