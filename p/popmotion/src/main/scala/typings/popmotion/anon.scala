package typings.popmotion

import typings.popmotion.typesMod.Animation
import typings.popmotion.typesMod.KeyframeOptions
import typings.popmotion.typesMod.SpringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Damping extends StObject {
    
    var damping: Double
    
    var duration: Double
    
    var stiffness: Double
  }
  object Damping {
    
    inline def apply(damping: Double, duration: Double, stiffness: Double): Damping = {
      val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
      __obj.asInstanceOf[Damping]
    }
    
    extension [Self <: Damping](x: Self) {
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    }
  }
  
  trait Done[V] extends StObject {
    
    var done: Boolean
    
    var value: V
  }
  object Done {
    
    inline def apply[V](done: Boolean, value: V): Done[V] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done[V]]
    }
    
    extension [Self <: Done[?], V](x: Self & Done[V]) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[V](hasFromToEaseOffsetDuration: KeyframeOptions[Double]): Animation[Double | String] = js.native
  }
  
  trait Start extends StObject {
    
    def start(): Unit
    
    def stop(): Boolean
  }
  object Start {
    
    inline def apply(start: () => Unit, stop: () => Boolean): Start = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Start]
    }
    
    extension [Self <: Start](x: Self) {
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Boolean): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait Stop extends StObject {
    
    def stop(): Unit
  }
  object Stop {
    
    inline def apply(stop: () => Unit): Stop = {
      val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Stop]
    }
    
    extension [Self <: Stop](x: Self) {
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Typeofspring extends StObject {
    
    def apply(hasFromToRestSpeedRestDeltaOptions: SpringOptions): Animation[Double] = js.native
    
    def needsInterpolation(a: Any, b: Any): Boolean = js.native
    @JSName("needsInterpolation")
    var needsInterpolation_Original: js.Function2[/* a */ Any, /* b */ Any, Boolean] = js.native
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
