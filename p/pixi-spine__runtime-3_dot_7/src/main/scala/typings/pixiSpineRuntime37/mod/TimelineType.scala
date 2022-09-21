package typings.pixiSpineRuntime37.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimelineType extends StObject
@JSImport("@pixi-spine/runtime-3.7", "TimelineType")
@js.native
object TimelineType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineType & Double] = js.native
  
  @js.native
  sealed trait attachment
    extends StObject
       with TimelineType
  /* 4 */ val attachment: typings.pixiSpineRuntime37.mod.TimelineType.attachment & Double = js.native
  
  @js.native
  sealed trait color
    extends StObject
       with TimelineType
  /* 5 */ val color: typings.pixiSpineRuntime37.mod.TimelineType.color & Double = js.native
  
  @js.native
  sealed trait deform
    extends StObject
       with TimelineType
  /* 6 */ val deform: typings.pixiSpineRuntime37.mod.TimelineType.deform & Double = js.native
  
  @js.native
  sealed trait drawOrder
    extends StObject
       with TimelineType
  /* 8 */ val drawOrder: typings.pixiSpineRuntime37.mod.TimelineType.drawOrder & Double = js.native
  
  @js.native
  sealed trait event
    extends StObject
       with TimelineType
  /* 7 */ val event: typings.pixiSpineRuntime37.mod.TimelineType.event & Double = js.native
  
  @js.native
  sealed trait ikConstraint
    extends StObject
       with TimelineType
  /* 9 */ val ikConstraint: typings.pixiSpineRuntime37.mod.TimelineType.ikConstraint & Double = js.native
  
  @js.native
  sealed trait pathConstraintMix
    extends StObject
       with TimelineType
  /* 13 */ val pathConstraintMix: typings.pixiSpineRuntime37.mod.TimelineType.pathConstraintMix & Double = js.native
  
  @js.native
  sealed trait pathConstraintPosition
    extends StObject
       with TimelineType
  /* 11 */ val pathConstraintPosition: typings.pixiSpineRuntime37.mod.TimelineType.pathConstraintPosition & Double = js.native
  
  @js.native
  sealed trait pathConstraintSpacing
    extends StObject
       with TimelineType
  /* 12 */ val pathConstraintSpacing: typings.pixiSpineRuntime37.mod.TimelineType.pathConstraintSpacing & Double = js.native
  
  @js.native
  sealed trait rotate
    extends StObject
       with TimelineType
  /* 0 */ val rotate: typings.pixiSpineRuntime37.mod.TimelineType.rotate & Double = js.native
  
  @js.native
  sealed trait scale
    extends StObject
       with TimelineType
  /* 2 */ val scale: typings.pixiSpineRuntime37.mod.TimelineType.scale & Double = js.native
  
  @js.native
  sealed trait shear
    extends StObject
       with TimelineType
  /* 3 */ val shear: typings.pixiSpineRuntime37.mod.TimelineType.shear & Double = js.native
  
  @js.native
  sealed trait transformConstraint
    extends StObject
       with TimelineType
  /* 10 */ val transformConstraint: typings.pixiSpineRuntime37.mod.TimelineType.transformConstraint & Double = js.native
  
  @js.native
  sealed trait translate
    extends StObject
       with TimelineType
  /* 1 */ val translate: typings.pixiSpineRuntime37.mod.TimelineType.translate & Double = js.native
  
  @js.native
  sealed trait twoColor
    extends StObject
       with TimelineType
  /* 14 */ val twoColor: typings.pixiSpineRuntime37.mod.TimelineType.twoColor & Double = js.native
}
