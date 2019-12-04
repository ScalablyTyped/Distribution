package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.SwirlEffect")
@js.native
class SwirlEffect protected () extends VertexEffect {
  def this(radius: Double) = this()
  var angle: Double = js.native
  var centerX: Double = js.native
  var centerY: Double = js.native
  var radius: Double = js.native
  var worldX: js.Any = js.native
  var worldY: js.Any = js.native
  /* CompleteClass */
  override def begin(skeleton: Skeleton): Unit = js.native
  /* CompleteClass */
  override def end(): Unit = js.native
  /* CompleteClass */
  override def transform(position: Vector2, uv: Vector2, light: Color, dark: Color): Unit = js.native
}

/* static members */
@JSGlobal("spine.SwirlEffect")
@js.native
object SwirlEffect extends js.Object {
  var interpolation: PowOut = js.native
}

