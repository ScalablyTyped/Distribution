package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OmaSettingString
  extends StObject
     with OmaSetting {
  
  // Value.
  var value: js.UndefOr[String] = js.undefined
}
object OmaSettingString {
  
  inline def apply(): OmaSettingString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSettingString]
  }
  
  extension [Self <: OmaSettingString](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
