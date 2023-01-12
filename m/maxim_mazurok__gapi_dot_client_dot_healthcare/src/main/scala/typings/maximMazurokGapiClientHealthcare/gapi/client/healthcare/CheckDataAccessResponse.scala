package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckDataAccessResponse extends StObject {
  
  /** The resource names of all evaluated Consents mapped to their evaluation. */
  var consentDetails: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.healthcare.gapi.client.healthcare.ConsentEvaluation} */ js.Any
  ] = js.undefined
  
  /** Whether the requested resource is consented for the given use. */
  var consented: js.UndefOr[Boolean] = js.undefined
}
object CheckDataAccessResponse {
  
  inline def apply(): CheckDataAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckDataAccessResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckDataAccessResponse] (val x: Self) extends AnyVal {
    
    inline def setConsentDetails(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.healthcare.gapi.client.healthcare.ConsentEvaluation} */ js.Any
    ): Self = StObject.set(x, "consentDetails", value.asInstanceOf[js.Any])
    
    inline def setConsentDetailsUndefined: Self = StObject.set(x, "consentDetails", js.undefined)
    
    inline def setConsented(value: Boolean): Self = StObject.set(x, "consented", value.asInstanceOf[js.Any])
    
    inline def setConsentedUndefined: Self = StObject.set(x, "consented", js.undefined)
  }
}
