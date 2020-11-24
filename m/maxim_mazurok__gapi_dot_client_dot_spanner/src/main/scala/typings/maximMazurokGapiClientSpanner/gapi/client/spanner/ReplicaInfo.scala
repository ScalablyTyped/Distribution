package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicaInfo extends js.Object {
  
  /**
    * If true, this location is designated as the default leader location where leader replicas are placed. See the [region types
    * documentation](https://cloud.google.com/spanner/docs/instances#region_types) for more details.
    */
  var defaultLeaderLocation: js.UndefOr[Boolean] = js.native
  
  /** The location of the serving resources, e.g. "us-central1". */
  var location: js.UndefOr[String] = js.native
  
  /** The type of replica. */
  var `type`: js.UndefOr[String] = js.native
}
object ReplicaInfo {
  
  @scala.inline
  def apply(): ReplicaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaInfo]
  }
  
  @scala.inline
  implicit class ReplicaInfoOps[Self <: ReplicaInfo] (val x: Self) extends AnyVal {
    
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
    def setDefaultLeaderLocation(value: Boolean): Self = this.set("defaultLeaderLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLeaderLocation: Self = this.set("defaultLeaderLocation", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
