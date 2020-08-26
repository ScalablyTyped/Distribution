package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoneData extends js.Object {
  var color: Color = js.native
  var index: Double = js.native
  var length: Double = js.native
  var name: String = js.native
  var parent: BoneData = js.native
  var rotation: Double = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
  var shearX: Double = js.native
  var shearY: Double = js.native
  var skinRequired: Boolean = js.native
  var transformMode: TransformMode = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object BoneData {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class BoneDataOps[Self <: BoneData] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: BoneData): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def setShearX(value: Double): Self = this.set("shearX", value.asInstanceOf[js.Any])
    @scala.inline
    def setShearY(value: Double): Self = this.set("shearY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkinRequired(value: Boolean): Self = this.set("skinRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformMode(value: TransformMode): Self = this.set("transformMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

