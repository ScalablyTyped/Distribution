package typings.pixiCore.mod

import typings.pixiCore.libShaderProgramMod.IProgramExtraData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "Program")
@js.native
/**
  * @param vertexSrc - The source of the vertex shader.
  * @param fragmentSrc - The source of the fragment shader.
  * @param name - Name for shader
  * @param extra - Extra data for shader
  */
open class Program ()
  extends typings.pixiCore.libShaderProgramMod.Program {
  def this(vertexSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String) = this()
  def this(vertexSrc: Unit, fragmentSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String, name: String) = this()
  def this(vertexSrc: String, fragmentSrc: Unit, name: String) = this()
  def this(vertexSrc: Unit, fragmentSrc: String, name: String) = this()
  def this(vertexSrc: Unit, fragmentSrc: Unit, name: String) = this()
  def this(vertexSrc: String, fragmentSrc: String, name: String, extra: IProgramExtraData) = this()
  def this(vertexSrc: String, fragmentSrc: String, name: Unit, extra: IProgramExtraData) = this()
  def this(vertexSrc: String, fragmentSrc: Unit, name: String, extra: IProgramExtraData) = this()
  def this(vertexSrc: String, fragmentSrc: Unit, name: Unit, extra: IProgramExtraData) = this()
  def this(vertexSrc: Unit, fragmentSrc: String, name: String, extra: IProgramExtraData) = this()
  def this(vertexSrc: Unit, fragmentSrc: String, name: Unit, extra: IProgramExtraData) = this()
  def this(vertexSrc: Unit, fragmentSrc: Unit, name: String, extra: IProgramExtraData) = this()
  def this(vertexSrc: Unit, fragmentSrc: Unit, name: Unit, extra: IProgramExtraData) = this()
}
/* static members */
object Program {
  
  @JSImport("@pixi/core", "Program")
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
  inline def from(): typings.pixiCore.libShaderProgramMod.Program = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[typings.pixiCore.libShaderProgramMod.Program]
  inline def from(vertexSrc: String): typings.pixiCore.libShaderProgramMod.Program = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.libShaderProgramMod.Program]
  inline def from(vertexSrc: String, fragmentSrc: String): typings.pixiCore.libShaderProgramMod.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.libShaderProgramMod.Program]
  inline def from(vertexSrc: String, fragmentSrc: String, name: String): typings.pixiCore.libShaderProgramMod.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.libShaderProgramMod.Program]
  inline def from(vertexSrc: String, fragmentSrc: Unit, name: String): typings.pixiCore.libShaderProgramMod.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.libShaderProgramMod.Program]
  inline def from(vertexSrc: Unit, fragmentSrc: String): typings.pixiCore.libShaderProgramMod.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.libShaderProgramMod.Program]
  inline def from(vertexSrc: Unit, fragmentSrc: String, name: String): typings.pixiCore.libShaderProgramMod.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.libShaderProgramMod.Program]
  inline def from(vertexSrc: Unit, fragmentSrc: Unit, name: String): typings.pixiCore.libShaderProgramMod.Program = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(vertexSrc.asInstanceOf[js.Any], fragmentSrc.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.libShaderProgramMod.Program]
}
