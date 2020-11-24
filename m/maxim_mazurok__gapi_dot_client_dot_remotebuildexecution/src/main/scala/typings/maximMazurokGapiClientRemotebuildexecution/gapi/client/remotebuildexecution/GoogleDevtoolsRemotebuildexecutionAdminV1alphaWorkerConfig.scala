package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig extends js.Object {
  
  /** The accelerator card attached to each VM. */
  var accelerator: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig] = js.native
  
  /** Required. Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/ */
  var diskSizeGb: js.UndefOr[String] = js.native
  
  /** Required. Disk Type to use for the worker. See [Storage options](https://cloud.google.com/compute/docs/disks/#introduction). Currently only `pd-standard` and `pd-ssd` are supported. */
  var diskType: js.UndefOr[String] = js.native
  
  /**
    * Labels associated with the workers. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes.
    * International letters are permitted. Label keys must start with a letter. Label values are optional. There can not be more than 64 labels per resource.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Required. Machine type of the worker, such as `n1-standard-2`. See https://cloud.google.com/compute/docs/machine-types for a list of supported machine types. Note that `f1-micro`
    * and `g1-small` are not yet supported.
    */
  var machineType: js.UndefOr[String] = js.native
  
  /** The maximum number of actions a worker can execute concurrently. */
  var maxConcurrentActions: js.UndefOr[String] = js.native
  
  /** Minimum CPU platform to use when creating the worker. See [CPU Platforms](https://cloud.google.com/compute/docs/cpu-platforms). */
  var minCpuPlatform: js.UndefOr[String] = js.native
  
  /**
    * Determines the type of network access granted to workers. Possible values: - "public": Workers can connect to the public internet. - "private": Workers can only connect to Google
    * APIs and services. - "restricted-private": Workers can only connect to Google APIs that are reachable through `restricted.googleapis.com` (`199.36.153.4/30`).
    */
  var networkAccess: js.UndefOr[String] = js.native
  
  /**
    * Determines whether the worker is reserved (equivalent to a Compute Engine on-demand VM and therefore won't be preempted). See [Preemptible
    * VMs](https://cloud.google.com/preemptible-vms/) for more details.
    */
  var reserved: js.UndefOr[Boolean] = js.native
  
  /** Sole-tenant node information for pools hosted on STNs. */
  var soleTenancy: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaSoleTenancyConfig] = js.native
  
  /** The name of the image used by each VM. */
  var vmImage: js.UndefOr[String] = js.native
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigOps[Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig] (val x: Self) extends AnyVal {
    
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
    def setAccelerator(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig): Self = this.set("accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccelerator: Self = this.set("accelerator", js.undefined)
    
    @scala.inline
    def setDiskSizeGb(value: String): Self = this.set("diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSizeGb: Self = this.set("diskSizeGb", js.undefined)
    
    @scala.inline
    def setDiskType(value: String): Self = this.set("diskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskType: Self = this.set("diskType", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    
    @scala.inline
    def setMaxConcurrentActions(value: String): Self = this.set("maxConcurrentActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrentActions: Self = this.set("maxConcurrentActions", js.undefined)
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = this.set("minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCpuPlatform: Self = this.set("minCpuPlatform", js.undefined)
    
    @scala.inline
    def setNetworkAccess(value: String): Self = this.set("networkAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkAccess: Self = this.set("networkAccess", js.undefined)
    
    @scala.inline
    def setReserved(value: Boolean): Self = this.set("reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReserved: Self = this.set("reserved", js.undefined)
    
    @scala.inline
    def setSoleTenancy(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaSoleTenancyConfig): Self = this.set("soleTenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoleTenancy: Self = this.set("soleTenancy", js.undefined)
    
    @scala.inline
    def setVmImage(value: String): Self = this.set("vmImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmImage: Self = this.set("vmImage", js.undefined)
  }
}
