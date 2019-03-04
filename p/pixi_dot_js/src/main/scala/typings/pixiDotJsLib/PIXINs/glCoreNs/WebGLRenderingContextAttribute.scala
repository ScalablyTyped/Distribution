package typings
package pixiDotJsLib.PIXINs.glCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLRenderingContextAttribute extends js.Object {
  var attribute: js.Any
  var buffer: stdLib.WebGLBuffer
  var normalized: scala.Boolean
  var start: scala.Double
  var stride: scala.Double
  var `type`: scala.Double
}

object WebGLRenderingContextAttribute {
  @scala.inline
  def apply(
    attribute: js.Any,
    buffer: stdLib.WebGLBuffer,
    normalized: scala.Boolean,
    start: scala.Double,
    stride: scala.Double,
    `type`: scala.Double
  ): WebGLRenderingContextAttribute = {
    val __obj = js.Dynamic.literal(attribute = attribute, buffer = buffer, normalized = normalized, start = start, stride = stride)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WebGLRenderingContextAttribute]
  }
}

