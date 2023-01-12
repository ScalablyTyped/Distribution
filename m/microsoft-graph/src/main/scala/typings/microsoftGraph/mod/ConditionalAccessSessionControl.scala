package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessSessionControl extends StObject {
  
  // Specifies whether the session control is enabled.
  var isEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object ConditionalAccessSessionControl {
  
  inline def apply(): ConditionalAccessSessionControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessSessionControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalAccessSessionControl] (val x: Self) extends AnyVal {
    
    inline def setIsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledNull: Self = StObject.set(x, "isEnabled", null)
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
  }
}
