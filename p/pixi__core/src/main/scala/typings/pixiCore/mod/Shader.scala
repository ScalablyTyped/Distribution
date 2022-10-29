package typings.pixiCore.mod

import typings.pixiUtils.libTypesMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "Shader")
@js.native
open class Shader protected ()
  extends typings.pixiCore.libShaderShaderMod.Shader {
  /**
    * @param program - The program the shader will use.
    * @param uniforms - Custom uniforms to use to augment the built-in ones.
    */
  def this(program: typings.pixiCore.libShaderProgramMod.Program) = this()
  def this(program: typings.pixiCore.libShaderProgramMod.Program, uniforms: Dict[Any]) = this()
}
/* static members */
object Shader {
  
  @JSImport("@pixi/core", "Shader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A short hand function to create a shader based of a vertex and fragment shader.
    * @param vertexSrc - The source of the vertex shader.
    * @param fragmentSrc - The source of the fragment shader.
    * @param uniforms - Custom uniforms to use to augment the built-in ones.
    * @returns A shiny new PixiJS shader!
    */
  inline def from(): typings.pixiCore.libShaderShaderMod.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[typings.pixiCore.libShaderShaderMod.Shader]
  inline def from(vertexSrc: String): typings.pixiCore.libShaderShaderMod.Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.libShaderShaderMod.Shader]
  inline def from(vertexSrc: String, fragmentSrc: String): typings.pixiCore.libShaderShaderMod.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.libShaderShaderMod.Shader]
  inline def from(vertexSrc: String, fragmentSrc: String, uniforms: Dict[Any]): typings.pixiCore.libShaderShaderMod.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.libShaderShaderMod.Shader]
  inline def from(vertexSrc: String, fragmentSrc: Unit, uniforms: Dict[Any]): typings.pixiCore.libShaderShaderMod.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.libShaderShaderMod.Shader]
  inline def from(vertexSrc: Unit, fragmentSrc: String): typings.pixiCore.libShaderShaderMod.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.libShaderShaderMod.Shader]
  inline def from(vertexSrc: Unit, fragmentSrc: String, uniforms: Dict[Any]): typings.pixiCore.libShaderShaderMod.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.libShaderShaderMod.Shader]
  inline def from(vertexSrc: Unit, fragmentSrc: Unit, uniforms: Dict[Any]): typings.pixiCore.libShaderShaderMod.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.libShaderShaderMod.Shader]
}
