package typings.nginstackEngine

import typings.nginstackEngine.anon.RowId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseDbcacheMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/database/DBCache", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DBCache
  @JSImport("@nginstack/engine/lib/database/DBCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait DBCache extends StObject {
    
    def copyTableStructure(tableName: String, ds: typings.nginstackEngine.dataSetMod.^): Unit = js.native
    
    var dbDate: js.Date = js.native
    
    var dbName: String = js.native
    
    var dbType: String = js.native
    
    var dbUTCDate: js.Date = js.native
    
    def fieldExists(tableName: String, fieldName: String): Boolean = js.native
    
    /* private */ var fieldExistsCache_ : Any = js.native
    
    def findKey(key: Double): RowId = js.native
    
    def getClass(key: Double): Double = js.native
    
    def getClassFieldName(tableName: String): String = js.native
    
    def getFieldValue(key: Double, fieldName: String, refreshIfNotFound: Boolean): Double | Boolean | String | Null = js.native
    
    def getKeyFieldName(tableName: String): String = js.native
    
    def getTable(tableName: String): typings.nginstackEngine.dataSetMod.^ = js.native
    
    def getTableClass(tableName: String): Double = js.native
    
    def getTableNameDefinedByClass(classKey: Double): Boolean = js.native
    
    def getTableNames(): js.Array[Any] = js.native
    
    def getVersionFieldName(tableName: String): String = js.native
    
    def hasTable(tableName: String): Boolean = js.native
    
    var host: String = js.native
    
    var initializedSuccessfully: Boolean = js.native
    
    def isCachedTable(tableName: String): Boolean = js.native
    
    def isFromCache(ds: typings.nginstackEngine.dataSetMod.^): Boolean = js.native
    
    def newTableStructure(tableName: String): typings.nginstackEngine.dataSetMod.^ = js.native
    
    /* private */ var readTableSchemaField_ : Any = js.native
    
    def recordFieldExists(key: Double, fieldName: String): Boolean = js.native
    
    def refresh(): Boolean = js.native
    def refresh(wait: Boolean): Boolean = js.native
    def refresh(wait: Boolean, timeout: Double): Boolean = js.native
    def refresh(wait: Unit, timeout: Double): Boolean = js.native
    
    /* private */ var systemTables_ : Any = js.native
    
    def tableContainsKey(tableName: String, key: Double): Boolean = js.native
    
    def tryGetClass(key: Double): Double | Null = js.native
  }
}
