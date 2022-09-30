package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "Program")
@js.native
/**
  * @param vertexSrc - The source of the vertex shader.
  * @param fragmentSrc - The source of the fragment shader.
  * @param name - Name for shader
  */
open class Program ()
  extends typings.pixiCore.mod.Program {
  def this(vertexSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String) = this()
  def this(vertexSrc: Unit, fragmentSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String, name: String) = this()
  def this(vertexSrc: String, fragmentSrc: Unit, name: String) = this()
  def this(vertexSrc: Unit, fragmentSrc: String, name: String) = this()
  def this(vertexSrc: Unit, fragmentSrc: Unit, name: String) = this()
}
/* static members */
object Program {
  
  @JSImport("pixi.js", "Program")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A short hand function to create a program based of a vertex and fragment shader.
    *
    * This method will also check to see if there is a cached program.
    * @param vertexSrc - The source of the vertex shader.
    * @param fragmentSrc - The source of the fragment shader.
    * @param name - Name for shader
    * @returns A shiny new PixiJS shader program!
    */
  inline def from(): typings.pixiCore.mod.Program = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[typings.pixiCore.mod.Program]
  inline def from(vertexSrc: String): typings.pixiCore.mod.Program = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.mod.Program]
  inline def from(vertexSrc: String, fragmentSrc: String): typings.pixiCore.mod.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Program]
  inline def from(vertexSrc: String, fragmentSrc: String, name: String): typings.pixiCore.mod.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Program]
  inline def from(vertexSrc: String, fragmentSrc: Unit, name: String): typings.pixiCore.mod.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Program]
  inline def from(vertexSrc: Unit, fragmentSrc: String): typings.pixiCore.mod.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Program]
  inline def from(vertexSrc: Unit, fragmentSrc: String, name: String): typings.pixiCore.mod.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Program]
  inline def from(vertexSrc: Unit, fragmentSrc: Unit, name: String): typings.pixiCore.mod.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Program]
}
