package typings.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shader extends StObject {
  
  def setUniform(uniformName: String, data: js.Array[Double]): Shader = js.native
  // TODO: Fix p5.Shader() errors in src/webgl/p5.Shader.js, line 11:
  //
  //    param "renderer" has invalid type: p5.RendererGL
  //
  // constructor(renderer: RendererGL, vertSrc: string, fragSrc: string);
  /**
    *   Used to set the uniforms of a p5.Shader object.
    *   Uniforms are used as a way to provide shader
    *   programs (which run on the GPU) with values from a
    *   sketch (which runs on the CPU).
    *   @param uniformName the name of the uniform. Must
    *   correspond to the name used in the vertex and
    *   fragment shaders
    *   @param data the data to associate with the
    *   uniform. The type can be a boolean (true/false), a
    *   number, an array of numbers, or an image
    *   (p5.Image, p5.Graphics, p5.MediaElement,
    *   p5.Texture)
    *   @chainable
    */
  def setUniform(uniformName: String, data: Boolean): Shader = js.native
  def setUniform(uniformName: String, data: Double): Shader = js.native
  def setUniform(uniformName: String, data: Graphics): Shader = js.native
  def setUniform(uniformName: String, data: Image): Shader = js.native
  def setUniform(uniformName: String, data: MediaElement): Shader = js.native
}
