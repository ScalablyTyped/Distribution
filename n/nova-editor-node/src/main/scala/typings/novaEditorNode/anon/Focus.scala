package typings.novaEditorNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focus extends StObject {
  
  var focus: js.UndefOr[Boolean] = js.undefined
  
  var reveal: js.UndefOr[Double] = js.undefined
  
  var select: js.UndefOr[Boolean] = js.undefined
}
object Focus {
  
  inline def apply(): Focus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Focus]
  }
  
  extension [Self <: Focus](x: Self) {
    
    inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setReveal(value: Double): Self = StObject.set(x, "reveal", value.asInstanceOf[js.Any])
    
    inline def setRevealUndefined: Self = StObject.set(x, "reveal", js.undefined)
    
    inline def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
