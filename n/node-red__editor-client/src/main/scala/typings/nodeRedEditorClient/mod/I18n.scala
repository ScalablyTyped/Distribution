package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
trait I18n extends StObject {
  
  def lang(): String
}
object I18n {
  
  @scala.inline
  def apply(lang: () => String): I18n = {
    val __obj = js.Dynamic.literal(lang = js.Any.fromFunction0(lang))
    __obj.asInstanceOf[I18n]
  }
  
  @scala.inline
  implicit class I18nMutableBuilder[Self <: I18n] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLang(value: () => String): Self = StObject.set(x, "lang", js.Any.fromFunction0(value))
  }
}
