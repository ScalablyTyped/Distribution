package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentList extends StObject {
  
  /**
    * The resource names of the Consents to evaluate against, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}`.
    */
  var consents: js.UndefOr[js.Array[String]] = js.undefined
}
object ConsentList {
  
  inline def apply(): ConsentList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsentList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsentList] (val x: Self) extends AnyVal {
    
    inline def setConsents(value: js.Array[String]): Self = StObject.set(x, "consents", value.asInstanceOf[js.Any])
    
    inline def setConsentsUndefined: Self = StObject.set(x, "consents", js.undefined)
    
    inline def setConsentsVarargs(value: String*): Self = StObject.set(x, "consents", js.Array(value*))
  }
}
