package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimelineType extends js.Object

@JSGlobal("spine.TimelineType")
@js.native
object TimelineType extends js.Object {
  @js.native
  sealed trait attachment extends TimelineType
  
  @js.native
  sealed trait color extends TimelineType
  
  @js.native
  sealed trait deform extends TimelineType
  
  @js.native
  sealed trait drawOrder extends TimelineType
  
  @js.native
  sealed trait event extends TimelineType
  
  @js.native
  sealed trait ikConstraint extends TimelineType
  
  @js.native
  sealed trait pathConstraintMix extends TimelineType
  
  @js.native
  sealed trait pathConstraintPosition extends TimelineType
  
  @js.native
  sealed trait pathConstraintSpacing extends TimelineType
  
  @js.native
  sealed trait rotate extends TimelineType
  
  @js.native
  sealed trait scale extends TimelineType
  
  @js.native
  sealed trait shear extends TimelineType
  
  @js.native
  sealed trait transformConstraint extends TimelineType
  
  @js.native
  sealed trait translate extends TimelineType
  
  @js.native
  sealed trait twoColor extends TimelineType
  
  /* 4 */ val attachment: typings.phaser.spine.TimelineType.attachment with Double = js.native
  /* 5 */ val color: typings.phaser.spine.TimelineType.color with Double = js.native
  /* 6 */ val deform: typings.phaser.spine.TimelineType.deform with Double = js.native
  /* 8 */ val drawOrder: typings.phaser.spine.TimelineType.drawOrder with Double = js.native
  /* 7 */ val event: typings.phaser.spine.TimelineType.event with Double = js.native
  /* 9 */ val ikConstraint: typings.phaser.spine.TimelineType.ikConstraint with Double = js.native
  /* 13 */ val pathConstraintMix: typings.phaser.spine.TimelineType.pathConstraintMix with Double = js.native
  /* 11 */ val pathConstraintPosition: typings.phaser.spine.TimelineType.pathConstraintPosition with Double = js.native
  /* 12 */ val pathConstraintSpacing: typings.phaser.spine.TimelineType.pathConstraintSpacing with Double = js.native
  /* 0 */ val rotate: typings.phaser.spine.TimelineType.rotate with Double = js.native
  /* 2 */ val scale: typings.phaser.spine.TimelineType.scale with Double = js.native
  /* 3 */ val shear: typings.phaser.spine.TimelineType.shear with Double = js.native
  /* 10 */ val transformConstraint: typings.phaser.spine.TimelineType.transformConstraint with Double = js.native
  /* 1 */ val translate: typings.phaser.spine.TimelineType.translate with Double = js.native
  /* 14 */ val twoColor: typings.phaser.spine.TimelineType.twoColor with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineType with Double] = js.native
}

