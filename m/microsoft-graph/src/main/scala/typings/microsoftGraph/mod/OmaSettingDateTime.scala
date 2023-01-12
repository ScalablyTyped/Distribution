package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OmaSettingDateTime
  extends StObject
     with OmaSetting {
  
  // Value.
  var value: js.UndefOr[String] = js.undefined
}
object OmaSettingDateTime {
  
  inline def apply(): OmaSettingDateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSettingDateTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmaSettingDateTime] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
