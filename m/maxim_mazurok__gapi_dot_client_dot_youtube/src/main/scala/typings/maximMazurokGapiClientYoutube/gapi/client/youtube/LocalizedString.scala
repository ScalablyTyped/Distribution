package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalizedString extends StObject {
  
  var language: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object LocalizedString {
  
  inline def apply(): LocalizedString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalizedString] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
