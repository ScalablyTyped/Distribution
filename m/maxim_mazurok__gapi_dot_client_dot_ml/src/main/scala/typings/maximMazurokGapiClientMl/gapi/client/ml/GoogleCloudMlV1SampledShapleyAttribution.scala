package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1SampledShapleyAttribution extends StObject {
  
  /** The number of feature permutations to consider when approximating the Shapley values. */
  var numPaths: js.UndefOr[Double] = js.undefined
}
object GoogleCloudMlV1SampledShapleyAttribution {
  
  @scala.inline
  def apply(): GoogleCloudMlV1SampledShapleyAttribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1SampledShapleyAttribution]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1SampledShapleyAttributionMutableBuilder[Self <: GoogleCloudMlV1SampledShapleyAttribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumPaths(value: Double): Self = StObject.set(x, "numPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPathsUndefined: Self = StObject.set(x, "numPaths", js.undefined)
  }
}
