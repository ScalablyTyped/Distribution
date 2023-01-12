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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HedgeOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
