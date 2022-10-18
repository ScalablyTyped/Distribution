package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reason extends StObject {
  
  /**
    * Actual number of items.
    */
  var actual: js.UndefOr[int] = js.undefined
  
  /**
    * The reason of the update, e.g. Binding, Filter, Sort, Growing, Change, Refresh, Context.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The total count of bound items. This can be used if the `growing` property is set to `true`.
    */
  var total: js.UndefOr[int] = js.undefined
}
object Reason {
  
  inline def apply(): Reason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reason]
  }
  
  extension [Self <: Reason](x: Self) {
    
    inline def setActual(value: int): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setTotal(value: int): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
