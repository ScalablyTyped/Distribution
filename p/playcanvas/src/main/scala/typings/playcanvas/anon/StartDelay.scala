package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDelay extends StObject {
  
  var startDelay: js.UndefOr[Double] = js.undefined
  
  var strongMagnitude: js.UndefOr[Double] = js.undefined
  
  var weakMagnitude: js.UndefOr[Double] = js.undefined
}
object StartDelay {
  
  inline def apply(): StartDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDelay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDelay] (val x: Self) extends AnyVal {
    
    inline def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
    
    inline def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
    
    inline def setStrongMagnitude(value: Double): Self = StObject.set(x, "strongMagnitude", value.asInstanceOf[js.Any])
    
    inline def setStrongMagnitudeUndefined: Self = StObject.set(x, "strongMagnitude", js.undefined)
    
    inline def setWeakMagnitude(value: Double): Self = StObject.set(x, "weakMagnitude", value.asInstanceOf[js.Any])
    
    inline def setWeakMagnitudeUndefined: Self = StObject.set(x, "weakMagnitude", js.undefined)
  }
}
