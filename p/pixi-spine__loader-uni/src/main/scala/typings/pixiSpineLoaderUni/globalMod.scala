package typings.pixiSpineLoaderUni

import typings.pixiSpineBase.mod.IAnimation
import typings.pixiSpineBase.mod.IBoneData
import typings.pixiSpineBase.mod.IEventData
import typings.pixiSpineBase.mod.IIkConstraintData
import typings.pixiSpineBase.mod.IPathConstraintData
import typings.pixiSpineBase.mod.ISkeletonData
import typings.pixiSpineBase.mod.ISkin
import typings.pixiSpineBase.mod.ISlotData
import typings.pixiSpineBase.mod.ITimeline
import typings.pixiSpineBase.mod.ITransformConstraintData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  object GlobalMixins {
    
    trait LoaderResource extends StObject {
      
      var spineData: js.UndefOr[
            ISkeletonData[
              IBoneData, 
              ISlotData, 
              ISkin, 
              IAnimation[ITimeline], 
              IEventData, 
              IIkConstraintData, 
              ITransformConstraintData, 
              IPathConstraintData
            ]
          ] = js.undefined
    }
    object LoaderResource {
      
      inline def apply(): LoaderResource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LoaderResource]
      }
      
      extension [Self <: LoaderResource](x: Self) {
        
        inline def setSpineData(
          value: ISkeletonData[
                  IBoneData, 
                  ISlotData, 
                  ISkin, 
                  IAnimation[ITimeline], 
                  IEventData, 
                  IIkConstraintData, 
                  ITransformConstraintData, 
                  IPathConstraintData
                ]
        ): Self = StObject.set(x, "spineData", value.asInstanceOf[js.Any])
        
        inline def setSpineDataUndefined: Self = StObject.set(x, "spineData", js.undefined)
      }
    }
  }
}
