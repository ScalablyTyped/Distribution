package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeMount extends js.Object {
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported Path within the container at which the volume should be mounted. Must not contain ':'. */
  var mountPath: js.UndefOr[String] = js.native
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported This must match the Name of a Volume. */
  var name: js.UndefOr[String] = js.native
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Only true is accepted. Defaults to true. */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Path within the volume from which the container's volume should be mounted. Defaults to ""
    * (volume's root).
    */
  var subPath: js.UndefOr[String] = js.native
}
object VolumeMount {
  
  @scala.inline
  def apply(): VolumeMount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeMount]
  }
  
  @scala.inline
  implicit class VolumeMountOps[Self <: VolumeMount] (val x: Self) extends AnyVal {
    
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
    def setMountPath(value: String): Self = this.set("mountPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountPath: Self = this.set("mountPath", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSubPath(value: String): Self = this.set("subPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubPath: Self = this.set("subPath", js.undefined)
  }
}
