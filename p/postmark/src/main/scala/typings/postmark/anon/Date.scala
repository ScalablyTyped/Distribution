package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  var Date: String
  
  var HTML: Double
  
  var Text: Double
}
object Date {
  
  inline def apply(Date: String, HTML: Double, Text: Double): Date = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], HTML = HTML.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setHTML(value: Double): Self = StObject.set(x, "HTML", value.asInstanceOf[js.Any])
    
    inline def setText(value: Double): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
