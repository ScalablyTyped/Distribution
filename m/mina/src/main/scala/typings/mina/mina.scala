package typings.mina

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mina {
  
  @js.native
  trait AnimationDescriptor extends StObject {
    
    var b: Double = js.native
    
    var dur: Double = js.native
    
    def duration(): Double = js.native
    def duration(newDuration: Double): Unit = js.native
    
    def easing(input: Double): Double = js.native
    
    var end: Double = js.native
    
    def get(): Double = js.native
    
    var id: String = js.native
    
    def pause(): Unit = js.native
    
    def resume(): Unit = js.native
    
    var s: Double = js.native
    
    def set(slave: Double): Double = js.native
    
    var spd: Double = js.native
    
    def speed(): Double = js.native
    def speed(newSpeed: Double): Unit = js.native
    
    var start: Double = js.native
    
    def status(): Double = js.native
    def status(newStatus: Double): Unit = js.native
    
    def stop(): Unit = js.native
    
    def update(): Unit = js.native
  }
  
  trait MinaAnimation extends StObject {
    
    def duration(): Double
    
    def easing(): Double
    
    var id: String
    
    def speed(): Double
    
    def status(): Double
    
    def stop(): Unit
  }
  object MinaAnimation {
    
    inline def apply(
      duration: () => Double,
      easing: () => Double,
      id: String,
      speed: () => Double,
      status: () => Double,
      stop: () => Unit
    ): MinaAnimation = {
      val __obj = js.Dynamic.literal(duration = js.Any.fromFunction0(duration), easing = js.Any.fromFunction0(easing), id = id.asInstanceOf[js.Any], speed = js.Any.fromFunction0(speed), status = js.Any.fromFunction0(status), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[MinaAnimation]
    }
    
    extension [Self <: MinaAnimation](x: Self) {
      
      inline def setDuration(value: () => Double): Self = StObject.set(x, "duration", js.Any.fromFunction0(value))
      
      inline def setEasing(value: () => Double): Self = StObject.set(x, "easing", js.Any.fromFunction0(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSpeed(value: () => Double): Self = StObject.set(x, "speed", js.Any.fromFunction0(value))
      
      inline def setStatus(value: () => Double): Self = StObject.set(x, "status", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
