package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Html extends StObject {
  
  var html: js.UndefOr[String] = js.native
  
  var rtf: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object Html {
  
  @scala.inline
  def apply(): Html = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Html]
  }
  
  @scala.inline
  implicit class HtmlMutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setRtf(value: String): Self = StObject.set(x, "rtf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtfUndefined: Self = StObject.set(x, "rtf", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
