package typings.nginstackDatasource

import typings.nginstackDatasource.anon.DerivedFrom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataSourceColumnsMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(opt_dataSource: Unit, opt_colsDefs: js.Array[DataSourceColumnDef]): Unit = (^.asInstanceOf[js.Dynamic].apply(opt_dataSource.asInstanceOf[js.Any], opt_colsDefs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(opt_dataSource: DataSource): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_dataSource.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(opt_dataSource: DataSource, opt_colsDefs: js.Array[DataSourceColumnDef]): Unit = (^.asInstanceOf[js.Dynamic].apply(opt_dataSource.asInstanceOf[js.Any], opt_colsDefs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/datasource/lib/DataSourceColumns", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataSourceColumns {
    def this(opt_dataSource: DataSource) = this()
    def this(opt_dataSource: Unit, opt_colsDefs: js.Array[DataSourceColumnDef]) = this()
    def this(opt_dataSource: DataSource, opt_colsDefs: js.Array[DataSourceColumnDef]) = this()
  }
  @JSImport("@nginstack/datasource/lib/DataSourceColumns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSource = typings.nginstackDatasource.libDataSourceMod.^
  
  type DataSourceColumnDef = typings.nginstackDatasource.libDataSourceColumnDefMod.^
  
  @js.native
  trait DataSourceColumns extends StObject {
    
    /* private */ var add: Any = js.native
    
    /* private */ var aliasChangeListener_ : Any = js.native
    
    def column(indexOrName: String): typings.nginstackDatasource.libDataSourceColumnMod.^ = js.native
    def column(indexOrName: String, opt_type: String): typings.nginstackDatasource.libDataSourceColumnMod.^ = js.native
    def column(indexOrName: Double): typings.nginstackDatasource.libDataSourceColumnMod.^ = js.native
    def column(indexOrName: Double, opt_type: String): typings.nginstackDatasource.libDataSourceColumnMod.^ = js.native
    
    /* private */ var columnsArray_ : Any = js.native
    
    /* private */ var columnsByAlias_ : Any = js.native
    
    /* private */ var columnsByName_ : Any = js.native
    
    def findByAlias(alias: String): typings.nginstackDatasource.libDataSourceColumnMod.^ = js.native
    
    def findByName(name: String): typings.nginstackDatasource.libDataSourceColumnMod.^ = js.native
    
    def getColumns(columnsSelection: String): DataSourceColumns = js.native
    
    def getIQueryColumns(columnsSelection: String): js.Array[Any] = js.native
    def getIQueryColumns(columnsSelection: String, iquery: IQuery): js.Array[Any] = js.native
    
    def getLength(): Double = js.native
    
    def getPostProcessingInfo(): Any = js.native
    
    def hasColumn(name: String): Boolean = js.native
    
    /* private */ var importAndMixin_ : Any = js.native
    
    def importFields(classKey: Double, prefix: String): Unit = js.native
    def importFields(classKey: Double, prefix: String, opt_options: Any): Unit = js.native
    
    def importVisibleFields(classKey: Double): Unit = js.native
    def importVisibleFields(classKey: Double, fieldNamesPrefix: String): Unit = js.native
    def importVisibleFields(classKey: Double, fieldNamesPrefix: String, includeFieldNames: String): Unit = js.native
    def importVisibleFields(classKey: Double, fieldNamesPrefix: String, includeFieldNames: String, excludeFieldNames: String): Unit = js.native
    def importVisibleFields(classKey: Double, fieldNamesPrefix: String, includeFieldNames: Unit, excludeFieldNames: String): Unit = js.native
    def importVisibleFields(classKey: Double, fieldNamesPrefix: Unit, includeFieldNames: String): Unit = js.native
    def importVisibleFields(classKey: Double, fieldNamesPrefix: Unit, includeFieldNames: String, excludeFieldNames: String): Unit = js.native
    def importVisibleFields(classKey: Double, fieldNamesPrefix: Unit, includeFieldNames: Unit, excludeFieldNames: String): Unit = js.native
    
    /* private */ var indexByName_ : Any = js.native
    
    def indexOf(aliasOrName: String): Double = js.native
    
    /* private */ var newDynColumn_ : Any = js.native
    
    /* private */ var parseColumnsExpression_ : Any = js.native
    
    def parseDynColumnExpr(columnName: Any): DerivedFrom = js.native
    
    /* private */ var postProcessingInfo_ : Any = js.native
    
    /* private */ var unshare_ : Any = js.native
  }
  
  type IQuery = typings.nginstackIquery.libIqueryMod.^
}
