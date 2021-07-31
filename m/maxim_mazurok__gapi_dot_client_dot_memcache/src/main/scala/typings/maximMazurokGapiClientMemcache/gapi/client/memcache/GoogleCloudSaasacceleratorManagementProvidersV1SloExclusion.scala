package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion extends StObject {
  
  /**
    * Exclusion duration. No restrictions on the possible values. When an ongoing operation is taking longer than initially expected, an existing entry in the exclusion list can be
    * updated by extending the duration. This is supported by the subsystem exporting eligibility data as long as such extension is committed at least 10 minutes before the original
    * exclusion expiration - otherwise it is possible that there will be "gaps" in the exclusion application in the exported timeseries.
    */
  var duration: js.UndefOr[String] = js.undefined
  
  /**
    * Human-readable reason for the exclusion. This should be a static string (e.g. "Disruptive update in progress") and should not contain dynamically generated data (e.g. instance
    * name). Can be left empty.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /** Name of an SLI that this exclusion applies to. Can be left empty, signaling that the instance should be excluded from all SLIs defined in the service SLO configuration. */
  var sliName: js.UndefOr[String] = js.undefined
  
  /** Start time of the exclusion. No alignment (e.g. to a full minute) needed. */
  var startTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion {
  
  @scala.inline
  def apply(): GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion]
  }
  
  @scala.inline
  implicit class GoogleCloudSaasacceleratorManagementProvidersV1SloExclusionMutableBuilder[Self <: GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setSliName(value: String): Self = StObject.set(x, "sliName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliNameUndefined: Self = StObject.set(x, "sliName", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
