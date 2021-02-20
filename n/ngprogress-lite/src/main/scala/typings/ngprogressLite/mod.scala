package typings.ngprogressLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object progressLite {
    
    @js.native
    trait IConfigurationOptions extends StObject {
      
      var ease: String = js.native
      
      var minimum: Double = js.native
      
      var speed: Double = js.native
      
      var template: String = js.native
      
      var trickleRate: Double = js.native
      
      var trickleSpeed: Double = js.native
    }
    object IConfigurationOptions {
      
      @scala.inline
      def apply(
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
      
      @scala.inline
      implicit class IConfigurationOptionsMutableBuilder[Self <: IConfigurationOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEase(value: String): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrickleRate(value: Double): Self = StObject.set(x, "trickleRate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrickleSpeed(value: Double): Self = StObject.set(x, "trickleSpeed", value.asInstanceOf[js.Any])
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
    
    @js.native
    trait INgProgressLiteProvider extends StObject {
      
      var settings: IConfigurationOptions = js.native
    }
    object INgProgressLiteProvider {
      
      @scala.inline
      def apply(settings: IConfigurationOptions): INgProgressLiteProvider = {
        val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
        __obj.asInstanceOf[INgProgressLiteProvider]
      }
      
      @scala.inline
      implicit class INgProgressLiteProviderMutableBuilder[Self <: INgProgressLiteProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSettings(value: IConfigurationOptions): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      }
    }
  }
}
