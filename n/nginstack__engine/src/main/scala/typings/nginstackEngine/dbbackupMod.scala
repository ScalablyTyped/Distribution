package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dbbackupMod {
  
  inline def apply(backupFileName: String, dbServerHost: String, dbName: String): Unit = (^.asInstanceOf[js.Dynamic].apply(backupFileName.asInstanceOf[js.Any], dbServerHost.asInstanceOf[js.Any], dbName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(backupFileName: String, dbServerHost: String, dbName: String, userId: String): Unit = (^.asInstanceOf[js.Dynamic].apply(backupFileName.asInstanceOf[js.Any], dbServerHost.asInstanceOf[js.Any], dbName.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(backupFileName: String, dbServerHost: String, dbName: String, userId: String, password: String): Unit = (^.asInstanceOf[js.Dynamic].apply(backupFileName.asInstanceOf[js.Any], dbServerHost.asInstanceOf[js.Any], dbName.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(backupFileName: String, dbServerHost: String, dbName: String, userId: Unit, password: String): Unit = (^.asInstanceOf[js.Dynamic].apply(backupFileName.asInstanceOf[js.Any], dbServerHost.asInstanceOf[js.Any], dbName.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/database/DBBackup", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DBBackup {
    def this(backupFileName: String, dbServerHost: String, dbName: String) = this()
    def this(backupFileName: String, dbServerHost: String, dbName: String, userId: String) = this()
    def this(backupFileName: String, dbServerHost: String, dbName: String, userId: String, password: String) = this()
    def this(backupFileName: String, dbServerHost: String, dbName: String, userId: Unit, password: String) = this()
    
    /* CompleteClass */
    override def backup(ignoredTables: String): Unit = js.native
    
    /* CompleteClass */
    override def partialBackup(initialLogDate: js.Date, ignoredTables: String): Unit = js.native
    
    /* CompleteClass */
    override def restore(options: Double): RestoreResult = js.native
  }
  @JSImport("@nginstack/engine/lib/database/DBBackup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/database/DBBackup", "DRY_RUN")
  @js.native
  def DRY_RUN: Double = js.native
  inline def DRY_RUN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRY_RUN")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/database/DBBackup", "IGNORE_DUPLICATED_KEYS")
  @js.native
  def IGNORE_DUPLICATED_KEYS: Double = js.native
  inline def IGNORE_DUPLICATED_KEYS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IGNORE_DUPLICATED_KEYS")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/database/DBBackup", "IGNORE_EXISTING_TABLES")
  @js.native
  def IGNORE_EXISTING_TABLES: Double = js.native
  inline def IGNORE_EXISTING_TABLES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IGNORE_EXISTING_TABLES")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/database/DBBackup", "MERGE_ILOG_TABLE")
  @js.native
  def MERGE_ILOG_TABLE: Double = js.native
  inline def MERGE_ILOG_TABLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MERGE_ILOG_TABLE")(x.asInstanceOf[js.Any])
  
  trait DBBackup extends StObject {
    
    def backup(ignoredTables: String): Unit
    
    def partialBackup(initialLogDate: js.Date, ignoredTables: String): Unit
    
    def restore(options: Double): RestoreResult
  }
  object DBBackup {
    
    inline def apply(backup: String => Unit, partialBackup: (js.Date, String) => Unit, restore: Double => RestoreResult): DBBackup = {
      val __obj = js.Dynamic.literal(backup = js.Any.fromFunction1(backup), partialBackup = js.Any.fromFunction2(partialBackup), restore = js.Any.fromFunction1(restore))
      __obj.asInstanceOf[DBBackup]
    }
    
    extension [Self <: DBBackup](x: Self) {
      
      inline def setBackup(value: String => Unit): Self = StObject.set(x, "backup", js.Any.fromFunction1(value))
      
      inline def setPartialBackup(value: (js.Date, String) => Unit): Self = StObject.set(x, "partialBackup", js.Any.fromFunction2(value))
      
      inline def setRestore(value: Double => RestoreResult): Self = StObject.set(x, "restore", js.Any.fromFunction1(value))
    }
  }
  
  trait RestoreResult extends StObject {
    
    var error: String
    
    var success: Boolean
    
    var tables: js.Array[RestoredTable]
  }
  object RestoreResult {
    
    inline def apply(error: String, success: Boolean, tables: js.Array[RestoredTable]): RestoreResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreResult]
    }
    
    extension [Self <: RestoreResult](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setTables(value: js.Array[RestoredTable]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
      
      inline def setTablesVarargs(value: RestoredTable*): Self = StObject.set(x, "tables", js.Array(value*))
    }
  }
  
  trait RestoredTable extends StObject {
    
    var ignored: Boolean
    
    var ignoredKeys: js.Array[Double]
    
    var merged: Boolean
    
    var name: String
    
    var recordCount: Double
  }
  object RestoredTable {
    
    inline def apply(
      ignored: Boolean,
      ignoredKeys: js.Array[Double],
      merged: Boolean,
      name: String,
      recordCount: Double
    ): RestoredTable = {
      val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any], ignoredKeys = ignoredKeys.asInstanceOf[js.Any], merged = merged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recordCount = recordCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoredTable]
    }
    
    extension [Self <: RestoredTable](x: Self) {
      
      inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      inline def setIgnoredKeys(value: js.Array[Double]): Self = StObject.set(x, "ignoredKeys", value.asInstanceOf[js.Any])
      
      inline def setIgnoredKeysVarargs(value: Double*): Self = StObject.set(x, "ignoredKeys", js.Array(value*))
      
      inline def setMerged(value: Boolean): Self = StObject.set(x, "merged", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRecordCount(value: Double): Self = StObject.set(x, "recordCount", value.asInstanceOf[js.Any])
    }
  }
}
