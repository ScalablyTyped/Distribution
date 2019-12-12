package typings.pixiDashSpine.PIXI.spine.core

import org.scalablytyped.runtime.TopLevel
import typings.pixiDashSpine.PIXI.spine.core.TimelineType.attachment
import typings.pixiDashSpine.PIXI.spine.core.TimelineType.color
import typings.pixiDashSpine.PIXI.spine.core.TimelineType.deform
import typings.pixiDashSpine.PIXI.spine.core.TimelineType.drawOrder
import typings.pixiDashSpine.PIXI.spine.core.TimelineType.event
import typings.pixiDashSpine.PIXI.spine.core.TimelineType.ikConstraint
import typings.pixiDashSpine.PIXI.spine.core.TimelineType.pathConstraintMix
import typings.pixiDashSpine.PIXI.spine.core.TimelineType.pathConstraintPosition
import typings.pixiDashSpine.PIXI.spine.core.TimelineType.pathConstraintSpacing
import typings.pixiDashSpine.PIXI.spine.core.TimelineType.rotate
import typings.pixiDashSpine.PIXI.spine.core.TimelineType.scale
import typings.pixiDashSpine.PIXI.spine.core.TimelineType.shear
import typings.pixiDashSpine.PIXI.spine.core.TimelineType.transformConstraint
import typings.pixiDashSpine.PIXI.spine.core.TimelineType.translate
import typings.pixiDashSpine.PIXI.spine.core.TimelineType.twoColor
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineType with Double] = js.native
  /* 4 */ @js.native
  object attachment extends TopLevel[attachment with Double]
  
  /* 5 */ @js.native
  object color extends TopLevel[color with Double]
  
  /* 6 */ @js.native
  object deform extends TopLevel[deform with Double]
  
  /* 8 */ @js.native
  object drawOrder extends TopLevel[drawOrder with Double]
  
  /* 7 */ @js.native
  object event extends TopLevel[event with Double]
  
  /* 9 */ @js.native
  object ikConstraint extends TopLevel[ikConstraint with Double]
  
  /* 13 */ @js.native
  object pathConstraintMix extends TopLevel[pathConstraintMix with Double]
  
  /* 11 */ @js.native
  object pathConstraintPosition extends TopLevel[pathConstraintPosition with Double]
  
  /* 12 */ @js.native
  object pathConstraintSpacing extends TopLevel[pathConstraintSpacing with Double]
  
  /* 0 */ @js.native
  object rotate extends TopLevel[rotate with Double]
  
  /* 2 */ @js.native
  object scale extends TopLevel[scale with Double]
  
  /* 3 */ @js.native
  object shear extends TopLevel[shear with Double]
  
  /* 10 */ @js.native
  object transformConstraint extends TopLevel[transformConstraint with Double]
  
  /* 1 */ @js.native
  object translate extends TopLevel[translate with Double]
  
  /* 14 */ @js.native
  object twoColor extends TopLevel[twoColor with Double]
  
}

