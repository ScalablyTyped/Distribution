package typings.pixiDotJs.pixiDotJsMod

import typings.pixiDotJs.PIXI.glCore.AttribState
import typings.pixiDotJs.PIXI.glCore.GLShader
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "WebGLGraphicsData")
@js.native
class WebGLGraphicsData protected ()
  extends typings.pixiDotJs.PIXI.WebGLGraphicsData {
  def this(gl: WebGLRenderingContext, shader: GLShader, attribsState: AttribState) = this()
}

