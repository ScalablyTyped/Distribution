package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.GLProgram
import typings.pixiJs.PIXI.Shader
import typings.pixiJs.PIXI.System
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage shaders.
  *
  * @class
  * @memberof PIXI.systems
  * @extends PIXI.System
  */
@js.native
trait ShaderSystem extends System {
  /**
    * The current WebGL rendering context
    *
    * @member {WebGLRenderingContext} PIXI.systems.ShaderSystem#gl
    */
  var gl: WebGLRenderingContext = js.native
  /**
    * Changes the current shader to the one given in parameter
    *
    * @param {PIXI.Shader} shader - the new shader
    * @param {boolean} [dontSync] - false if the shader should automatically sync its uniforms.
    * @returns {PIXI.GLProgram} the glProgram that belongs to the shader.
    */
  def bind(shader: Shader): GLProgram = js.native
  def bind(shader: Shader, dontSync: Boolean): GLProgram = js.native
  /**
    * Returns the underlying GLShade rof the currently bound shader.
    * This can be handy for when you to have a little more control over the setting of your uniforms.
    *
    * @return {PIXI.GLProgram} the glProgram for the currently bound Shader for this context
    */
  def getglProgram(): GLProgram = js.native
  /**
    * Resets ShaderSystem state, does not affect WebGL state
    */
  def reset(): Unit = js.native
  /**
    * Uploads the uniforms values to the currently bound shader.
    *
    * @param {object} uniforms - the uniforms values that be applied to the current shader
    */
  def setUniforms(uniforms: js.Any): Unit = js.native
  /**
    *
    * syncs uniforms on the group
    * @param {*} group - the uniform group to sync
    * @param {*} [syncData] - this is data that is passed to the sync function and any nested sync functions
    */
  def syncUniformGroup(group: js.Any): Unit = js.native
  def syncUniformGroup(group: js.Any, syncData: js.Any): Unit = js.native
}

