package typings.pixiDotJs.PIXINs.glCoreNs

import typings.std.WebGLBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLRenderingContextAttribute extends js.Object {
  var attribute: js.Any
  var buffer: WebGLBuffer
  var normalized: Boolean
  var start: Double
  var stride: Double
  var `type`: Double
}

object WebGLRenderingContextAttribute {
  @scala.inline
  def apply(
    attribute: js.Any,
    buffer: WebGLBuffer,
    normalized: Boolean,
    start: Double,
    stride: Double,
    `type`: Double
  ): WebGLRenderingContextAttribute = {
    val __obj = js.Dynamic.literal(attribute = attribute, buffer = buffer, normalized = normalized, start = start, stride = stride)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WebGLRenderingContextAttribute]
  }
}

