package typings.nginstackWebFramework

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reportVisualizationDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/ReportVisualizationDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ReportVisualizationDef {
    
    /* CompleteClass */
    var columns: js.Array[ReportVisualizationColumnDef] = js.native
    
    /* CompleteClass */
    var dataSourceQuery: (Record[Any, Any]) | Double = js.native
    
    /* CompleteClass */
    var dataSourceQueryKey: Double = js.native
    
    /* CompleteClass */
    var footerComplement: String | Null = js.native
    
    /* CompleteClass */
    var groupExpansionLevel: Double | Null = js.native
    
    /* CompleteClass */
    var headerComplement: String | Null = js.native
    
    /* CompleteClass */
    var orderBy: String | Null = js.native
    
    /* CompleteClass */
    var rankingColumnLabel: String = js.native
    
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
    
    /* CompleteClass */
    var totalLabel: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/ReportVisualizationDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ReportVisualizationColumnDef = typings.nginstackWebFramework.reportVisualizationColumnDefMod.^
  
  trait ReportVisualizationDef extends StObject {
    
    var columns: js.Array[ReportVisualizationColumnDef]
    
    var dataSourceQuery: (Record[Any, Any]) | Double
    
    var dataSourceQueryKey: Double
    
    var footerComplement: String | Null
    
    var groupExpansionLevel: Double | Null
    
    var headerComplement: String | Null
    
    var orderBy: String | Null
    
    var rankingColumnLabel: String
    
    var showDateTime: Boolean
    
    var showEnterpriseName: Boolean
    
    var showFooter: Boolean
    
    var showHeader: Boolean
    
    var showOnlyFilledVariables: Boolean
    
    var showPath: Boolean
    
    var showRankingColumn: Boolean
    
    var showUserAndDataBaseName: Boolean
    
    var showVariables: Boolean
    
    var totalLabel: String
    
    var `type`: String
  }
  object ReportVisualizationDef {
    
    inline def apply(
      columns: js.Array[ReportVisualizationColumnDef],
      dataSourceQuery: (Record[Any, Any]) | Double,
      dataSourceQueryKey: Double,
      rankingColumnLabel: String,
      showDateTime: Boolean,
      showEnterpriseName: Boolean,
      showFooter: Boolean,
      showHeader: Boolean,
      showOnlyFilledVariables: Boolean,
      showPath: Boolean,
      showRankingColumn: Boolean,
      showUserAndDataBaseName: Boolean,
      showVariables: Boolean,
      totalLabel: String,
      `type`: String
    ): ReportVisualizationDef = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dataSourceQuery = dataSourceQuery.asInstanceOf[js.Any], dataSourceQueryKey = dataSourceQueryKey.asInstanceOf[js.Any], rankingColumnLabel = rankingColumnLabel.asInstanceOf[js.Any], showDateTime = showDateTime.asInstanceOf[js.Any], showEnterpriseName = showEnterpriseName.asInstanceOf[js.Any], showFooter = showFooter.asInstanceOf[js.Any], showHeader = showHeader.asInstanceOf[js.Any], showOnlyFilledVariables = showOnlyFilledVariables.asInstanceOf[js.Any], showPath = showPath.asInstanceOf[js.Any], showRankingColumn = showRankingColumn.asInstanceOf[js.Any], showUserAndDataBaseName = showUserAndDataBaseName.asInstanceOf[js.Any], showVariables = showVariables.asInstanceOf[js.Any], totalLabel = totalLabel.asInstanceOf[js.Any], footerComplement = null, groupExpansionLevel = null, headerComplement = null, orderBy = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportVisualizationDef]
    }
    
    extension [Self <: ReportVisualizationDef](x: Self) {
      
      inline def setColumns(value: js.Array[ReportVisualizationColumnDef]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: ReportVisualizationColumnDef*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDataSourceQuery(value: (Record[Any, Any]) | Double): Self = StObject.set(x, "dataSourceQuery", value.asInstanceOf[js.Any])
      
      inline def setDataSourceQueryKey(value: Double): Self = StObject.set(x, "dataSourceQueryKey", value.asInstanceOf[js.Any])
      
      inline def setFooterComplement(value: String): Self = StObject.set(x, "footerComplement", value.asInstanceOf[js.Any])
      
      inline def setFooterComplementNull: Self = StObject.set(x, "footerComplement", null)
      
      inline def setGroupExpansionLevel(value: Double): Self = StObject.set(x, "groupExpansionLevel", value.asInstanceOf[js.Any])
      
      inline def setGroupExpansionLevelNull: Self = StObject.set(x, "groupExpansionLevel", null)
      
      inline def setHeaderComplement(value: String): Self = StObject.set(x, "headerComplement", value.asInstanceOf[js.Any])
      
      inline def setHeaderComplementNull: Self = StObject.set(x, "headerComplement", null)
      
      inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderByNull: Self = StObject.set(x, "orderBy", null)
      
      inline def setRankingColumnLabel(value: String): Self = StObject.set(x, "rankingColumnLabel", value.asInstanceOf[js.Any])
      
      inline def setShowDateTime(value: Boolean): Self = StObject.set(x, "showDateTime", value.asInstanceOf[js.Any])
      
      inline def setShowEnterpriseName(value: Boolean): Self = StObject.set(x, "showEnterpriseName", value.asInstanceOf[js.Any])
      
      inline def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowOnlyFilledVariables(value: Boolean): Self = StObject.set(x, "showOnlyFilledVariables", value.asInstanceOf[js.Any])
      
      inline def setShowPath(value: Boolean): Self = StObject.set(x, "showPath", value.asInstanceOf[js.Any])
      
      inline def setShowRankingColumn(value: Boolean): Self = StObject.set(x, "showRankingColumn", value.asInstanceOf[js.Any])
      
      inline def setShowUserAndDataBaseName(value: Boolean): Self = StObject.set(x, "showUserAndDataBaseName", value.asInstanceOf[js.Any])
      
      inline def setShowVariables(value: Boolean): Self = StObject.set(x, "showVariables", value.asInstanceOf[js.Any])
      
      inline def setTotalLabel(value: String): Self = StObject.set(x, "totalLabel", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
