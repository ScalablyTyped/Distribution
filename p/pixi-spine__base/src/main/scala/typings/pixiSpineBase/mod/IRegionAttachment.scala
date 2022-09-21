package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRegionAttachment
  extends StObject
     with IAttachment {
  
  var color: Color
  
  var height: Double
  
  var region: TextureRegion
  
  var rotation: Any
  
  var scaleX: Any
  
  var scaleY: Any
  
  var width: Any
  
  var x: Any
  
  var y: Any
}
object IRegionAttachment {
  
  inline def apply(
    color: Color,
    height: Double,
    name: String,
    region: TextureRegion,
    rotation: Any,
    scaleX: Any,
    scaleY: Any,
    `type`: AttachmentType,
    width: Any,
    x: Any,
    y: Any
  ): IRegionAttachment = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegionAttachment]
  }
  
  extension [Self <: IRegionAttachment](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: TextureRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Any): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScaleX(value: Any): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: Any): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
