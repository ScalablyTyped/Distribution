package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A helper class for shaders
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Shader")
@js.native
class Shader ()
  extends StObject
     with typings.pixiJs.PIXI.Shader {
  def this(program: typings.pixiJs.PIXI.Program) = this()
  def this(program: Unit, uniforms: js.Any) = this()
  def this(program: typings.pixiJs.PIXI.Program, uniforms: js.Any) = this()
  
  /**
    * Program that the shader uses
    *
    * @member {PIXI.Program} PIXI.Shader#program
    */
  /* CompleteClass */
  var program: typings.pixiJs.PIXI.Program = js.native
  
  /**
    * Shader uniform values, shortcut for `uniformGroup.uniforms`
    * @readonly
    * @member {object}
    */
  /* CompleteClass */
  override val uniforms: js.Any = js.native
}
object Shader {
  
  @JSImport("pixi.js", "Shader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A short hand function to create a shader based of a vertex and fragment shader
    *
    * @param {string} [vertexSrc] - The source of the vertex shader.
    * @param {string} [fragmentSrc] - The source of the fragment shader.
    * @param {object} [uniforms] - Custom uniforms to use to augment the built-in ones.
    *
    * @returns {PIXI.Shader} an shiny new Pixi shader!
    */
  /* static member */
  inline def from(): typings.pixiJs.PIXI.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[typings.pixiJs.PIXI.Shader]
  inline def from(vertexSrc: String): typings.pixiJs.PIXI.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Shader]
  inline def from(vertexSrc: String, fragmentSrc: String): typings.pixiJs.PIXI.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Shader]
  inline def from(vertexSrc: String, fragmentSrc: String, uniforms: js.Any): typings.pixiJs.PIXI.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Shader]
  inline def from(vertexSrc: String, fragmentSrc: Unit, uniforms: js.Any): typings.pixiJs.PIXI.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Shader]
  inline def from(vertexSrc: Unit, fragmentSrc: String): typings.pixiJs.PIXI.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Shader]
  inline def from(vertexSrc: Unit, fragmentSrc: String, uniforms: js.Any): typings.pixiJs.PIXI.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Shader]
  inline def from(vertexSrc: Unit, fragmentSrc: Unit, uniforms: js.Any): typings.pixiJs.PIXI.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Shader]
}
