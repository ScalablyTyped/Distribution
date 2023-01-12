package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cull extends StObject {
  
  def blendType(value: Any): Boolean
  
  def cull(value: Any): Boolean
  
  def depthFunc(value: Any): Boolean
  
  def occludeSpecular(value: Any): Boolean
  
  def shadingModel(value: Any): Boolean
}
object Cull {
  
  inline def apply(
    blendType: Any => Boolean,
    cull: Any => Boolean,
    depthFunc: Any => Boolean,
    occludeSpecular: Any => Boolean,
    shadingModel: Any => Boolean
  ): Cull = {
    val __obj = js.Dynamic.literal(blendType = js.Any.fromFunction1(blendType), cull = js.Any.fromFunction1(cull), depthFunc = js.Any.fromFunction1(depthFunc), occludeSpecular = js.Any.fromFunction1(occludeSpecular), shadingModel = js.Any.fromFunction1(shadingModel))
    __obj.asInstanceOf[Cull]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cull] (val x: Self) extends AnyVal {
    
    inline def setBlendType(value: Any => Boolean): Self = StObject.set(x, "blendType", js.Any.fromFunction1(value))
    
    inline def setCull(value: Any => Boolean): Self = StObject.set(x, "cull", js.Any.fromFunction1(value))
    
    inline def setDepthFunc(value: Any => Boolean): Self = StObject.set(x, "depthFunc", js.Any.fromFunction1(value))
    
    inline def setOccludeSpecular(value: Any => Boolean): Self = StObject.set(x, "occludeSpecular", js.Any.fromFunction1(value))
    
    inline def setShadingModel(value: Any => Boolean): Self = StObject.set(x, "shadingModel", js.Any.fromFunction1(value))
  }
}
