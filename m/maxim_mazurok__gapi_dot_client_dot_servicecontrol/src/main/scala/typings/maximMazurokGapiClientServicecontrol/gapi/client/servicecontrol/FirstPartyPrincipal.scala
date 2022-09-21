package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstPartyPrincipal extends StObject {
  
  /** The email address of a Google account. . */
  var principalEmail: js.UndefOr[String] = js.undefined
  
  /** Metadata about the service that uses the service account. . */
  var serviceMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.FirstPartyPrincipal & TopLevel[Any]
  ] = js.undefined
}
object FirstPartyPrincipal {
  
  inline def apply(): FirstPartyPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstPartyPrincipal]
  }
  
  extension [Self <: FirstPartyPrincipal](x: Self) {
    
    inline def setPrincipalEmail(value: String): Self = StObject.set(x, "principalEmail", value.asInstanceOf[js.Any])
    
    inline def setPrincipalEmailUndefined: Self = StObject.set(x, "principalEmail", js.undefined)
    
    inline def setServiceMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.FirstPartyPrincipal & TopLevel[Any]
    ): Self = StObject.set(x, "serviceMetadata", value.asInstanceOf[js.Any])
    
    inline def setServiceMetadataUndefined: Self = StObject.set(x, "serviceMetadata", js.undefined)
  }
}
