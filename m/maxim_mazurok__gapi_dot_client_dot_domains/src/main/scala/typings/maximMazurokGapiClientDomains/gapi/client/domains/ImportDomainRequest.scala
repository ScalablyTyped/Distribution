package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDomainRequest extends StObject {
  
  /** Required. The domain name. Unicode domain names must be expressed in Punycode format. */
  var domainName: js.UndefOr[String] = js.undefined
  
  /** Set of labels associated with the `Registration`. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDomains.maximMazurokGapiClientDomainsStrings.ImportDomainRequest & TopLevel[Any]
  ] = js.undefined
}
object ImportDomainRequest {
  
  inline def apply(): ImportDomainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportDomainRequest]
  }
  
  extension [Self <: ImportDomainRequest](x: Self) {
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDomains.maximMazurokGapiClientDomainsStrings.ImportDomainRequest & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
