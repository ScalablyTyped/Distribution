package typings
package pixiDotJsLib.PIXINs.meshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.mesh.Rope")
@js.native
class Rope protected () extends Mesh {
  def this(texture: pixiDotJsLib.PIXINs.Texture, points: js.Array[pixiDotJsLib.PIXINs.Point]) = this()
  var colors: js.Array[scala.Double] = js.native
  var points: js.Array[pixiDotJsLib.PIXINs.Point] = js.native
  def refreshVertices(): scala.Unit = js.native
}

