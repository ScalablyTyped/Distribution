package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OmaSettingInteger
  extends StObject
     with OmaSetting {
  
  // Value.
  var value: js.UndefOr[Double] = js.undefined
}
object OmaSettingInteger {
  
  inline def apply(): OmaSettingInteger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSettingInteger]
  }
  
  extension [Self <: OmaSettingInteger](x: Self) {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
