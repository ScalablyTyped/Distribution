package typings.nivoCore.mod

import typings.nivoCore.anon.Dictkey
import typings.nivoCore.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SvgDefsAndFill[T] extends StObject {
  
  var defs: js.UndefOr[js.Array[Dictkey]] = js.undefined
  
  var fill: js.UndefOr[js.Array[Id[T]]] = js.undefined
}
object SvgDefsAndFill {
  
  inline def apply[T](): SvgDefsAndFill[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgDefsAndFill[T]]
  }
  
  extension [Self <: SvgDefsAndFill[?], T](x: Self & SvgDefsAndFill[T]) {
    
    inline def setDefs(value: js.Array[Dictkey]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
    
    inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
    
    inline def setDefsVarargs(value: Dictkey*): Self = StObject.set(x, "defs", js.Array(value*))
    
    inline def setFill(value: js.Array[Id[T]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFillVarargs(value: Id[T]*): Self = StObject.set(x, "fill", js.Array(value*))
  }
}
