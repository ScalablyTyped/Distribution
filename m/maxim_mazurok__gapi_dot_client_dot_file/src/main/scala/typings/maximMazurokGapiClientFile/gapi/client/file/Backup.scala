package typings.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backup extends js.Object {
  
  /** Output only. Capacity of the source file share when the backup was created. */
  var capacityGb: js.UndefOr[String] = js.native
  
  /** Output only. The time when the backup was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Output only. Amount of bytes that will be downloaded if the backup is restored. This may be different than storage bytes, since sequential backups of the same disk will share
    * storage.
    */
  var downloadBytes: js.UndefOr[String] = js.native
  
  /** Resource labels to represent user provided metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.Backup with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The resource name of the backup, in the format projects/{project_number}/locations/{location_id}/backups/{backup_id}. */
  var name: js.UndefOr[String] = js.native
  
  /** Name of the file share in the source Cloud Filestore instance that the backup is created from. */
  var sourceFileShare: js.UndefOr[String] = js.native
  
  /** The resource name of the source Cloud Filestore instance, in the format projects/{project_number}/locations/{location_id}/instances/{instance_id}, used to create this backup. */
  var sourceInstance: js.UndefOr[String] = js.native
  
  /** Output only. The service tier of the source Cloud Filestore instance that this backup is created from. */
  var sourceInstanceTier: js.UndefOr[String] = js.native
  
  /** Output only. The backup state. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion. */
  var storageBytes: js.UndefOr[String] = js.native
}
object Backup {
  
  @scala.inline
  def apply(): Backup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backup]
  }
  
  @scala.inline
  implicit class BackupOps[Self <: Backup] (val x: Self) extends AnyVal {
    
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
    def setCapacityGb(value: String): Self = this.set("capacityGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityGb: Self = this.set("capacityGb", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDownloadBytes(value: String): Self = this.set("downloadBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadBytes: Self = this.set("downloadBytes", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.Backup with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSourceFileShare(value: String): Self = this.set("sourceFileShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceFileShare: Self = this.set("sourceFileShare", js.undefined)
    
    @scala.inline
    def setSourceInstance(value: String): Self = this.set("sourceInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceInstance: Self = this.set("sourceInstance", js.undefined)
    
    @scala.inline
    def setSourceInstanceTier(value: String): Self = this.set("sourceInstanceTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceInstanceTier: Self = this.set("sourceInstanceTier", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStorageBytes(value: String): Self = this.set("storageBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageBytes: Self = this.set("storageBytes", js.undefined)
  }
}
