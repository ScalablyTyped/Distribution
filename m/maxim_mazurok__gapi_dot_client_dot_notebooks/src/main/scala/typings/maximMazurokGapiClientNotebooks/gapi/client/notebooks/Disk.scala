package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disk extends js.Object {
  
  /** Indicates whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance). */
  var autoDelete: js.UndefOr[Boolean] = js.native
  
  /** Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem. */
  var boot: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used
    * to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form
    * persistent-disk-x, where x is a number assigned by Google Compute Engine.This field is only applicable for persistent disks.
    */
  var deviceName: js.UndefOr[String] = js.native
  
  /** Indicates the size of the disk in base-2 GB. */
  var diskSizeGb: js.UndefOr[String] = js.native
  
  /**
    * Indicates a list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available
    * options.
    */
  var guestOsFeatures: js.UndefOr[js.Array[GuestOsFeature]] = js.native
  
  /** A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number. */
  var index: js.UndefOr[String] = js.native
  
  /**
    * Indicates the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if
    * you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD
    * performance. Valid values: NVME SCSI
    */
  var interface: js.UndefOr[String] = js.native
  
  /** Type of the resource. Always compute#attachedDisk for attached disks. */
  var kind: js.UndefOr[String] = js.native
  
  /** A list of publicly visible licenses. Reserved for Google's use. A License represents billing and aggregate usage data for public and marketplace images. */
  var licenses: js.UndefOr[js.Array[String]] = js.native
  
  /** The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode. Valid values: READ_ONLY READ_WRITE */
  var mode: js.UndefOr[String] = js.native
  
  /** Indicates a valid partial or full URL to an existing Persistent Disk resource. */
  var source: js.UndefOr[String] = js.native
  
  /** Indicates the type of the disk, either SCRATCH or PERSISTENT. Valid values: PERSISTENT SCRATCH */
  var `type`: js.UndefOr[String] = js.native
}
object Disk {
  
  @scala.inline
  def apply(): Disk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disk]
  }
  
  @scala.inline
  implicit class DiskOps[Self <: Disk] (val x: Self) extends AnyVal {
    
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
    def setAutoDelete(value: Boolean): Self = this.set("autoDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDelete: Self = this.set("autoDelete", js.undefined)
    
    @scala.inline
    def setBoot(value: Boolean): Self = this.set("boot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoot: Self = this.set("boot", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    
    @scala.inline
    def setDiskSizeGb(value: String): Self = this.set("diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSizeGb: Self = this.set("diskSizeGb", js.undefined)
    
    @scala.inline
    def setGuestOsFeaturesVarargs(value: GuestOsFeature*): Self = this.set("guestOsFeatures", js.Array(value :_*))
    
    @scala.inline
    def setGuestOsFeatures(value: js.Array[GuestOsFeature]): Self = this.set("guestOsFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuestOsFeatures: Self = this.set("guestOsFeatures", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setInterface(value: String): Self = this.set("interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterface: Self = this.set("interface", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLicensesVarargs(value: String*): Self = this.set("licenses", js.Array(value :_*))
    
    @scala.inline
    def setLicenses(value: js.Array[String]): Self = this.set("licenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenses: Self = this.set("licenses", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
