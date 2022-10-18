package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckDataAccessRequest extends StObject {
  
  /**
    * Optional. Specific Consents to evaluate the access request against. These Consents must have the same `user_id` as the evaluated User data mapping, must exist in the current
    * `consent_store`, and have a `state` of either `ACTIVE` or `DRAFT`. A maximum of 100 Consents can be provided here. If no selection is specified, the access request is evaluated
    * against all `ACTIVE` unexpired Consents with the same `user_id` as the evaluated User data mapping.
    */
  var consentList: js.UndefOr[ConsentList] = js.undefined
  
  /** Required. The unique identifier of the resource to check access for. This identifier must correspond to a User data mapping in the given consent store. */
  var dataId: js.UndefOr[String] = js.undefined
  
  /** The values of request attributes associated with this access request. */
  var requestAttributes: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Optional. The view for CheckDataAccessResponse. If unspecified, defaults to `BASIC` and returns `consented` as `TRUE` or `FALSE`. */
  var responseView: js.UndefOr[String] = js.undefined
}
object CheckDataAccessRequest {
  
  inline def apply(): CheckDataAccessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckDataAccessRequest]
  }
  
  extension [Self <: CheckDataAccessRequest](x: Self) {
    
    inline def setConsentList(value: ConsentList): Self = StObject.set(x, "consentList", value.asInstanceOf[js.Any])
    
    inline def setConsentListUndefined: Self = StObject.set(x, "consentList", js.undefined)
    
    inline def setDataId(value: String): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
    
    inline def setDataIdUndefined: Self = StObject.set(x, "dataId", js.undefined)
    
    inline def setRequestAttributes(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributesUndefined: Self = StObject.set(x, "requestAttributes", js.undefined)
    
    inline def setResponseView(value: String): Self = StObject.set(x, "responseView", value.asInstanceOf[js.Any])
    
    inline def setResponseViewUndefined: Self = StObject.set(x, "responseView", js.undefined)
  }
}
