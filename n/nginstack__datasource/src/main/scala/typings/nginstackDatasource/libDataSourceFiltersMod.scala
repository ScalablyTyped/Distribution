package typings.nginstackDatasource

import typings.nginstackDatasource.anon.ClassDef
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataSourceFiltersMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(opt_dataSource: Unit, opt_filtersValues: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(opt_dataSource.asInstanceOf[js.Any], opt_filtersValues.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(opt_dataSource: DataSource): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_dataSource.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(opt_dataSource: DataSource, opt_filtersValues: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(opt_dataSource.asInstanceOf[js.Any], opt_filtersValues.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/datasource/lib/DataSourceFilters", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataSourceFilters {
    def this(opt_dataSource: DataSource) = this()
    def this(opt_dataSource: Unit, opt_filtersValues: js.Array[Any]) = this()
    def this(opt_dataSource: DataSource, opt_filtersValues: js.Array[Any]) = this()
  }
  @JSImport("@nginstack/datasource/lib/DataSourceFilters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSource = typings.nginstackDatasource.libDataSourceMod.^
  
  @js.native
  trait DataSourceFilters extends StObject {
    
    /* private */ var add: Any = js.native
    
    def filter(id: String): typings.nginstackDatasource.libDataSourceFilterMod.^ = js.native
    def filter(id: String, opt_type: String): typings.nginstackDatasource.libDataSourceFilterMod.^ = js.native
    def filter(id: String, opt_type: String, opt_classKey: Double): typings.nginstackDatasource.libDataSourceFilterMod.^ = js.native
    def filter(id: String, opt_type: Unit, opt_classKey: Double): typings.nginstackDatasource.libDataSourceFilterMod.^ = js.native
    def filter(id: Double): typings.nginstackDatasource.libDataSourceFilterMod.^ = js.native
    def filter(id: Double, opt_type: String): typings.nginstackDatasource.libDataSourceFilterMod.^ = js.native
    def filter(id: Double, opt_type: String, opt_classKey: Double): typings.nginstackDatasource.libDataSourceFilterMod.^ = js.native
    def filter(id: Double, opt_type: Unit, opt_classKey: Double): typings.nginstackDatasource.libDataSourceFilterMod.^ = js.native
    
    /* private */ var filtersArray_ : Any = js.native
    
    /* private */ var filtersHash_ : Any = js.native
    
    def getDerivedFiltersNames(filterName: String, selfDerived: Boolean): js.Array[Any] = js.native
    
    def getFilters(filtersSelection: String): DataSourceFilters = js.native
    
    def getIQueryFilters(filtersSelection: String, conditionalOperator: String): js.Array[Any] = js.native
    def getIQueryFilters(filtersSelection: String, conditionalOperator: String, iquery: IQuery): js.Array[Any] = js.native
    
    def getLength(): Double = js.native
    
    def hasFilter(name: String): Boolean = js.native
    
    def importFields(classKey: Double, prefix: String): Unit = js.native
    def importFields(classKey: Double, prefix: String, opt_options: ClassDef): Unit = js.native
    def importFields(classKey: Double, prefix: String, opt_options: Record[Any, Any]): Unit = js.native
    
    def importVisibleFields(classKey: Double): Unit = js.native
    def importVisibleFields(classKey: Double, fieldNamesPrefix: String): Unit = js.native
    def importVisibleFields(classKey: Double, fieldNamesPrefix: String, includeFieldNames: String): Unit = js.native
    def importVisibleFields(classKey: Double, fieldNamesPrefix: String, includeFieldNames: String, excludeFieldNames: String): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: String,
      includeFieldNames: String,
      excludeFieldNames: String,
      classDef: Unit,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: String,
      includeFieldNames: String,
      excludeFieldNames: String,
      classDef: ModelDef
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: String,
      includeFieldNames: String,
      excludeFieldNames: String,
      classDef: ModelDef,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: String,
      includeFieldNames: String,
      excludeFieldNames: Unit,
      classDef: Unit,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: String,
      includeFieldNames: String,
      excludeFieldNames: Unit,
      classDef: ModelDef
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: String,
      includeFieldNames: String,
      excludeFieldNames: Unit,
      classDef: ModelDef,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    def importVisibleFields(classKey: Double, fieldNamesPrefix: String, includeFieldNames: Unit, excludeFieldNames: String): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: String,
      includeFieldNames: Unit,
      excludeFieldNames: String,
      classDef: Unit,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: String,
      includeFieldNames: Unit,
      excludeFieldNames: String,
      classDef: ModelDef
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: String,
      includeFieldNames: Unit,
      excludeFieldNames: String,
      classDef: ModelDef,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: String,
      includeFieldNames: Unit,
      excludeFieldNames: Unit,
      classDef: Unit,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: String,
      includeFieldNames: Unit,
      excludeFieldNames: Unit,
      classDef: ModelDef
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: String,
      includeFieldNames: Unit,
      excludeFieldNames: Unit,
      classDef: ModelDef,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    def importVisibleFields(classKey: Double, fieldNamesPrefix: Unit, includeFieldNames: String): Unit = js.native
    def importVisibleFields(classKey: Double, fieldNamesPrefix: Unit, includeFieldNames: String, excludeFieldNames: String): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: Unit,
      includeFieldNames: String,
      excludeFieldNames: String,
      classDef: Unit,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: Unit,
      includeFieldNames: String,
      excludeFieldNames: String,
      classDef: ModelDef
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: Unit,
      includeFieldNames: String,
      excludeFieldNames: String,
      classDef: ModelDef,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: Unit,
      includeFieldNames: String,
      excludeFieldNames: Unit,
      classDef: Unit,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: Unit,
      includeFieldNames: String,
      excludeFieldNames: Unit,
      classDef: ModelDef
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: Unit,
      includeFieldNames: String,
      excludeFieldNames: Unit,
      classDef: ModelDef,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    def importVisibleFields(classKey: Double, fieldNamesPrefix: Unit, includeFieldNames: Unit, excludeFieldNames: String): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: Unit,
      includeFieldNames: Unit,
      excludeFieldNames: String,
      classDef: Unit,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: Unit,
      includeFieldNames: Unit,
      excludeFieldNames: String,
      classDef: ModelDef
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: Unit,
      includeFieldNames: Unit,
      excludeFieldNames: String,
      classDef: ModelDef,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: Unit,
      includeFieldNames: Unit,
      excludeFieldNames: Unit,
      classDef: Unit,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: Unit,
      includeFieldNames: Unit,
      excludeFieldNames: Unit,
      classDef: ModelDef
    ): Unit = js.native
    def importVisibleFields(
      classKey: Double,
      fieldNamesPrefix: Unit,
      includeFieldNames: Unit,
      excludeFieldNames: Unit,
      classDef: ModelDef,
      onlyIncludedFieldNames: Boolean
    ): Unit = js.native
    
    /* private */ var indexByName_ : Any = js.native
    
    def map(
      fn: js.Function3[
          /* arg0 */ typings.nginstackDatasource.libDataSourceFilterMod.^, 
          /* arg1 */ Double, 
          /* arg2 */ js.Array[typings.nginstackDatasource.libDataSourceFilterMod.^], 
          Any
        ]
    ): js.Array[Any] = js.native
    def map(
      fn: js.Function3[
          /* arg0 */ typings.nginstackDatasource.libDataSourceFilterMod.^, 
          /* arg1 */ Double, 
          /* arg2 */ js.Array[typings.nginstackDatasource.libDataSourceFilterMod.^], 
          Any
        ],
      opt_scope: Any
    ): js.Array[Any] = js.native
    
    /* private */ var newDynFilter_ : Any = js.native
    
    def parseDynFilterExpr(filterName: String): Any = js.native
    
    /* private */ var parseFiltersExpression_ : Any = js.native
    
    /* private */ var unshare_ : Any = js.native
  }
  
  type IQuery = typings.nginstackIquery.libIqueryMod.^
  
  type ModelDef = typings.nginstackEngine.libClassdefModelDefMod.^
}
