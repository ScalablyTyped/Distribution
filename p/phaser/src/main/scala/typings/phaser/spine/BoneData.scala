package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoneData extends js.Object {
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
}

