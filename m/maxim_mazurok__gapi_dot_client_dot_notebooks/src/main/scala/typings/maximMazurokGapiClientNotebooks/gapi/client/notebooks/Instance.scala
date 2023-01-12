package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  /**
    * The hardware accelerator used on this instance. If you use accelerators, make sure that your configuration has [enough vCPUs and memory to support the `machine_type` you have
    * selected](/compute/docs/gpus/#gpus-list).
    */
  var acceleratorConfig: js.UndefOr[AcceleratorConfig] = js.undefined
  
  /**
    * Input only. The size of the boot disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). The minimum recommended value is 100 GB. If not specified, this defaults
    * to 100.
    */
  var bootDiskSizeGb: js.UndefOr[String] = js.undefined
  
  /** Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`). */
  var bootDiskType: js.UndefOr[String] = js.undefined
  
  /** Optional. Flag to enable ip forwarding or not, default false/off. https://cloud.google.com/vpc/docs/using-routes#canipforward */
  var canIpForward: js.UndefOr[Boolean] = js.undefined
  
  /** Use a container image to start the notebook instance. */
  var containerImage: js.UndefOr[ContainerImage] = js.undefined
  
  /** Output only. Instance creation time. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Email address of entity that sent original CreateInstance request. */
  var creator: js.UndefOr[String] = js.undefined
  
  /** Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we'll automatically choose from official GPU drivers. */
  var customGpuDriverPath: js.UndefOr[String] = js.undefined
  
  /**
    * Input only. The size of the data disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). You can choose the size of the data disk based on how big your notebooks
    * and data are. If not specified, this defaults to 100.
    */
  var dataDiskSizeGb: js.UndefOr[String] = js.undefined
  
  /** Input only. The type of the data disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`). */
  var dataDiskType: js.UndefOr[String] = js.undefined
  
  /** Input only. Disk encryption method used on the boot and data disks, defaults to GMEK. */
  var diskEncryption: js.UndefOr[String] = js.undefined
  
  /** Output only. Attached disks to notebook instance. */
  var disks: js.UndefOr[js.Array[Disk]] = js.undefined
  
  /**
    * Whether the end user authorizes Google Cloud to install GPU driver on this instance. If this field is empty or set to false, the GPU driver won't be installed. Only applicable to
    * instances with GPUs.
    */
  var installGpuDriver: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Input only. The owner of this instance after creation. Format: `alias@example.com` Currently supports one owner only. If not specified, all of the service account users of your VM
    * instance's service account can use the instance.
    */
  var instanceOwners: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Input only. The KMS key used to encrypt the disks, only applicable if disk_encryption is CMEK. Format:
    * `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}` Learn more about [using your own encryption keys](/kms/docs/quickstart).
    */
  var kmsKey: js.UndefOr[String] = js.undefined
  
  /** Labels to apply to this instance. These can be later modified by the setLabels method. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Required. The [Compute Engine machine type](/compute/docs/machine-types) of this instance. */
  var machineType: js.UndefOr[String] = js.undefined
  
  /** Custom metadata to apply to this instance. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Output only. The name of this notebook instance. Format: `projects/{project_id}/locations/{location}/instances/{instance_id}` */
  var name: js.UndefOr[String] = js.undefined
  
  /** The name of the VPC that this instance is in. Format: `projects/{project_id}/global/networks/{network_id}` */
  var network: js.UndefOr[String] = js.undefined
  
  /** Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet. */
  var nicType: js.UndefOr[String] = js.undefined
  
  /** If true, the notebook instance will not register with the proxy. */
  var noProxyAccess: js.UndefOr[Boolean] = js.undefined
  
  /** If true, no public IP will be assigned to this instance. */
  var noPublicIp: js.UndefOr[Boolean] = js.undefined
  
  /** Input only. If true, the data disk will not be auto deleted when deleting the instance. */
  var noRemoveDataDisk: js.UndefOr[Boolean] = js.undefined
  
  /** Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`). */
  var postStartupScript: js.UndefOr[String] = js.undefined
  
  /** Output only. The proxy endpoint that is used to access the Jupyter notebook. */
  var proxyUri: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The optional reservation affinity. Setting this field will apply the specified [Zonal Compute
    * Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) to this notebook instance.
    */
  var reservationAffinity: js.UndefOr[ReservationAffinity] = js.undefined
  
  /**
    * The service account on this instance, giving access to other Google Cloud services. You can use any service account within the same project, but you must have the service account
    * user permission to use the instance. If not specified, the [Compute Engine default service
    * account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
    */
  var serviceAccount: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The URIs of service account scopes to be included in Compute Engine instances. If not specified, the following
    * [scopes](https://cloud.google.com/compute/docs/access/service-accounts#accesscopesiam) are defined: - https://www.googleapis.com/auth/cloud-platform -
    * https://www.googleapis.com/auth/userinfo.email If not using default scopes, you need at least: https://www.googleapis.com/auth/compute
    */
  var serviceAccountScopes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. Shielded VM configuration. [Images using supported Shielded VM features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm). */
  var shieldedInstanceConfig: js.UndefOr[ShieldedInstanceConfig] = js.undefined
  
  /** Output only. The state of this instance. */
  var state: js.UndefOr[String] = js.undefined
  
  /** The name of the subnet that this instance is in. Format: `projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}` */
  var subnet: js.UndefOr[String] = js.undefined
  
  /** Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)). */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Instance update time. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** The upgrade history of this instance. */
  var upgradeHistory: js.UndefOr[js.Array[UpgradeHistoryEntry]] = js.undefined
  
  /** Use a Compute Engine VM image to start the notebook instance. */
  var vmImage: js.UndefOr[VmImage] = js.undefined
}
object Instance {
  
