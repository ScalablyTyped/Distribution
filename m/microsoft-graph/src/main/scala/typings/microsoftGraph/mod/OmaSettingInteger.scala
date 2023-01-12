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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmaSettingInteger] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
