package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libButtonButtonTimerMod {
  
  inline def apply(button: Button): Unit = ^.asInstanceOf[js.Dynamic].apply(button.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/button/ButtonTimer", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ButtonTimer {
    def this(button: Button) = this()
    
    /* CompleteClass */
    var button: typings.nginstackWebFramework.libButtonButtonMod.^ = js.native
    
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /* CompleteClass */
    var interval: Double = js.native
    
    /* private */ /* CompleteClass */
    var propertiesToSync_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/button/ButtonTimer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Button = typings.nginstackWebFramework.libButtonButtonMod.^
  
  trait ButtonTimer extends StObject {
    
    var button: typings.nginstackWebFramework.libButtonButtonMod.^
    
    var enabled: Boolean
    
    var interval: Double
    
    /* private */ var propertiesToSync_ : Any
  }
  object ButtonTimer {
    
    inline def apply(
      button: typings.nginstackWebFramework.libButtonButtonMod.^,
      enabled: Boolean,
      interval: Double,
      propertiesToSync_ : Any
    ): ButtonTimer = {
      val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], propertiesToSync_ = propertiesToSync_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonTimer]
    }
    
    extension [Self <: ButtonTimer](x: Self) {
      
      inline def setButton(value: typings.nginstackWebFramework.libButtonButtonMod.^): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setPropertiesToSync_(value: Any): Self = StObject.set(x, "propertiesToSync_", value.asInstanceOf[js.Any])
    }
  }
}
