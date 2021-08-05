package typings.popperjsCore.anon

import typings.popperjsCore.typesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reference extends StObject {
  
  var popper: Rect
  
  var reference: Rect
}
object Reference {
  
  inline def apply(popper: Rect, reference: Rect): Reference = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  
  extension [Self <: Reference](x: Self) {
    
    inline def setPopper(value: Rect): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setReference(value: Rect): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
