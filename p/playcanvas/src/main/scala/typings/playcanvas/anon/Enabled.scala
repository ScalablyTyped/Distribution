package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  var attributes: js.UndefOr[js.Object] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var ind: js.UndefOr[Double] = js.undefined
  
  var preloading: js.UndefOr[Boolean] = js.undefined
}
object Enabled {
  
  inline def apply(): Enabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setInd(value: Double): Self = StObject.set(x, "ind", value.asInstanceOf[js.Any])
    
    inline def setIndUndefined: Self = StObject.set(x, "ind", js.undefined)
    
    inline def setPreloading(value: Boolean): Self = StObject.set(x, "preloading", value.asInstanceOf[js.Any])
    
    inline def setPreloadingUndefined: Self = StObject.set(x, "preloading", js.undefined)
  }
}
