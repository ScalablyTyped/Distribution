package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderInfo extends StObject {
  
  /** Attribution string for this provider. This string is not localized. */
  var description: js.UndefOr[String] = js.undefined
}
object ProviderInfo {
  
  inline def apply(): ProviderInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProviderInfo] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
