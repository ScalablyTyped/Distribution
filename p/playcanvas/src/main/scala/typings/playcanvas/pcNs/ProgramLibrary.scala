package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.ProgramLibrary")
@js.native
class ProgramLibrary protected () extends js.Object {
  def this(device: GraphicsDevice) = this()
  def clearCache(): Unit = js.native
  def getProgram(name: String, options: js.Object): Shader = js.native
  def isRegistered(name: String): Unit = js.native
  def register(name: String, generator: js.Any): Unit = js.native
  def removeFromCache(shader: Shader): Unit = js.native
  def unregister(name: String): Unit = js.native
}

