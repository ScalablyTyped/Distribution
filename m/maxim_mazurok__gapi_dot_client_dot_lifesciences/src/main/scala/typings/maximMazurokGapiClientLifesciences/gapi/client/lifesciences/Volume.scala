package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Volume extends js.Object {
  
  /** Configuration for a existing disk. */
  var existingDisk: js.UndefOr[ExistingDisk] = js.native
  
  /** Configuration for an NFS mount. */
  var nfsMount: js.UndefOr[NFSMount] = js.native
  
  /** Configuration for a persistent disk. */
  var persistentDisk: js.UndefOr[PersistentDisk] = js.native
  
  /**
    * A user-supplied name for the volume. Used when mounting the volume into `Actions`. The name must contain only upper and lowercase alphanumeric characters and hyphens and cannot
    * start with a hyphen.
    */
  var volume: js.UndefOr[String] = js.native
}
object Volume {
  
  @scala.inline
  def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  
  @scala.inline
  implicit class VolumeOps[Self <: Volume] (val x: Self) extends AnyVal {
    
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
    def setExistingDisk(value: ExistingDisk): Self = this.set("existingDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExistingDisk: Self = this.set("existingDisk", js.undefined)
    
    @scala.inline
    def setNfsMount(value: NFSMount): Self = this.set("nfsMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNfsMount: Self = this.set("nfsMount", js.undefined)
    
    @scala.inline
    def setPersistentDisk(value: PersistentDisk): Self = this.set("persistentDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistentDisk: Self = this.set("persistentDisk", js.undefined)
    
    @scala.inline
    def setVolume(value: String): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
}
