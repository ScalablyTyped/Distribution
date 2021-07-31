package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficTarget extends StObject {
  
  /**
    * ConfigurationName of a configuration to whose latest revision we will send this portion of traffic. When the "status.latestReadyRevisionName" of the referenced configuration
    * changes, we will automatically migrate traffic from the prior "latest ready" revision to the new one. This field is never set in Route's status, only its spec. This is mutually
    * exclusive with RevisionName. Cloud Run currently supports a single ConfigurationName.
    */
  var configurationName: js.UndefOr[String] = js.undefined
  
  /**
    * LatestRevision may be optionally provided to indicate that the latest ready Revision of the Configuration should be used for this traffic target. When provided LatestRevision must
    * be true if RevisionName is empty; it must be false when RevisionName is non-empty. +optional
    */
  var latestRevision: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Percent specifies percent of the traffic to this Revision or Configuration. This defaults to zero if unspecified. Cloud Run currently requires 100 percent for a single
    * ConfigurationName TrafficTarget entry.
    */
  var percent: js.UndefOr[Double] = js.undefined
  
  /**
    * RevisionName of a specific revision to which to send this portion of traffic. This is mutually exclusive with ConfigurationName. Providing RevisionName in spec is not currently
    * supported by Cloud Run.
    */
  var revisionName: js.UndefOr[String] = js.undefined
  
  /** Tag is optionally used to expose a dedicated url for referencing this target exclusively. +optional */
  var tag: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. URL displays the URL for accessing tagged traffic targets. URL is displayed in status, and is disallowed on spec. URL must contain a scheme (e.g. http://) and a
    * hostname, but may not contain anything else (e.g. basic auth, url path, etc. Not currently supported in Cloud Run.
    */
  var url: js.UndefOr[String] = js.undefined
}
object TrafficTarget {
  
  @scala.inline
  def apply(): TrafficTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficTarget]
  }
  
  @scala.inline
  implicit class TrafficTargetMutableBuilder[Self <: TrafficTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationName(value: String): Self = StObject.set(x, "configurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationNameUndefined: Self = StObject.set(x, "configurationName", js.undefined)
    
    @scala.inline
    def setLatestRevision(value: Boolean): Self = StObject.set(x, "latestRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestRevisionUndefined: Self = StObject.set(x, "latestRevision", js.undefined)
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    @scala.inline
    def setRevisionName(value: String): Self = StObject.set(x, "revisionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionNameUndefined: Self = StObject.set(x, "revisionName", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
