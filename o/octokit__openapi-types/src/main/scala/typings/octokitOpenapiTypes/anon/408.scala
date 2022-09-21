package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `408` extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object `408` {
  
  inline def apply(): `408` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`408`]
  }
  
  extension [Self <: `408`](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
