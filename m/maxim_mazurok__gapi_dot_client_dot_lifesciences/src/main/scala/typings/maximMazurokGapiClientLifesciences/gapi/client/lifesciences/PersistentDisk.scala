package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistentDisk extends js.Object {
  
  /**
    * The size, in GB, of the disk to attach. If the size is not specified, a default is chosen to ensure reasonable I/O performance. If the disk type is specified as `local-ssd`,
    * multiple local drives are automatically combined to provide the requested size. Note, however, that each physical SSD is 375GB in size, and no more than 8 drives can be attached to
    * a single instance.
    */
  var sizeGb: js.UndefOr[Double] = js.native
  
  /** An image to put on the disk before attaching it to the VM. */
  var sourceImage: js.UndefOr[String] = js.native
  
  /** The Compute Engine disk type. If unspecified, `pd-standard` is used. */
  var `type`: js.UndefOr[String] = js.native
}
object PersistentDisk {
  
  @scala.inline
  def apply(): PersistentDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentDisk]
  }
  
  @scala.inline
  implicit class PersistentDiskOps[Self <: PersistentDisk] (val x: Self) extends AnyVal {
    
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
    def setSizeGb(value: Double): Self = this.set("sizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeGb: Self = this.set("sizeGb", js.undefined)
    
    @scala.inline
    def setSourceImage(value: String): Self = this.set("sourceImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceImage: Self = this.set("sourceImage", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
