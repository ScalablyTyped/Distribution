package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activehooks extends StObject {
  
  var active_hooks: js.UndefOr[Double] = js.undefined
  
  var inactive_hooks: js.UndefOr[Double] = js.undefined
  
  var total_hooks: js.UndefOr[Double] = js.undefined
}
object Activehooks {
  
  inline def apply(): Activehooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activehooks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Activehooks] (val x: Self) extends AnyVal {
    
    inline def setActive_hooks(value: Double): Self = StObject.set(x, "active_hooks", value.asInstanceOf[js.Any])
    
    inline def setActive_hooksUndefined: Self = StObject.set(x, "active_hooks", js.undefined)
    
    inline def setInactive_hooks(value: Double): Self = StObject.set(x, "inactive_hooks", value.asInstanceOf[js.Any])
    
    inline def setInactive_hooksUndefined: Self = StObject.set(x, "inactive_hooks", js.undefined)
    
    inline def setTotal_hooks(value: Double): Self = StObject.set(x, "total_hooks", value.asInstanceOf[js.Any])
    
    inline def setTotal_hooksUndefined: Self = StObject.set(x, "total_hooks", js.undefined)
  }
}
