package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvertiserAndBrand extends StObject {
  
  /** See https://storage.googleapis.com/adx-rtb-dictionaries/advertisers.txt for the list of possible values. Can be used to filter the response of the creatives.list method. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Advertiser name. Can be used to filter the response of the creatives.list method. */
  var advertiserName: js.UndefOr[String] = js.undefined
  
  /**
    * Detected brand ID or zero if no brand has been detected. See https://storage.googleapis.com/adx-rtb-dictionaries/brands.txt for the list of possible values. Can be used to filter
    * the response of the creatives.list method.
    */
  var brandId: js.UndefOr[String] = js.undefined
  
  /** Brand name. Can be used to filter the response of the creatives.list method. */
  var brandName: js.UndefOr[String] = js.undefined
}
object AdvertiserAndBrand {
  
  inline def apply(): AdvertiserAndBrand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserAndBrand]
  }
  
  extension [Self <: AdvertiserAndBrand](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAdvertiserName(value: String): Self = StObject.set(x, "advertiserName", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserNameUndefined: Self = StObject.set(x, "advertiserName", js.undefined)
    
    inline def setBrandId(value: String): Self = StObject.set(x, "brandId", value.asInstanceOf[js.Any])
    
    inline def setBrandIdUndefined: Self = StObject.set(x, "brandId", js.undefined)
    
    inline def setBrandName(value: String): Self = StObject.set(x, "brandName", value.asInstanceOf[js.Any])
    
    inline def setBrandNameUndefined: Self = StObject.set(x, "brandName", js.undefined)
  }
}
