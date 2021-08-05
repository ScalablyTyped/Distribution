package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Onselect extends StObject {
  
  var onselect: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object Onselect {
  
  inline def apply(): Onselect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Onselect]
  }
  
  extension [Self <: Onselect](x: Self) {
    
    inline def setOnselect(value: () => Unit): Self = StObject.set(x, "onselect", js.Any.fromFunction0(value))
    
    inline def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
  }
}
