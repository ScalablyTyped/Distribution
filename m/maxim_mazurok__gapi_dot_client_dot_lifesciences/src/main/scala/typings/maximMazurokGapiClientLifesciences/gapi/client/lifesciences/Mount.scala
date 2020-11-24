package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mount extends js.Object {
  
  /** The name of the disk to mount, as specified in the resources section. */
  var disk: js.UndefOr[String] = js.native
  
  /** The path to mount the disk inside the container. */
  var path: js.UndefOr[String] = js.native
  
  /** If true, the disk is mounted read-only inside the container. */
  var readOnly: js.UndefOr[Boolean] = js.native
}
object Mount {
  
  @scala.inline
  def apply(): Mount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mount]
  }
  
  @scala.inline
  implicit class MountOps[Self <: Mount] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
  }
}
