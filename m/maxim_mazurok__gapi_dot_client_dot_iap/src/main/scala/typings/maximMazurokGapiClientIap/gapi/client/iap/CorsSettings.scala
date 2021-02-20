package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CorsSettings extends StObject {
  
  /** Configuration to allow HTTP OPTIONS calls to skip authorization. If undefined, IAP will not apply any special logic to OPTIONS requests. */
  var allowHttpOptions: js.UndefOr[Boolean] = js.native
}
object CorsSettings {
  
  @scala.inline
  def apply(): CorsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorsSettings]
  }
  
  @scala.inline
  implicit class CorsSettingsMutableBuilder[Self <: CorsSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowHttpOptions(value: Boolean): Self = StObject.set(x, "allowHttpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHttpOptionsUndefined: Self = StObject.set(x, "allowHttpOptions", js.undefined)
  }
}
