package typings.nivoGenerators.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryCount extends StObject {
  
  var categoryCount: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
}
object CategoryCount {
  
  inline def apply(): CategoryCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoryCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoryCount] (val x: Self) extends AnyVal {
    
    inline def setCategoryCount(value: Double): Self = StObject.set(x, "categoryCount", value.asInstanceOf[js.Any])
    
    inline def setCategoryCountUndefined: Self = StObject.set(x, "categoryCount", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
