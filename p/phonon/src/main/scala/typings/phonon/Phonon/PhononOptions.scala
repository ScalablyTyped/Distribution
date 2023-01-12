package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*** Options ***/
trait PhononOptions extends StObject {
  
  var i18n: js.UndefOr[PhononI18nOptions | Null] = js.undefined
  
  var navigator: js.UndefOr[PhononNavigatorOptions] = js.undefined
}
object PhononOptions {
  
  inline def apply(): PhononOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhononOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhononOptions] (val x: Self) extends AnyVal {
    
    inline def setI18n(value: PhononI18nOptions): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setI18nNull: Self = StObject.set(x, "i18n", null)
    
    inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    inline def setNavigator(value: PhononNavigatorOptions): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
    
    inline def setNavigatorUndefined: Self = StObject.set(x, "navigator", js.undefined)
  }
}
