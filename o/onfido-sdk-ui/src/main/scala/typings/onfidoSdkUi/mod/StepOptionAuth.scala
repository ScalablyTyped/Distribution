package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepOptionAuth extends StObject {
  
  var retries: js.UndefOr[Double] = js.undefined
}
object StepOptionAuth {
  
  inline def apply(): StepOptionAuth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOptionAuth]
  }
  
  extension [Self <: StepOptionAuth](x: Self) {
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
  }
}
