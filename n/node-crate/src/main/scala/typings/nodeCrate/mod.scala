package typings.nodeCrate

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("node-crate", JSImport.Namespace)
  @js.native
  val ^ : Crate = js.native
  
  @js.native
  trait Crate extends StObject {
    
    /**
      * Connect to a single crate instance with host and port
      */
    def connect(host: String): Unit = js.native
    def connect(host: String, port: Double): Unit = js.native
    
    /**
      * Creates a table with the given schema.
      */
    def create(schema: js.Object): js.Promise[DBResultObject] = js.native
    
    /**
      * Creates a BLOB table
      */
    def createBlobTable(tableName: String, replicas: Double, shards: Double): js.Promise[DBResultObject] = js.native
    
    /**
      * Creates a table if it doesn't already exist.
      */
    def createIfNotExists(schema: js.Object): js.Promise[DBResultObject] = js.native
    
    /**
      * Deletes one or more rows in a table.
      */
    def delete(tableName: String, where: String): js.Promise[DBResultObject] = js.native
    
    /**
      * Drops a table.
      */
    def drop(tableName: String): js.Promise[DBResultObject] = js.native
    
    /**
      * Executes a parameterized sql statement.
      */
    def execute(sql: String): js.Promise[DBResultObject] = js.native
    def execute(sql: String, args: js.Array[String | Double | js.Date]): js.Promise[DBResultObject] = js.native
    
    /**
      * Retrieves a BLOB with the given hash key
      */
    def getBlob(tableName: String, hashKey: String): js.Promise[String] = js.native
    
    /**
      * Inserts a row in table.
      */
    def insert(tableName: String, data: js.Object): js.Promise[DBResultObject] = js.native
    
    /**
      * Inserts a BLOB
      */
    def insertBlob(tableName: String, buffer: String): js.Promise[String] = js.native
    
    /**
      * Inserts a BLOB from the filesystem
      */
    def insertBlobFile(tableName: String, filename: String): js.Promise[String] = js.native
    
    /**
      * Updates one or more rows in table.
      */
    def update(tableName: String, data: js.Object, where: String): js.Promise[DBResultObject] = js.native
  }
  
  trait DBResultObject extends StObject {
    
    var cols: js.Array[String]
    
    var duration: Double
    
    var json: js.Array[js.Object]
    
    var rowcount: Double
    
    var rows: js.Array[js.Array[js.Object]]
  }
  object DBResultObject {
    
    inline def apply(
      cols: js.Array[String],
      duration: Double,
      json: js.Array[js.Object],
      rowcount: Double,
      rows: js.Array[js.Array[js.Object]]
    ): DBResultObject = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], rowcount = rowcount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[DBResultObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DBResultObject] (val x: Self) extends AnyVal {
      
      inline def setCols(value: js.Array[String]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsVarargs(value: String*): Self = StObject.set(x, "cols", js.Array(value*))
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setJson(value: js.Array[js.Object]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonVarargs(value: js.Object*): Self = StObject.set(x, "json", js.Array(value*))
      
      inline def setRowcount(value: Double): Self = StObject.set(x, "rowcount", value.asInstanceOf[js.Any])
      
      inline def setRows(value: js.Array[js.Array[js.Object]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: js.Array[js.Object]*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
  
  type _To = Crate
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Crate = ^
}
