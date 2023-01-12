package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.complete
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.failed_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Analysesurl extends StObject {
  
  /**
    * Format: uri
    * @description The REST API URL for getting the analyses associated with the upload.
    */
  var analyses_url: js.UndefOr[String | Null] = js.undefined
  
  /** @description Any errors that ocurred during processing of the delivery. */
  var errors: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * @description `pending` files have not yet been processed, while `complete` means results from the SARIF have been stored. `failed` files have either not been processed at all, or could only be partially processed.
    * @enum {string}
    */
  var processing_status: js.UndefOr[pending | complete | failed_] = js.undefined
}
object Analysesurl {
  
  inline def apply(): Analysesurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analysesurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Analysesurl] (val x: Self) extends AnyVal {
    
    inline def setAnalyses_url(value: String): Self = StObject.set(x, "analyses_url", value.asInstanceOf[js.Any])
    
    inline def setAnalyses_urlNull: Self = StObject.set(x, "analyses_url", null)
    
    inline def setAnalyses_urlUndefined: Self = StObject.set(x, "analyses_url", js.undefined)
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsNull: Self = StObject.set(x, "errors", null)
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setProcessing_status(value: pending | complete | failed_): Self = StObject.set(x, "processing_status", value.asInstanceOf[js.Any])
    
    inline def setProcessing_statusUndefined: Self = StObject.set(x, "processing_status", js.undefined)
  }
}
