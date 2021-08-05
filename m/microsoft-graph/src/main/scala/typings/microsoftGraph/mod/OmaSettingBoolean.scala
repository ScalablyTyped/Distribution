package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OmaSettingBoolean
  extends StObject
     with OmaSetting {
  
  // Value.
  var value: js.UndefOr[Boolean] = js.undefined
}
object OmaSettingBoolean {
  
  inline def apply(): OmaSettingBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSettingBoolean]
  }
  
  extension [Self <: OmaSettingBoolean](x: Self) {
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
