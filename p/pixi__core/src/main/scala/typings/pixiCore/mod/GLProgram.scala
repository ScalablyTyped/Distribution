package typings.pixiCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.WebGLProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "GLProgram")
@js.native
open class GLProgram protected ()
  extends typings.pixiCore.libShaderGlprogramMod.GLProgram {
  /**
    * Makes a new Pixi program.
    * @param program - webgl program
    * @param uniformData - uniforms
    */
  def this(
    program: WebGLProgram,
    uniformData: StringDictionary[typings.pixiCore.libShaderGlprogramMod.IGLUniformData]
  ) = this()
}
