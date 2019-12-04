package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.JitterEffect")
@js.native
class JitterEffect protected () extends VertexEffect {
  def this(jitterX: Double, jitterY: Double) = this()
  var jitterX: Double = js.native
  var jitterY: Double = js.native
  /* CompleteClass */
  override def begin(skeleton: Skeleton): Unit = js.native
  /* CompleteClass */
  override def end(): Unit = js.native
  /* CompleteClass */
  override def transform(position: Vector2, uv: Vector2, light: Color, dark: Color): Unit = js.native
}

