package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HedgeOptions extends StObject {
  
  /** Explicitly enable or disable hedged reads. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object HedgeOptions {
  
  inline def apply(): HedgeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HedgeOptions]
  }
  
  extension [Self <: HedgeOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
