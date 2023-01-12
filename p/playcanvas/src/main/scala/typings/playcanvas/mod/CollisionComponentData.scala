package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollisionComponentData extends StObject {
  
  var asset: Any
  
  var axis: Double
  
  var enabled: Boolean
  
  var halfExtents: Vec3
  
  var height: Double
  
  var initialized: Boolean
  
  var model: Any
  
  var radius: Double
  
  var render: Any
  
  var renderAsset: Any
  
  var shape: Any
  
  var `type`: String
}
object CollisionComponentData {
  
  inline def apply(
    asset: Any,
    axis: Double,
    enabled: Boolean,
    halfExtents: Vec3,
    height: Double,
    initialized: Boolean,
    model: Any,
    radius: Double,
    render: Any,
    renderAsset: Any,
    shape: Any,
    `type`: String
  ): CollisionComponentData = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], halfExtents = halfExtents.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], renderAsset = renderAsset.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionComponentData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollisionComponentData] (val x: Self) extends AnyVal {
    
    inline def setAsset(value: Any): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setHalfExtents(value: Vec3): Self = StObject.set(x, "halfExtents", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
    
    inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRender(value: Any): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderAsset(value: Any): Self = StObject.set(x, "renderAsset", value.asInstanceOf[js.Any])
    
    inline def setShape(value: Any): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
