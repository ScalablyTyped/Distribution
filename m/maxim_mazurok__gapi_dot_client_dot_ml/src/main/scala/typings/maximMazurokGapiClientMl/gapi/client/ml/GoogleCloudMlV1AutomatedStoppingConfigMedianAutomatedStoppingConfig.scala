package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig extends StObject {
  
  /**
    * If true, the median automated stopping rule applies to measurement.use_elapsed_time, which means the elapsed_time field of the current trial's latest measurement is used to compute
    * the median objective value for each completed trial.
    */
  var useElapsedTime: js.UndefOr[Boolean] = js.native
}
object GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig {
  
  @scala.inline
  def apply(): GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfigMutableBuilder[Self <: GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseElapsedTime(value: Boolean): Self = StObject.set(x, "useElapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseElapsedTimeUndefined: Self = StObject.set(x, "useElapsedTime", js.undefined)
  }
}
