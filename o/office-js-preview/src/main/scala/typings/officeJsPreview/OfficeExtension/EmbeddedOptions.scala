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
  
  @scala.inline
  def apply(): EmbeddedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedOptions]
  }
  
  @scala.inline
  implicit class EmbeddedOptionsMutableBuilder[Self <: EmbeddedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
    
    @scala.inline
    def setTimeoutInMilliseconds(value: Double): Self = StObject.set(x, "timeoutInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMillisecondsUndefined: Self = StObject.set(x, "timeoutInMilliseconds", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
