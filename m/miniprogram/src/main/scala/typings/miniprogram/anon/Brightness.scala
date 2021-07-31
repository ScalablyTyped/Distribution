package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brightness extends StObject {
  
  var brightness: Double
}
object Brightness {
  
  @scala.inline
  def apply(brightness: Double): Brightness = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brightness]
  }
  
  @scala.inline
  implicit class BrightnessMutableBuilder[Self <: Brightness] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
  }
}
