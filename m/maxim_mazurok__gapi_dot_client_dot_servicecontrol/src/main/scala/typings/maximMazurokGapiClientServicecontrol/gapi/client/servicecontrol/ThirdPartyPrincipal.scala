package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyPrincipal extends StObject {
  
  /** Metadata about third party identity. */
  var thirdPartyClaims: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
}
object ThirdPartyPrincipal {
  
  inline def apply(): ThirdPartyPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyPrincipal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThirdPartyPrincipal] (val x: Self) extends AnyVal {
    
    inline def setThirdPartyClaims(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "thirdPartyClaims", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyClaimsUndefined: Self = StObject.set(x, "thirdPartyClaims", js.undefined)
  }
}
