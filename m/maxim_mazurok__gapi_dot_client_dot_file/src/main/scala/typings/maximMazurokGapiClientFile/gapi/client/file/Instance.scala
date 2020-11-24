package typings.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends js.Object {
  
  /** Output only. The time when the instance was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The description of the instance (2048 characters or less). */
  var description: js.UndefOr[String] = js.native
  
  /** Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other. */
  var etag: js.UndefOr[String] = js.native
  
  /** File system shares on the instance. For this version, only a single file share is supported. */
  var fileShares: js.UndefOr[js.Array[FileShareConfig]] = js.native
  
  /** Resource labels to represent user provided metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.Instance with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The resource name of the instance, in the format projects/{project}/locations/{location}/instances/{instance}. */
  var name: js.UndefOr[String] = js.native
  
  /** VPC networks to which the instance is connected. For this version, only a single network is supported. */
  var networks: js.UndefOr[js.Array[NetworkConfig]] = js.native
  
  /** Output only. The instance state. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. Additional information about the instance state, if available. */
  var statusMessage: js.UndefOr[String] = js.native
  
  /** The service tier of the instance. */
  var tier: js.UndefOr[String] = js.native
}
object Instance {
  
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setFileSharesVarargs(value: FileShareConfig*): Self = this.set("fileShares", js.Array(value :_*))
    
    @scala.inline
    def setFileShares(value: js.Array[FileShareConfig]): Self = this.set("fileShares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileShares: Self = this.set("fileShares", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.Instance with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetworksVarargs(value: NetworkConfig*): Self = this.set("networks", js.Array(value :_*))
    
    @scala.inline
    def setNetworks(value: js.Array[NetworkConfig]): Self = this.set("networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworks: Self = this.set("networks", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    
    @scala.inline
    def setTier(value: String): Self = this.set("tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTier: Self = this.set("tier", js.undefined)
  }
}
