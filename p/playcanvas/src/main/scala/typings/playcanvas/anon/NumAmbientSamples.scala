package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumAmbientSamples extends StObject {
  
  var numAmbientSamples: js.UndefOr[Double] = js.undefined
  
  var numReflectionSamples: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var target: js.UndefOr[typings.playcanvas.mod.Texture] = js.undefined
}
object NumAmbientSamples {
  
  inline def apply(): NumAmbientSamples = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumAmbientSamples]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumAmbientSamples] (val x: Self) extends AnyVal {
    
    inline def setNumAmbientSamples(value: Double): Self = StObject.set(x, "numAmbientSamples", value.asInstanceOf[js.Any])
    
    inline def setNumAmbientSamplesUndefined: Self = StObject.set(x, "numAmbientSamples", js.undefined)
    
    inline def setNumReflectionSamples(value: Double): Self = StObject.set(x, "numReflectionSamples", value.asInstanceOf[js.Any])
    
    inline def setNumReflectionSamplesUndefined: Self = StObject.set(x, "numReflectionSamples", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTarget(value: typings.playcanvas.mod.Texture): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
