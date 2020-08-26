package typings.ol.webglLayerMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLWorkerGenerateBuffersMessage extends js.Object {
  var customAttributesCount: js.UndefOr[Double] = js.native
  var indexBuffer: js.UndefOr[ArrayBuffer] = js.native
  var renderInstructions: ArrayBuffer = js.native
  var `type`: WebGLWorkerMessageType = js.native
  var vertexBuffer: js.UndefOr[ArrayBuffer] = js.native
}

object WebGLWorkerGenerateBuffersMessage {
  @scala.inline
  def apply(renderInstructions: ArrayBuffer, `type`: WebGLWorkerMessageType): WebGLWorkerGenerateBuffersMessage = {
    val __obj = js.Dynamic.literal(renderInstructions = renderInstructions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLWorkerGenerateBuffersMessage]
  }
  @scala.inline
  implicit class WebGLWorkerGenerateBuffersMessageOps[Self <: WebGLWorkerGenerateBuffersMessage] (val x: Self) extends AnyVal {
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
    def setRenderInstructions(value: ArrayBuffer): Self = this.set("renderInstructions", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: WebGLWorkerMessageType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomAttributesCount(value: Double): Self = this.set("customAttributesCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomAttributesCount: Self = this.set("customAttributesCount", js.undefined)
    @scala.inline
    def setIndexBuffer(value: ArrayBuffer): Self = this.set("indexBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexBuffer: Self = this.set("indexBuffer", js.undefined)
    @scala.inline
    def setVertexBuffer(value: ArrayBuffer): Self = this.set("vertexBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertexBuffer: Self = this.set("vertexBuffer", js.undefined)
  }
  
}

