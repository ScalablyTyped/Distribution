package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateUserConsentsRequest extends StObject {
  
  /**
    * Optional. Specific Consents to evaluate the access request against. These Consents must have the same `user_id` as the User data mappings being evalauted, must exist in the current
    * `consent_store`, and must have a `state` of either `ACTIVE` or `DRAFT`. A maximum of 100 Consents can be provided here. If unspecified, all `ACTIVE` unexpired Consents in the
    * current `consent_store` will be evaluated.
    */
  var consentList: js.UndefOr[ConsentList] = js.undefined
  
  /** Optional. Limit on the number of User data mappings to return in a single response. If not specified, 100 is used. May not be larger than 1000. */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /** Optional. Token to retrieve the next page of results, or empty to get the first page. */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** Required. The values of request attributes associated with this access request. */
  var requestAttributes: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Optional. The values of resource attributes associated with the resources being requested. If no values are specified, then all resources are queried. */
  var resourceAttributes: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Optional. The view for EvaluateUserConsentsResponse. If unspecified, defaults to `BASIC` and returns `consented` as `TRUE` or `FALSE`. */
  var responseView: js.UndefOr[String] = js.undefined
  
  /** Required. User ID to evaluate consents for. */
  var userId: js.UndefOr[String] = js.undefined
}
object EvaluateUserConsentsRequest {
  
  inline def apply(): EvaluateUserConsentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluateUserConsentsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluateUserConsentsRequest] (val x: Self) extends AnyVal {
    
    inline def setConsentList(value: ConsentList): Self = StObject.set(x, "consentList", value.asInstanceOf[js.Any])
    
    inline def setConsentListUndefined: Self = StObject.set(x, "consentList", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setRequestAttributes(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributesUndefined: Self = StObject.set(x, "requestAttributes", js.undefined)
    
    inline def setResourceAttributes(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
    
    inline def setResourceAttributesUndefined: Self = StObject.set(x, "resourceAttributes", js.undefined)
    
    inline def setResponseView(value: String): Self = StObject.set(x, "responseView", value.asInstanceOf[js.Any])
    
    inline def setResponseViewUndefined: Self = StObject.set(x, "responseView", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
