package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/base", "DebugUtils")
@js.native
open class DebugUtils () extends StObject
/* static members */
object DebugUtils {
  
  @JSImport("@pixi-spine/base", "DebugUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def logBones(
    skeleton: ISkeleton[
      ISkeletonData[
        IBoneData, 
        ISlotData, 
        ISkin, 
        IAnimation[ITimeline], 
        IEventData, 
        IIkConstraintData, 
        ITransformConstraintData, 
        IPathConstraintData
      ], 
      IBone, 
      ISlot, 
      ISkin
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logBones")(skeleton.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
