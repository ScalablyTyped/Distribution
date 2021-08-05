package typings.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper class to create a shader program.
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.Program")
@js.native
class Program ()
  extends StObject
     with typings.pixiJs.PIXI.Program {
  def this(vertexSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String) = this()
  def this(vertexSrc: Unit, fragmentSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String, name: String) = this()
  def this(vertexSrc: String, fragmentSrc: Unit, name: String) = this()
  def this(vertexSrc: Unit, fragmentSrc: String, name: String) = this()
  def this(vertexSrc: Unit, fragmentSrc: Unit, name: String) = this()
}
object Program {
  
  @JSGlobal("PIXI.Program")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default fragment shader source
    *
    * @static
    * @constant
    * @member {string}
    */
  /* static member */
  @JSGlobal("PIXI.Program.defaultFragmentSrc")
  @js.native
  def defaultFragmentSrc: String = js.native
  inline def defaultFragmentSrc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFragmentSrc")(x.asInstanceOf[js.Any])
  
  /**
    * The default vertex shader source
    *
    * @static
    * @constant
    * @member {string}
    */
  /* static member */
  @JSGlobal("PIXI.Program.defaultVertexSrc")
  @js.native
  def defaultVertexSrc: String = js.native
  inline def defaultVertexSrc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultVertexSrc")(x.asInstanceOf[js.Any])
  
  /**
    * A short hand function to create a program based of a vertex and fragment shader
    * this method will also check to see if there is a cached program.
    *
    * @param {string} [vertexSrc] - The source of the vertex shader.
    * @param {string} [fragmentSrc] - The source of the fragment shader.
    * @param {string} [name=pixi-shader] - Name for shader
    *
    * @returns {PIXI.Program} an shiny new Pixi shader!
    */
  /* static member */
  inline def from(): typings.pixiJs.PIXI.Program = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[typings.pixiJs.PIXI.Program]
  inline def from(vertexSrc: String): typings.pixiJs.PIXI.Program = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Program]
  inline def from(vertexSrc: String, fragmentSrc: String): typings.pixiJs.PIXI.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Program]
  inline def from(vertexSrc: String, fragmentSrc: String, name: String): typings.pixiJs.PIXI.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Program]
  inline def from(vertexSrc: String, fragmentSrc: Unit, name: String): typings.pixiJs.PIXI.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Program]
  inline def from(vertexSrc: Unit, fragmentSrc: String): typings.pixiJs.PIXI.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Program]
  inline def from(vertexSrc: Unit, fragmentSrc: String, name: String): typings.pixiJs.PIXI.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Program]
  inline def from(vertexSrc: Unit, fragmentSrc: Unit, name: String): typings.pixiJs.PIXI.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Program]
}
