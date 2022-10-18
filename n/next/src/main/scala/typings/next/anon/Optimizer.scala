package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Optimizer extends StObject {
  
  var optimizer: js.UndefOr[Any] = js.undefined
  
  var skipValidation: js.UndefOr[Boolean] = js.undefined
  
  var validator: js.UndefOr[String] = js.undefined
}
object Optimizer {
  
  inline def apply(): Optimizer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optimizer]
  }
  
  extension [Self <: Optimizer](x: Self) {
    
    inline def setOptimizer(value: Any): Self = StObject.set(x, "optimizer", value.asInstanceOf[js.Any])
    
    inline def setOptimizerUndefined: Self = StObject.set(x, "optimizer", js.undefined)
    
    inline def setSkipValidation(value: Boolean): Self = StObject.set(x, "skipValidation", value.asInstanceOf[js.Any])
    
    inline def setSkipValidationUndefined: Self = StObject.set(x, "skipValidation", js.undefined)
    
    inline def setValidator(value: String): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
