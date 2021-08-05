package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.undefined
}
object PopoverOptions {
  
  inline def apply(): PopoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverOptions]
  }
  
  extension [Self <: PopoverOptions](x: Self) {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
  }
}
