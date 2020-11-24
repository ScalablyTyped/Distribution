package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricDescriptorMetadata extends js.Object {
  
  /** The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors. */
  var ingestDelay: js.UndefOr[String] = js.native
  
  /** Deprecated. Must use the MetricDescriptor.launch_stage instead. */
  var launchStage: js.UndefOr[String] = js.native
  
  /**
    * The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors.
    * Metrics with a higher granularity have a smaller sampling period.
    */
  var samplePeriod: js.UndefOr[String] = js.native
}
object MetricDescriptorMetadata {
  
  @scala.inline
  def apply(): MetricDescriptorMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDescriptorMetadata]
  }
  
  @scala.inline
  implicit class MetricDescriptorMetadataOps[Self <: MetricDescriptorMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIngestDelay(value: String): Self = this.set("ingestDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngestDelay: Self = this.set("ingestDelay", js.undefined)
    
    @scala.inline
    def setLaunchStage(value: String): Self = this.set("launchStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchStage: Self = this.set("launchStage", js.undefined)
    
    @scala.inline
    def setSamplePeriod(value: String): Self = this.set("samplePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplePeriod: Self = this.set("samplePeriod", js.undefined)
  }
}
