package typings.pixiSpineLoaderUni

import typings.pixiLoaders.mod.LoaderResource
import typings.pixiSpineBase.mod.IAnimation
import typings.pixiSpineBase.mod.IAnimationState
import typings.pixiSpineBase.mod.IAnimationStateData
import typings.pixiSpineBase.mod.IBone
import typings.pixiSpineBase.mod.IBoneData
import typings.pixiSpineBase.mod.IEventData
import typings.pixiSpineBase.mod.IIkConstraintData
import typings.pixiSpineBase.mod.IPathConstraintData
import typings.pixiSpineBase.mod.ISkeleton
import typings.pixiSpineBase.mod.ISkeletonData
import typings.pixiSpineBase.mod.ISkin
import typings.pixiSpineBase.mod.ISlot
import typings.pixiSpineBase.mod.ISlotData
import typings.pixiSpineBase.mod.ITimeline
import typings.pixiSpineBase.mod.ITransformConstraintData
import typings.pixiSpineBase.mod.SpineBase
import typings.pixiSpineLoaderBase.mod.AbstractSpineParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi-spine/loader-uni", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait SPINE_VERSION extends StObject
  @JSImport("@pixi-spine/loader-uni", "SPINE_VERSION")
  @js.native
  object SPINE_VERSION extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SPINE_VERSION & Double] = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with SPINE_VERSION
    /* 0 */ val UNKNOWN: typings.pixiSpineLoaderUni.mod.SPINE_VERSION.UNKNOWN & Double = js.native
    
    @js.native
    sealed trait VER37
      extends StObject
         with SPINE_VERSION
    /* 37 */ val VER37: typings.pixiSpineLoaderUni.mod.SPINE_VERSION.VER37 & Double = js.native
    
    @js.native
    sealed trait VER38
      extends StObject
         with SPINE_VERSION
    /* 38 */ val VER38: typings.pixiSpineLoaderUni.mod.SPINE_VERSION.VER38 & Double = js.native
    
    @js.native
    sealed trait VER40
      extends StObject
         with SPINE_VERSION
    /* 40 */ val VER40: typings.pixiSpineLoaderUni.mod.SPINE_VERSION.VER40 & Double = js.native
    
    @js.native
    sealed trait VER41
      extends StObject
         with SPINE_VERSION
    /* 41 */ val VER41: typings.pixiSpineLoaderUni.mod.SPINE_VERSION.VER41 & Double = js.native
  }
  
  @JSImport("@pixi-spine/loader-uni", "Spine")
  @js.native
  open class Spine protected () extends SpineBase[
          ISkeleton[
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
          ], 
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
          IAnimationState[
            IAnimationStateData[
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
              IAnimation[ITimeline]
            ]
          ], 
          IAnimationStateData[
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
            IAnimation[ITimeline]
          ]
        ] {
    def this(spineData: ISkeletonData[
            IBoneData, 
            ISlotData, 
            ISkin, 
            IAnimation[ITimeline], 
            IEventData, 
            IIkConstraintData, 
            ITransformConstraintData, 
            IPathConstraintData
          ]) = this()
  }
  
  @JSImport("@pixi-spine/loader-uni", "SpineParser")
  @js.native
  open class SpineParser () extends AbstractSpineParser
  /* static members */
  object SpineParser {
    
    @JSImport("@pixi-spine/loader-uni", "SpineParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def registerLoaderPlugin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLoaderPlugin")().asInstanceOf[Unit]
    
    inline def use(resource: LoaderResource, next: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  inline def detectSpineVersion(version: String): SPINE_VERSION = ^.asInstanceOf[js.Dynamic].applyDynamic("detectSpineVersion")(version.asInstanceOf[js.Any]).asInstanceOf[SPINE_VERSION]
}
