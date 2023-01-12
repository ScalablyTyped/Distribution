package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actual extends StObject {
  
  /**
    * Actual number of items.
    */
  var actual: js.UndefOr[int] = js.undefined
  
  /**
    * Total number of items.
    */
  var total: js.UndefOr[int] = js.undefined
}
object Actual {
  
  inline def apply(): Actual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actual] (val x: Self) extends AnyVal {
    
    inline def setActual(value: int): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
    
    inline def setTotal(value: int): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
