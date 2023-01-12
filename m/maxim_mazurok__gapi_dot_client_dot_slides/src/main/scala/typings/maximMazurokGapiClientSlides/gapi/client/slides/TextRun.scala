package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextRun extends StObject {
  
  /** The text of this run. */
  var content: js.UndefOr[String] = js.undefined
  
  /** The styling applied to this run. */
  var style: js.UndefOr[TextStyle] = js.undefined
}
object TextRun {
  
  inline def apply(): TextRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextRun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextRun] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setStyle(value: TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
