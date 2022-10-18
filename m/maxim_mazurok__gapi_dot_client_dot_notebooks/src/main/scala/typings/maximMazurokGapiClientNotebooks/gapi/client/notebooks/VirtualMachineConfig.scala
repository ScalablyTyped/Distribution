package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualMachineConfig extends StObject {
  
  /** Optional. The Compute Engine accelerator configuration for this runtime. */
  var acceleratorConfig: js.UndefOr[RuntimeAcceleratorConfig] = js.undefined
  
  /** Optional. Boot image metadata used for runtime upgradeability. */
  var bootImage: js.UndefOr[Any] = js.undefined
  
  /** Optional. Use a list of container images to use as Kernels in the notebook instance. */
  var containerImages: js.UndefOr[js.Array[ContainerImage]] = js.undefined
  
  /** Required. Data disk option configuration settings. */
  var dataDisk: js.UndefOr[LocalDisk] = js.undefined
  
  /** Optional. Encryption settings for virtual machine data disk. */
  var encryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
  
  /** Output only. The Compute Engine guest attributes. (see [Project and instance guest attributes](https://cloud.google.com/compute/docs/storing-retrieving-metadata#guest_attributes)). */
  var guestAttributes: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * Optional. If true, runtime will only have internal IP addresses. By default, runtimes are not restricted to internal IP addresses, and will have ephemeral external IP addresses
    * assigned to each vm. This `internal_ip_only` restriction can only be enabled for subnetwork enabled networks, and all dependencies must be configured to be accessible without
    * external IP addresses.
    */
  var internalIpOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. The labels to associate with this runtime. Label **keys** must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). Label
    * **values** may be empty, but, if present, must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
    * associated with a cluster.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Required. The Compute Engine machine type used for runtimes. Short name is valid. Examples: * `n1-standard-2` * `e2-standard-8` */
  var machineType: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The Compute Engine metadata entries to add to virtual machine. (see [Project and instance
    * metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
    */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork. If neither `network` nor `subnet` is specified, the "default"
    * network of the project is used, if it exists. A full URL or partial URI. Examples: * `https://www.googleapis.com/compute/v1/projects/[project_id]/global/networks/default` *
    * `projects/[project_id]/global/networks/default` Runtimes are managed resources inside Google Infrastructure. Runtimes support the following network configurations: * Google Managed
    * Network (Network & subnet are empty) * Consumer Project VPC (network & subnet are required). Requires configuring Private Service Access. * Shared VPC (network & subnet are
    * required). Requires configuring Private Service Access.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /** Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet. */
  var nicType: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Reserved IP Range name is used for VPC Peering. The subnetwork allocation will use the range *name* if it's assigned. Example: managed-notebooks-range-c
    * PEERING_RANGE_NAME_3=managed-notebooks-range-c gcloud compute addresses create $PEERING_RANGE_NAME_3 \ --global \ --prefix-length=24 \ --description="Google Cloud Managed Notebooks
    * Range 24 c" \ --network=$NETWORK \ --addresses=192.168.0.0 \ --purpose=VPC_PEERING Field value will be: `managed-notebooks-range-c`
    */
  var reservedIpRange: js.UndefOr[String] = js.undefined
  
  /** Optional. Shielded VM Instance configuration settings. */
  var shieldedInstanceConfig: js.UndefOr[RuntimeShieldedInstanceConfig] = js.undefined
  
  /**
    * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network. A full URL or partial URI are valid. Examples: *
    * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0` * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
    */
  var subnet: js.UndefOr[String] = js.undefined
  
  /** Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)). */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Output only. The zone where the virtual machine is located. If using regional request, the notebooks service will pick a location in the corresponding runtime region. On a get
    * request, zone will always be present. Example: * `us-central1-b`
    */
  var zone: js.UndefOr[String] = js.undefined
}
object VirtualMachineConfig {
  
  inline def apply(): VirtualMachineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualMachineConfig]
  }
  
  extension [Self <: VirtualMachineConfig](x: Self) {
    
    inline def setAcceleratorConfig(value: RuntimeAcceleratorConfig): Self = StObject.set(x, "acceleratorConfig", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorConfigUndefined: Self = StObject.set(x, "acceleratorConfig", js.undefined)
    
    inline def setBootImage(value: Any): Self = StObject.set(x, "bootImage", value.asInstanceOf[js.Any])
    
    inline def setBootImageUndefined: Self = StObject.set(x, "bootImage", js.undefined)
    
    inline def setContainerImages(value: js.Array[ContainerImage]): Self = StObject.set(x, "containerImages", value.asInstanceOf[js.Any])
    
    inline def setContainerImagesUndefined: Self = StObject.set(x, "containerImages", js.undefined)
    
    inline def setContainerImagesVarargs(value: ContainerImage*): Self = StObject.set(x, "containerImages", js.Array(value*))
    
    inline def setDataDisk(value: LocalDisk): Self = StObject.set(x, "dataDisk", value.asInstanceOf[js.Any])
    
    inline def setDataDiskUndefined: Self = StObject.set(x, "dataDisk", js.undefined)
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setGuestAttributes(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "guestAttributes", value.asInstanceOf[js.Any])
    
    inline def setGuestAttributesUndefined: Self = StObject.set(x, "guestAttributes", js.undefined)
    
    inline def setInternalIpOnly(value: Boolean): Self = StObject.set(x, "internalIpOnly", value.asInstanceOf[js.Any])
    
    inline def setInternalIpOnlyUndefined: Self = StObject.set(x, "internalIpOnly", js.undefined)
    
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
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNicType(value: String): Self = StObject.set(x, "nicType", value.asInstanceOf[js.Any])
    
    inline def setNicTypeUndefined: Self = StObject.set(x, "nicType", js.undefined)
    
    inline def setReservedIpRange(value: String): Self = StObject.set(x, "reservedIpRange", value.asInstanceOf[js.Any])
    
    inline def setReservedIpRangeUndefined: Self = StObject.set(x, "reservedIpRange", js.undefined)
    
    inline def setShieldedInstanceConfig(value: RuntimeShieldedInstanceConfig): Self = StObject.set(x, "shieldedInstanceConfig", value.asInstanceOf[js.Any])
    
    inline def setShieldedInstanceConfigUndefined: Self = StObject.set(x, "shieldedInstanceConfig", js.undefined)
    
    inline def setSubnet(value: String): Self = StObject.set(x, "subnet", value.asInstanceOf[js.Any])
    
    inline def setSubnetUndefined: Self = StObject.set(x, "subnet", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
