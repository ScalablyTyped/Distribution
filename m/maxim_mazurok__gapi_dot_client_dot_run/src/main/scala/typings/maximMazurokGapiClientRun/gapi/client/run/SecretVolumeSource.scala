package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretVolumeSource extends js.Object {
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Mode bits to use on created files by default. Must be a value between 0000 and 0777. Defaults to
    * 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other
    * mode bits set. NOTE: This is an integer representation of the mode bits. So, the integer value should look exactly as the chmod numeric notation, i.e. Unix chmod "777" (a=rwx)
    * should have the integer value 777.
    */
  var defaultMode: js.UndefOr[Double] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported If unspecified, each key-value pair in the Data field of the referenced Secret will be projected
    * into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be
    * present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional.
    */
  var items: js.UndefOr[js.Array[KeyToPath]] = js.native
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Specify whether the Secret or its keys must be defined. */
  var optional: js.UndefOr[Boolean] = js.native
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported Name of the secret in the container's namespace to use. */
  var secretName: js.UndefOr[String] = js.native
}
object SecretVolumeSource {
  
  @scala.inline
  def apply(): SecretVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretVolumeSource]
  }
  
  @scala.inline
  implicit class SecretVolumeSourceOps[Self <: SecretVolumeSource] (val x: Self) extends AnyVal {
    
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
    def setDefaultMode(value: Double): Self = this.set("defaultMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMode: Self = this.set("defaultMode", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: KeyToPath*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[KeyToPath]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    
    @scala.inline
    def setSecretName(value: String): Self = this.set("secretName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretName: Self = this.set("secretName", js.undefined)
  }
}
