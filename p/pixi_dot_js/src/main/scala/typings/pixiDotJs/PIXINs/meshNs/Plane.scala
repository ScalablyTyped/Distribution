package typings.pixiDotJs.PIXINs.meshNs

import typings.pixiDotJs.PIXINs.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.mesh.Plane")
@js.native
class Plane protected () extends Mesh {
  def this(texture: Texture) = this()
  def this(texture: Texture, verticesX: Double) = this()
  def this(texture: Texture, verticesX: Double, verticesY: Double) = this()
  var _ready: Boolean = js.native
  var verticesX: Double = js.native
  var verticesY: Double = js.native
  /* protected */ def _onTexureUpdate(): Unit = js.native
}

