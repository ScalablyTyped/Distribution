package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopSettings extends StObject {
  
  /** The range of messages which are accessible via POP. */
  var accessWindow: js.UndefOr[String] = js.undefined
  
  /** The action that will be executed on a message after it has been fetched via POP. */
  var disposition: js.UndefOr[String] = js.undefined
}
object PopSettings {
  
  inline def apply(): PopSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopSettings] (val x: Self) extends AnyVal {
    
    inline def setAccessWindow(value: String): Self = StObject.set(x, "accessWindow", value.asInstanceOf[js.Any])
    
    inline def setAccessWindowUndefined: Self = StObject.set(x, "accessWindow", js.undefined)
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
  }
}
