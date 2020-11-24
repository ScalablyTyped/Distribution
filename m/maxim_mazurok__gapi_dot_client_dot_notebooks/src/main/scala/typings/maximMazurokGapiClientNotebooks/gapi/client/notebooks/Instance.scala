package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends js.Object {
  
  /**
    * The hardware accelerator used on this instance. If you use accelerators, make sure that your configuration has [enough vCPUs and memory to support the `machine_type` you have
    * selected](/compute/docs/gpus/#gpus-list).
    */
  var acceleratorConfig: js.UndefOr[AcceleratorConfig] = js.native
  
  /**
    * Input only. The size of the boot disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). The minimum recommended value is 100 GB. If not specified, this defaults
    * to 100.
    */
  var bootDiskSizeGb: js.UndefOr[String] = js.native
  
  /** Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`). */
  var bootDiskType: js.UndefOr[String] = js.native
  
  /** Use a container image to start the notebook instance. */
  var containerImage: js.UndefOr[ContainerImage] = js.native
  
  /** Output only. Instance creation time. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we'll automatically choose from official GPU drivers. */
  var customGpuDriverPath: js.UndefOr[String] = js.native
  
  /**
    * Input only. The size of the data disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). You can choose the size of the data disk based on how big your notebooks
    * and data are. If not specified, this defaults to 100.
    */
  var dataDiskSizeGb: js.UndefOr[String] = js.native
  
  /** Input only. The type of the data disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`). */
  var dataDiskType: js.UndefOr[String] = js.native
  
  /** Input only. Disk encryption method used on the boot and data disks, defaults to GMEK. */
  var diskEncryption: js.UndefOr[String] = js.native
  
  /** Output only. Attached disks to notebook instance. */
  var disks: js.UndefOr[js.Array[Disk]] = js.native
  
  /**
    * Whether the end user authorizes Google Cloud to install GPU driver on this instance. If this field is empty or set to false, the GPU driver won't be installed. Only applicable to
    * instances with GPUs.
    */
  var installGpuDriver: js.UndefOr[Boolean] = js.native
  
  /**
    * Input only. The owner of this instance after creation. Format: `alias@example.com` Currently supports one owner only. If not specified, all of the service account users of your VM
    * instance's service account can use the instance.
    */
  var instanceOwners: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Input only. The KMS key used to encrypt the disks, only applicable if disk_encryption is CMEK. Format:
    * `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}` Learn more about [using your own encryption keys](/kms/docs/quickstart).
    */
  var kmsKey: js.UndefOr[String] = js.native
  
  /** Labels to apply to this instance. These can be later modified by the setLabels method. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.Instance with TopLevel[js.Any]
  ] = js.native
  
  /** Required. The [Compute Engine machine type](/compute/docs/machine-types) of this instance. */
  var machineType: js.UndefOr[String] = js.native
  
  /** Custom metadata to apply to this instance. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.Instance with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The name of this notebook instance. Format: `projects/{project_id}/locations/{location}/instances/{instance_id}` */
  var name: js.UndefOr[String] = js.native
  
  /** The name of the VPC that this instance is in. Format: `projects/{project_id}/global/networks/{network_id}` */
  var network: js.UndefOr[String] = js.native
  
  /** If true, the notebook instance will not register with the proxy. */
  var noProxyAccess: js.UndefOr[Boolean] = js.native
  
  /** If true, no public IP will be assigned to this instance. */
  var noPublicIp: js.UndefOr[Boolean] = js.native
  
  /** Input only. If true, the data disk will not be auto deleted when deleting the instance. */
  var noRemoveDataDisk: js.UndefOr[Boolean] = js.native
  
  /** Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path (gs://path-to-file/file-name). */
  var postStartupScript: js.UndefOr[String] = js.native
  
  /** Output only. The proxy endpoint that is used to access the Jupyter notebook. */
  var proxyUri: js.UndefOr[String] = js.native
  
  /**
    * The service account on this instance, giving access to other Google Cloud services. You can use any service account within the same project, but you must have the service account
    * user permission to use the instance. If not specified, the [Compute Engine default service
    * account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
    */
  var serviceAccount: js.UndefOr[String] = js.native
  
  /** Output only. The state of this instance. */
  var state: js.UndefOr[String] = js.native
  
  /** The name of the subnet that this instance is in. Format: `projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}` */
  var subnet: js.UndefOr[String] = js.native
  
  /** Output only. Instance update time. */
  var updateTime: js.UndefOr[String] = js.native
  
  /** The upgrade history of this instance. */
  var upgradeHistory: js.UndefOr[js.Array[UpgradeHistoryEntry]] = js.native
  
  /** Use a Compute Engine VM image to start the notebook instance. */
  var vmImage: js.UndefOr[VmImage] = js.native
}
object Instance {
  
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    
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
    def setAcceleratorConfig(value: AcceleratorConfig): Self = this.set("acceleratorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorConfig: Self = this.set("acceleratorConfig", js.undefined)
    
    @scala.inline
    def setBootDiskSizeGb(value: String): Self = this.set("bootDiskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootDiskSizeGb: Self = this.set("bootDiskSizeGb", js.undefined)
    
    @scala.inline
    def setBootDiskType(value: String): Self = this.set("bootDiskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootDiskType: Self = this.set("bootDiskType", js.undefined)
    
    @scala.inline
    def setContainerImage(value: ContainerImage): Self = this.set("containerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerImage: Self = this.set("containerImage", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setCustomGpuDriverPath(value: String): Self = this.set("customGpuDriverPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomGpuDriverPath: Self = this.set("customGpuDriverPath", js.undefined)
    
    @scala.inline
    def setDataDiskSizeGb(value: String): Self = this.set("dataDiskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDiskSizeGb: Self = this.set("dataDiskSizeGb", js.undefined)
    
    @scala.inline
    def setDataDiskType(value: String): Self = this.set("dataDiskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDiskType: Self = this.set("dataDiskType", js.undefined)
    
    @scala.inline
    def setDiskEncryption(value: String): Self = this.set("diskEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskEncryption: Self = this.set("diskEncryption", js.undefined)
    
    @scala.inline
    def setDisksVarargs(value: Disk*): Self = this.set("disks", js.Array(value :_*))
    
    @scala.inline
    def setDisks(value: js.Array[Disk]): Self = this.set("disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisks: Self = this.set("disks", js.undefined)
    
    @scala.inline
    def setInstallGpuDriver(value: Boolean): Self = this.set("installGpuDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallGpuDriver: Self = this.set("installGpuDriver", js.undefined)
    
    @scala.inline
    def setInstanceOwnersVarargs(value: String*): Self = this.set("instanceOwners", js.Array(value :_*))
    
    @scala.inline
    def setInstanceOwners(value: js.Array[String]): Self = this.set("instanceOwners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceOwners: Self = this.set("instanceOwners", js.undefined)
    
    @scala.inline
    def setKmsKey(value: String): Self = this.set("kmsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKey: Self = this.set("kmsKey", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.Instance with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.Instance with TopLevel[js.Any]
    ): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setNoProxyAccess(value: Boolean): Self = this.set("noProxyAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoProxyAccess: Self = this.set("noProxyAccess", js.undefined)
    
    @scala.inline
    def setNoPublicIp(value: Boolean): Self = this.set("noPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoPublicIp: Self = this.set("noPublicIp", js.undefined)
    
    @scala.inline
    def setNoRemoveDataDisk(value: Boolean): Self = this.set("noRemoveDataDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoRemoveDataDisk: Self = this.set("noRemoveDataDisk", js.undefined)
    
    @scala.inline
    def setPostStartupScript(value: String): Self = this.set("postStartupScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostStartupScript: Self = this.set("postStartupScript", js.undefined)
    
    @scala.inline
    def setProxyUri(value: String): Self = this.set("proxyUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyUri: Self = this.set("proxyUri", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: String): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccount: Self = this.set("serviceAccount", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSubnet(value: String): Self = this.set("subnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnet: Self = this.set("subnet", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setUpgradeHistoryVarargs(value: UpgradeHistoryEntry*): Self = this.set("upgradeHistory", js.Array(value :_*))
    
    @scala.inline
    def setUpgradeHistory(value: js.Array[UpgradeHistoryEntry]): Self = this.set("upgradeHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeHistory: Self = this.set("upgradeHistory", js.undefined)
    
    @scala.inline
    def setVmImage(value: VmImage): Self = this.set("vmImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmImage: Self = this.set("vmImage", js.undefined)
  }
}
