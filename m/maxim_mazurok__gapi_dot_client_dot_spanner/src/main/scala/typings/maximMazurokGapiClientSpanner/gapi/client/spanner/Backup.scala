package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backup extends StObject {
  
  /**
    * Output only. The backup will contain an externally consistent copy of the database at the timestamp specified by `create_time`. `create_time` is approximately the time the
    * CreateBackup request is received.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required for the CreateBackup operation. Name of the database from which this backup was created. This needs to be in the same instance as the backup. Values are of the form
    * `projects//instances//databases/`.
    */
  var database: js.UndefOr[String] = js.undefined
  
  /**
    * Required for the CreateBackup operation. The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 366 days from the time the
    * CreateBackup request is processed. Once the `expire_time` has passed, the backup is eligible to be automatically deleted by Cloud Spanner to free the resources used by the backup.
    */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only for the CreateBackup operation. Required for the UpdateBackup operation. A globally unique identifier for the backup which cannot be changed. Values are of the form
    * `projects//instances//backups/a-z*[a-z0-9]` The final segment of the name must be between 2 and 60 characters in length. The backup is stored in the location(s) specified in the
    * instance configuration of the instance containing the backup, identified by the prefix of the backup name of the form `projects//instances/`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The names of the restored databases that reference the backup. The database names are of the form `projects//instances//databases/`. Referencing databases may exist in
    * different instances. The existence of any referencing database prevents the backup from being deleted. When a restored database from the backup enters the `READY` state, the
    * reference to the backup is removed.
    */
  var referencingDatabases: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Size of the backup in bytes. */
  var sizeBytes: js.UndefOr[String] = js.undefined
  
  /** Output only. The current state of the backup. */
  var state: js.UndefOr[String] = js.undefined
}
object Backup {
  
  @scala.inline
  def apply(): Backup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backup]
  }
  
  @scala.inline
  implicit class BackupMutableBuilder[Self <: Backup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReferencingDatabases(value: js.Array[String]): Self = StObject.set(x, "referencingDatabases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencingDatabasesUndefined: Self = StObject.set(x, "referencingDatabases", js.undefined)
    
    @scala.inline
    def setReferencingDatabasesVarargs(value: String*): Self = StObject.set(x, "referencingDatabases", js.Array(value :_*))
    
    @scala.inline
    def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
