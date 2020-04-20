package typings.pixiJs

import typings.std.EXTTextureFilterAnisotropic
import typings.std.OESTextureFloat
import typings.std.OESVertexArrayObject
import typings.std.WEBGLDepthTexture
import typings.std.WEBGLDrawBuffers
import typings.std.WEBGLLoseContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnisotropicFiltering extends js.Object {
  var anisotropicFiltering: EXTTextureFilterAnisotropic
  var depthTexture: WEBGLDepthTexture
  var drawBuffers: WEBGLDrawBuffers
  var floatTexture: OESTextureFloat
  var loseContext: WEBGLLoseContext
  var vertexArrayObject: OESVertexArrayObject
}

object AnonAnisotropicFiltering {
  @scala.inline
  def apply(
    anisotropicFiltering: EXTTextureFilterAnisotropic,
    depthTexture: WEBGLDepthTexture,
    drawBuffers: WEBGLDrawBuffers,
    floatTexture: OESTextureFloat,
    loseContext: WEBGLLoseContext,
    vertexArrayObject: OESVertexArrayObject
  ): AnonAnisotropicFiltering = {
    val __obj = js.Dynamic.literal(anisotropicFiltering = anisotropicFiltering.asInstanceOf[js.Any], depthTexture = depthTexture.asInstanceOf[js.Any], drawBuffers = drawBuffers.asInstanceOf[js.Any], floatTexture = floatTexture.asInstanceOf[js.Any], loseContext = loseContext.asInstanceOf[js.Any], vertexArrayObject = vertexArrayObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnisotropicFiltering]
  }
}

