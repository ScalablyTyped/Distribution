package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.ProgramLibrary")
@js.native
class ProgramLibrary protected () extends js.Object {
  def this(device: GraphicsDevice) = this()
  def clearCache(): scala.Unit = js.native
  def getProgram(name: java.lang.String, options: js.Object): Shader = js.native
  def isRegistered(name: java.lang.String): scala.Unit = js.native
  def register(name: java.lang.String, generator: js.Any): scala.Unit = js.native
  def removeFromCache(shader: Shader): scala.Unit = js.native
  def unregister(name: java.lang.String): scala.Unit = js.native
}

