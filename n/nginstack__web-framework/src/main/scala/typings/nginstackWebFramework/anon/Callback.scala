package typings.nginstackWebFramework.anon

import typings.nginstackWebFramework.libDsvVisualizationFiltersMod.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  var callback: js.UndefOr[js.Function1[/* arg0 */ Field, Any]] = js.undefined
  
  var datesAsExpressions: js.UndefOr[Boolean] = js.undefined
}
object Callback {
  
  inline def apply(): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callback]
  }
  
  extension [Self <: Callback](x: Self) {
    
    inline def setCallback(value: /* arg0 */ Field => Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDatesAsExpressions(value: Boolean): Self = StObject.set(x, "datesAsExpressions", value.asInstanceOf[js.Any])
    
    inline def setDatesAsExpressionsUndefined: Self = StObject.set(x, "datesAsExpressions", js.undefined)
  }
}
