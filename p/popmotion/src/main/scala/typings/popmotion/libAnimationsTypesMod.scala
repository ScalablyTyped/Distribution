package typings.popmotion

import typings.popmotion.anon.Done
import typings.popmotion.libEasingTypesMod.Easing
import typings.popmotion.popmotionStrings.decay
import typings.popmotion.popmotionStrings.keyframes
import typings.popmotion.popmotionStrings.loop
import typings.popmotion.popmotionStrings.mirror
import typings.popmotion.popmotionStrings.reverse
import typings.popmotion.popmotionStrings.spring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimationsTypesMod {
  
  trait Animation[V] extends StObject {
    
    def flipTarget(): Unit
    
    def next(t: Double): Done[V]
  }
  object Animation {
    
    inline def apply[V](flipTarget: () => Unit, next: Double => Done[V]): Animation[V] = {
      val __obj = js.Dynamic.literal(flipTarget = js.Any.fromFunction0(flipTarget), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Animation[V]]
    }
    
    extension [Self <: Animation[?], V](x: Self & Animation[V]) {
      
      inline def setFlipTarget(value: () => Unit): Self = StObject.set(x, "flipTarget", js.Any.fromFunction0(value))
      
      inline def setNext(value: Double => Done[V]): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  type AnimationOptions[V] = (DecayOptions & PlaybackOptions[V]) | (KeyframeOptions[V] & PlaybackOptions[V]) | (SpringOptions & PlaybackOptions[V])
  
  trait AnimationState[V] extends StObject {
    
    var done: Boolean
    
    var value: V
  }
  object AnimationState {
    
    inline def apply[V](done: Boolean, value: V): AnimationState[V] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationState[V]]
    }
    
    extension [Self <: AnimationState[?], V](x: Self & AnimationState[V]) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DecayOptions extends StObject {
    
    var from: js.UndefOr[Double] = js.undefined
    
    var modifyTarget: js.UndefOr[js.Function1[/* target */ Double, Double]] = js.undefined
    
    var power: js.UndefOr[Double] = js.undefined
    
    var restDelta: js.UndefOr[Double] = js.undefined
    
    var timeConstant: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[Double] = js.undefined
    
    var velocity: js.UndefOr[Double] = js.undefined
  }
  object DecayOptions {
    
    inline def apply(): DecayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecayOptions]
    }
    
    extension [Self <: DecayOptions](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setModifyTarget(value: /* target */ Double => Double): Self = StObject.set(x, "modifyTarget", js.Any.fromFunction1(value))
      
      inline def setModifyTargetUndefined: Self = StObject.set(x, "modifyTarget", js.undefined)
      
      inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
      
      inline def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
      
      inline def setRestDelta(value: Double): Self = StObject.set(x, "restDelta", value.asInstanceOf[js.Any])
      
      inline def setRestDeltaUndefined: Self = StObject.set(x, "restDelta", js.undefined)
      
      inline def setTimeConstant(value: Double): Self = StObject.set(x, "timeConstant", value.asInstanceOf[js.Any])
      
      inline def setTimeConstantUndefined: Self = StObject.set(x, "timeConstant", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    }
  }
  
  type Driver = js.Function1[/* update */ Update, DriverControls]
  
  trait DriverControls extends StObject {
    
    def start(): Unit
    
    def stop(): Unit
  }
  object DriverControls {
    
    inline def apply(start: () => Unit, stop: () => Unit): DriverControls = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[DriverControls]
    }
    
    extension [Self <: DriverControls](x: Self) {
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait InertiaOptions
    extends StObject
       with DecayOptions {
    
    var bounceDamping: js.UndefOr[Double] = js.undefined
    
    var bounceStiffness: js.UndefOr[Double] = js.undefined
    
    var driver: js.UndefOr[Driver] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onStop: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* v */ Double, Unit]] = js.undefined
    
    var restSpeed: js.UndefOr[Double] = js.undefined
  }
  object InertiaOptions {
    
    inline def apply(): InertiaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InertiaOptions]
    }
    
    extension [Self <: InertiaOptions](x: Self) {
      
      inline def setBounceDamping(value: Double): Self = StObject.set(x, "bounceDamping", value.asInstanceOf[js.Any])
      
      inline def setBounceDampingUndefined: Self = StObject.set(x, "bounceDamping", js.undefined)
      
      inline def setBounceStiffness(value: Double): Self = StObject.set(x, "bounceStiffness", value.asInstanceOf[js.Any])
      
      inline def setBounceStiffnessUndefined: Self = StObject.set(x, "bounceStiffness", js.undefined)
      
      inline def setDriver(value: /* update */ Update => DriverControls): Self = StObject.set(x, "driver", js.Any.fromFunction1(value))
      
      inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnStop(value: () => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction0(value))
      
      inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      inline def setOnUpdate(value: /* v */ Double => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setRestSpeed(value: Double): Self = StObject.set(x, "restSpeed", value.asInstanceOf[js.Any])
      
      inline def setRestSpeedUndefined: Self = StObject.set(x, "restSpeed", js.undefined)
    }
  }
  
  trait KeyframeOptions[V] extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var ease: js.UndefOr[Easing | js.Array[Easing]] = js.undefined
    
    var from: js.UndefOr[V] = js.undefined
    
    var offset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var to: V | js.Array[V]
  }
  object KeyframeOptions {
    
    inline def apply[V](to: V | js.Array[V]): KeyframeOptions[V] = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyframeOptions[V]]
    }
    
    extension [Self <: KeyframeOptions[?], V](x: Self & KeyframeOptions[V]) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEase(value: Easing | js.Array[Easing]): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      inline def setEaseFunction1(value: /* v */ Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
      
      inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      inline def setEaseVarargs(value: Easing*): Self = StObject.set(x, "ease", js.Array(value*))
      
      inline def setFrom(value: V): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setTo(value: V | js.Array[V]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToVarargs(value: V*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
  
  trait PhysicsSpringOptions extends StObject {
    
    var damping: js.UndefOr[Double] = js.undefined
    
    var mass: js.UndefOr[Double] = js.undefined
    
    var stiffness: js.UndefOr[Double] = js.undefined
    
    var velocity: js.UndefOr[Double] = js.undefined
  }
  object PhysicsSpringOptions {
    
    inline def apply(): PhysicsSpringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhysicsSpringOptions]
    }
    
    extension [Self <: PhysicsSpringOptions](x: Self) {
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
      
      inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
      
      inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    }
  }
  
  trait PlaybackControls extends StObject {
    
    def stop(): Unit
  }
  object PlaybackControls {
    
    inline def apply(stop: () => Unit): PlaybackControls = {
      val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[PlaybackControls]
    }
    
    extension [Self <: PlaybackControls](x: Self) {
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait PlaybackOptions[V] extends StObject {
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var driver: js.UndefOr[Driver] = js.undefined
    
    var elapsed: js.UndefOr[Double] = js.undefined
    
    var from: js.UndefOr[V] = js.undefined
    
    var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onRepeat: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onStop: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* latest */ V, Unit]] = js.undefined
    
    var repeat: js.UndefOr[Double] = js.undefined
    
    var repeatDelay: js.UndefOr[Double] = js.undefined
    
    var repeatType: js.UndefOr[loop | reverse | mirror] = js.undefined
    
    var `type`: js.UndefOr[spring | decay | keyframes] = js.undefined
  }
  object PlaybackOptions {
    
    inline def apply[V](): PlaybackOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaybackOptions[V]]
    }
    
    extension [Self <: PlaybackOptions[?], V](x: Self & PlaybackOptions[V]) {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setDriver(value: /* update */ Update => DriverControls): Self = StObject.set(x, "driver", js.Any.fromFunction1(value))
      
      inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
      
      inline def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      inline def setElapsedUndefined: Self = StObject.set(x, "elapsed", js.undefined)
      
      inline def setFrom(value: V): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnPlay(value: () => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction0(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnRepeat(value: () => Unit): Self = StObject.set(x, "onRepeat", js.Any.fromFunction0(value))
      
      inline def setOnRepeatUndefined: Self = StObject.set(x, "onRepeat", js.undefined)
      
      inline def setOnStop(value: () => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction0(value))
      
      inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      inline def setOnUpdate(value: /* latest */ V => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
      
      inline def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
      
      inline def setRepeatType(value: loop | reverse | mirror): Self = StObject.set(x, "repeatType", value.asInstanceOf[js.Any])
      
      inline def setRepeatTypeUndefined: Self = StObject.set(x, "repeatType", js.undefined)
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setType(value: spring | decay | keyframes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SpringOptions
    extends StObject
       with PhysicsSpringOptions {
    
    var bounce: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var from: js.UndefOr[Double] = js.undefined
    
    var restDelta: js.UndefOr[Double] = js.undefined
    
    var restSpeed: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[Double] = js.undefined
  }
  object SpringOptions {
    
    inline def apply(): SpringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpringOptions]
    }
    
    extension [Self <: SpringOptions](x: Self) {
      
      inline def setBounce(value: Double): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setRestDelta(value: Double): Self = StObject.set(x, "restDelta", value.asInstanceOf[js.Any])
      
      inline def setRestDeltaUndefined: Self = StObject.set(x, "restDelta", js.undefined)
      
      inline def setRestSpeed(value: Double): Self = StObject.set(x, "restSpeed", value.asInstanceOf[js.Any])
      
      inline def setRestSpeedUndefined: Self = StObject.set(x, "restSpeed", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  type Update = js.Function1[/* timestamp */ Double, Unit]
}
