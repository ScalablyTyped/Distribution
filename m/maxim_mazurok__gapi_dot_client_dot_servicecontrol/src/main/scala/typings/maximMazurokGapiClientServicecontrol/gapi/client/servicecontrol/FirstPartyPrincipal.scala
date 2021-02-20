package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstPartyPrincipal extends StObject {
  
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
  implicit class FirstPartyPrincipalMutableBuilder[Self <: FirstPartyPrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrincipalEmail(value: String): Self = StObject.set(x, "principalEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalEmailUndefined: Self = StObject.set(x, "principalEmail", js.undefined)
    
    @scala.inline
    def setServiceMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.FirstPartyPrincipal with TopLevel[js.Any]
    ): Self = StObject.set(x, "serviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceMetadataUndefined: Self = StObject.set(x, "serviceMetadata", js.undefined)
  }
}
