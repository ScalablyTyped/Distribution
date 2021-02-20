package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A helper class for shaders
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Shader extends StObject {
  
  /**
    * Program that the shader uses
    *
    * @member {PIXI.Program} PIXI.Shader#program
    */
  var program: Program = js.native
  
  /**
    * Shader uniform values, shortcut for `uniformGroup.uniforms`
    * @readonly
    * @member {object}
    */
  val uniforms: js.Any = js.native
}
object Shader {
  
  @scala.inline
  def apply(program: Program, uniforms: js.Any): Shader = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shader]
  }
  
  @scala.inline
  implicit class ShaderMutableBuilder[Self <: Shader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniforms(value: js.Any): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
  }
}
