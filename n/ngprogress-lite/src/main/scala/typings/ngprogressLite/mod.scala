package typings.ngprogressLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object progressLite {
    
    trait IConfigurationOptions extends StObject {
      
      var ease: String
      
      var minimum: Double
      
      var speed: Double
      
      var template: String
      
      var trickleRate: Double
      
      var trickleSpeed: Double
    }
    object IConfigurationOptions {
      
      inline def apply(
        ease: String,
        minimum: Double,
        speed: Double,
        template: String,
        trickleRate: Double,
        trickleSpeed: Double
      ): IConfigurationOptions = {
        val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], trickleRate = trickleRate.asInstanceOf[js.Any], trickleSpeed = trickleSpeed.asInstanceOf[js.Any])
        __obj.asInstanceOf[IConfigurationOptions]
      }
      
      extension [Self <: IConfigurationOptions](x: Self) {
        
        inline def setEase(value: String): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
        
        inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
        
        inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        inline def setTrickleRate(value: Double): Self = StObject.set(x, "trickleRate", value.asInstanceOf[js.Any])
        
        inline def setTrickleSpeed(value: Double): Self = StObject.set(x, "trickleSpeed", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait INgProgressLite extends StObject {
      
      def done(): Unit = js.native
      
      def get(): Double = js.native
      
      def inc(): INgProgressLite = js.native
      def inc(amount: Double): INgProgressLite = js.native
      
      def set(num: Double): INgProgressLite = js.native
      
      def start(): INgProgressLite = js.native
    }
    
    trait INgProgressLiteProvider extends StObject {
      
      var settings: IConfigurationOptions
    }
    object INgProgressLiteProvider {
      
      inline def apply(settings: IConfigurationOptions): INgProgressLiteProvider = {
        val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
        __obj.asInstanceOf[INgProgressLiteProvider]
      }
      
      extension [Self <: INgProgressLiteProvider](x: Self) {
        
        inline def setSettings(value: IConfigurationOptions): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      }
    }
  }
}
