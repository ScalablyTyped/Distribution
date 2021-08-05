package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCustomObjectFormatterEnabledParameterType extends StObject {
  
  var enabled: Boolean
}
object SetCustomObjectFormatterEnabledParameterType {
  
  inline def apply(enabled: Boolean): SetCustomObjectFormatterEnabledParameterType = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCustomObjectFormatterEnabledParameterType]
  }
  
  extension [Self <: SetCustomObjectFormatterEnabledParameterType](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
