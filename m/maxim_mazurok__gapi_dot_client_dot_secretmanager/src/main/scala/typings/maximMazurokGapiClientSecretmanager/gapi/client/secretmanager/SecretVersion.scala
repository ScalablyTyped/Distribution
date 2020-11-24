package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretVersion extends js.Object {
  
  /** Output only. The time at which the SecretVersion was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The time this SecretVersion was destroyed. Only present if state is DESTROYED. */
  var destroyTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The resource name of the SecretVersion in the format `projects/∗/secrets/∗/versions/ *`. SecretVersion IDs in a Secret start at 1 and are incremented for each subsequent
    * version of the secret.
    */
  var name: js.UndefOr[String] = js.native
  
  /** The replication status of the SecretVersion. */
  var replicationStatus: js.UndefOr[ReplicationStatus] = js.native
  
  /** Output only. The current state of the SecretVersion. */
  var state: js.UndefOr[String] = js.native
}
object SecretVersion {
  
  @scala.inline
  def apply(): SecretVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretVersion]
  }
  
  @scala.inline
  implicit class SecretVersionOps[Self <: SecretVersion] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDestroyTime(value: String): Self = this.set("destroyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyTime: Self = this.set("destroyTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReplicationStatus(value: ReplicationStatus): Self = this.set("replicationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationStatus: Self = this.set("replicationStatus", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
