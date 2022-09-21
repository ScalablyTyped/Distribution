package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnimationStateData[SkeletonData /* <: ISkeletonData[
IBoneData, 
ISlotData, 
ISkin, 
IAnimation[ITimeline], 
IEventData, 
IIkConstraintData, 
ITransformConstraintData, 
IPathConstraintData] */, Animation /* <: IAnimation[ITimeline] */] extends StObject {
  
  var animationToMixTime: Map2[Double]
  
  var defaultMix: Double
  
  def getMix(from: Animation, to: Animation): Double
  
  def setMix(fromName: String, toName: String, duration: Double): Unit
  
  def setMixWith(from: Animation, to: Animation, duration: Double): Unit
  
  var skeletonData: SkeletonData
}
object IAnimationStateData {
  
  inline def apply[SkeletonData /* <: ISkeletonData[
    IBoneData, 
    ISlotData, 
    ISkin, 
    IAnimation[ITimeline], 
    IEventData, 
    IIkConstraintData, 
    ITransformConstraintData, 
    IPathConstraintData
  ] */, Animation /* <: IAnimation[ITimeline] */](
    animationToMixTime: Map2[Double],
    defaultMix: Double,
    getMix: (Animation, Animation) => Double,
    setMix: (String, String, Double) => Unit,
    setMixWith: (Animation, Animation, Double) => Unit,
    skeletonData: SkeletonData
  ): IAnimationStateData[SkeletonData, Animation] = {
    val __obj = js.Dynamic.literal(animationToMixTime = animationToMixTime.asInstanceOf[js.Any], defaultMix = defaultMix.asInstanceOf[js.Any], getMix = js.Any.fromFunction2(getMix), setMix = js.Any.fromFunction3(setMix), setMixWith = js.Any.fromFunction3(setMixWith), skeletonData = skeletonData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimationStateData[SkeletonData, Animation]]
  }
  
  extension [Self <: IAnimationStateData[?, ?], SkeletonData /* <: ISkeletonData[
    IBoneData, 
    ISlotData, 
    ISkin, 
    IAnimation[ITimeline], 
    IEventData, 
    IIkConstraintData, 
    ITransformConstraintData, 
    IPathConstraintData
  ] */, Animation /* <: IAnimation[ITimeline] */](x: Self & (IAnimationStateData[SkeletonData, Animation])) {
    
    inline def setAnimationToMixTime(value: Map2[Double]): Self = StObject.set(x, "animationToMixTime", value.asInstanceOf[js.Any])
    
    inline def setDefaultMix(value: Double): Self = StObject.set(x, "defaultMix", value.asInstanceOf[js.Any])
    
    inline def setGetMix(value: (Animation, Animation) => Double): Self = StObject.set(x, "getMix", js.Any.fromFunction2(value))
    
    inline def setSetMix(value: (String, String, Double) => Unit): Self = StObject.set(x, "setMix", js.Any.fromFunction3(value))
    
    inline def setSetMixWith(value: (Animation, Animation, Double) => Unit): Self = StObject.set(x, "setMixWith", js.Any.fromFunction3(value))
    
    inline def setSkeletonData(value: SkeletonData): Self = StObject.set(x, "skeletonData", value.asInstanceOf[js.Any])
  }
}
