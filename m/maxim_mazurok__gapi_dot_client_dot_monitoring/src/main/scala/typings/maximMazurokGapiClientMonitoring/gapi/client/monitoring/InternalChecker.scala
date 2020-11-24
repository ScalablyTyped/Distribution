package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalChecker extends js.Object {
  
  /** The checker's human-readable name. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The GCP zone the Uptime check should egress from. Only respected for internal Uptime checks, where internal_network is specified. */
  var gcpZone: js.UndefOr[String] = js.native
  
  /**
    * A unique resource name for this InternalChecker. The format is: projects/[PROJECT_ID_OR_NUMBER]/internalCheckers/[INTERNAL_CHECKER_ID] [PROJECT_ID_OR_NUMBER] is the Stackdriver
    * Workspace project for the Uptime check config associated with the internal checker.
    */
  var name: js.UndefOr[String] = js.native
  
  /** The GCP VPC network (https://cloud.google.com/vpc/docs/vpc) where the internal resource lives (ex: "default"). */
  var network: js.UndefOr[String] = js.native
  
  /** The GCP project ID where the internal checker lives. Not necessary the same as the Workspace project. */
  var peerProjectId: js.UndefOr[String] = js.native
  
  /** The current operational state of the internal checker. */
  var state: js.UndefOr[String] = js.native
}
object InternalChecker {
  
  @scala.inline
  def apply(): InternalChecker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalChecker]
  }
  
  @scala.inline
  implicit class InternalCheckerOps[Self <: InternalChecker] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setGcpZone(value: String): Self = this.set("gcpZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcpZone: Self = this.set("gcpZone", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setPeerProjectId(value: String): Self = this.set("peerProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerProjectId: Self = this.set("peerProjectId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
