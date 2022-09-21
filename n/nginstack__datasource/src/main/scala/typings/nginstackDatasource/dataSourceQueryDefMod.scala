package typings.nginstackDatasource

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSourceQueryDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/datasource/lib/DataSourceQueryDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataSourceQueryDef {
    
    /* CompleteClass */
    var columns: js.Array[Any] = js.native
    
    /* CompleteClass */
    var dataSource: (Record[Any, Any]) | Double = js.native
    
    /* CompleteClass */
    var dataSourceKey: Double = js.native
    
    /* CompleteClass */
    var filters: js.Array[Any] = js.native
    
    /* CompleteClass */
    var help: String | Null = js.native
    
    /* CompleteClass */
    var includes: js.Array[Double | String] = js.native
    
    /* CompleteClass */
    var onCreate: (js.Function1[/* arg0 */ DataSourceQuery, Any]) | Null = js.native
    
    /* CompleteClass */
    var orderBy: String | Null = js.native
  }
  @JSImport("@nginstack/datasource/lib/DataSourceQueryDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSourceQuery = typings.nginstackDatasource.dataSourceQueryMod.^
  
  trait DataSourceQueryDef extends StObject {
    
    var columns: js.Array[Any]
    
    var dataSource: (Record[Any, Any]) | Double
    
    var dataSourceKey: Double
    
    var filters: js.Array[Any]
    
    var help: String | Null
    
    var includes: js.Array[Double | String]
    
    var onCreate: (js.Function1[/* arg0 */ DataSourceQuery, Any]) | Null
    
    var orderBy: String | Null
  }
  object DataSourceQueryDef {
    
    inline def apply(
      columns: js.Array[Any],
      dataSource: (Record[Any, Any]) | Double,
      dataSourceKey: Double,
      filters: js.Array[Any],
      includes: js.Array[Double | String]
    ): DataSourceQueryDef = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], dataSourceKey = dataSourceKey.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], help = null, onCreate = null, orderBy = null)
      __obj.asInstanceOf[DataSourceQueryDef]
    }
    
    extension [Self <: DataSourceQueryDef](x: Self) {
      
      inline def setColumns(value: js.Array[Any]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: Any*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDataSource(value: (Record[Any, Any]) | Double): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceKey(value: Double): Self = StObject.set(x, "dataSourceKey", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: js.Array[Any]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersVarargs(value: Any*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpNull: Self = StObject.set(x, "help", null)
      
      inline def setIncludes(value: js.Array[Double | String]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesVarargs(value: (Double | String)*): Self = StObject.set(x, "includes", js.Array(value*))
      
      inline def setOnCreate(value: /* arg0 */ DataSourceQuery => Any): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
      
      inline def setOnCreateNull: Self = StObject.set(x, "onCreate", null)
      
      inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderByNull: Self = StObject.set(x, "orderBy", null)
    }
  }
}
