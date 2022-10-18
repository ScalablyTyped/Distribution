package typings.nextSeo.anon

import typings.nextSeo.nextSeoStrings.HowToDirection
import typings.nextSeo.nextSeoStrings.HowToTip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextType extends StObject {
  
  var `@type`: HowToTip | HowToDirection
  
  var text: String
}
object TextType {
  
  inline def apply(`@type`: HowToTip | HowToDirection, text: String): TextType = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextType]
  }
  
  extension [Self <: TextType](x: Self) {
    
    inline def `set@type`(value: HowToTip | HowToDirection): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
