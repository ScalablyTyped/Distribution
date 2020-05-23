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
  
}

