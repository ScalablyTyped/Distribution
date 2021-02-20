package typings.popmotion

import typings.popmotion.typesMod.Animation
import typings.popmotion.typesMod.KeyframeOptions
import typings.popmotion.typesMod.SpringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Damping extends StObject {
    
    var damping: Double = js.native
    
    var stiffness: Double = js.native
  }
  object Damping {
    
    @scala.inline
    def apply(damping: Double, stiffness: Double): Damping = {
      val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
      __obj.asInstanceOf[Damping]
    }
    
    @scala.inline
    implicit class DampingMutableBuilder[Self <: Damping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Done[V] extends StObject {
    
    var done: Boolean = js.native
    
    var value: V = js.native
  }
  object Done {
    
    @scala.inline
    def apply[V](done: Boolean, value: V): Done[V] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done[V]]
    }
    
    @scala.inline
    implicit class DoneMutableBuilder[Self <: Done[_], V] (val x: Self with Done[V]) extends AnyVal {
      
      @scala.inline
      def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[V](hasFromToEaseOffsetDuration: KeyframeOptions[Double]): Animation[Double | String] = js.native
  }
  
  @js.native
  trait Start extends StObject {
    
    def start(): Unit = js.native
    
    def stop(): Boolean = js.native
  }
  object Start {
    
    @scala.inline
    def apply(start: () => Unit, stop: () => Boolean): Start = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Start]
    }
    
    @scala.inline
    implicit class StartMutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Boolean): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Stop extends StObject {
    
    def stop(): Unit = js.native
  }
  object Stop {
    
    @scala.inline
    def apply(stop: () => Unit): Stop = {
      val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Stop]
    }
    
    @scala.inline
    implicit class StopMutableBuilder[Self <: Stop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Typeofspring extends StObject {
    
    def apply(hasFromToRestSpeedRestDeltaOptions: SpringOptions): Animation[Double] = js.native
    
    def needsInterpolation(a: js.Any, b: js.Any): Boolean = js.native
    @JSName("needsInterpolation")
    var needsInterpolation_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
