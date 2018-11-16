package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimelineType extends js.Object

@JSGlobal("spine.TimelineType")
@js.native
object TimelineType extends js.Object {
  @js.native
  sealed trait attachment
    extends phaserLib.spineNs.TimelineType
  
  @js.native
  sealed trait color
    extends phaserLib.spineNs.TimelineType
  
  @js.native
  sealed trait deform
    extends phaserLib.spineNs.TimelineType
  
  @js.native
  sealed trait drawOrder
    extends phaserLib.spineNs.TimelineType
  
  @js.native
  sealed trait event
    extends phaserLib.spineNs.TimelineType
  
  @js.native
  sealed trait ikConstraint
    extends phaserLib.spineNs.TimelineType
  
  @js.native
  sealed trait pathConstraintMix
    extends phaserLib.spineNs.TimelineType
  
  @js.native
  sealed trait pathConstraintPosition
    extends phaserLib.spineNs.TimelineType
  
  @js.native
  sealed trait pathConstraintSpacing
    extends phaserLib.spineNs.TimelineType
  
  @js.native
  sealed trait rotate
    extends phaserLib.spineNs.TimelineType
  
  @js.native
  sealed trait scale
    extends phaserLib.spineNs.TimelineType
  
  @js.native
  sealed trait shear
    extends phaserLib.spineNs.TimelineType
  
  @js.native
  sealed trait transformConstraint
    extends phaserLib.spineNs.TimelineType
  
  @js.native
  sealed trait translate
    extends phaserLib.spineNs.TimelineType
  
  @js.native
  sealed trait twoColor
    extends phaserLib.spineNs.TimelineType
  
  /* 4 */ val attachment: attachment with scala.Double = js.native
  /* 5 */ val color: color with scala.Double = js.native
  /* 6 */ val deform: deform with scala.Double = js.native
  /* 8 */ val drawOrder: drawOrder with scala.Double = js.native
  /* 7 */ val event: event with scala.Double = js.native
  /* 9 */ val ikConstraint: ikConstraint with scala.Double = js.native
  /* 13 */ val pathConstraintMix: pathConstraintMix with scala.Double = js.native
  /* 11 */ val pathConstraintPosition: pathConstraintPosition with scala.Double = js.native
  /* 12 */ val pathConstraintSpacing: pathConstraintSpacing with scala.Double = js.native
  /* 0 */ val rotate: rotate with scala.Double = js.native
  /* 2 */ val scale: scale with scala.Double = js.native
  /* 3 */ val shear: shear with scala.Double = js.native
  /* 10 */ val transformConstraint: transformConstraint with scala.Double = js.native
  /* 1 */ val translate: translate with scala.Double = js.native
  /* 14 */ val twoColor: twoColor with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.spineNs.TimelineType with scala.Double] = js.native
}

