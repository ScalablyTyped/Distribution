package typings
package pixiDotJsLib.PIXINs.meshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.mesh.MeshRenderer")
@js.native
class MeshRenderer protected ()
  extends pixiDotJsLib.PIXINs.ObjectRenderer {
  def this(renderer: pixiDotJsLib.PIXINs.WebGLRenderer) = this()
  var shader: pixiDotJsLib.PIXINs.Shader = js.native
  def render(mesh: Mesh): scala.Unit = js.native
}

