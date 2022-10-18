package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextVendorMod {
  
  trait ThemeColors extends StObject {
    
    var background: String
    
    var error: String
    
    var link: String
    
    var onError: String
    
    var onPrimary: String
    
    var onSecondary: String | Null
    
    var onSurface: String
    
    var primary: String
    
    var secondary: String | Null
    
    var surface: String
  }
  object ThemeColors {
    
    inline def apply(
      background: String,
      error: String,
      link: String,
      onError: String,
      onPrimary: String,
      onSurface: String,
      primary: String,
      surface: String
    ): ThemeColors = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onPrimary = onPrimary.asInstanceOf[js.Any], onSurface = onSurface.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], surface = surface.asInstanceOf[js.Any], onSecondary = null, secondary = null)
      __obj.asInstanceOf[ThemeColors]
    }
    
    extension [Self <: ThemeColors](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setOnError(value: String): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      inline def setOnPrimary(value: String): Self = StObject.set(x, "onPrimary", value.asInstanceOf[js.Any])
      
      inline def setOnSecondary(value: String): Self = StObject.set(x, "onSecondary", value.asInstanceOf[js.Any])
      
      inline def setOnSecondaryNull: Self = StObject.set(x, "onSecondary", null)
      
      inline def setOnSurface(value: String): Self = StObject.set(x, "onSurface", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSecondaryNull: Self = StObject.set(x, "secondary", null)
      
      inline def setSurface(value: String): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
    }
  }
}
