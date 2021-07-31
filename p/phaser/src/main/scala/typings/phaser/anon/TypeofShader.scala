package typings.phaser.anon

import typings.phaser.spine.webgl.ManagedWebGLRenderingContext
import typings.phaser.spine.webgl.Shader
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofShader extends StObject {
  
  /* static member */
  var COLOR: String = js.native
  
  /* static member */
  var COLOR2: String = js.native
  
  /* static member */
  var MVP_MATRIX: String = js.native
  
  /* static member */
  var POSITION: String = js.native
  
  /* static member */
  var SAMPLER: String = js.native
  
  /* static member */
  var TEXCOORDS: String = js.native
  
  /* static member */
  def newColored(context: ManagedWebGLRenderingContext): Shader = js.native
  def newColored(context: WebGLRenderingContext): Shader = js.native
  
  /* static member */
  def newColoredTextured(context: ManagedWebGLRenderingContext): Shader = js.native
  def newColoredTextured(context: WebGLRenderingContext): Shader = js.native
  
  /* static member */
  def newTwoColoredTextured(context: ManagedWebGLRenderingContext): Shader = js.native
  def newTwoColoredTextured(context: WebGLRenderingContext): Shader = js.native
}
