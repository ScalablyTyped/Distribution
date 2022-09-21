package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BakedLights extends StObject {
  
  var bakedLights: Double
  
  var dynamicLights: Double
  
  var lastStaticPrepareCombineTime: Double
  
  var lastStaticPrepareFullTime: Double
  
  var lastStaticPrepareSearchTime: Double
  
  var lastStaticPrepareTriAabbTime: Double
  
  var lastStaticPrepareWriteTime: Double
  
  var lights: Double
  
  var meshInstances: Double
  
  var updateShadersTime: Double
}
object BakedLights {
  
  inline def apply(
    bakedLights: Double,
    dynamicLights: Double,
    lastStaticPrepareCombineTime: Double,
    lastStaticPrepareFullTime: Double,
    lastStaticPrepareSearchTime: Double,
    lastStaticPrepareTriAabbTime: Double,
    lastStaticPrepareWriteTime: Double,
    lights: Double,
    meshInstances: Double,
    updateShadersTime: Double
  ): BakedLights = {
    val __obj = js.Dynamic.literal(bakedLights = bakedLights.asInstanceOf[js.Any], dynamicLights = dynamicLights.asInstanceOf[js.Any], lastStaticPrepareCombineTime = lastStaticPrepareCombineTime.asInstanceOf[js.Any], lastStaticPrepareFullTime = lastStaticPrepareFullTime.asInstanceOf[js.Any], lastStaticPrepareSearchTime = lastStaticPrepareSearchTime.asInstanceOf[js.Any], lastStaticPrepareTriAabbTime = lastStaticPrepareTriAabbTime.asInstanceOf[js.Any], lastStaticPrepareWriteTime = lastStaticPrepareWriteTime.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], meshInstances = meshInstances.asInstanceOf[js.Any], updateShadersTime = updateShadersTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BakedLights]
  }
  
  extension [Self <: BakedLights](x: Self) {
    
    inline def setBakedLights(value: Double): Self = StObject.set(x, "bakedLights", value.asInstanceOf[js.Any])
    
    inline def setDynamicLights(value: Double): Self = StObject.set(x, "dynamicLights", value.asInstanceOf[js.Any])
    
    inline def setLastStaticPrepareCombineTime(value: Double): Self = StObject.set(x, "lastStaticPrepareCombineTime", value.asInstanceOf[js.Any])
    
    inline def setLastStaticPrepareFullTime(value: Double): Self = StObject.set(x, "lastStaticPrepareFullTime", value.asInstanceOf[js.Any])
    
    inline def setLastStaticPrepareSearchTime(value: Double): Self = StObject.set(x, "lastStaticPrepareSearchTime", value.asInstanceOf[js.Any])
    
    inline def setLastStaticPrepareTriAabbTime(value: Double): Self = StObject.set(x, "lastStaticPrepareTriAabbTime", value.asInstanceOf[js.Any])
    
    inline def setLastStaticPrepareWriteTime(value: Double): Self = StObject.set(x, "lastStaticPrepareWriteTime", value.asInstanceOf[js.Any])
    
    inline def setLights(value: Double): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    inline def setMeshInstances(value: Double): Self = StObject.set(x, "meshInstances", value.asInstanceOf[js.Any])
    
    inline def setUpdateShadersTime(value: Double): Self = StObject.set(x, "updateShadersTime", value.asInstanceOf[js.Any])
  }
}
