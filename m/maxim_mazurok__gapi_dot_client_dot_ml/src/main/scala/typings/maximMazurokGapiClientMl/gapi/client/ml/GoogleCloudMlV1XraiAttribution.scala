package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1XraiAttribution extends StObject {
  
  /** Number of steps for approximating the path integral. A good value to start is 50 and gradually increase until the sum to diff property is met within the desired error range. */
  var numIntegralSteps: js.UndefOr[Double] = js.native
}
object GoogleCloudMlV1XraiAttribution {
  
  @scala.inline
  def apply(): GoogleCloudMlV1XraiAttribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1XraiAttribution]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1XraiAttributionMutableBuilder[Self <: GoogleCloudMlV1XraiAttribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumIntegralSteps(value: Double): Self = StObject.set(x, "numIntegralSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumIntegralStepsUndefined: Self = StObject.set(x, "numIntegralSteps", js.undefined)
  }
}
