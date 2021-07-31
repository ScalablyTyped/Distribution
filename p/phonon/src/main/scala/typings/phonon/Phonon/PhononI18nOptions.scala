package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononI18nOptions extends StObject {
  
  var directory: js.UndefOr[String] = js.undefined
  
  var localeFallback: js.UndefOr[String] = js.undefined
  
  var localePreferred: js.UndefOr[String] = js.undefined
}
object PhononI18nOptions {
  
  @scala.inline
  def apply(): PhononI18nOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhononI18nOptions]
  }
  
  @scala.inline
  implicit class PhononI18nOptionsMutableBuilder[Self <: PhononI18nOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    @scala.inline
    def setLocaleFallback(value: String): Self = StObject.set(x, "localeFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleFallbackUndefined: Self = StObject.set(x, "localeFallback", js.undefined)
    
    @scala.inline
    def setLocalePreferred(value: String): Self = StObject.set(x, "localePreferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalePreferredUndefined: Self = StObject.set(x, "localePreferred", js.undefined)
  }
}
