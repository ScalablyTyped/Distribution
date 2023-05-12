package typings.mercadopagoSdkJs.cardform

import typings.mercadopagoSdkJs.shared.FieldStyle
import typings.mercadopagoSdkJs.shared.SecurityCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatableProperties extends StObject {
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var settings: js.UndefOr[SecurityCode] = js.undefined
  
  var style: js.UndefOr[FieldStyle] = js.undefined
}
object UpdatableProperties {
  
  inline def apply(): UpdatableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatableProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatableProperties] (val x: Self) extends AnyVal {
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSettings(value: SecurityCode): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setStyle(value: FieldStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
