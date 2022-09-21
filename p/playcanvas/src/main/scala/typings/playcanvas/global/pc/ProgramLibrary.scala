package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class responsible for creation and caching of required shaders.
  * There is a two level cache. The first level generates the shader based on the provided options.
  * The second level processes this generated shader using processing options - in most cases
  * modifies it to support uniform buffers.
  *
  * @ignore
  */
@JSGlobal("pc.ProgramLibrary")
@js.native
open class ProgramLibrary protected ()
  extends typings.playcanvas.mod.ProgramLibrary {
  def this(device: Any) = this()
}
