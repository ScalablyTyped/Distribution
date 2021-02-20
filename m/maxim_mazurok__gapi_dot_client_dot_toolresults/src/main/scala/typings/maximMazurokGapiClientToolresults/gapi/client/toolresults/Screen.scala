package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Screen extends StObject {
  
  /** File reference of the png file. Required. */
  var fileReference: js.UndefOr[String] = js.native
  
  /** Locale of the device that the screenshot was taken on. Required. */
  var locale: js.UndefOr[String] = js.native
  
  /** Model of the device that the screenshot was taken on. Required. */
  var model: js.UndefOr[String] = js.native
  
  /** OS version of the device that the screenshot was taken on. Required. */
  var version: js.UndefOr[String] = js.native
}
object Screen {
  
  @scala.inline
  def apply(): Screen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Screen]
  }
  
  @scala.inline
  implicit class ScreenMutableBuilder[Self <: Screen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileReference(value: String): Self = StObject.set(x, "fileReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileReferenceUndefined: Self = StObject.set(x, "fileReference", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
