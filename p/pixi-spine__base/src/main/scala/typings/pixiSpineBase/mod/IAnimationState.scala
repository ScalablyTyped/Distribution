package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnimationState[AnimationStateData /* <: IAnimationStateData[
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
IAnimation[ITimeline]] */] extends StObject {
  
  def addAnimation(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): ITrackEntry
  
  def addEmptyAnimation(trackIndex: Double, mixDuration: Double, delay: Double): ITrackEntry
  
  def addListener(listener: IAnimationStateListener): Unit
  
  @JSName("apply")
  def apply(
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
  ): Boolean
  
  def clearListeners(): Unit
  
  def clearTrack(index: Double): Unit
  
  def clearTracks(): Unit
  
  var data: AnimationStateData
  
  def hasAnimation(animationName: String): Boolean
  
  var listeners: js.Array[IAnimationStateListener]
  
  def removeListener(listener: IAnimationStateListener): Unit
  
  def setAnimation(trackIndex: Double, animationName: String, loop: Boolean): ITrackEntry
  
  def setEmptyAnimation(trackIndex: Double, mixDuration: Double): ITrackEntry
  
  def setEmptyAnimations(mixDuration: Double): Unit
  
  var timeScale: Double
  
  var tracks: js.Array[ITrackEntry]
  
  def update(dt: Double): Unit
}
object IAnimationState {
  
  inline def apply[AnimationStateData /* <: IAnimationStateData[
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
  ] */](
    addAnimation: (Double, String, Boolean, Double) => ITrackEntry,
    addEmptyAnimation: (Double, Double, Double) => ITrackEntry,
    addListener: IAnimationStateListener => Unit,
    apply: ISkeleton[
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
    ] => Boolean,
    clearListeners: () => Unit,
    clearTrack: Double => Unit,
    clearTracks: () => Unit,
    data: AnimationStateData,
    hasAnimation: String => Boolean,
    listeners: js.Array[IAnimationStateListener],
    removeListener: IAnimationStateListener => Unit,
    setAnimation: (Double, String, Boolean) => ITrackEntry,
    setEmptyAnimation: (Double, Double) => ITrackEntry,
    setEmptyAnimations: Double => Unit,
    timeScale: Double,
    tracks: js.Array[ITrackEntry],
    update: Double => Unit
  ): IAnimationState[AnimationStateData] = {
    val __obj = js.Dynamic.literal(addAnimation = js.Any.fromFunction4(addAnimation), addEmptyAnimation = js.Any.fromFunction3(addEmptyAnimation), addListener = js.Any.fromFunction1(addListener), apply = js.Any.fromFunction1(apply), clearListeners = js.Any.fromFunction0(clearListeners), clearTrack = js.Any.fromFunction1(clearTrack), clearTracks = js.Any.fromFunction0(clearTracks), data = data.asInstanceOf[js.Any], hasAnimation = js.Any.fromFunction1(hasAnimation), listeners = listeners.asInstanceOf[js.Any], removeListener = js.Any.fromFunction1(removeListener), setAnimation = js.Any.fromFunction3(setAnimation), setEmptyAnimation = js.Any.fromFunction2(setEmptyAnimation), setEmptyAnimations = js.Any.fromFunction1(setEmptyAnimations), timeScale = timeScale.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[IAnimationState[AnimationStateData]]
  }
  
  extension [Self <: IAnimationState[?], AnimationStateData /* <: IAnimationStateData[
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
  ] */](x: Self & IAnimationState[AnimationStateData]) {
    
    inline def setAddAnimation(value: (Double, String, Boolean, Double) => ITrackEntry): Self = StObject.set(x, "addAnimation", js.Any.fromFunction4(value))
    
    inline def setAddEmptyAnimation(value: (Double, Double, Double) => ITrackEntry): Self = StObject.set(x, "addEmptyAnimation", js.Any.fromFunction3(value))
    
    inline def setAddListener(value: IAnimationStateListener => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
    
    inline def setApply(
      value: ISkeleton[
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
        ] => Boolean
    ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setClearListeners(value: () => Unit): Self = StObject.set(x, "clearListeners", js.Any.fromFunction0(value))
    
    inline def setClearTrack(value: Double => Unit): Self = StObject.set(x, "clearTrack", js.Any.fromFunction1(value))
    
    inline def setClearTracks(value: () => Unit): Self = StObject.set(x, "clearTracks", js.Any.fromFunction0(value))
    
    inline def setData(value: AnimationStateData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHasAnimation(value: String => Boolean): Self = StObject.set(x, "hasAnimation", js.Any.fromFunction1(value))
    
    inline def setListeners(value: js.Array[IAnimationStateListener]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersVarargs(value: IAnimationStateListener*): Self = StObject.set(x, "listeners", js.Array(value*))
    
    inline def setRemoveListener(value: IAnimationStateListener => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    
    inline def setSetAnimation(value: (Double, String, Boolean) => ITrackEntry): Self = StObject.set(x, "setAnimation", js.Any.fromFunction3(value))
    
    inline def setSetEmptyAnimation(value: (Double, Double) => ITrackEntry): Self = StObject.set(x, "setEmptyAnimation", js.Any.fromFunction2(value))
    
    inline def setSetEmptyAnimations(value: Double => Unit): Self = StObject.set(x, "setEmptyAnimations", js.Any.fromFunction1(value))
    
    inline def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: js.Array[ITrackEntry]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: ITrackEntry*): Self = StObject.set(x, "tracks", js.Array(value*))
    
    inline def setUpdate(value: Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
