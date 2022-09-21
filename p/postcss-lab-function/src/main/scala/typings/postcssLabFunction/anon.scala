package typings.postcssLabFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DisplayP3 extends StObject {
    
    var displayP3: js.UndefOr[Boolean] = js.undefined
  }
  object DisplayP3 {
    
    inline def apply(): DisplayP3 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayP3]
    }
    
    extension [Self <: DisplayP3](x: Self) {
      
      inline def setDisplayP3(value: Boolean): Self = StObject.set(x, "displayP3", value.asInstanceOf[js.Any])
      
      inline def setDisplayP3Undefined: Self = StObject.set(x, "displayP3", js.undefined)
    }
  }
  
  trait Rgb extends StObject {
    
    var displayP3: String
    
    var rgb: String
  }
  object Rgb {
    
    inline def apply(displayP3: String, rgb: String): Rgb = {
      val __obj = js.Dynamic.literal(displayP3 = displayP3.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rgb]
    }
    
    extension [Self <: Rgb](x: Self) {
      
      inline def setDisplayP3(value: String): Self = StObject.set(x, "displayP3", value.asInstanceOf[js.Any])
      
      inline def setRgb(value: String): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
    }
  }
}
