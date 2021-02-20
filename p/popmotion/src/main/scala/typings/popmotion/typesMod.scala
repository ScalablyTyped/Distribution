package typings.popmotion

import typings.popmotion.anon.Done
import typings.popmotion.easingTypesMod.Easing
import typings.popmotion.popmotionStrings.decay
import typings.popmotion.popmotionStrings.keyframes
import typings.popmotion.popmotionStrings.loop
import typings.popmotion.popmotionStrings.mirror
import typings.popmotion.popmotionStrings.reverse
import typings.popmotion.popmotionStrings.spring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Animation[V] extends StObject {
    
    def flipTarget(): Unit = js.native
    
    def next(t: Double): Done[V] = js.native
  }
  object Animation {
    
    @scala.inline
    def apply[V](flipTarget: () => Unit, next: Double => Done[V]): Animation[V] = {
      val __obj = js.Dynamic.literal(flipTarget = js.Any.fromFunction0(flipTarget), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Animation[V]]
    }
    
    @scala.inline
    implicit class AnimationMutableBuilder[Self <: Animation[_], V] (val x: Self with Animation[V]) extends AnyVal {
      
      @scala.inline
      def setFlipTarget(value: () => Unit): Self = StObject.set(x, "flipTarget", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNext(value: Double => Done[V]): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  type AnimationOptions[V] = PlaybackOptions[V] with (DecayOptions | KeyframeOptions[V] | SpringOptions)
  
  @js.native
  trait AnimationState[V] extends StObject {
    
    var done: Boolean = js.native
    
    var value: V = js.native
  }
  object AnimationState {
    
    @scala.inline
    def apply[V](done: Boolean, value: V): AnimationState[V] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationState[V]]
    }
    
    @scala.inline
    implicit class AnimationStateMutableBuilder[Self <: AnimationState[_], V] (val x: Self with AnimationState[V]) extends AnyVal {
      
      @scala.inline
      def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DecayOptions extends StObject {
    
    var from: js.UndefOr[Double] = js.native
    
    var modifyTarget: js.UndefOr[js.Function1[/* target */ Double, Double]] = js.native
    
    var power: js.UndefOr[Double] = js.native
    
    var restDelta: js.UndefOr[Double] = js.native
    
    var timeConstant: js.UndefOr[Double] = js.native
    
    var to: js.UndefOr[Double] = js.native
    
    var velocity: js.UndefOr[Double] = js.native
  }
  object DecayOptions {
    
    @scala.inline
    def apply(): DecayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecayOptions]
    }
    
    @scala.inline
    implicit class DecayOptionsMutableBuilder[Self <: DecayOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setModifyTarget(value: /* target */ Double => Double): Self = StObject.set(x, "modifyTarget", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModifyTargetUndefined: Self = StObject.set(x, "modifyTarget", js.undefined)
      
      @scala.inline
      def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
      
      @scala.inline
      def setRestDelta(value: Double): Self = StObject.set(x, "restDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestDeltaUndefined: Self = StObject.set(x, "restDelta", js.undefined)
      
      @scala.inline
      def setTimeConstant(value: Double): Self = StObject.set(x, "timeConstant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeConstantUndefined: Self = StObject.set(x, "timeConstant", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    }
  }
  
  type Driver = js.Function1[/* update */ Update, DriverControls]
  
  @js.native
  trait DriverControls extends StObject {
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  object DriverControls {
    
    @scala.inline
    def apply(start: () => Unit, stop: () => Unit): DriverControls = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[DriverControls]
    }
    
    @scala.inline
    implicit class DriverControlsMutableBuilder[Self <: DriverControls] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait InertiaOptions extends DecayOptions {
    
    var bounceDamping: js.UndefOr[Double] = js.native
    
    var bounceStiffness: js.UndefOr[Double] = js.native
    
    var driver: js.UndefOr[Driver] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var onComplete: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onUpdate: js.UndefOr[js.Function1[/* v */ Double, Unit]] = js.native
    
    var restSpeed: js.UndefOr[Double] = js.native
  }
  object InertiaOptions {
    
    @scala.inline
    def apply(): InertiaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InertiaOptions]
    }
    
    @scala.inline
    implicit class InertiaOptionsMutableBuilder[Self <: InertiaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounceDamping(value: Double): Self = StObject.set(x, "bounceDamping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceDampingUndefined: Self = StObject.set(x, "bounceDamping", js.undefined)
      
      @scala.inline
      def setBounceStiffness(value: Double): Self = StObject.set(x, "bounceStiffness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceStiffnessUndefined: Self = StObject.set(x, "bounceStiffness", js.undefined)
      
      @scala.inline
      def setDriver(value: /* update */ Update => DriverControls): Self = StObject.set(x, "driver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: /* v */ Double => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setRestSpeed(value: Double): Self = StObject.set(x, "restSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestSpeedUndefined: Self = StObject.set(x, "restSpeed", js.undefined)
    }
  }
  
  @js.native
  trait KeyframeOptions[V] extends StObject {
    
    var duration: js.UndefOr[Double] = js.native
    
    var ease: js.UndefOr[Easing | js.Array[Easing]] = js.native
    
    var from: js.UndefOr[V] = js.native
    
    var offset: js.UndefOr[js.Array[Double]] = js.native
    
    var to: V | js.Array[V] = js.native
  }
  object KeyframeOptions {
    
    @scala.inline
    def apply[V](to: V | js.Array[V]): KeyframeOptions[V] = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyframeOptions[V]]
    }
    
    @scala.inline
    implicit class KeyframeOptionsMutableBuilder[Self <: KeyframeOptions[_], V] (val x: Self with KeyframeOptions[V]) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEase(value: Easing | js.Array[Easing]): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseFunction1(value: /* v */ Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      @scala.inline
      def setEaseVarargs(value: Easing*): Self = StObject.set(x, "ease", js.Array(value :_*))
      
      @scala.inline
      def setFrom(value: V): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
      
      @scala.inline
      def setTo(value: V | js.Array[V]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToVarargs(value: V*): Self = StObject.set(x, "to", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PhysicsSpringOptions extends StObject {
    
    var damping: js.UndefOr[Double] = js.native
    
    var mass: js.UndefOr[Double] = js.native
    
    var stiffness: js.UndefOr[Double] = js.native
    
    var velocity: js.UndefOr[Double] = js.native
  }
  object PhysicsSpringOptions {
    
    @scala.inline
    def apply(): PhysicsSpringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhysicsSpringOptions]
    }
    
    @scala.inline
    implicit class PhysicsSpringOptionsMutableBuilder[Self <: PhysicsSpringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      @scala.inline
      def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
      
      @scala.inline
      def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
      
      @scala.inline
      def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    }
  }
  
  @js.native
  trait PlaybackControls extends StObject {
    
    def stop(): Unit = js.native
  }
  object PlaybackControls {
    
    @scala.inline
    def apply(stop: () => Unit): PlaybackControls = {
      val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[PlaybackControls]
    }
    
    @scala.inline
    implicit class PlaybackControlsMutableBuilder[Self <: PlaybackControls] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PlaybackOptions[V] extends StObject {
    
    var autoplay: js.UndefOr[Boolean] = js.native
    
    var driver: js.UndefOr[Driver] = js.native
    
    var elapsed: js.UndefOr[Double] = js.native
    
    var from: js.UndefOr[V] = js.native
    
    var onComplete: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPlay: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onRepeat: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onStop: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onUpdate: js.UndefOr[js.Function1[/* latest */ V, Unit]] = js.native
    
    var repeat: js.UndefOr[Double] = js.native
    
    var repeatDelay: js.UndefOr[Double] = js.native
    
    var repeatType: js.UndefOr[loop | reverse | mirror] = js.native
    
    var `type`: js.UndefOr[spring | decay | keyframes] = js.native
  }
  object PlaybackOptions {
    
    @scala.inline
    def apply[V](): PlaybackOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaybackOptions[V]]
    }
    
    @scala.inline
    implicit class PlaybackOptionsMutableBuilder[Self <: PlaybackOptions[_], V] (val x: Self with PlaybackOptions[V]) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setDriver(value: /* update */ Update => DriverControls): Self = StObject.set(x, "driver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
      
      @scala.inline
      def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElapsedUndefined: Self = StObject.set(x, "elapsed", js.undefined)
      
      @scala.inline
      def setFrom(value: V): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnPlay(value: () => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnRepeat(value: () => Unit): Self = StObject.set(x, "onRepeat", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRepeatUndefined: Self = StObject.set(x, "onRepeat", js.undefined)
      
      @scala.inline
      def setOnStop(value: () => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: /* latest */ V => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
      
      @scala.inline
      def setRepeatType(value: loop | reverse | mirror): Self = StObject.set(x, "repeatType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatTypeUndefined: Self = StObject.set(x, "repeatType", js.undefined)
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setType(value: spring | decay | keyframes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SpringOptions extends PhysicsSpringOptions {
    
    var bounce: js.UndefOr[Double] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var from: js.UndefOr[Double] = js.native
    
    var restDelta: js.UndefOr[Double] = js.native
    
    var restSpeed: js.UndefOr[Double] = js.native
    
    var to: js.UndefOr[Double] = js.native
  }
  object SpringOptions {
    
    @scala.inline
    def apply(): SpringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpringOptions]
    }
    
    @scala.inline
    implicit class SpringOptionsMutableBuilder[Self <: SpringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounce(value: Double): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setRestDelta(value: Double): Self = StObject.set(x, "restDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestDeltaUndefined: Self = StObject.set(x, "restDelta", js.undefined)
      
      @scala.inline
      def setRestSpeed(value: Double): Self = StObject.set(x, "restSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestSpeedUndefined: Self = StObject.set(x, "restSpeed", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  type Update = js.Function1[/* timestamp */ Double, Unit]
}
