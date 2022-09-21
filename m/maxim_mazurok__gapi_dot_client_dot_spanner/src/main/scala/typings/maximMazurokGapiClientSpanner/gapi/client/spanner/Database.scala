package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Database extends StObject {
  
  /** Output only. If exists, the time at which the database creation started. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The dialect of the Cloud Spanner Database. */
  var databaseDialect: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The read-write region which contains the database's leader replicas. This is the same as the value of default_leader database option set using
    * DatabaseAdmin.CreateDatabase or DatabaseAdmin.UpdateDatabaseDdl. If not explicitly set, this is empty.
    */
  var defaultLeader: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Earliest timestamp at which older versions of the data can be read. This value is continuously updated by Cloud Spanner and becomes stale the moment it is queried. If
    * you are using this value to recover data, make sure to account for the time from the moment when the value is queried to the moment when you initiate the recovery.
    */
  var earliestVersionTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. For databases that are using customer managed encryption, this field contains the encryption configuration for the database. For databases that are using Google default
    * or other types of encryption, this field is empty.
    */
  var encryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
  
  /**
    * Output only. For databases that are using customer managed encryption, this field contains the encryption information for the database, such as encryption state and the Cloud KMS
    * key versions that are in use. For databases that are using Google default or other types of encryption, this field is empty. This field is propagated lazily from the backend. There
    * might be a delay from when a key version is being used and when it appears in this field.
    */
  var encryptionInfo: js.UndefOr[js.Array[EncryptionInfo]] = js.undefined
  
  /**
    * Required. The name of the database. Values are of the form `projects//instances//databases/`, where `` is as specified in the `CREATE DATABASE` statement. This name can be passed to
    * other API methods to identify the database.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Applicable only for restored databases. Contains information about the restore source. */
  var restoreInfo: js.UndefOr[RestoreInfo] = js.undefined
  
  /** Output only. The current database state. */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The period in which Cloud Spanner retains all versions of data for the database. This is the same as the value of version_retention_period database option set using
    * UpdateDatabaseDdl. Defaults to 1 hour, if not set.
    */
  var versionRetentionPeriod: js.UndefOr[String] = js.undefined
}
object Database {
  
  inline def apply(): Database = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Database]
  }
  
  extension [Self <: Database](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDatabaseDialect(value: String): Self = StObject.set(x, "databaseDialect", value.asInstanceOf[js.Any])
    
    inline def setDatabaseDialectUndefined: Self = StObject.set(x, "databaseDialect", js.undefined)
    
    inline def setDefaultLeader(value: String): Self = StObject.set(x, "defaultLeader", value.asInstanceOf[js.Any])
    
    inline def setDefaultLeaderUndefined: Self = StObject.set(x, "defaultLeader", js.undefined)
    
    inline def setEarliestVersionTime(value: String): Self = StObject.set(x, "earliestVersionTime", value.asInstanceOf[js.Any])
    
    inline def setEarliestVersionTimeUndefined: Self = StObject.set(x, "earliestVersionTime", js.undefined)
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setEncryptionInfo(value: js.Array[EncryptionInfo]): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
    
    inline def setEncryptionInfoVarargs(value: EncryptionInfo*): Self = StObject.set(x, "encryptionInfo", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRestoreInfo(value: RestoreInfo): Self = StObject.set(x, "restoreInfo", value.asInstanceOf[js.Any])
    
    inline def setRestoreInfoUndefined: Self = StObject.set(x, "restoreInfo", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVersionRetentionPeriod(value: String): Self = StObject.set(x, "versionRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setVersionRetentionPeriodUndefined: Self = StObject.set(x, "versionRetentionPeriod", js.undefined)
  }
}
