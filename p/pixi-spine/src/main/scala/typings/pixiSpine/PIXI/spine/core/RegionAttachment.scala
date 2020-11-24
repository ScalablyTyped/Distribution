package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionAttachment extends Attachment {
  
  var color: Color = js.native
  
  def computeWorldVertices(bone: Bone, worldVertices: ArrayLike[Double], offset: Double, stride: Double): Unit = js.native
  
  var height: Double = js.native
  
  var offset: ArrayLike[Double] = js.native
  
  var path: String = js.native
  
  var region: TextureRegion = js.native
  
  var rendererObject: js.Any = js.native
  
  var rotation: Double = js.native
  
  var scaleX: Double = js.native
  
  var scaleY: Double = js.native
  
  def setRegion(region: TextureRegion): Unit = js.native
  
  var tempColor: Color = js.native
  
  def updateOffset(): Unit = js.native
  
  var uvs: ArrayLike[Double] = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object RegionAttachment {
  
  @scala.inline
  def apply(
    color: Color,
    computeWorldVertices: (Bone, ArrayLike[Double], Double, Double) => Unit,
    copy: () => Attachment,
    height: Double,
    name: String,
    offset: ArrayLike[Double],
    path: String,
    region: TextureRegion,
    rendererObject: js.Any,
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
  implicit class RegionAttachmentOps[Self <: RegionAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeWorldVertices(value: (Bone, ArrayLike[Double], Double, Double) => Unit): Self = this.set("computeWorldVertices", js.Any.fromFunction4(value))
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: ArrayLike[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: TextureRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererObject(value: js.Any): Self = this.set("rendererObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRegion(value: TextureRegion => Unit): Self = this.set("setRegion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTempColor(value: Color): Self = this.set("tempColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateOffset(value: () => Unit): Self = this.set("updateOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUvs(value: ArrayLike[Double]): Self = this.set("uvs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
