package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.officeUiFabricReactInts.`12`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionalHint extends StObject {
  
  var beakWidth: Double
  
  var directionalHint: `12`
  
  var doNotLayer: Boolean
  
  var gapSpace: Double
  
  var setInitialFocus: Boolean
}
object DirectionalHint {
  
  inline def apply(beakWidth: Double, doNotLayer: Boolean, gapSpace: Double, setInitialFocus: Boolean): DirectionalHint = {
    val __obj = js.Dynamic.literal(beakWidth = beakWidth.asInstanceOf[js.Any], directionalHint = 12, doNotLayer = doNotLayer.asInstanceOf[js.Any], gapSpace = gapSpace.asInstanceOf[js.Any], setInitialFocus = setInitialFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionalHint]
  }
  
  extension [Self <: DirectionalHint](x: Self) {
    
    inline def setBeakWidth(value: Double): Self = StObject.set(x, "beakWidth", value.asInstanceOf[js.Any])
    
    inline def setDirectionalHint(value: `12`): Self = StObject.set(x, "directionalHint", value.asInstanceOf[js.Any])
    
    inline def setDoNotLayer(value: Boolean): Self = StObject.set(x, "doNotLayer", value.asInstanceOf[js.Any])
    
    inline def setGapSpace(value: Double): Self = StObject.set(x, "gapSpace", value.asInstanceOf[js.Any])
    
    inline def setSetInitialFocus(value: Boolean): Self = StObject.set(x, "setInitialFocus", value.asInstanceOf[js.Any])
  }
}
