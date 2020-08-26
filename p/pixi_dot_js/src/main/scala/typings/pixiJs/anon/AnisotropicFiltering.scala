package typings.pixiJs.anon

import typings.std.EXTTextureFilterAnisotropic
import typings.std.OESTextureFloat
import typings.std.OESVertexArrayObject
import typings.std.WEBGLDepthTexture
import typings.std.WEBGLDrawBuffers
import typings.std.WEBGLLoseContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnisotropicFiltering extends js.Object {
  var anisotropicFiltering: EXTTextureFilterAnisotropic = js.native
  var depthTexture: WEBGLDepthTexture = js.native
  var drawBuffers: WEBGLDrawBuffers = js.native
  var floatTexture: OESTextureFloat = js.native
  var loseContext: WEBGLLoseContext = js.native
  var vertexArrayObject: OESVertexArrayObject = js.native
}

object AnisotropicFiltering {
  @scala.inline
  def apply(
    anisotropicFiltering: EXTTextureFilterAnisotropic,
    depthTexture: WEBGLDepthTexture,
    drawBuffers: WEBGLDrawBuffers,
    floatTexture: OESTextureFloat,
    loseContext: WEBGLLoseContext,
    vertexArrayObject: OESVertexArrayObject
  ): AnisotropicFiltering = {
    val __obj = js.Dynamic.literal(anisotropicFiltering = anisotropicFiltering.asInstanceOf[js.Any], depthTexture = depthTexture.asInstanceOf[js.Any], drawBuffers = drawBuffers.asInstanceOf[js.Any], floatTexture = floatTexture.asInstanceOf[js.Any], loseContext = loseContext.asInstanceOf[js.Any], vertexArrayObject = vertexArrayObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnisotropicFiltering]
  }
  @scala.inline
  implicit class AnisotropicFilteringOps[Self <: AnisotropicFiltering] (val x: Self) extends AnyVal {
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
    def setAnisotropicFiltering(value: EXTTextureFilterAnisotropic): Self = this.set("anisotropicFiltering", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepthTexture(value: WEBGLDepthTexture): Self = this.set("depthTexture", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawBuffers(value: WEBGLDrawBuffers): Self = this.set("drawBuffers", value.asInstanceOf[js.Any])
    @scala.inline
    def setFloatTexture(value: OESTextureFloat): Self = this.set("floatTexture", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoseContext(value: WEBGLLoseContext): Self = this.set("loseContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexArrayObject(value: OESVertexArrayObject): Self = this.set("vertexArrayObject", value.asInstanceOf[js.Any])
  }
  
}

