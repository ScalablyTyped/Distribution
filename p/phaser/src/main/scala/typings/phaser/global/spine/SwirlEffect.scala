package typings.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.SwirlEffect")
@js.native
class SwirlEffect protected ()
  extends typings.phaser.spine.SwirlEffect {
  def this(radius: Double) = this()
  /* CompleteClass */
  override var angle: Double = js.native
  /* CompleteClass */
  override var centerX: Double = js.native
  /* CompleteClass */
  override var centerY: Double = js.native
  /* CompleteClass */
  override var radius: Double = js.native
  /* CompleteClass */
  override var worldX: js.Any = js.native
  /* CompleteClass */
  override var worldY: js.Any = js.native
  /* CompleteClass */
  override def begin(skeleton: typings.phaser.spine.Skeleton): Unit = js.native
  /* CompleteClass */
  override def end(): Unit = js.native
  /* CompleteClass */
  override def transform(
    position: typings.phaser.spine.Vector2,
    uv: typings.phaser.spine.Vector2,
    light: typings.phaser.spine.Color,
    dark: typings.phaser.spine.Color
  ): Unit = js.native
}

/* static members */
@JSGlobal("spine.SwirlEffect")
@js.native
object SwirlEffect extends js.Object {
  var interpolation: typings.phaser.spine.PowOut = js.native
}

