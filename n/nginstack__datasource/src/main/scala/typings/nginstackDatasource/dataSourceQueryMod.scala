package typings.nginstackDatasource

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSourceQueryMod {
  
  inline def apply(definition: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(definition: Record[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/datasource/lib/DataSourceQuery", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataSourceQuery {
    def this(definition: Double) = this()
    def this(definition: Record[Any, Any]) = this()
    
    /* CompleteClass */
    var columns: Any = js.native
    
    /* CompleteClass */
    override def createColumns(columns: js.Array[Any]): Any = js.native
    
    /* CompleteClass */
    override def createFilters(filters: js.Array[Any]): Any = js.native
    
    /* CompleteClass */
    var dataSource: (Record[Any, Any]) | Double = js.native
    
    /* CompleteClass */
    var dataSourceInstance: Any = js.native
    
    /* private */ /* CompleteClass */
    var dataSourceInstance_ : Any = js.native
    
    /* CompleteClass */
    var dataSourceKey: Double = js.native
    
    /* CompleteClass */
    var definition: Any = js.native
    
    /* CompleteClass */
    override def execute(filters: js.Array[Any], columns: js.Array[Any]): DataSet = js.native
    
    /* CompleteClass */
    var filters: Any = js.native
    
    /* CompleteClass */
    var help: String | Null = js.native
    
    /* CompleteClass */
    var includes: Any = js.native
    
    /* CompleteClass */
    var orderBy: String | Null = js.native
  }
  @JSImport("@nginstack/datasource/lib/DataSourceQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.dataSetMod.^
  
  trait DataSourceQuery extends StObject {
    
    var columns: Any
    
    def createColumns(columns: js.Array[Any]): Any
    
    def createFilters(filters: js.Array[Any]): Any
    
    var dataSource: (Record[Any, Any]) | Double
    
    var dataSourceInstance: Any
    
    /* private */ var dataSourceInstance_ : Any
    
    var dataSourceKey: Double
    
    var definition: Any
    
    def execute(filters: js.Array[Any], columns: js.Array[Any]): DataSet
    
    var filters: Any
    
    var help: String | Null
    
    var includes: Any
    
    var orderBy: String | Null
  }
  object DataSourceQuery {
    
    inline def apply(
      columns: Any,
      createColumns: js.Array[Any] => Any,
      createFilters: js.Array[Any] => Any,
      dataSource: (Record[Any, Any]) | Double,
      dataSourceInstance: Any,
      dataSourceInstance_ : Any,
      dataSourceKey: Double,
      definition: Any,
      execute: (js.Array[Any], js.Array[Any]) => DataSet,
      filters: Any,
      includes: Any
    ): DataSourceQuery = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], createColumns = js.Any.fromFunction1(createColumns), createFilters = js.Any.fromFunction1(createFilters), dataSource = dataSource.asInstanceOf[js.Any], dataSourceInstance = dataSourceInstance.asInstanceOf[js.Any], dataSourceInstance_ = dataSourceInstance_.asInstanceOf[js.Any], dataSourceKey = dataSourceKey.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], execute = js.Any.fromFunction2(execute), filters = filters.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], help = null, orderBy = null)
      __obj.asInstanceOf[DataSourceQuery]
    }
    
    extension [Self <: DataSourceQuery](x: Self) {
      
      inline def setColumns(value: Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setCreateColumns(value: js.Array[Any] => Any): Self = StObject.set(x, "createColumns", js.Any.fromFunction1(value))
      
      inline def setCreateFilters(value: js.Array[Any] => Any): Self = StObject.set(x, "createFilters", js.Any.fromFunction1(value))
      
      inline def setDataSource(value: (Record[Any, Any]) | Double): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceInstance(value: Any): Self = StObject.set(x, "dataSourceInstance", value.asInstanceOf[js.Any])
      
      inline def setDataSourceInstance_(value: Any): Self = StObject.set(x, "dataSourceInstance_", value.asInstanceOf[js.Any])
      
      inline def setDataSourceKey(value: Double): Self = StObject.set(x, "dataSourceKey", value.asInstanceOf[js.Any])
      
      inline def setDefinition(value: Any): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setExecute(value: (js.Array[Any], js.Array[Any]) => DataSet): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
      
      inline def setFilters(value: Any): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpNull: Self = StObject.set(x, "help", null)
      
      inline def setIncludes(value: Any): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderByNull: Self = StObject.set(x, "orderBy", null)
    }
  }
}
