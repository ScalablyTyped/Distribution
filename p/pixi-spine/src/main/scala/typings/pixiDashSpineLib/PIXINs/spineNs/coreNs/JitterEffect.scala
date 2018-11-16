package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.JitterEffect")
@js.native
class JitterEffect protected () extends VertexEffect {
  def this(jitterX: scala.Double, jitterY: scala.Double) = this()
  var jitterX: scala.Double = js.native
  var jitterY: scala.Double = js.native
  /* CompleteClass */
  override def begin(skeleton: Skeleton): scala.Unit = js.native
  /* CompleteClass */
  override def end(): scala.Unit = js.native
  /* CompleteClass */
  override def transform(position: Vector2, uv: Vector2, light: Color, dark: Color): scala.Unit = js.native
}

