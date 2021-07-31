package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  var attributes: js.UndefOr[js.Any] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var ind: js.UndefOr[Double] = js.undefined
  
  var preloading: js.UndefOr[Boolean] = js.undefined
}
object Enabled {
  
  @scala.inline
  def apply(): Enabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enabled]
  }
  
  @scala.inline
  implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setInd(value: Double): Self = StObject.set(x, "ind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndUndefined: Self = StObject.set(x, "ind", js.undefined)
    
    @scala.inline
    def setPreloading(value: Boolean): Self = StObject.set(x, "preloading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadingUndefined: Self = StObject.set(x, "preloading", js.undefined)
  }
}
