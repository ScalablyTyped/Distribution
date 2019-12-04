package typings.phaser.spine.webgl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VertexAttributeType extends js.Object

@JSGlobal("spine.webgl.VertexAttributeType")
@js.native
object VertexAttributeType extends js.Object {
  @js.native
  sealed trait Float extends VertexAttributeType
  
  /* 0 */ val Float: typings.phaser.spine.webgl.VertexAttributeType.Float with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VertexAttributeType with Double] = js.native
}

