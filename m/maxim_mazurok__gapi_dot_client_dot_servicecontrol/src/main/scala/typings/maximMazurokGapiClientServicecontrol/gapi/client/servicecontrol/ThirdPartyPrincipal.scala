package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThirdPartyPrincipal extends js.Object {
  
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
  implicit class ThirdPartyPrincipalOps[Self <: ThirdPartyPrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setThirdPartyClaims(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.ThirdPartyPrincipal with TopLevel[js.Any]
    ): Self = this.set("thirdPartyClaims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThirdPartyClaims: Self = this.set("thirdPartyClaims", js.undefined)
  }
}
