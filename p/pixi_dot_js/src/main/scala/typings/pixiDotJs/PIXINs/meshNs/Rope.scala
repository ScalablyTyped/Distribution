package typings.pixiDotJs.PIXINs.meshNs

import typings.pixiDotJs.PIXINs.Point
import typings.pixiDotJs.PIXINs.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.mesh.Rope")
@js.native
class Rope protected () extends Mesh {
  def this(texture: Texture, points: js.Array[Point]) = this()
  var colors: js.Array[Double] = js.native
  var points: js.Array[Point] = js.native
  def refreshVertices(): Unit = js.native
}

