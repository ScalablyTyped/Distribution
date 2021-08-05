package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoneData extends StObject {
  
  var color: Color
  
  var index: Double
  
  var length: Double
  
  var name: String
  
  var parent: BoneData
  
  var rotation: Double
  
  var scaleX: Double
  
  var scaleY: Double
  
  var shearX: Double
  
  var shearY: Double
  
  var skinRequired: Boolean
  
  var transformMode: TransformMode
  
  var x: Double
  
  var y: Double
}
object BoneData {
  
  inline def apply(
    color: Color,
    index: Double,
    length: Double,
    name: String,
    parent: BoneData,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    shearX: Double,
    shearY: Double,
    skinRequired: Boolean,
    transformMode: TransformMode,
    x: Double,
    y: Double
  ): BoneData = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], shearX = shearX.asInstanceOf[js.Any], shearY = shearY.asInstanceOf[js.Any], skinRequired = skinRequired.asInstanceOf[js.Any], transformMode = transformMode.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoneData]
  }
  
  extension [Self <: BoneData](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: BoneData): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setShearX(value: Double): Self = StObject.set(x, "shearX", value.asInstanceOf[js.Any])
    
    inline def setShearY(value: Double): Self = StObject.set(x, "shearY", value.asInstanceOf[js.Any])
    
    inline def setSkinRequired(value: Boolean): Self = StObject.set(x, "skinRequired", value.asInstanceOf[js.Any])
    
    inline def setTransformMode(value: TransformMode): Self = StObject.set(x, "transformMode", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
