package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexEffect extends js.Object {
  def begin(skeleton: Skeleton): Unit
  def end(): Unit
  def transform(position: Vector2, uv: Vector2, light: Color, dark: Color): Unit
}

object VertexEffect {
  @scala.inline
  def apply(begin: Skeleton => Unit, end: () => Unit, transform: (Vector2, Vector2, Color, Color) => Unit): VertexEffect = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1(begin), end = js.Any.fromFunction0(end), transform = js.Any.fromFunction4(transform))
    __obj.asInstanceOf[VertexEffect]
  }
}

