package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `388` extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object `388` {
  
  inline def apply(): `388` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`388`]
  }
  
  extension [Self <: `388`](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