  inline def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
    
    inline def setAcceleratorConfig(value: AcceleratorConfig): Self = StObject.set(x, "acceleratorConfig", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorConfigUndefined: Self = StObject.set(x, "acceleratorConfig", js.undefined)
    
    inline def setBootDiskSizeGb(value: String): Self = StObject.set(x, "bootDiskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setBootDiskSizeGbUndefined: Self = StObject.set(x, "bootDiskSizeGb", js.undefined)
    
    inline def setBootDiskType(value: String): Self = StObject.set(x, "bootDiskType", value.asInstanceOf[js.Any])
    
    inline def setBootDiskTypeUndefined: Self = StObject.set(x, "bootDiskType", js.undefined)
    
    inline def setCanIpForward(value: Boolean): Self = StObject.set(x, "canIpForward", value.asInstanceOf[js.Any])
    
    inline def setCanIpForwardUndefined: Self = StObject.set(x, "canIpForward", js.undefined)
    
    inline def setContainerImage(value: ContainerImage): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    inline def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setCustomGpuDriverPath(value: String): Self = StObject.set(x, "customGpuDriverPath", value.asInstanceOf[js.Any])
    
    inline def setCustomGpuDriverPathUndefined: Self = StObject.set(x, "customGpuDriverPath", js.undefined)
    
    inline def setDataDiskSizeGb(value: String): Self = StObject.set(x, "dataDiskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDataDiskSizeGbUndefined: Self = StObject.set(x, "dataDiskSizeGb", js.undefined)
    
    inline def setDataDiskType(value: String): Self = StObject.set(x, "dataDiskType", value.asInstanceOf[js.Any])
    
    inline def setDataDiskTypeUndefined: Self = StObject.set(x, "dataDiskType", js.undefined)
    
    inline def setDiskEncryption(value: String): Self = StObject.set(x, "diskEncryption", value.asInstanceOf[js.Any])
    
    inline def setDiskEncryptionUndefined: Self = StObject.set(x, "diskEncryption", js.undefined)
    
    inline def setDisks(value: js.Array[Disk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: Disk*): Self = StObject.set(x, "disks", js.Array(value*))
    
    inline def setInstallGpuDriver(value: Boolean): Self = StObject.set(x, "installGpuDriver", value.asInstanceOf[js.Any])
    
    inline def setInstallGpuDriverUndefined: Self = StObject.set(x, "installGpuDriver", js.undefined)
    
    inline def setInstanceOwners(value: js.Array[String]): Self = StObject.set(x, "instanceOwners", value.asInstanceOf[js.Any])
    
    inline def setInstanceOwnersUndefined: Self = StObject.set(x, "instanceOwners", js.undefined)
    
    inline def setInstanceOwnersVarargs(value: String*): Self = StObject.set(x, "instanceOwners", js.Array(value*))
    
    inline def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNicType(value: String): Self = StObject.set(x, "nicType", value.asInstanceOf[js.Any])
    
    inline def setNicTypeUndefined: Self = StObject.set(x, "nicType", js.undefined)
    
    inline def setNoProxyAccess(value: Boolean): Self = StObject.set(x, "noProxyAccess", value.asInstanceOf[js.Any])
    
    inline def setNoProxyAccessUndefined: Self = StObject.set(x, "noProxyAccess", js.undefined)
    
    inline def setNoPublicIp(value: Boolean): Self = StObject.set(x, "noPublicIp", value.asInstanceOf[js.Any])
    
    inline def setNoPublicIpUndefined: Self = StObject.set(x, "noPublicIp", js.undefined)
    
    inline def setNoRemoveDataDisk(value: Boolean): Self = StObject.set(x, "noRemoveDataDisk", value.asInstanceOf[js.Any])
    
    inline def setNoRemoveDataDiskUndefined: Self = StObject.set(x, "noRemoveDataDisk", js.undefined)
    
    inline def setPostStartupScript(value: String): Self = StObject.set(x, "postStartupScript", value.asInstanceOf[js.Any])
    
    inline def setPostStartupScriptUndefined: Self = StObject.set(x, "postStartupScript", js.undefined)
    
    inline def setProxyUri(value: String): Self = StObject.set(x, "proxyUri", value.asInstanceOf[js.Any])
    
    inline def setProxyUriUndefined: Self = StObject.set(x, "proxyUri", js.undefined)
    
    inline def setReservationAffinity(value: ReservationAffinity): Self = StObject.set(x, "reservationAffinity", value.asInstanceOf[js.Any])
    
    inline def setReservationAffinityUndefined: Self = StObject.set(x, "reservationAffinity", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountScopes(value: js.Array[String]): Self = StObject.set(x, "serviceAccountScopes", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountScopesUndefined: Self = StObject.set(x, "serviceAccountScopes", js.undefined)
    
    inline def setServiceAccountScopesVarargs(value: String*): Self = StObject.set(x, "serviceAccountScopes", js.Array(value*))
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setShieldedInstanceConfig(value: ShieldedInstanceConfig): Self = StObject.set(x, "shieldedInstanceConfig", value.asInstanceOf[js.Any])
    
    inline def setShieldedInstanceConfigUndefined: Self = StObject.set(x, "shieldedInstanceConfig", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSubnet(value: String): Self = StObject.set(x, "subnet", value.asInstanceOf[js.Any])
    
    inline def setSubnetUndefined: Self = StObject.set(x, "subnet", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUpgradeHistory(value: js.Array[UpgradeHistoryEntry]): Self = StObject.set(x, "upgradeHistory", value.asInstanceOf[js.Any])
    
    inline def setUpgradeHistoryUndefined: Self = StObject.set(x, "upgradeHistory", js.undefined)
    
    inline def setUpgradeHistoryVarargs(value: UpgradeHistoryEntry*): Self = StObject.set(x, "upgradeHistory", js.Array(value*))
    
    inline def setVmImage(value: VmImage): Self = StObject.set(x, "vmImage", value.asInstanceOf[js.Any])
    
    inline def setVmImageUndefined: Self = StObject.set(x, "vmImage", js.undefined)
  }
}
