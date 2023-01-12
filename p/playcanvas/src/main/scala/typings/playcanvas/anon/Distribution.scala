package typings.playcanvas.anon

import typings.playcanvas.mod.Vec4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distribution extends StObject {
  
  var distribution: js.UndefOr[String] = js.undefined
  
  var face: js.UndefOr[Double] = js.undefined
  
  var numSamples: js.UndefOr[Double] = js.undefined
  
  var rect: js.UndefOr[Vec4] = js.undefined
  
  var seamPixels: js.UndefOr[Double] = js.undefined
  
  var specularPower: js.UndefOr[Double] = js.undefined
}
object Distribution {
  
  inline def apply(): Distribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Distribution] (val x: Self) extends AnyVal {
    
    inline def setDistribution(value: String): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    inline def setFace(value: Double): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    inline def setFaceUndefined: Self = StObject.set(x, "face", js.undefined)
    
    inline def setNumSamples(value: Double): Self = StObject.set(x, "numSamples", value.asInstanceOf[js.Any])
    
    inline def setNumSamplesUndefined: Self = StObject.set(x, "numSamples", js.undefined)
    
    inline def setRect(value: Vec4): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    inline def setSeamPixels(value: Double): Self = StObject.set(x, "seamPixels", value.asInstanceOf[js.Any])
    
    inline def setSeamPixelsUndefined: Self = StObject.set(x, "seamPixels", js.undefined)
    
    inline def setSpecularPower(value: Double): Self = StObject.set(x, "specularPower", value.asInstanceOf[js.Any])
    
    inline def setSpecularPowerUndefined: Self = StObject.set(x, "specularPower", js.undefined)
  }
}
