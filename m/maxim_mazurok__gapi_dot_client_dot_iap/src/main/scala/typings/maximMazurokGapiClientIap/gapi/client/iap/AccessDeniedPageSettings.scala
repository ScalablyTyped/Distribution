package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessDeniedPageSettings extends StObject {
  
  /** The URI to be redirected to when access is denied. */
  var accessDeniedPageUri: js.UndefOr[String] = js.native
}
object AccessDeniedPageSettings {
  
  @scala.inline
  def apply(): AccessDeniedPageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessDeniedPageSettings]
  }
  
  @scala.inline
  implicit class AccessDeniedPageSettingsMutableBuilder[Self <: AccessDeniedPageSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDeniedPageUri(value: String): Self = StObject.set(x, "accessDeniedPageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessDeniedPageUriUndefined: Self = StObject.set(x, "accessDeniedPageUri", js.undefined)
  }
}
