package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIdoIdoDBMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/ido/IdoDB", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with IdoDB {
    
    /* CompleteClass */
    override def dropTable(tableName: String): Unit = js.native
    
    /* CompleteClass */
    override def getDBStatistics(): String = js.native
    
    /* CompleteClass */
    override def getTable(tableName: String): DataSet = js.native
    
    /* CompleteClass */
    override def getTablesNames(): js.Array[Any] = js.native
    
    /* CompleteClass */
    var name: Any = js.native
    
    /* CompleteClass */
    override def tableExists(tableName: String): Unit = js.native
    
    /* CompleteClass */
    var uniqueId: Any = js.native
  }
  @JSImport("@nginstack/engine/lib/ido/IdoDB", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  trait IdoDB extends StObject {
    
    def dropTable(tableName: String): Unit
    
    def getDBStatistics(): String
    
    def getTable(tableName: String): DataSet
    
    def getTablesNames(): js.Array[Any]
    
    var name: Any
    
    def tableExists(tableName: String): Unit
    
    var uniqueId: Any
  }
  object IdoDB {
    
    inline def apply(
      dropTable: String => Unit,
      getDBStatistics: () => String,
      getTable: String => DataSet,
      getTablesNames: () => js.Array[Any],
      name: Any,
      tableExists: String => Unit,
      uniqueId: Any
    ): IdoDB = {
      val __obj = js.Dynamic.literal(dropTable = js.Any.fromFunction1(dropTable), getDBStatistics = js.Any.fromFunction0(getDBStatistics), getTable = js.Any.fromFunction1(getTable), getTablesNames = js.Any.fromFunction0(getTablesNames), name = name.asInstanceOf[js.Any], tableExists = js.Any.fromFunction1(tableExists), uniqueId = uniqueId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdoDB]
    }
    
    extension [Self <: IdoDB](x: Self) {
      
      inline def setDropTable(value: String => Unit): Self = StObject.set(x, "dropTable", js.Any.fromFunction1(value))
      
      inline def setGetDBStatistics(value: () => String): Self = StObject.set(x, "getDBStatistics", js.Any.fromFunction0(value))
      
      inline def setGetTable(value: String => DataSet): Self = StObject.set(x, "getTable", js.Any.fromFunction1(value))
      
      inline def setGetTablesNames(value: () => js.Array[Any]): Self = StObject.set(x, "getTablesNames", js.Any.fromFunction0(value))
      
      inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTableExists(value: String => Unit): Self = StObject.set(x, "tableExists", js.Any.fromFunction1(value))
      
      inline def setUniqueId(value: Any): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    }
  }
}
