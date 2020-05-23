package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwirlEffect extends VertexEffect {
  var angle: Double
  var centerX: Double
  var centerY: Double
  var radius: Double
  var worldX: js.Any
  var worldY: js.Any
}

object SwirlEffect {
  @scala.inline
  def apply(
    angle: Double,
    begin: Skeleton => Unit,
    centerX: Double,
    centerY: Double,
    end: () => Unit,
    radius: Double,
    transform: (Vector2, Vector2, Color, Color) => Unit,
    worldX: js.Any,
    worldY: js.Any
  ): SwirlEffect = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], begin = js.Any.fromFunction1(begin), centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), radius = radius.asInstanceOf[js.Any], transform = js.Any.fromFunction4(transform), worldX = worldX.asInstanceOf[js.Any], worldY = worldY.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwirlEffect]
  }
}

