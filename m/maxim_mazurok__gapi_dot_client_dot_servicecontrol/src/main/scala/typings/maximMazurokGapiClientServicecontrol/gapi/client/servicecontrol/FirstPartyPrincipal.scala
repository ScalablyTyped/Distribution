package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstPartyPrincipal extends js.Object {
  
  /** The email address of a Google account. . */
  var principalEmail: js.UndefOr[String] = js.native
  
  /** Metadata about the service that uses the service account. . */
  var serviceMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.FirstPartyPrincipal with TopLevel[js.Any]
  ] = js.native
}
object FirstPartyPrincipal {
  
  @scala.inline
  def apply(): FirstPartyPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstPartyPrincipal]
  }
  
  @scala.inline
  implicit class FirstPartyPrincipalOps[Self <: FirstPartyPrincipal] (val x: Self) extends AnyVal {
    
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
    def setPrincipalEmail(value: String): Self = this.set("principalEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalEmail: Self = this.set("principalEmail", js.undefined)
    
    @scala.inline
    def setServiceMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.FirstPartyPrincipal with TopLevel[js.Any]
    ): Self = this.set("serviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceMetadata: Self = this.set("serviceMetadata", js.undefined)
  }
}
