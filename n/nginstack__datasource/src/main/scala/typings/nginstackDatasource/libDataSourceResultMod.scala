package typings.nginstackDatasource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataSourceResultMod {
  
  inline def apply(
    dataSource: DataSource,
    filters: js.Array[Any | DataSourceFilterDef],
    columns: js.Array[Any | DataSourceColumnDef]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(dataSource.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    dataSource: DataSource,
    filters: js.Array[Any | DataSourceFilterDef],
    columns: typings.nginstackDatasource.libDataSourceColumnsMod.^
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(dataSource.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    dataSource: DataSource,
    filters: typings.nginstackDatasource.libDataSourceFiltersMod.^,
    columns: js.Array[Any | DataSourceColumnDef]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(dataSource.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    dataSource: DataSource,
    filters: typings.nginstackDatasource.libDataSourceFiltersMod.^,
    columns: typings.nginstackDatasource.libDataSourceColumnsMod.^
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(dataSource.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/datasource/lib/DataSourceResult", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataSourceResult {
    def this(
      dataSource: DataSource,
      filters: js.Array[Any | DataSourceFilterDef],
      columns: js.Array[Any | DataSourceColumnDef]
    ) = this()
    def this(
      dataSource: DataSource,
      filters: js.Array[Any | DataSourceFilterDef],
      columns: typings.nginstackDatasource.libDataSourceColumnsMod.^
    ) = this()
    def this(
      dataSource: DataSource,
      filters: typings.nginstackDatasource.libDataSourceFiltersMod.^,
      columns: js.Array[Any | DataSourceColumnDef]
    ) = this()
    def this(
      dataSource: DataSource,
      filters: typings.nginstackDatasource.libDataSourceFiltersMod.^,
      columns: typings.nginstackDatasource.libDataSourceColumnsMod.^
    ) = this()
    
    /* CompleteClass */
    var columns: typings.nginstackDatasource.libDataSourceColumnsMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var columns_ : Any = js.native
    
    /* CompleteClass */
    var dataSource: DataSource = js.native
    
    /* private */ /* CompleteClass */
    var dataSource_ : Any = js.native
    
    /* CompleteClass */
    var filters: typings.nginstackDatasource.libDataSourceFiltersMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var filters_ : Any = js.native
    
    /* CompleteClass */
    override def getDataSet(): DataSet = js.native
  }
  @JSImport("@nginstack/datasource/lib/DataSourceResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  type DataSource = typings.nginstackDatasource.libDataSourceMod.^
  
  type DataSourceColumnDef = typings.nginstackDatasource.libDataSourceColumnDefMod.^
  
  type DataSourceFilterDef = typings.nginstackDatasource.libDataSourceFilterDefMod.^
  
  trait DataSourceResult extends StObject {
    
    var columns: typings.nginstackDatasource.libDataSourceColumnsMod.^
    
    /* private */ var columns_ : Any
    
    var dataSource: DataSource
    
    /* private */ var dataSource_ : Any
    
    var filters: typings.nginstackDatasource.libDataSourceFiltersMod.^
    
    /* private */ var filters_ : Any
    
    def getDataSet(): DataSet
  }
  object DataSourceResult {
    
    inline def apply(
      columns: typings.nginstackDatasource.libDataSourceColumnsMod.^,
      columns_ : Any,
      dataSource: DataSource,
      dataSource_ : Any,
      filters: typings.nginstackDatasource.libDataSourceFiltersMod.^,
      filters_ : Any,
      getDataSet: () => DataSet
    ): DataSourceResult = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], columns_ = columns_.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], dataSource_ = dataSource_.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], filters_ = filters_.asInstanceOf[js.Any], getDataSet = js.Any.fromFunction0(getDataSet))
      __obj.asInstanceOf[DataSourceResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataSourceResult] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: typings.nginstackDatasource.libDataSourceColumnsMod.^): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumns_(value: Any): Self = StObject.set(x, "columns_", value.asInstanceOf[js.Any])
      
      inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSource_(value: Any): Self = StObject.set(x, "dataSource_", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: typings.nginstackDatasource.libDataSourceFiltersMod.^): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFilters_(value: Any): Self = StObject.set(x, "filters_", value.asInstanceOf[js.Any])
      
      inline def setGetDataSet(value: () => DataSet): Self = StObject.set(x, "getDataSet", js.Any.fromFunction0(value))
    }
  }
}
