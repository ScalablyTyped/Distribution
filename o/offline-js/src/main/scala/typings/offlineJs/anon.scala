package typings.offlineJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Delay extends StObject {
    
    var delay: Double
    
    var initialDelay: Double
  }
  object Delay {
    
    @scala.inline
    def apply(delay: Double, initialDelay: Double): Delay = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], initialDelay = initialDelay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
    }
  }
}
