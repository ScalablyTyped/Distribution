package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cameras extends StObject {
  
  var _fpsAccum: Double
  
  var _timeToCountFrames: Double
  
  var cameras: Double
  
  var cullTime: Double
  
  var depthMapTime: Double
  
  var dt: Double
  
  var forwardTime: Double
  
  var fps: Double
  
  var instancingTime: Double
  
  var lightClusters: Double
  
  var lightClustersTime: Double
  
  var materials: Double
  
  var morphTime: Double
  
  var ms: Double
  
  var otherPrimitives: Double
  
  var physicsStart: Double
  
  var physicsTime: Double
  
  var renderStart: Double
  
  var renderTime: Double
  
  var shaders: Double
  
  var shadowMapTime: Double
  
  var shadowMapUpdates: Double
  
  var skinTime: Double
  
  var sortTime: Double
  
  var triangles: Double
  
  var updateStart: Double
  
  var updateTime: Double
}
object Cameras {
  
  inline def apply(
    _fpsAccum: Double,
    _timeToCountFrames: Double,
    cameras: Double,
    cullTime: Double,
    depthMapTime: Double,
    dt: Double,
    forwardTime: Double,
    fps: Double,
    instancingTime: Double,
    lightClusters: Double,
    lightClustersTime: Double,
    materials: Double,
    morphTime: Double,
    ms: Double,
    otherPrimitives: Double,
    physicsStart: Double,
    physicsTime: Double,
    renderStart: Double,
    renderTime: Double,
    shaders: Double,
    shadowMapTime: Double,
    shadowMapUpdates: Double,
    skinTime: Double,
    sortTime: Double,
    triangles: Double,
    updateStart: Double,
    updateTime: Double
  ): Cameras = {
    val __obj = js.Dynamic.literal(_fpsAccum = _fpsAccum.asInstanceOf[js.Any], _timeToCountFrames = _timeToCountFrames.asInstanceOf[js.Any], cameras = cameras.asInstanceOf[js.Any], cullTime = cullTime.asInstanceOf[js.Any], depthMapTime = depthMapTime.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], forwardTime = forwardTime.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], instancingTime = instancingTime.asInstanceOf[js.Any], lightClusters = lightClusters.asInstanceOf[js.Any], lightClustersTime = lightClustersTime.asInstanceOf[js.Any], materials = materials.asInstanceOf[js.Any], morphTime = morphTime.asInstanceOf[js.Any], ms = ms.asInstanceOf[js.Any], otherPrimitives = otherPrimitives.asInstanceOf[js.Any], physicsStart = physicsStart.asInstanceOf[js.Any], physicsTime = physicsTime.asInstanceOf[js.Any], renderStart = renderStart.asInstanceOf[js.Any], renderTime = renderTime.asInstanceOf[js.Any], shaders = shaders.asInstanceOf[js.Any], shadowMapTime = shadowMapTime.asInstanceOf[js.Any], shadowMapUpdates = shadowMapUpdates.asInstanceOf[js.Any], skinTime = skinTime.asInstanceOf[js.Any], sortTime = sortTime.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any], updateStart = updateStart.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cameras]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cameras] (val x: Self) extends AnyVal {
    
    inline def setCameras(value: Double): Self = StObject.set(x, "cameras", value.asInstanceOf[js.Any])
    
    inline def setCullTime(value: Double): Self = StObject.set(x, "cullTime", value.asInstanceOf[js.Any])
    
    inline def setDepthMapTime(value: Double): Self = StObject.set(x, "depthMapTime", value.asInstanceOf[js.Any])
    
    inline def setDt(value: Double): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
    
    inline def setForwardTime(value: Double): Self = StObject.set(x, "forwardTime", value.asInstanceOf[js.Any])
    
    inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    inline def setInstancingTime(value: Double): Self = StObject.set(x, "instancingTime", value.asInstanceOf[js.Any])
    
    inline def setLightClusters(value: Double): Self = StObject.set(x, "lightClusters", value.asInstanceOf[js.Any])
    
    inline def setLightClustersTime(value: Double): Self = StObject.set(x, "lightClustersTime", value.asInstanceOf[js.Any])
    
    inline def setMaterials(value: Double): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMorphTime(value: Double): Self = StObject.set(x, "morphTime", value.asInstanceOf[js.Any])
    
    inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
    
    inline def setOtherPrimitives(value: Double): Self = StObject.set(x, "otherPrimitives", value.asInstanceOf[js.Any])
    
    inline def setPhysicsStart(value: Double): Self = StObject.set(x, "physicsStart", value.asInstanceOf[js.Any])
    
    inline def setPhysicsTime(value: Double): Self = StObject.set(x, "physicsTime", value.asInstanceOf[js.Any])
    
    inline def setRenderStart(value: Double): Self = StObject.set(x, "renderStart", value.asInstanceOf[js.Any])
    
    inline def setRenderTime(value: Double): Self = StObject.set(x, "renderTime", value.asInstanceOf[js.Any])
    
    inline def setShaders(value: Double): Self = StObject.set(x, "shaders", value.asInstanceOf[js.Any])
    
    inline def setShadowMapTime(value: Double): Self = StObject.set(x, "shadowMapTime", value.asInstanceOf[js.Any])
    
    inline def setShadowMapUpdates(value: Double): Self = StObject.set(x, "shadowMapUpdates", value.asInstanceOf[js.Any])
    
    inline def setSkinTime(value: Double): Self = StObject.set(x, "skinTime", value.asInstanceOf[js.Any])
    
    inline def setSortTime(value: Double): Self = StObject.set(x, "sortTime", value.asInstanceOf[js.Any])
    
    inline def setTriangles(value: Double): Self = StObject.set(x, "triangles", value.asInstanceOf[js.Any])
    
    inline def setUpdateStart(value: Double): Self = StObject.set(x, "updateStart", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: Double): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def set_fpsAccum(value: Double): Self = StObject.set(x, "_fpsAccum", value.asInstanceOf[js.Any])
    
    inline def set_timeToCountFrames(value: Double): Self = StObject.set(x, "_timeToCountFrames", value.asInstanceOf[js.Any])
  }
}
