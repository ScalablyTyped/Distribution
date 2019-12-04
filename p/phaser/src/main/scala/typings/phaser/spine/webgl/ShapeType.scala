package typings.phaser.spine.webgl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeType extends js.Object

@JSGlobal("spine.webgl.ShapeType")
@js.native
object ShapeType extends js.Object {
  @js.native
  sealed trait Filled extends ShapeType
  
  @js.native
  sealed trait Line extends ShapeType
  
  @js.native
  sealed trait Point extends ShapeType
  
  /* 4 */ val Filled: typings.phaser.spine.webgl.ShapeType.Filled with Double = js.native
  /* 1 */ val Line: typings.phaser.spine.webgl.ShapeType.Line with Double = js.native
  /* 0 */ val Point: typings.phaser.spine.webgl.ShapeType.Point with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShapeType with Double] = js.native
}

