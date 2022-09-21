package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreventCancel extends StObject {
  
  var preventCancel: js.UndefOr[Boolean] = js.undefined
}
object PreventCancel {
  
  inline def apply(): PreventCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreventCancel]
  }
  
  extension [Self <: PreventCancel](x: Self) {
    
    inline def setPreventCancel(value: Boolean): Self = StObject.set(x, "preventCancel", value.asInstanceOf[js.Any])
    
    inline def setPreventCancelUndefined: Self = StObject.set(x, "preventCancel", js.undefined)
  }
}
