package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckInResponse extends StObject {
  
  /**
    * The deadline by which the worker must request an extension. The backend will allow for network transmission time and other delays, but the worker must attempt to transmit the
    * extension request no later than the deadline.
    */
  var deadline: js.UndefOr[String] = js.undefined
  
  /** Feature configuration for the operation. */
  var features: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** The metadata that describes the operation assigned to the worker. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
}
object CheckInResponse {
  
  inline def apply(): CheckInResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckInResponse]
  }
  
  extension [Self <: CheckInResponse](x: Self) {
    
    inline def setDeadline(value: String): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
    
    inline def setFeatures(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
