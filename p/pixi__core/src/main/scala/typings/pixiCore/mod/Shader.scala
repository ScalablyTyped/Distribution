package typings.pixiCore.mod

import typings.pixiRunner.mod.Runner
import typings.pixiUtils.mod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "Shader")
@js.native
open class Shader protected () extends StObject {
  /**
    * @param program - The program the shader will use.
    * @param uniforms - Custom uniforms to use to augment the built-in ones.
    */
  def this(program: Program) = this()
  def this(program: Program, uniforms: Dict[Any]) = this()
  
  def checkUniformExists(name: String, group: UniformGroup[Dict[Any]]): Boolean = js.native
  
  def destroy(): Unit = js.native
  
  var disposeRunner: Runner = js.native
  
  /** Program that the shader uses. */
  var program: Program = js.native
  
  /**
    * Used internally to bind uniform buffer objects.
    * @ignore
    */
  var uniformBindCount: Double = js.native
  
  var uniformGroup: UniformGroup[Dict[Any]] = js.native
  
  /**
    * Shader uniform values, shortcut for `uniformGroup.uniforms`.
    * @readonly
    */
  def uniforms: Dict[Any] = js.native
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
  inline def from(): Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[Shader]
  inline def from(vertexSrc: String): Shader = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any]).asInstanceOf[Shader]
  inline def from(vertexSrc: String, fragmentSrc: String): Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any])).asInstanceOf[Shader]
  inline def from(vertexSrc: String, fragmentSrc: String, uniforms: Dict[Any]): Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[Shader]
  inline def from(vertexSrc: String, fragmentSrc: Unit, uniforms: Dict[Any]): Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[Shader]
  inline def from(vertexSrc: Unit, fragmentSrc: String): Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any])).asInstanceOf[Shader]
  inline def from(vertexSrc: Unit, fragmentSrc: String, uniforms: Dict[Any]): Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[Shader]
  inline def from(vertexSrc: Unit, fragmentSrc: Unit, uniforms: Dict[Any]): Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[Shader]
}
