package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionAttachment extends Attachment {
  var color: Color
  var height: Double
  var offset: ArrayLike[Double]
  var path: String
  var region: TextureRegion
  var rendererObject: js.Any
  var rotation: Double
  var scaleX: Double
  var scaleY: Double
  var tempColor: Color
  var uvs: ArrayLike[Double]
  var width: Double
  var x: Double
  var y: Double
  def computeWorldVertices(bone: Bone, worldVertices: ArrayLike[Double], offset: Double, stride: Double): Unit
  def setRegion(region: TextureRegion): Unit
  def updateOffset(): Unit
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
}

