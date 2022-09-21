package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reportVisualizationColumnDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/ReportVisualizationColumnDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ReportVisualizationColumnDef {
    
    /* CompleteClass */
    var classKey: Double | Null = js.native
    
    /* CompleteClass */
    var columnGroup: String | Null = js.native
    
    /* CompleteClass */
    var displayFormat: String | Double | Null = js.native
    
    /* CompleteClass */
    var expression: String = js.native
    
    /* CompleteClass */
    var groupName: String | Null = js.native
    
    /* CompleteClass */
    var groupType: String = js.native
    
    /* CompleteClass */
    var height: Double | String | Null = js.native
    
    /* CompleteClass */
    var help: String = js.native
    
    /* CompleteClass */
    var label: String = js.native
    
    /* CompleteClass */
    var links: js.Array[ColumnLinkDef] = js.native
    
    /* CompleteClass */
    var lookupType: Double = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var pathDepth: Double = js.native
    
    /* CompleteClass */
    var pathHeight: Double = js.native
    
    /* CompleteClass */
    var pathRoot: Double | Null = js.native
    
    /* CompleteClass */
    var pivot: Boolean = js.native
    
    /* CompleteClass */
    var renderAsImage: Boolean = js.native
    
    /* CompleteClass */
    var renderContentAsHtml: Boolean = js.native
    
    /* CompleteClass */
    var showGlobalActions: Boolean = js.native
    
    /* CompleteClass */
    var showOutOfTree: Boolean | Null = js.native
    
    /* CompleteClass */
    var simpleLayoutAggregate: String | Null = js.native
    
    /* CompleteClass */
    var simpleLayoutWeight: String | Null = js.native
    
    /* CompleteClass */
    var totalAggregate: String | Null = js.native
    
    /* CompleteClass */
    var totalWeightColumn: String | Null = js.native
    
    /* CompleteClass */
    var useToGroup: Boolean | Null = js.native
    
    /* CompleteClass */
    var visible: Boolean = js.native
    
    /* CompleteClass */
    var width: Double | String | Null = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/ReportVisualizationColumnDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/dsv/ReportVisualizationColumnDef", "mergeDuplicatedValues")
  @js.native
  def mergeDuplicatedValues: Boolean = js.native
  inline def mergeDuplicatedValues_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mergeDuplicatedValues")(x.asInstanceOf[js.Any])
  
  trait ColumnLinkDef extends StObject {
    
    var dsvKey: DBKey | Double
    
    var label: String
    
    var newTab: Boolean
    
    var params: Any
    
    var process: DBKey | Double
    
    var target: String
  }
  object ColumnLinkDef {
    
    inline def apply(
      dsvKey: DBKey | Double,
      label: String,
      newTab: Boolean,
      params: Any,
      process: DBKey | Double,
      target: String
    ): ColumnLinkDef = {
      val __obj = js.Dynamic.literal(dsvKey = dsvKey.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], newTab = newTab.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnLinkDef]
    }
    
    extension [Self <: ColumnLinkDef](x: Self) {
      
      inline def setDsvKey(value: DBKey | Double): Self = StObject.set(x, "dsvKey", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setNewTab(value: Boolean): Self = StObject.set(x, "newTab", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: DBKey | Double): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type DBKey = typings.nginstackEngine.dbkeyMod.^
  
  trait ReportVisualizationColumnDef extends StObject {
    
    var classKey: Double | Null
    
    var columnGroup: String | Null
    
    var displayFormat: String | Double | Null
    
    var expression: String
    
    var groupName: String | Null
    
    var groupType: String
    
    var height: Double | String | Null
    
    var help: String
    
    var label: String
    
    var links: js.Array[ColumnLinkDef]
    
    var lookupType: Double
    
    var name: String
    
    var pathDepth: Double
    
    var pathHeight: Double
    
    var pathRoot: Double | Null
    
    var pivot: Boolean
    
    var renderAsImage: Boolean
    
    var renderContentAsHtml: Boolean
    
    var showGlobalActions: Boolean
    
    var showOutOfTree: Boolean | Null
    
    var simpleLayoutAggregate: String | Null
    
    var simpleLayoutWeight: String | Null
    
    var totalAggregate: String | Null
    
    var totalWeightColumn: String | Null
    
    var useToGroup: Boolean | Null
    
    var visible: Boolean
    
    var width: Double | String | Null
  }
  object ReportVisualizationColumnDef {
    
    inline def apply(
      expression: String,
      groupType: String,
      help: String,
      label: String,
      links: js.Array[ColumnLinkDef],
      lookupType: Double,
      name: String,
      pathDepth: Double,
      pathHeight: Double,
      pivot: Boolean,
      renderAsImage: Boolean,
      renderContentAsHtml: Boolean,
      showGlobalActions: Boolean,
      visible: Boolean
    ): ReportVisualizationColumnDef = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], groupType = groupType.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], lookupType = lookupType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pathDepth = pathDepth.asInstanceOf[js.Any], pathHeight = pathHeight.asInstanceOf[js.Any], pivot = pivot.asInstanceOf[js.Any], renderAsImage = renderAsImage.asInstanceOf[js.Any], renderContentAsHtml = renderContentAsHtml.asInstanceOf[js.Any], showGlobalActions = showGlobalActions.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], classKey = null, columnGroup = null, displayFormat = null, groupName = null, height = null, pathRoot = null, showOutOfTree = null, simpleLayoutAggregate = null, simpleLayoutWeight = null, totalAggregate = null, totalWeightColumn = null, useToGroup = null, width = null)
      __obj.asInstanceOf[ReportVisualizationColumnDef]
    }
    
    extension [Self <: ReportVisualizationColumnDef](x: Self) {
      
      inline def setClassKey(value: Double): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setClassKeyNull: Self = StObject.set(x, "classKey", null)
      
      inline def setColumnGroup(value: String): Self = StObject.set(x, "columnGroup", value.asInstanceOf[js.Any])
      
      inline def setColumnGroupNull: Self = StObject.set(x, "columnGroup", null)
      
      inline def setDisplayFormat(value: String | Double): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
      
      inline def setDisplayFormatNull: Self = StObject.set(x, "displayFormat", null)
      
      inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      inline def setGroupNameNull: Self = StObject.set(x, "groupName", null)
      
      inline def setGroupType(value: String): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: js.Array[ColumnLinkDef]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: ColumnLinkDef*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setLookupType(value: Double): Self = StObject.set(x, "lookupType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPathDepth(value: Double): Self = StObject.set(x, "pathDepth", value.asInstanceOf[js.Any])
      
      inline def setPathHeight(value: Double): Self = StObject.set(x, "pathHeight", value.asInstanceOf[js.Any])
      
      inline def setPathRoot(value: Double): Self = StObject.set(x, "pathRoot", value.asInstanceOf[js.Any])
      
      inline def setPathRootNull: Self = StObject.set(x, "pathRoot", null)
      
      inline def setPivot(value: Boolean): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
      
      inline def setRenderAsImage(value: Boolean): Self = StObject.set(x, "renderAsImage", value.asInstanceOf[js.Any])
      
      inline def setRenderContentAsHtml(value: Boolean): Self = StObject.set(x, "renderContentAsHtml", value.asInstanceOf[js.Any])
      
      inline def setShowGlobalActions(value: Boolean): Self = StObject.set(x, "showGlobalActions", value.asInstanceOf[js.Any])
      
      inline def setShowOutOfTree(value: Boolean): Self = StObject.set(x, "showOutOfTree", value.asInstanceOf[js.Any])
      
      inline def setShowOutOfTreeNull: Self = StObject.set(x, "showOutOfTree", null)
      
      inline def setSimpleLayoutAggregate(value: String): Self = StObject.set(x, "simpleLayoutAggregate", value.asInstanceOf[js.Any])
      
      inline def setSimpleLayoutAggregateNull: Self = StObject.set(x, "simpleLayoutAggregate", null)
      
      inline def setSimpleLayoutWeight(value: String): Self = StObject.set(x, "simpleLayoutWeight", value.asInstanceOf[js.Any])
      
      inline def setSimpleLayoutWeightNull: Self = StObject.set(x, "simpleLayoutWeight", null)
      
      inline def setTotalAggregate(value: String): Self = StObject.set(x, "totalAggregate", value.asInstanceOf[js.Any])
      
      inline def setTotalAggregateNull: Self = StObject.set(x, "totalAggregate", null)
      
      inline def setTotalWeightColumn(value: String): Self = StObject.set(x, "totalWeightColumn", value.asInstanceOf[js.Any])
      
      inline def setTotalWeightColumnNull: Self = StObject.set(x, "totalWeightColumn", null)
      
      inline def setUseToGroup(value: Boolean): Self = StObject.set(x, "useToGroup", value.asInstanceOf[js.Any])
      
      inline def setUseToGroupNull: Self = StObject.set(x, "useToGroup", null)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
    }
  }
}
