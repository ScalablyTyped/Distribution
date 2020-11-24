package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficTarget extends js.Object {
  
  /**
    * ConfigurationName of a configuration to whose latest revision we will send this portion of traffic. When the "status.latestReadyRevisionName" of the referenced configuration
    * changes, we will automatically migrate traffic from the prior "latest ready" revision to the new one. This field is never set in Route's status, only its spec. This is mutually
    * exclusive with RevisionName. Cloud Run currently supports a single ConfigurationName.
    */
  var configurationName: js.UndefOr[String] = js.native
  
  /**
    * LatestRevision may be optionally provided to indicate that the latest ready Revision of the Configuration should be used for this traffic target. When provided LatestRevision must
    * be true if RevisionName is empty; it must be false when RevisionName is non-empty. +optional
    */
  var latestRevision: js.UndefOr[Boolean] = js.native
  
  /**
    * Percent specifies percent of the traffic to this Revision or Configuration. This defaults to zero if unspecified. Cloud Run currently requires 100 percent for a single
    * ConfigurationName TrafficTarget entry.
    */
  var percent: js.UndefOr[Double] = js.native
  
  /**
    * RevisionName of a specific revision to which to send this portion of traffic. This is mutually exclusive with ConfigurationName. Providing RevisionName in spec is not currently
    * supported by Cloud Run.
    */
  var revisionName: js.UndefOr[String] = js.native
  
  /** Tag is optionally used to expose a dedicated url for referencing this target exclusively. +optional */
  var tag: js.UndefOr[String] = js.native
  
  /**
    * Output only. URL displays the URL for accessing tagged traffic targets. URL is displayed in status, and is disallowed on spec. URL must contain a scheme (e.g. http://) and a
    * hostname, but may not contain anything else (e.g. basic auth, url path, etc. Not currently supported in Cloud Run.
    */
  var url: js.UndefOr[String] = js.native
}
object TrafficTarget {
  
  @scala.inline
  def apply(): TrafficTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficTarget]
  }
  
  @scala.inline
  implicit class TrafficTargetOps[Self <: TrafficTarget] (val x: Self) extends AnyVal {
    
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
    def setConfigurationName(value: String): Self = this.set("configurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationName: Self = this.set("configurationName", js.undefined)
    
    @scala.inline
    def setLatestRevision(value: Boolean): Self = this.set("latestRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestRevision: Self = this.set("latestRevision", js.undefined)
    
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    
    @scala.inline
    def setRevisionName(value: String): Self = this.set("revisionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionName: Self = this.set("revisionName", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
