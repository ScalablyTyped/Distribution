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
    begin: js.Function1[Skeleton, scala.Unit],
    end: js.Function0[scala.Unit],
    transform: js.Function4[Vector2, Vector2, Color, Color, scala.Unit]
  ): VertexEffect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("begin")(begin)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[VertexEffect]
  }
}

