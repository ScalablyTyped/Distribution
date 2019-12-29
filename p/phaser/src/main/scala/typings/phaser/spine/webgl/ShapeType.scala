package typings.phaser.spine.webgl

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShapeType with Double] = js.native
  /* 4 */ @js.native
  object Filled extends TopLevel[Filled with Double]
  
  /* 1 */ @js.native
  object Line extends TopLevel[Line with Double]
  
  /* 0 */ @js.native
  object Point extends TopLevel[Point with Double]
  
}

