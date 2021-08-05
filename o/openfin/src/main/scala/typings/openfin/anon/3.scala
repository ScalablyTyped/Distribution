package typings.openfin.anon

import typings.openfin.GoldenLayout.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var newVal: js.UndefOr[Config] = js.undefined
  
  var oldVal: js.UndefOr[Config] = js.undefined
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setNewVal(value: Config): Self = StObject.set(x, "newVal", value.asInstanceOf[js.Any])
    
    inline def setNewValUndefined: Self = StObject.set(x, "newVal", js.undefined)
    
    inline def setOldVal(value: Config): Self = StObject.set(x, "oldVal", value.asInstanceOf[js.Any])
    
    inline def setOldValUndefined: Self = StObject.set(x, "oldVal", js.undefined)
  }
}
