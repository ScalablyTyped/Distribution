package typings.nivoChord.anon

import typings.nivoChord.distTypesTypesMod.RibbonDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveArcOpacity extends StObject {
  
  var activeArcOpacity: js.UndefOr[Double] = js.undefined
  
  var activeRibbonOpacity: js.UndefOr[Double] = js.undefined
  
  var arcOpacity: js.UndefOr[Double] = js.undefined
  
  var inactiveArcOpacity: js.UndefOr[Double] = js.undefined
  
  var inactiveRibbonOpacity: js.UndefOr[Double] = js.undefined
  
  var ribbonOpacity: js.UndefOr[Double] = js.undefined
  
  var ribbons: js.Array[RibbonDatum]
}
object ActiveArcOpacity {
  
  inline def apply(ribbons: js.Array[RibbonDatum]): ActiveArcOpacity = {
    val __obj = js.Dynamic.literal(ribbons = ribbons.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveArcOpacity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveArcOpacity] (val x: Self) extends AnyVal {
    
    inline def setActiveArcOpacity(value: Double): Self = StObject.set(x, "activeArcOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveArcOpacityUndefined: Self = StObject.set(x, "activeArcOpacity", js.undefined)
    
    inline def setActiveRibbonOpacity(value: Double): Self = StObject.set(x, "activeRibbonOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveRibbonOpacityUndefined: Self = StObject.set(x, "activeRibbonOpacity", js.undefined)
    
    inline def setArcOpacity(value: Double): Self = StObject.set(x, "arcOpacity", value.asInstanceOf[js.Any])
    
    inline def setArcOpacityUndefined: Self = StObject.set(x, "arcOpacity", js.undefined)
    
    inline def setInactiveArcOpacity(value: Double): Self = StObject.set(x, "inactiveArcOpacity", value.asInstanceOf[js.Any])
    
    inline def setInactiveArcOpacityUndefined: Self = StObject.set(x, "inactiveArcOpacity", js.undefined)
    
    inline def setInactiveRibbonOpacity(value: Double): Self = StObject.set(x, "inactiveRibbonOpacity", value.asInstanceOf[js.Any])
    
    inline def setInactiveRibbonOpacityUndefined: Self = StObject.set(x, "inactiveRibbonOpacity", js.undefined)
    
    inline def setRibbonOpacity(value: Double): Self = StObject.set(x, "ribbonOpacity", value.asInstanceOf[js.Any])
    
    inline def setRibbonOpacityUndefined: Self = StObject.set(x, "ribbonOpacity", js.undefined)
    
    inline def setRibbons(value: js.Array[RibbonDatum]): Self = StObject.set(x, "ribbons", value.asInstanceOf[js.Any])
    
    inline def setRibbonsVarargs(value: RibbonDatum*): Self = StObject.set(x, "ribbons", js.Array(value*))
  }
}
