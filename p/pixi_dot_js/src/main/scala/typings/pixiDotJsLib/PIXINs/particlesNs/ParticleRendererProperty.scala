package typings
package pixiDotJsLib.PIXINs.particlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticleRendererProperty extends js.Object {
  var attribute: scala.Double
  var offset: scala.Double
  var size: scala.Double
  var unsignedByte: js.Any
  def uploadFunction(
    children: js.Array[pixiDotJsLib.PIXINs.DisplayObject],
    startIndex: scala.Double,
    amount: scala.Double,
    array: js.Array[scala.Double],
    stride: scala.Double,
    offset: scala.Double
  ): scala.Unit
}

object ParticleRendererProperty {
  @scala.inline
  def apply(
    attribute: scala.Double,
    offset: scala.Double,
    size: scala.Double,
    unsignedByte: js.Any,
    uploadFunction: js.Function6[
      js.Array[pixiDotJsLib.PIXINs.DisplayObject], 
      scala.Double, 
      scala.Double, 
      js.Array[scala.Double], 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ]
  ): ParticleRendererProperty = {
    val __obj = js.Dynamic.literal(attribute = attribute, offset = offset, size = size, unsignedByte = unsignedByte, uploadFunction = uploadFunction)
  
    __obj.asInstanceOf[ParticleRendererProperty]
  }
}

