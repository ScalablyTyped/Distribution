package typings.pixiSpine.global.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.SwirlEffect")
@js.native
class SwirlEffect protected ()
  extends typings.pixiSpine.PIXI.spine.core.SwirlEffect {
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
  override def begin(skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton): Unit = js.native
  /* CompleteClass */
  override def end(): Unit = js.native
  /* CompleteClass */
  override def transform(
    position: typings.pixiSpine.PIXI.spine.core.Vector2,
    uv: typings.pixiSpine.PIXI.spine.core.Vector2,
    light: typings.pixiSpine.PIXI.spine.core.Color,
    dark: typings.pixiSpine.PIXI.spine.core.Color
  ): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.SwirlEffect")
@js.native
object SwirlEffect extends js.Object {
  var interpolation: typings.pixiSpine.PIXI.spine.core.PowOut = js.native
}

