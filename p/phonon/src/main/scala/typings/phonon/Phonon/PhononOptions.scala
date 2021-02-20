package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*** Options ***/
@js.native
trait PhononOptions extends StObject {
  
  var i18n: js.UndefOr[PhononI18nOptions | Null] = js.native
  
  var navigator: js.UndefOr[PhononNavigatorOptions] = js.native
}
object PhononOptions {
  
  @scala.inline
  def apply(): PhononOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhononOptions]
  }
  
  @scala.inline
  implicit class PhononOptionsMutableBuilder[Self <: PhononOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setI18n(value: PhononI18nOptions): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nNull: Self = StObject.set(x, "i18n", null)
    
    @scala.inline
    def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    @scala.inline
    def setNavigator(value: PhononNavigatorOptions): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorUndefined: Self = StObject.set(x, "navigator", js.undefined)
  }
}
