package typings.operationRetrier

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Initial extends StObject {
    
    var initial: js.UndefOr[Double] = js.undefined
    
    var max: Double
    
    var maxAttemptsCount: js.UndefOr[Double] = js.undefined
    
    var maxAttemptsTime: js.UndefOr[Double] = js.undefined
    
    var min: Double
    
    var randomness: js.UndefOr[Double] = js.undefined
  }
  object Initial {
    
    @scala.inline
    def apply(max: Double, min: Double): Initial = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Initial]
    }
    
    @scala.inline
    implicit class InitialMutableBuilder[Self <: Initial] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttemptsCount(value: Double): Self = StObject.set(x, "maxAttemptsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttemptsCountUndefined: Self = StObject.set(x, "maxAttemptsCount", js.undefined)
      
      @scala.inline
      def setMaxAttemptsTime(value: Double): Self = StObject.set(x, "maxAttemptsTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttemptsTimeUndefined: Self = StObject.set(x, "maxAttemptsTime", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomness(value: Double): Self = StObject.set(x, "randomness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomnessUndefined: Self = StObject.set(x, "randomness", js.undefined)
    }
  }
}
