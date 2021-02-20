package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopSettings extends StObject {
  
  /** The range of messages which are accessible via POP. */
  var accessWindow: js.UndefOr[String] = js.native
  
  /** The action that will be executed on a message after it has been fetched via POP. */
  var disposition: js.UndefOr[String] = js.native
}
object PopSettings {
  
  @scala.inline
  def apply(): PopSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopSettings]
  }
  
  @scala.inline
  implicit class PopSettingsMutableBuilder[Self <: PopSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessWindow(value: String): Self = StObject.set(x, "accessWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessWindowUndefined: Self = StObject.set(x, "accessWindow", js.undefined)
    
    @scala.inline
    def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
  }
}
