package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebDetectionParams extends StObject {
  
  /** Whether to include results derived from the geo information in the image. */
  var includeGeoResults: js.UndefOr[Boolean] = js.undefined
}
object WebDetectionParams {
  
  inline def apply(): WebDetectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebDetectionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebDetectionParams] (val x: Self) extends AnyVal {
    
    inline def setIncludeGeoResults(value: Boolean): Self = StObject.set(x, "includeGeoResults", value.asInstanceOf[js.Any])
    
    inline def setIncludeGeoResultsUndefined: Self = StObject.set(x, "includeGeoResults", js.undefined)
  }
}
