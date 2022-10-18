package typings.nginstackDatasource

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataSourceMod {
  
  inline def apply(definition: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(definition: Double, opt_options: Record[Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(definition: DataSourceDef): Unit = ^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(definition: DataSourceDef, opt_options: Record[Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(definition: Record[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(definition: Record[Any, Any], opt_options: Record[Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/datasource/lib/DataSource", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataSource {
    def this(definition: Double) = this()
    def this(definition: DataSourceDef) = this()
    def this(definition: Record[Any, Any]) = this()
    def this(definition: Double, opt_options: Record[Any, Any]) = this()
    def this(definition: DataSourceDef, opt_options: Record[Any, Any]) = this()
    def this(definition: Record[Any, Any], opt_options: Record[Any, Any]) = this()
  }
  @JSImport("@nginstack/datasource/lib/DataSource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def list(): typings.nginstackEngine.libDatasetDataSetMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[typings.nginstackEngine.libDatasetDataSetMod.^]
  
  inline def loadDefinitionFile(fileId: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadDefinitionFile")(fileId.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def loadDefinitionFile(fileId: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadDefinitionFile")(fileId.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  type ColumnOps = String
  
  @js.native
  trait DataSource extends StObject {
    
    var autoPurgeUnsolicitedColumns: Boolean = js.native
    
    /* private */ var checkFilterClassKey_ : Any = js.native
    
    /* private */ var checkFilters_ : Any = js.native
    
    var columns: typings.nginstackDatasource.libDataSourceColumnsMod.^ = js.native
    
    /* private */ var convertColumns_ : Any = js.native
    
    /* private */ var convertFilters_ : Any = js.native
    
    def createColumns(jsonColumns: js.Array[Any | DataSourceColumnDef]): typings.nginstackDatasource.libDataSourceColumnsMod.^ = js.native
    
    def createFilters(jsonFilters: js.Array[Any | DataSourceFilterDef]): typings.nginstackDatasource.libDataSourceFiltersMod.^ = js.native
    
    def createFiltersFromMap(filtersMap: StringDictionary[Any]): typings.nginstackDatasource.libDataSourceFiltersMod.^ = js.native
    
    var definition: Any = js.native
    
    var filters: typings.nginstackDatasource.libDataSourceFiltersMod.^ = js.native
    
    def getDataSet(
      filters: typings.nginstackDatasource.libDataSourceFiltersMod.^,
      columns: typings.nginstackDatasource.libDataSourceColumnsMod.^
    ): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    def getKey(): Double = js.native
    
    def getQuery(
      filters: typings.nginstackDatasource.libDataSourceFiltersMod.^,
      columns: typings.nginstackDatasource.libDataSourceColumnsMod.^
    ): String = js.native
    
    def getResult(filters: js.Array[Any | DataSourceFilterDef], columns: js.Array[Any | DataSourceColumnDef]): typings.nginstackDatasource.libDataSourceResultMod.^ = js.native
    
    def getUrl(): String = js.native
    
    var help: String = js.native
    
    /* private */ var iKey_ : Any = js.native
    
    /* private */ var iUrl_ : Any = js.native
    
    /* private */ var logger_ : Any = js.native
    
    def mountDataSet(ds: typings.nginstackEngine.libDatasetDataSetMod.^): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* private */ var processAggregate_ : Any = js.native
    
    /* private */ var processDimensionLevels_ : Any = js.native
    
    var public: Boolean = js.native
    
    def purgeUnsolicitedColumns(
      ds: typings.nginstackEngine.libDatasetDataSetMod.^,
      columns: typings.nginstackDatasource.libDataSourceColumnsMod.^
    ): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* private */ var specializeFiltersAndColumns_ : Any = js.native
    
    /* private */ var validadeGetQueryReturn_ : Any = js.native
    
    /* private */ var validateAvailableColumn_ : Any = js.native
    
    /* private */ var validateAvailableFilter_ : Any = js.native
  }
  
  type DataSourceColumnDef = typings.nginstackDatasource.libDataSourceColumnDefMod.^
  
  type DataSourceDef = typings.nginstackDatasource.libDataSourceDefMod.^
  
  type DataSourceFilterDef = typings.nginstackDatasource.libDataSourceFilterDefMod.^
}
