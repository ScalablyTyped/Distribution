package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.GetExporter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvReportVisualizationMod {
  
  inline def apply(definition: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/ReportVisualization", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ReportVisualization {
    def this(definition: Any) = this()
    
    /* CompleteClass */
    var COLUMN_VALUE_PREFIX: String = js.native
    
    /* CompleteClass */
    var columns: typings.nginstackWebFramework.libDsvReportVisualizationColumnsMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var createDSQColumnMap_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var createParamsToExpression_ : Any = js.native
    
    /* CompleteClass */
    var dataSourceQuery: (Record[Any, Any]) | Double = js.native
    
    /* CompleteClass */
    var dataSourceQueryKey: Double = js.native
    
    /* private */ /* CompleteClass */
    var defineWeightedAverage_ : Any = js.native
    
    /* CompleteClass */
    var definition: Any = js.native
    
    /* private */ /* CompleteClass */
    var ds_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var fillPivotDefinitions_ : Any = js.native
    
    /* CompleteClass */
    var footerComplement: String | Null = js.native
    
    /* private */ /* CompleteClass */
    var getBaseFromPivotAggregatedColumn_ : Any = js.native
    
    /* CompleteClass */
    override def getColumn(name: String): typings.nginstackWebFramework.libDsvReportVisualizationColumnMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var getColumnDefs_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getColumnsFromDataSet_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getDataExporter_ : Any = js.native
    
    /* CompleteClass */
    override def getExportableData(): js.Array[GetExporter] = js.native
    
    /* private */ /* CompleteClass */
    var getGroupValues_ : Any = js.native
    
    /* protected */ /* CompleteClass */
    override def getPivotDataSet_(): Any = js.native
    
    /* private */ /* CompleteClass */
    var getRawDataExporter_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getTotalWeightColumn_ : Any = js.native
    
    /* CompleteClass */
    var groupExpansionLevel: Double | Null = js.native
    
    /* CompleteClass */
    var headerComplement: String = js.native
    
    /* private */ /* CompleteClass */
    var initColumns_ : Any = js.native
    
    /* protected */ /* CompleteClass */
    override def initPivots_(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var initProperties_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var lastUsedFilterValues_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var layoutFilters_ : Any = js.native
    
    /* CompleteClass */
    var orderBy: String | Null = js.native
    
    /* private */ /* CompleteClass */
    var pivotDefs_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var pivotGeneratedLabels_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var prepareLayoutFilters_ : Any = js.native
    
    /* CompleteClass */
    override def queryData(filterValues: Record[String, Any]): Unit = js.native
    
    /* CompleteClass */
    var rankingColumnLabel: String = js.native
    
    /* private */ /* CompleteClass */
    var referenceColumnMap_ : Any = js.native
    
    /* CompleteClass */
    override def render(outputObj: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var reportAssignMap_ : Any = js.native
    
    /* CompleteClass */
    var showDateTime: Boolean = js.native
    
    /* CompleteClass */
    var showEnterpriseName: Boolean = js.native
    
    /* CompleteClass */
    var showFooter: Boolean = js.native
    
    /* CompleteClass */
    var showHeader: Boolean = js.native
    
    /* CompleteClass */
    var showOnlyFilledVariables: Boolean = js.native
    
    /* CompleteClass */
    var showPath: Boolean = js.native
    
    /* CompleteClass */
    var showRankingColumn: Boolean = js.native
    
    /* CompleteClass */
    var showUserAndDataBaseName: Boolean = js.native
    
    /* CompleteClass */
    var showVariables: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var simpleLayoutExporter_ : Any = js.native
    
    /* CompleteClass */
    var totalLabel: String = js.native
    
    /* private */ /* CompleteClass */
    var unsolicitedColumns_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/ReportVisualization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/dsv/ReportVisualization", "Process")
  @js.native
  def Process: Any = js.native
  inline def Process_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Process")(x.asInstanceOf[js.Any])
  
  inline def registerExportFormat(name: String, processKey: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerExportFormat")(name.asInstanceOf[js.Any], processKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type DataExporter = typings.nginstackWebFramework.libExportDataExporterMod.^
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  trait ReportVisualization extends StObject {
    
    var COLUMN_VALUE_PREFIX: String
    
    var columns: typings.nginstackWebFramework.libDsvReportVisualizationColumnsMod.^
    
    /* private */ var createDSQColumnMap_ : Any
    
    /* private */ var createParamsToExpression_ : Any
    
    var dataSourceQuery: (Record[Any, Any]) | Double
    
    var dataSourceQueryKey: Double
    
    /* private */ var defineWeightedAverage_ : Any
    
    var definition: Any
    
    /* private */ var ds_ : Any
    
    /* private */ var fillPivotDefinitions_ : Any
    
    var footerComplement: String | Null
    
    /* private */ var getBaseFromPivotAggregatedColumn_ : Any
    
    def getColumn(name: String): typings.nginstackWebFramework.libDsvReportVisualizationColumnMod.^
    
    /* private */ var getColumnDefs_ : Any
    
    /* private */ var getColumnsFromDataSet_ : Any
    
    /* private */ var getDataExporter_ : Any
    
    def getExportableData(): js.Array[GetExporter]
    
    /* private */ var getGroupValues_ : Any
    
    /* protected */ def getPivotDataSet_(): Any
    
    /* private */ var getRawDataExporter_ : Any
    
    /* private */ var getTotalWeightColumn_ : Any
    
    var groupExpansionLevel: Double | Null
    
    var headerComplement: String
    
    /* private */ var initColumns_ : Any
    
    /* protected */ def initPivots_(): Unit
    
    /* private */ var initProperties_ : Any
    
    /* private */ var lastUsedFilterValues_ : Any
    
    /* private */ var layoutFilters_ : Any
    
    var orderBy: String | Null
    
    /* private */ var pivotDefs_ : Any
    
    /* private */ var pivotGeneratedLabels_ : Any
    
    /* private */ var prepareLayoutFilters_ : Any
    
    def queryData(filterValues: Record[String, Any]): Unit
    
    var rankingColumnLabel: String
    
    /* private */ var referenceColumnMap_ : Any
    
    def render(outputObj: Any): Unit
    
    /* private */ var reportAssignMap_ : Any
    
    var showDateTime: Boolean
    
    var showEnterpriseName: Boolean
    
    var showFooter: Boolean
    
    var showHeader: Boolean
    
    var showOnlyFilledVariables: Boolean
    
    var showPath: Boolean
    
    var showRankingColumn: Boolean
    
    var showUserAndDataBaseName: Boolean
    
    var showVariables: Boolean
    
    /* private */ var simpleLayoutExporter_ : Any
    
    var totalLabel: String
    
    /* private */ var unsolicitedColumns_ : Any
  }
  object ReportVisualization {
    
    inline def apply(
      COLUMN_VALUE_PREFIX: String,
      columns: typings.nginstackWebFramework.libDsvReportVisualizationColumnsMod.^,
      createDSQColumnMap_ : Any,
      createParamsToExpression_ : Any,
      dataSourceQuery: (Record[Any, Any]) | Double,
      dataSourceQueryKey: Double,
      defineWeightedAverage_ : Any,
      definition: Any,
      ds_ : Any,
      fillPivotDefinitions_ : Any,
      getBaseFromPivotAggregatedColumn_ : Any,
      getColumn: String => typings.nginstackWebFramework.libDsvReportVisualizationColumnMod.^,
      getColumnDefs_ : Any,
      getColumnsFromDataSet_ : Any,
      getDataExporter_ : Any,
      getExportableData: () => js.Array[GetExporter],
      getGroupValues_ : Any,
      getPivotDataSet_ : () => Any,
      getRawDataExporter_ : Any,
      getTotalWeightColumn_ : Any,
      headerComplement: String,
      initColumns_ : Any,
      initPivots_ : () => Unit,
      initProperties_ : Any,
      lastUsedFilterValues_ : Any,
      layoutFilters_ : Any,
      pivotDefs_ : Any,
      pivotGeneratedLabels_ : Any,
      prepareLayoutFilters_ : Any,
      queryData: Record[String, Any] => Unit,
      rankingColumnLabel: String,
      referenceColumnMap_ : Any,
      render: Any => Unit,
      reportAssignMap_ : Any,
      showDateTime: Boolean,
      showEnterpriseName: Boolean,
      showFooter: Boolean,
      showHeader: Boolean,
      showOnlyFilledVariables: Boolean,
      showPath: Boolean,
      showRankingColumn: Boolean,
      showUserAndDataBaseName: Boolean,
      showVariables: Boolean,
      simpleLayoutExporter_ : Any,
      totalLabel: String,
      unsolicitedColumns_ : Any
    ): ReportVisualization = {
      val __obj = js.Dynamic.literal(COLUMN_VALUE_PREFIX = COLUMN_VALUE_PREFIX.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], createDSQColumnMap_ = createDSQColumnMap_.asInstanceOf[js.Any], createParamsToExpression_ = createParamsToExpression_.asInstanceOf[js.Any], dataSourceQuery = dataSourceQuery.asInstanceOf[js.Any], dataSourceQueryKey = dataSourceQueryKey.asInstanceOf[js.Any], defineWeightedAverage_ = defineWeightedAverage_.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], ds_ = ds_.asInstanceOf[js.Any], fillPivotDefinitions_ = fillPivotDefinitions_.asInstanceOf[js.Any], getBaseFromPivotAggregatedColumn_ = getBaseFromPivotAggregatedColumn_.asInstanceOf[js.Any], getColumn = js.Any.fromFunction1(getColumn), getColumnDefs_ = getColumnDefs_.asInstanceOf[js.Any], getColumnsFromDataSet_ = getColumnsFromDataSet_.asInstanceOf[js.Any], getDataExporter_ = getDataExporter_.asInstanceOf[js.Any], getExportableData = js.Any.fromFunction0(getExportableData), getGroupValues_ = getGroupValues_.asInstanceOf[js.Any], getPivotDataSet_ = js.Any.fromFunction0(getPivotDataSet_), getRawDataExporter_ = getRawDataExporter_.asInstanceOf[js.Any], getTotalWeightColumn_ = getTotalWeightColumn_.asInstanceOf[js.Any], headerComplement = headerComplement.asInstanceOf[js.Any], initColumns_ = initColumns_.asInstanceOf[js.Any], initPivots_ = js.Any.fromFunction0(initPivots_), initProperties_ = initProperties_.asInstanceOf[js.Any], lastUsedFilterValues_ = lastUsedFilterValues_.asInstanceOf[js.Any], layoutFilters_ = layoutFilters_.asInstanceOf[js.Any], pivotDefs_ = pivotDefs_.asInstanceOf[js.Any], pivotGeneratedLabels_ = pivotGeneratedLabels_.asInstanceOf[js.Any], prepareLayoutFilters_ = prepareLayoutFilters_.asInstanceOf[js.Any], queryData = js.Any.fromFunction1(queryData), rankingColumnLabel = rankingColumnLabel.asInstanceOf[js.Any], referenceColumnMap_ = referenceColumnMap_.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), reportAssignMap_ = reportAssignMap_.asInstanceOf[js.Any], showDateTime = showDateTime.asInstanceOf[js.Any], showEnterpriseName = showEnterpriseName.asInstanceOf[js.Any], showFooter = showFooter.asInstanceOf[js.Any], showHeader = showHeader.asInstanceOf[js.Any], showOnlyFilledVariables = showOnlyFilledVariables.asInstanceOf[js.Any], showPath = showPath.asInstanceOf[js.Any], showRankingColumn = showRankingColumn.asInstanceOf[js.Any], showUserAndDataBaseName = showUserAndDataBaseName.asInstanceOf[js.Any], showVariables = showVariables.asInstanceOf[js.Any], simpleLayoutExporter_ = simpleLayoutExporter_.asInstanceOf[js.Any], totalLabel = totalLabel.asInstanceOf[js.Any], unsolicitedColumns_ = unsolicitedColumns_.asInstanceOf[js.Any], footerComplement = null, groupExpansionLevel = null, orderBy = null)
      __obj.asInstanceOf[ReportVisualization]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReportVisualization] (val x: Self) extends AnyVal {
      
      inline def setCOLUMN_VALUE_PREFIX(value: String): Self = StObject.set(x, "COLUMN_VALUE_PREFIX", value.asInstanceOf[js.Any])
      
      inline def setColumns(value: typings.nginstackWebFramework.libDsvReportVisualizationColumnsMod.^): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setCreateDSQColumnMap_(value: Any): Self = StObject.set(x, "createDSQColumnMap_", value.asInstanceOf[js.Any])
      
      inline def setCreateParamsToExpression_(value: Any): Self = StObject.set(x, "createParamsToExpression_", value.asInstanceOf[js.Any])
      
      inline def setDataSourceQuery(value: (Record[Any, Any]) | Double): Self = StObject.set(x, "dataSourceQuery", value.asInstanceOf[js.Any])
      
      inline def setDataSourceQueryKey(value: Double): Self = StObject.set(x, "dataSourceQueryKey", value.asInstanceOf[js.Any])
      
      inline def setDefineWeightedAverage_(value: Any): Self = StObject.set(x, "defineWeightedAverage_", value.asInstanceOf[js.Any])
      
      inline def setDefinition(value: Any): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDs_(value: Any): Self = StObject.set(x, "ds_", value.asInstanceOf[js.Any])
      
      inline def setFillPivotDefinitions_(value: Any): Self = StObject.set(x, "fillPivotDefinitions_", value.asInstanceOf[js.Any])
      
      inline def setFooterComplement(value: String): Self = StObject.set(x, "footerComplement", value.asInstanceOf[js.Any])
      
      inline def setFooterComplementNull: Self = StObject.set(x, "footerComplement", null)
      
      inline def setGetBaseFromPivotAggregatedColumn_(value: Any): Self = StObject.set(x, "getBaseFromPivotAggregatedColumn_", value.asInstanceOf[js.Any])
      
      inline def setGetColumn(value: String => typings.nginstackWebFramework.libDsvReportVisualizationColumnMod.^): Self = StObject.set(x, "getColumn", js.Any.fromFunction1(value))
      
      inline def setGetColumnDefs_(value: Any): Self = StObject.set(x, "getColumnDefs_", value.asInstanceOf[js.Any])
      
      inline def setGetColumnsFromDataSet_(value: Any): Self = StObject.set(x, "getColumnsFromDataSet_", value.asInstanceOf[js.Any])
      
      inline def setGetDataExporter_(value: Any): Self = StObject.set(x, "getDataExporter_", value.asInstanceOf[js.Any])
      
      inline def setGetExportableData(value: () => js.Array[GetExporter]): Self = StObject.set(x, "getExportableData", js.Any.fromFunction0(value))
      
      inline def setGetGroupValues_(value: Any): Self = StObject.set(x, "getGroupValues_", value.asInstanceOf[js.Any])
      
      inline def setGetPivotDataSet_(value: () => Any): Self = StObject.set(x, "getPivotDataSet_", js.Any.fromFunction0(value))
      
      inline def setGetRawDataExporter_(value: Any): Self = StObject.set(x, "getRawDataExporter_", value.asInstanceOf[js.Any])
      
      inline def setGetTotalWeightColumn_(value: Any): Self = StObject.set(x, "getTotalWeightColumn_", value.asInstanceOf[js.Any])
      
      inline def setGroupExpansionLevel(value: Double): Self = StObject.set(x, "groupExpansionLevel", value.asInstanceOf[js.Any])
      
      inline def setGroupExpansionLevelNull: Self = StObject.set(x, "groupExpansionLevel", null)
      
      inline def setHeaderComplement(value: String): Self = StObject.set(x, "headerComplement", value.asInstanceOf[js.Any])
      
      inline def setInitColumns_(value: Any): Self = StObject.set(x, "initColumns_", value.asInstanceOf[js.Any])
      
      inline def setInitPivots_(value: () => Unit): Self = StObject.set(x, "initPivots_", js.Any.fromFunction0(value))
      
      inline def setInitProperties_(value: Any): Self = StObject.set(x, "initProperties_", value.asInstanceOf[js.Any])
      
      inline def setLastUsedFilterValues_(value: Any): Self = StObject.set(x, "lastUsedFilterValues_", value.asInstanceOf[js.Any])
      
      inline def setLayoutFilters_(value: Any): Self = StObject.set(x, "layoutFilters_", value.asInstanceOf[js.Any])
      
      inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderByNull: Self = StObject.set(x, "orderBy", null)
      
      inline def setPivotDefs_(value: Any): Self = StObject.set(x, "pivotDefs_", value.asInstanceOf[js.Any])
      
      inline def setPivotGeneratedLabels_(value: Any): Self = StObject.set(x, "pivotGeneratedLabels_", value.asInstanceOf[js.Any])
      
      inline def setPrepareLayoutFilters_(value: Any): Self = StObject.set(x, "prepareLayoutFilters_", value.asInstanceOf[js.Any])
      
      inline def setQueryData(value: Record[String, Any] => Unit): Self = StObject.set(x, "queryData", js.Any.fromFunction1(value))
      
      inline def setRankingColumnLabel(value: String): Self = StObject.set(x, "rankingColumnLabel", value.asInstanceOf[js.Any])
      
      inline def setReferenceColumnMap_(value: Any): Self = StObject.set(x, "referenceColumnMap_", value.asInstanceOf[js.Any])
      
      inline def setRender(value: Any => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setReportAssignMap_(value: Any): Self = StObject.set(x, "reportAssignMap_", value.asInstanceOf[js.Any])
      
      inline def setShowDateTime(value: Boolean): Self = StObject.set(x, "showDateTime", value.asInstanceOf[js.Any])
      
      inline def setShowEnterpriseName(value: Boolean): Self = StObject.set(x, "showEnterpriseName", value.asInstanceOf[js.Any])
      
      inline def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowOnlyFilledVariables(value: Boolean): Self = StObject.set(x, "showOnlyFilledVariables", value.asInstanceOf[js.Any])
      
      inline def setShowPath(value: Boolean): Self = StObject.set(x, "showPath", value.asInstanceOf[js.Any])
      
      inline def setShowRankingColumn(value: Boolean): Self = StObject.set(x, "showRankingColumn", value.asInstanceOf[js.Any])
      
      inline def setShowUserAndDataBaseName(value: Boolean): Self = StObject.set(x, "showUserAndDataBaseName", value.asInstanceOf[js.Any])
      
      inline def setShowVariables(value: Boolean): Self = StObject.set(x, "showVariables", value.asInstanceOf[js.Any])
      
      inline def setSimpleLayoutExporter_(value: Any): Self = StObject.set(x, "simpleLayoutExporter_", value.asInstanceOf[js.Any])
      
      inline def setTotalLabel(value: String): Self = StObject.set(x, "totalLabel", value.asInstanceOf[js.Any])
      
      inline def setUnsolicitedColumns_(value: Any): Self = StObject.set(x, "unsolicitedColumns_", value.asInstanceOf[js.Any])
    }
  }
  
  type SimpleLayoutExporter = typings.nginstackWebFramework.libSimpleLayoutSimpleLayoutExporterMod.^
}
