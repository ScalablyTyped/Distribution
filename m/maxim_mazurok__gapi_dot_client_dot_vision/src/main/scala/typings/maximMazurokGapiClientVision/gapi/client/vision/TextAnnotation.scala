package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAnnotation extends StObject {
  
  /** List of pages detected by OCR. */
  var pages: js.UndefOr[js.Array[Page]] = js.undefined
  
  /** UTF-8 text detected on the pages. */
  var text: js.UndefOr[String] = js.undefined
}
object TextAnnotation {
  
  inline def apply(): TextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAnnotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextAnnotation] (val x: Self) extends AnyVal {
    
    inline def setPages(value: js.Array[Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: Page*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
