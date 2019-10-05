package typings.pixiDotJs.PIXI.particles

import typings.pixiDotJs.PIXI.DisplayObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticleRendererProperty extends js.Object {
  var attribute: Double
  var offset: Double
  var size: Double
  var unsignedByte: js.Any
  def uploadFunction(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit
}

object ParticleRendererProperty {
  @scala.inline
  def apply(
    attribute: Double,
    offset: Double,
    size: Double,
    unsignedByte: js.Any,
    uploadFunction: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit
  ): ParticleRendererProperty = {
    val __obj = js.Dynamic.literal(attribute = attribute, offset = offset, size = size, unsignedByte = unsignedByte, uploadFunction = js.Any.fromFunction6(uploadFunction))
  
    __obj.asInstanceOf[ParticleRendererProperty]
  }
}

