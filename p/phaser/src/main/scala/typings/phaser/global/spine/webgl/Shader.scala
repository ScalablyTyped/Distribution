package typings.phaser.global.spine.webgl

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.webgl.Shader")
@js.native
class Shader protected ()
  extends typings.phaser.spine.webgl.Shader {
  def this(
    context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext,
    vertexShader: String,
    fragmentShader: String
  ) = this()
  def this(context: WebGLRenderingContext, vertexShader: String, fragmentShader: String) = this()
}
/* static members */
@JSGlobal("spine.webgl.Shader")
@js.native
object Shader extends js.Object {
  
  var COLOR: String = js.native
  
  var COLOR2: String = js.native
  
  var MVP_MATRIX: String = js.native
  
  var POSITION: String = js.native
  
  var SAMPLER: String = js.native
  
  var TEXCOORDS: String = js.native
  
  def newColored(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext): typings.phaser.spine.webgl.Shader = js.native
  def newColored(context: WebGLRenderingContext): typings.phaser.spine.webgl.Shader = js.native
  
  def newColoredTextured(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext): typings.phaser.spine.webgl.Shader = js.native
  def newColoredTextured(context: WebGLRenderingContext): typings.phaser.spine.webgl.Shader = js.native
  
  def newTwoColoredTextured(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext): typings.phaser.spine.webgl.Shader = js.native
  def newTwoColoredTextured(context: WebGLRenderingContext): typings.phaser.spine.webgl.Shader = js.native
}
