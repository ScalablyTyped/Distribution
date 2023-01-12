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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrivateStepConfig] (val x: Self) extends AnyVal {
    
    inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
  }
}
