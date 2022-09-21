package typings.pixiCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pixiUtils.mod.Dict
import typings.std.WebGLProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "GLProgram")
@js.native
open class GLProgram protected () extends StObject {
  /**
    * Makes a new Pixi program.
    * @param program - webgl program
    * @param uniformData - uniforms
    */
  def this(program: WebGLProgram, uniformData: StringDictionary[IGLUniformData]) = this()
  
  /** Destroys this program. */
  def destroy(): Unit = js.native
  
  /** The shader program. */
  var program: WebGLProgram = js.native
  
  /** A hash that stores where UBOs are bound to on the program. */
  var uniformBufferBindings: Dict[Any] = js.native
  
  /**
    * Holds the uniform data which contains uniform locations
    * and current uniform values used for caching and preventing unneeded GPU commands.
    */
  var uniformData: Dict[Any] = js.native
  
  /**
    * A place where dirty ticks are stored for groups
    * If a tick here does not match with the Higher level Programs tick, it means
    * we should re upload the data.
    */
  var uniformDirtyGroups: Dict[Any] = js.native
  
  /**
    * UniformGroups holds the various upload functions for the shader. Each uniform group
    * and program have a unique upload function generated.
    */
  var uniformGroups: Dict[Any] = js.native
  
  /** A hash for lazily-generated uniform uploading functions. */
  var uniformSync: Dict[Any] = js.native
}
