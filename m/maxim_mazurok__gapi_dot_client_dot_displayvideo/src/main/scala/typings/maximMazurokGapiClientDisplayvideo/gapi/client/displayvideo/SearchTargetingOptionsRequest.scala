package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTargetingOptionsRequest extends StObject {
  
  /** Required. The Advertiser this request is being made in the context of. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Search terms for Business Chain targeting options. Can only be used when targeting_type is `TARGETING_TYPE_BUSINESS_CHAIN`. */
  var businessChainSearchTerms: js.UndefOr[BusinessChainSearchTerms] = js.undefined
  
  /** Search terms for geo region targeting options. Can only be used when targeting_type is `TARGETING_TYPE_GEO_REGION`. */
  var geoRegionSearchTerms: js.UndefOr[GeoRegionSearchTerms] = js.undefined
  
  /** Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified. */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `SearchTargetingOptions` method.
    * If not specified, the first page of results will be returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** Search terms for POI targeting options. Can only be used when targeting_type is `TARGETING_TYPE_POI`. */
  var poiSearchTerms: js.UndefOr[PoiSearchTerms] = js.undefined
}
object SearchTargetingOptionsRequest {
  
  inline def apply(): SearchTargetingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTargetingOptionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchTargetingOptionsRequest] (val x: Self) extends AnyVal {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setBusinessChainSearchTerms(value: BusinessChainSearchTerms): Self = StObject.set(x, "businessChainSearchTerms", value.asInstanceOf[js.Any])
    
    inline def setBusinessChainSearchTermsUndefined: Self = StObject.set(x, "businessChainSearchTerms", js.undefined)
    
    inline def setGeoRegionSearchTerms(value: GeoRegionSearchTerms): Self = StObject.set(x, "geoRegionSearchTerms", value.asInstanceOf[js.Any])
    
    inline def setGeoRegionSearchTermsUndefined: Self = StObject.set(x, "geoRegionSearchTerms", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPoiSearchTerms(value: PoiSearchTerms): Self = StObject.set(x, "poiSearchTerms", value.asInstanceOf[js.Any])
    
    inline def setPoiSearchTermsUndefined: Self = StObject.set(x, "poiSearchTerms", js.undefined)
  }
}
