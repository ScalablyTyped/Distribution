package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaInfo extends StObject {
  
  /**
    * If true, this location is designated as the default leader location where leader replicas are placed. See the [region types
    * documentation](https://cloud.google.com/spanner/docs/instances#region_types) for more details.
    */
  var defaultLeaderLocation: js.UndefOr[Boolean] = js.undefined
  
  /** The location of the serving resources, e.g. "us-central1". */
  var location: js.UndefOr[String] = js.undefined
  
  /** The type of replica. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ReplicaInfo {
  
  @scala.inline
  def apply(): ReplicaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaInfo]
  }
  
  @scala.inline
  implicit class ReplicaInfoMutableBuilder[Self <: ReplicaInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultLeaderLocation(value: Boolean): Self = StObject.set(x, "defaultLeaderLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLeaderLocationUndefined: Self = StObject.set(x, "defaultLeaderLocation", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
