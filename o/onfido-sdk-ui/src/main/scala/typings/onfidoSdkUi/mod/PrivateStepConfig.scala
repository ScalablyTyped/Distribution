package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateStepConfig extends StObject {
  
  var skip: js.UndefOr[Boolean] = js.undefined
}
object PrivateStepConfig {
  
  inline def apply(): PrivateStepConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateStepConfig]
  }
  
  extension [Self <: PrivateStepConfig](x: Self) {
    
    inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
  }
}
