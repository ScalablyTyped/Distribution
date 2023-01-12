package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.Position
import typings.overlayscrollbars.mod._Coordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait L
  extends StObject
     with _Coordinates {
  
  var l: js.UndefOr[Position] = js.undefined
  
  var t: js.UndefOr[Position] = js.undefined
}
object L {
  
  inline def apply(): L = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[L]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: L] (val x: Self) extends AnyVal {
    
    inline def setL(value: Position): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setLUndefined: Self = StObject.set(x, "l", js.undefined)
    
    inline def setT(value: Position): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
  }
}
