package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Screen extends StObject {
  
  /** File reference of the png file. Required. */
  var fileReference: js.UndefOr[String] = js.undefined
  
  /** Locale of the device that the screenshot was taken on. Required. */
  var locale: js.UndefOr[String] = js.undefined
  
  /** Model of the device that the screenshot was taken on. Required. */
  var model: js.UndefOr[String] = js.undefined
  
  /** OS version of the device that the screenshot was taken on. Required. */
  var version: js.UndefOr[String] = js.undefined
}
object Screen {
  
  inline def apply(): Screen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Screen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Screen] (val x: Self) extends AnyVal {
    
    inline def setFileReference(value: String): Self = StObject.set(x, "fileReference", value.asInstanceOf[js.Any])
    
    inline def setFileReferenceUndefined: Self = StObject.set(x, "fileReference", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
