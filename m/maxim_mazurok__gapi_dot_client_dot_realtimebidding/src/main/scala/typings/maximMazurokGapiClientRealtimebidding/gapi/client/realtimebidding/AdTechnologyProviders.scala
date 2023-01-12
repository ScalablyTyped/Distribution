package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdTechnologyProviders extends StObject {
  
  /**
    * The detected IAB Global Vendor List (GVL) IDs for this creative. See the IAB Global Vendor List at https://vendor-list.consensu.org/v2/vendor-list.json for details about the
    * vendors.
    */
  var detectedGvlIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The detected [Google Ad Tech Providers (ATP)](https://support.google.com/admanager/answer/9012903) for this creative. See
    * https://storage.googleapis.com/adx-rtb-dictionaries/providers.csv for mapping of provider ID to provided name, a privacy policy URL, and a list of domains which can be attributed to
    * the provider.
    */
  var detectedProviderIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Domains of detected unidentified ad technology providers (if any). You must ensure that the creatives used in bids placed for inventory that will serve to EEA or UK users does not
    * contain unidentified ad technology providers. Google reserves the right to filter non-compliant bids.
    */
  var unidentifiedProviderDomains: js.UndefOr[js.Array[String]] = js.undefined
}
object AdTechnologyProviders {
  
  inline def apply(): AdTechnologyProviders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdTechnologyProviders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdTechnologyProviders] (val x: Self) extends AnyVal {
    
    inline def setDetectedGvlIds(value: js.Array[String]): Self = StObject.set(x, "detectedGvlIds", value.asInstanceOf[js.Any])
    
    inline def setDetectedGvlIdsUndefined: Self = StObject.set(x, "detectedGvlIds", js.undefined)
    
    inline def setDetectedGvlIdsVarargs(value: String*): Self = StObject.set(x, "detectedGvlIds", js.Array(value*))
    
    inline def setDetectedProviderIds(value: js.Array[String]): Self = StObject.set(x, "detectedProviderIds", value.asInstanceOf[js.Any])
    
    inline def setDetectedProviderIdsUndefined: Self = StObject.set(x, "detectedProviderIds", js.undefined)
    
    inline def setDetectedProviderIdsVarargs(value: String*): Self = StObject.set(x, "detectedProviderIds", js.Array(value*))
    
    inline def setUnidentifiedProviderDomains(value: js.Array[String]): Self = StObject.set(x, "unidentifiedProviderDomains", value.asInstanceOf[js.Any])
    
    inline def setUnidentifiedProviderDomainsUndefined: Self = StObject.set(x, "unidentifiedProviderDomains", js.undefined)
    
    inline def setUnidentifiedProviderDomainsVarargs(value: String*): Self = StObject.set(x, "unidentifiedProviderDomains", js.Array(value*))
  }
}
