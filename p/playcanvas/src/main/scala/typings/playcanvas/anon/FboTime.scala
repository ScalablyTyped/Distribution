package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FboTime extends StObject {
  
  var compileTime: Double
  
  var fboTime: Double
  
  var forwardTime: Double
  
  var lightmapCount: Double
  
  var renderPasses: Double
  
  var shadersLinked: Double
  
  var shadowMapTime: Double
  
  var totalRenderTime: Double
}
object FboTime {
  
  inline def apply(
    compileTime: Double,
    fboTime: Double,
    forwardTime: Double,
    lightmapCount: Double,
    renderPasses: Double,
    shadersLinked: Double,
    shadowMapTime: Double,
    totalRenderTime: Double
  ): FboTime = {
    val __obj = js.Dynamic.literal(compileTime = compileTime.asInstanceOf[js.Any], fboTime = fboTime.asInstanceOf[js.Any], forwardTime = forwardTime.asInstanceOf[js.Any], lightmapCount = lightmapCount.asInstanceOf[js.Any], renderPasses = renderPasses.asInstanceOf[js.Any], shadersLinked = shadersLinked.asInstanceOf[js.Any], shadowMapTime = shadowMapTime.asInstanceOf[js.Any], totalRenderTime = totalRenderTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FboTime]
  }
  
  extension [Self <: FboTime](x: Self) {
    
    inline def setCompileTime(value: Double): Self = StObject.set(x, "compileTime", value.asInstanceOf[js.Any])
    
    inline def setFboTime(value: Double): Self = StObject.set(x, "fboTime", value.asInstanceOf[js.Any])
    
    inline def setForwardTime(value: Double): Self = StObject.set(x, "forwardTime", value.asInstanceOf[js.Any])
    
    inline def setLightmapCount(value: Double): Self = StObject.set(x, "lightmapCount", value.asInstanceOf[js.Any])
    
    inline def setRenderPasses(value: Double): Self = StObject.set(x, "renderPasses", value.asInstanceOf[js.Any])
    
    inline def setShadersLinked(value: Double): Self = StObject.set(x, "shadersLinked", value.asInstanceOf[js.Any])
    
    inline def setShadowMapTime(value: Double): Self = StObject.set(x, "shadowMapTime", value.asInstanceOf[js.Any])
    
    inline def setTotalRenderTime(value: Double): Self = StObject.set(x, "totalRenderTime", value.asInstanceOf[js.Any])
  }
}
