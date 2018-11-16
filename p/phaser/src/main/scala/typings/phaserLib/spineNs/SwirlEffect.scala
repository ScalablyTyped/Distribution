package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.SwirlEffect")
@js.native
class SwirlEffect protected () extends VertexEffect {
  def this(radius: scala.Double) = this()
  var angle: scala.Double = js.native
  var centerX: scala.Double = js.native
  var centerY: scala.Double = js.native
  var radius: scala.Double = js.native
  var worldX: js.Any = js.native
  var worldY: js.Any = js.native
  /* CompleteClass */
  override def begin(skeleton: Skeleton): scala.Unit = js.native
  /* CompleteClass */
  override def end(): scala.Unit = js.native
  /* CompleteClass */
  override def transform(position: Vector2, uv: Vector2, light: Color, dark: Color): scala.Unit = js.native
}

@JSGlobal("spine.SwirlEffect")
@js.native
object SwirlEffect extends js.Object {
  var interpolation: phaserLib.spineNs.PowOut = js.native
}

