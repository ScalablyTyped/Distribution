package typings.officeJsPreview.OfficeExtension

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedOptions extends StObject {
  
  var container: js.UndefOr[HTMLElement] = js.undefined
  
  var height: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var sessionKey: js.UndefOr[String] = js.undefined
  
  var timeoutInMilliseconds: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object EmbeddedOptions {
  
  inline def apply(): EmbeddedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmbeddedOptions] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
    
    inline def setTimeoutInMilliseconds(value: Double): Self = StObject.set(x, "timeoutInMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInMillisecondsUndefined: Self = StObject.set(x, "timeoutInMilliseconds", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
