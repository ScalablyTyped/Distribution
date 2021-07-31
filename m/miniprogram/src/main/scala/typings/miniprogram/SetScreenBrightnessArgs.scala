package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetScreenBrightnessArgs
  extends StObject
     with AsyncCallback[Unit] {
  
  /**
    * Screen brightness for the setting, range 0-1.
    */
  var brightness: Double
}
object SetScreenBrightnessArgs {
  
  @scala.inline
  def apply(brightness: Double): SetScreenBrightnessArgs = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScreenBrightnessArgs]
  }
  
  @scala.inline
  implicit class SetScreenBrightnessArgsMutableBuilder[Self <: SetScreenBrightnessArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
  }
}
