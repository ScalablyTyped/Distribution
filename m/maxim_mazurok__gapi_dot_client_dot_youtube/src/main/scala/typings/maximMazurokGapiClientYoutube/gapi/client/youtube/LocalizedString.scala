package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalizedString extends StObject {
  
  var language: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object LocalizedString {
  
  @scala.inline
  def apply(): LocalizedString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedString]
  }
  
  @scala.inline
  implicit class LocalizedStringMutableBuilder[Self <: LocalizedString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
