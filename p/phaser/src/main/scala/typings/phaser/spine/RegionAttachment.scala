package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionAttachment
  extends StObject
     with Attachment {
  
  var color: Color
  
  def computeWorldVertices(bone: Bone, worldVertices: ArrayLike[Double], offset: Double, stride: Double): Unit
  
  var height: Double
  
  var offset: ArrayLike[Double]
  
  var path: String
  
  var region: TextureRegion
  
  var rendererObject: Any
  
  var rotation: Double
  
  var scaleX: Double
  
  var scaleY: Double
  
  def setRegion(region: TextureRegion): Unit
  
  var tempColor: Color
  
  def updateOffset(): Unit
  
  var uvs: ArrayLike[Double]
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object RegionAttachment {
  
  inline def apply(
    color: Color,
    computeWorldVertices: (Bone, ArrayLike[Double], Double, Double) => Unit,
    copy: () => Attachment,
    height: Double,
    name: String,
    offset: ArrayLike[Double],
    path: String,
    region: TextureRegion,
    rendererObject: Any,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    setRegion: TextureRegion => Unit,
    tempColor: Color,
    updateOffset: () => Unit,
    uvs: ArrayLike[Double],
    width: Double,
    x: Double,
    y: Double
  ): RegionAttachment = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction4(computeWorldVertices), copy = js.Any.fromFunction0(copy), height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], rendererObject = rendererObject.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], setRegion = js.Any.fromFunction1(setRegion), tempColor = tempColor.asInstanceOf[js.Any], updateOffset = js.Any.fromFunction0(updateOffset), uvs = uvs.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegionAttachment] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setComputeWorldVertices(value: (Bone, ArrayLike[Double], Double, Double) => Unit): Self = StObject.set(x, "computeWorldVertices", js.Any.fromFunction4(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: ArrayLike[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: TextureRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRendererObject(value: Any): Self = StObject.set(x, "rendererObject", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setSetRegion(value: TextureRegion => Unit): Self = StObject.set(x, "setRegion", js.Any.fromFunction1(value))
    
    inline def setTempColor(value: Color): Self = StObject.set(x, "tempColor", value.asInstanceOf[js.Any])
    
    inline def setUpdateOffset(value: () => Unit): Self = StObject.set(x, "updateOffset", js.Any.fromFunction0(value))
    
    inline def setUvs(value: ArrayLike[Double]): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
