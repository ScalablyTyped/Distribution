package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThirdPartyPrincipal extends StObject {
  
  /** Metadata about third party identity. */
  var thirdPartyClaims: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.ThirdPartyPrincipal with TopLevel[js.Any]
  ] = js.native
}
object ThirdPartyPrincipal {
  
  @scala.inline
  def apply(): ThirdPartyPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyPrincipal]
  }
  
  @scala.inline
  implicit class ThirdPartyPrincipalMutableBuilder[Self <: ThirdPartyPrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThirdPartyClaims(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.ThirdPartyPrincipal with TopLevel[js.Any]
    ): Self = StObject.set(x, "thirdPartyClaims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirdPartyClaimsUndefined: Self = StObject.set(x, "thirdPartyClaims", js.undefined)
  }
}
