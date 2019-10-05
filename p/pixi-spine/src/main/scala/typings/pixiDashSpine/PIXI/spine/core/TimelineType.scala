package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimelineType extends js.Object

@JSGlobal("PIXI.spine.core.TimelineType")
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
  
  /* 4 */ val attachment: typings.pixiDashSpine.PIXI.spine.core.TimelineType.attachment with Double = js.native
  /* 5 */ val color: typings.pixiDashSpine.PIXI.spine.core.TimelineType.color with Double = js.native
  /* 6 */ val deform: typings.pixiDashSpine.PIXI.spine.core.TimelineType.deform with Double = js.native
  /* 8 */ val drawOrder: typings.pixiDashSpine.PIXI.spine.core.TimelineType.drawOrder with Double = js.native
  /* 7 */ val event: typings.pixiDashSpine.PIXI.spine.core.TimelineType.event with Double = js.native
  /* 9 */ val ikConstraint: typings.pixiDashSpine.PIXI.spine.core.TimelineType.ikConstraint with Double = js.native
  /* 13 */ val pathConstraintMix: typings.pixiDashSpine.PIXI.spine.core.TimelineType.pathConstraintMix with Double = js.native
  /* 11 */ val pathConstraintPosition: typings.pixiDashSpine.PIXI.spine.core.TimelineType.pathConstraintPosition with Double = js.native
  /* 12 */ val pathConstraintSpacing: typings.pixiDashSpine.PIXI.spine.core.TimelineType.pathConstraintSpacing with Double = js.native
  /* 0 */ val rotate: typings.pixiDashSpine.PIXI.spine.core.TimelineType.rotate with Double = js.native
  /* 2 */ val scale: typings.pixiDashSpine.PIXI.spine.core.TimelineType.scale with Double = js.native
  /* 3 */ val shear: typings.pixiDashSpine.PIXI.spine.core.TimelineType.shear with Double = js.native
  /* 10 */ val transformConstraint: typings.pixiDashSpine.PIXI.spine.core.TimelineType.transformConstraint with Double = js.native
  /* 1 */ val translate: typings.pixiDashSpine.PIXI.spine.core.TimelineType.translate with Double = js.native
  /* 14 */ val twoColor: typings.pixiDashSpine.PIXI.spine.core.TimelineType.twoColor with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineType with Double] = js.native
}

