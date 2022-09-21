package typings.nginstackDatasource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSourceResultMod {
  
  inline def apply(dataSource: Any, filters: js.Array[Any], columns: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(dataSource.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    dataSource: Any,
    filters: js.Array[Any],
    columns: typings.nginstackDatasource.dataSourceColumnsMod.^
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(dataSource.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    dataSource: Any,
    filters: typings.nginstackDatasource.dataSourceFiltersMod.^,
    columns: js.Array[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(dataSource.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    dataSource: Any,
    filters: typings.nginstackDatasource.dataSourceFiltersMod.^,
    columns: typings.nginstackDatasource.dataSourceColumnsMod.^
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(dataSource.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/datasource/lib/DataSourceResult", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataSourceResult {
    def this(dataSource: Any, filters: js.Array[Any], columns: js.Array[Any]) = this()
    def this(
      dataSource: Any,
      filters: js.Array[Any],
      columns: typings.nginstackDatasource.dataSourceColumnsMod.^
    ) = this()
    def this(
      dataSource: Any,
      filters: typings.nginstackDatasource.dataSourceFiltersMod.^,
      columns: js.Array[Any]
    ) = this()
    def this(
      dataSource: Any,
      filters: typings.nginstackDatasource.dataSourceFiltersMod.^,
      columns: typings.nginstackDatasource.dataSourceColumnsMod.^
    ) = this()
    
    /* CompleteClass */
    var columns: typings.nginstackDatasource.dataSourceColumnsMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var columns_ : Any = js.native
    
    /* CompleteClass */
    var dataSource: Any = js.native
    
    /* private */ /* CompleteClass */
    var dataSource_ : Any = js.native
    
    /* CompleteClass */
    var filters: typings.nginstackDatasource.dataSourceFiltersMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var filters_ : Any = js.native
    
    /* CompleteClass */
    override def getDataSet(): Any = js.native
  }
  @JSImport("@nginstack/datasource/lib/DataSourceResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DataSourceResult extends StObject {
    
    var columns: typings.nginstackDatasource.dataSourceColumnsMod.^
    
    /* private */ var columns_ : Any
    
    var dataSource: Any
    
    /* private */ var dataSource_ : Any
    
    var filters: typings.nginstackDatasource.dataSourceFiltersMod.^
    
    /* private */ var filters_ : Any
    
    def getDataSet(): Any
  }
  object DataSourceResult {
    
    inline def apply(
      columns: typings.nginstackDatasource.dataSourceColumnsMod.^,
      columns_ : Any,
      dataSource: Any,
      dataSource_ : Any,
      filters: typings.nginstackDatasource.dataSourceFiltersMod.^,
      filters_ : Any,
      getDataSet: () => Any
    ): DataSourceResult = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], columns_ = columns_.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], dataSource_ = dataSource_.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], filters_ = filters_.asInstanceOf[js.Any], getDataSet = js.Any.fromFunction0(getDataSet))
      __obj.asInstanceOf[DataSourceResult]
    }
    
    extension [Self <: DataSourceResult](x: Self) {
      
      inline def setColumns(value: typings.nginstackDatasource.dataSourceColumnsMod.^): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumns_(value: Any): Self = StObject.set(x, "columns_", value.asInstanceOf[js.Any])
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSource_(value: Any): Self = StObject.set(x, "dataSource_", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: typings.nginstackDatasource.dataSourceFiltersMod.^): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFilters_(value: Any): Self = StObject.set(x, "filters_", value.asInstanceOf[js.Any])
      
      inline def setGetDataSet(value: () => Any): Self = StObject.set(x, "getDataSet", js.Any.fromFunction0(value))
    }
  }
}
