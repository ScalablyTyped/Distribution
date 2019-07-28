package typings.pixiDotJs.PIXINs.meshNs

import typings.pixiDotJs.PIXINs.ObjectRenderer
import typings.pixiDotJs.PIXINs.Shader
import typings.pixiDotJs.PIXINs.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.mesh.MeshRenderer")
@js.native
class MeshRenderer protected () extends ObjectRenderer {
  def this(renderer: WebGLRenderer) = this()
  var shader: Shader = js.native
  def render(mesh: Mesh): Unit = js.native
}

