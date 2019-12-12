package typings.phaser.spine.webgl

import org.scalablytyped.runtime.TopLevel
import typings.phaser.spine.webgl.VertexAttributeType.Float
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VertexAttributeType with Double] = js.native
  /* 0 */ @js.native
  object Float extends TopLevel[Float with Double]
  
}

