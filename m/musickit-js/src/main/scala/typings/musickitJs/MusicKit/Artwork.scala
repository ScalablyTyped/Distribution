package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that represents artwork for a music item.
  * https://developer.apple.com/documentation/musickit/artwork
  */
trait Artwork extends StObject {
  
  var bgColor: String
  
  var height: Double
  
  var textColor1: String
  
  var textColor2: String
  
  var textColor3: String
  
  var textColor4: String
  
  var url: String
  
  var width: Double
}
object Artwork {
  
  inline def apply(
    bgColor: String,
    height: Double,
    textColor1: String,
    textColor2: String,
    textColor3: String,
    textColor4: String,
    url: String,
    width: Double
  ): Artwork = {
    val __obj = js.Dynamic.literal(bgColor = bgColor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], textColor1 = textColor1.asInstanceOf[js.Any], textColor2 = textColor2.asInstanceOf[js.Any], textColor3 = textColor3.asInstanceOf[js.Any], textColor4 = textColor4.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artwork]
  }
  
  extension [Self <: Artwork](x: Self) {
    
    inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setTextColor1(value: String): Self = StObject.set(x, "textColor1", value.asInstanceOf[js.Any])
    
    inline def setTextColor2(value: String): Self = StObject.set(x, "textColor2", value.asInstanceOf[js.Any])
    
    inline def setTextColor3(value: String): Self = StObject.set(x, "textColor3", value.asInstanceOf[js.Any])
    
    inline def setTextColor4(value: String): Self = StObject.set(x, "textColor4", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
