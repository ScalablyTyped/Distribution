package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransformConstraintData
  extends StObject
     with IConstraintData {
  
  var local: Boolean
  
  var offsetRotation: Double
  
  var offsetScaleX: Double
  
  var offsetScaleY: Double
  
  var offsetShearY: Double
  
  var offsetX: Double
  
  var offsetY: Double
  
  var relative: Boolean
}
object ITransformConstraintData {
  
  inline def apply(
    local: Boolean,
    name: String,
    offsetRotation: Double,
    offsetScaleX: Double,
    offsetScaleY: Double,
    offsetShearY: Double,
    offsetX: Double,
    offsetY: Double,
    order: Double,
    relative: Boolean
  ): ITransformConstraintData = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetRotation = offsetRotation.asInstanceOf[js.Any], offsetScaleX = offsetScaleX.asInstanceOf[js.Any], offsetScaleY = offsetScaleY.asInstanceOf[js.Any], offsetShearY = offsetShearY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransformConstraintData]
  }
  
  extension [Self <: ITransformConstraintData](x: Self) {
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setOffsetRotation(value: Double): Self = StObject.set(x, "offsetRotation", value.asInstanceOf[js.Any])
    
    inline def setOffsetScaleX(value: Double): Self = StObject.set(x, "offsetScaleX", value.asInstanceOf[js.Any])
    
    inline def setOffsetScaleY(value: Double): Self = StObject.set(x, "offsetScaleY", value.asInstanceOf[js.Any])
    
    inline def setOffsetShearY(value: Double): Self = StObject.set(x, "offsetShearY", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
  }
}
