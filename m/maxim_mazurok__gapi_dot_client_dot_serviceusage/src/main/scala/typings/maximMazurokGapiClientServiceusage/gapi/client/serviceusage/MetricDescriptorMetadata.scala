package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDescriptorMetadata extends StObject {
  
  /** The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors. */
  var ingestDelay: js.UndefOr[String] = js.undefined
  
  /** Deprecated. Must use the MetricDescriptor.launch_stage instead. */
  var launchStage: js.UndefOr[String] = js.undefined
  
  /**
    * The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors.
    * Metrics with a higher granularity have a smaller sampling period.
    */
  var samplePeriod: js.UndefOr[String] = js.undefined
}
object MetricDescriptorMetadata {
  
  @scala.inline
  def apply(): MetricDescriptorMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDescriptorMetadata]
  }
  
  @scala.inline
  implicit class MetricDescriptorMetadataMutableBuilder[Self <: MetricDescriptorMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIngestDelay(value: String): Self = StObject.set(x, "ingestDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestDelayUndefined: Self = StObject.set(x, "ingestDelay", js.undefined)
    
    @scala.inline
    def setLaunchStage(value: String): Self = StObject.set(x, "launchStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchStageUndefined: Self = StObject.set(x, "launchStage", js.undefined)
    
    @scala.inline
    def setSamplePeriod(value: String): Self = StObject.set(x, "samplePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplePeriodUndefined: Self = StObject.set(x, "samplePeriod", js.undefined)
  }
}
