package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExistingDisk extends js.Object {
  
  /**
    * If `disk` contains slashes, the Cloud Life Sciences API assumes that it is a complete URL for the disk. If `disk` does not contain slashes, the Cloud Life Sciences API assumes that
    * the disk is a zonal disk and a URL will be generated of the form `zones//disks/`, where `` is the zone in which the instance is allocated. The disk must be ext4 formatted. If all
    * `Mount` references to this disk have the `read_only` flag set to true, the disk will be attached in `read-only` mode and can be shared with other instances. Otherwise, the disk will
    * be available for writing but cannot be shared.
    */
  var disk: js.UndefOr[String] = js.native
}
object ExistingDisk {
  
  @scala.inline
  def apply(): ExistingDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExistingDisk]
  }
  
  @scala.inline
  implicit class ExistingDiskOps[Self <: ExistingDisk] (val x: Self) extends AnyVal {
    
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
    def setDisk(value: String): Self = this.set("disk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisk: Self = this.set("disk", js.undefined)
  }
}
