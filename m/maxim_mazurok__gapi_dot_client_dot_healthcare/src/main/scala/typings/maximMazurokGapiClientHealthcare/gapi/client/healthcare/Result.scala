package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  /** The resource names of all evaluated Consents mapped to their evaluation. */
  var consentDetails: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.healthcare.gapi.client.healthcare.ConsentEvaluation} */ js.Any
  ] = js.undefined
  
  /** Whether the resource is consented for the given use. */
  var consented: js.UndefOr[Boolean] = js.undefined
  
  /** The unique identifier of the evaluated resource. */
  var dataId: js.UndefOr[String] = js.undefined
}
object Result {
  
  inline def apply(): Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    inline def setConsentDetails(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.healthcare.gapi.client.healthcare.ConsentEvaluation} */ js.Any
    ): Self = StObject.set(x, "consentDetails", value.asInstanceOf[js.Any])
    
    inline def setConsentDetailsUndefined: Self = StObject.set(x, "consentDetails", js.undefined)
    
    inline def setConsented(value: Boolean): Self = StObject.set(x, "consented", value.asInstanceOf[js.Any])
    
    inline def setConsentedUndefined: Self = StObject.set(x, "consented", js.undefined)
    
    inline def setDataId(value: String): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
    
    inline def setDataIdUndefined: Self = StObject.set(x, "dataId", js.undefined)
  }
}
