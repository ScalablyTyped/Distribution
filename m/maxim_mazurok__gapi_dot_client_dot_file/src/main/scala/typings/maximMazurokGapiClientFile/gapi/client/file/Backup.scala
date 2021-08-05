package typings.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backup extends StObject {
  
  /** Output only. Capacity of the source file share when the backup was created. */
  var capacityGb: js.UndefOr[String] = js.undefined
  
  /** Output only. The time when the backup was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Amount of bytes that will be downloaded if the backup is restored. This may be different than storage bytes, since sequential backups of the same disk will share
    * storage.
    */
  var downloadBytes: js.UndefOr[String] = js.undefined
  
  /** Resource labels to represent user provided metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.Backup & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The resource name of the backup, in the format projects/{project_number}/locations/{location_id}/backups/{backup_id}. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Name of the file share in the source Cloud Filestore instance that the backup is created from. */
  var sourceFileShare: js.UndefOr[String] = js.undefined
  
  /** The resource name of the source Cloud Filestore instance, in the format projects/{project_number}/locations/{location_id}/instances/{instance_id}, used to create this backup. */
  var sourceInstance: js.UndefOr[String] = js.undefined
  
  /** Output only. The service tier of the source Cloud Filestore instance that this backup is created from. */
  var sourceInstanceTier: js.UndefOr[String] = js.undefined
  
  /** Output only. The backup state. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion. */
  var storageBytes: js.UndefOr[String] = js.undefined
}
object Backup {
  
  inline def apply(): Backup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backup]
  }
  
  extension [Self <: Backup](x: Self) {
    
    inline def setCapacityGb(value: String): Self = StObject.set(x, "capacityGb", value.asInstanceOf[js.Any])
    
    inline def setCapacityGbUndefined: Self = StObject.set(x, "capacityGb", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDownloadBytes(value: String): Self = StObject.set(x, "downloadBytes", value.asInstanceOf[js.Any])
    
    inline def setDownloadBytesUndefined: Self = StObject.set(x, "downloadBytes", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFile.maximMazurokGapiClientFileStrings.Backup & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSourceFileShare(value: String): Self = StObject.set(x, "sourceFileShare", value.asInstanceOf[js.Any])
    
    inline def setSourceFileShareUndefined: Self = StObject.set(x, "sourceFileShare", js.undefined)
    
    inline def setSourceInstance(value: String): Self = StObject.set(x, "sourceInstance", value.asInstanceOf[js.Any])
    
    inline def setSourceInstanceTier(value: String): Self = StObject.set(x, "sourceInstanceTier", value.asInstanceOf[js.Any])
    
    inline def setSourceInstanceTierUndefined: Self = StObject.set(x, "sourceInstanceTier", js.undefined)
    
    inline def setSourceInstanceUndefined: Self = StObject.set(x, "sourceInstance", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStorageBytes(value: String): Self = StObject.set(x, "storageBytes", value.asInstanceOf[js.Any])
    
    inline def setStorageBytesUndefined: Self = StObject.set(x, "storageBytes", js.undefined)
  }
}
