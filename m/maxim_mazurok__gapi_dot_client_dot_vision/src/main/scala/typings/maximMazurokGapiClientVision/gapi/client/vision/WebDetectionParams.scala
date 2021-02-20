package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDetectionParams extends StObject {
  
  /** Whether to include results derived from the geo information in the image. */
  var includeGeoResults: js.UndefOr[Boolean] = js.native
}
object WebDetectionParams {
  
  @scala.inline
  def apply(): WebDetectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebDetectionParams]
  }
  
  @scala.inline
  implicit class WebDetectionParamsMutableBuilder[Self <: WebDetectionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeGeoResults(value: Boolean): Self = StObject.set(x, "includeGeoResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeGeoResultsUndefined: Self = StObject.set(x, "includeGeoResults", js.undefined)
  }
}
