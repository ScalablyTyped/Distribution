package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JitterEffect extends VertexEffect {
  var jitterX: Double
  var jitterY: Double
}

object JitterEffect {
  @scala.inline
  def apply(
    begin: Skeleton => Unit,
    end: () => Unit,
    jitterX: Double,
    jitterY: Double,
    transform: (Vector2, Vector2, Color, Color) => Unit
  ): JitterEffect = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1(begin), end = js.Any.fromFunction0(end), jitterX = jitterX.asInstanceOf[js.Any], jitterY = jitterY.asInstanceOf[js.Any], transform = js.Any.fromFunction4(transform))
    __obj.asInstanceOf[JitterEffect]
  }
}

