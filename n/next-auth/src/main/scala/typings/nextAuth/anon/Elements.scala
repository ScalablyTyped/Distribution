package typings.nextAuth.anon

import typings.nextAuth.providersLinkedinMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elements extends StObject {
  
  var elements: js.UndefOr[js.Array[Element]] = js.undefined
}
object Elements {
  
  inline def apply(): Elements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Elements]
  }
  
  extension [Self <: Elements](x: Self) {
    
    inline def setElements(value: js.Array[Element]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: Element*): Self = StObject.set(x, "elements", js.Array(value*))
  }
}
