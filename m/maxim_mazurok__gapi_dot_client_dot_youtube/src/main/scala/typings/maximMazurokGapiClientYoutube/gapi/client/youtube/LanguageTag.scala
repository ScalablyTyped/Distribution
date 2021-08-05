package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageTag extends StObject {
  
  var value: js.UndefOr[String] = js.undefined
}
object LanguageTag {
  
  inline def apply(): LanguageTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageTag]
  }
  
  extension [Self <: LanguageTag](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
