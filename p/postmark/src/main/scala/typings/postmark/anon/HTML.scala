package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTML extends StObject {
  
  var Date: String = js.native
  
  var HTML: Double = js.native
  
  var Text: Double = js.native
}
object HTML {
  
  @scala.inline
  def apply(Date: String, HTML: Double, Text: Double): HTML = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], HTML = HTML.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML]
  }
  
  @scala.inline
  implicit class HTMLMutableBuilder[Self <: HTML] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTML(value: Double): Self = StObject.set(x, "HTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: Double): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
