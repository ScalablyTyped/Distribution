package typings.phaser

import org.scalablytyped.runtime.Instantiable3
import typings.phaser.spine.webgl.ManagedWebGLRenderingContext
import typings.phaser.spine.webgl.Shader
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofShader extends Instantiable3[
      (/* context */ ManagedWebGLRenderingContext) | (/* context */ WebGLRenderingContext), 
      /* vertexShader */ String, 
      /* fragmentShader */ String, 
      Shader
    ] {
  var COLOR: String = js.native
  var COLOR2: String = js.native
  var MVP_MATRIX: String = js.native
  var POSITION: String = js.native
  var SAMPLER: String = js.native
  var TEXCOORDS: String = js.native
  def newColored(context: ManagedWebGLRenderingContext): Shader = js.native
  def newColored(context: WebGLRenderingContext): Shader = js.native
  def newColoredTextured(context: ManagedWebGLRenderingContext): Shader = js.native
  def newColoredTextured(context: WebGLRenderingContext): Shader = js.native
  def newTwoColoredTextured(context: ManagedWebGLRenderingContext): Shader = js.native
  def newTwoColoredTextured(context: WebGLRenderingContext): Shader = js.native
}

