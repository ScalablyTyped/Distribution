package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTML extends StObject {
  
  var Date: String
  
  var HTML: Double
  
  var Text: Double
}
object HTML {
  
  inline def apply(Date: String, HTML: Double, Text: Double): HTML = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], HTML = HTML.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML]
  }
  
  extension [Self <: HTML](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setHTML(value: Double): Self = StObject.set(x, "HTML", value.asInstanceOf[js.Any])
    
    inline def setText(value: Double): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
