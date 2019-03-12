package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexEffect extends js.Object {
  def begin(skeleton: Skeleton): scala.Unit
  def end(): scala.Unit
  def transform(position: Vector2, uv: Vector2, light: Color, dark: Color): scala.Unit
}

object VertexEffect {
  @scala.inline
  def apply(
    begin: Skeleton => scala.Unit,
    end: () => scala.Unit,
    transform: (Vector2, Vector2, Color, Color) => scala.Unit
  ): VertexEffect = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1(begin), end = js.Any.fromFunction0(end), transform = js.Any.fromFunction4(transform))
  
    __obj.asInstanceOf[VertexEffect]
  }
}

