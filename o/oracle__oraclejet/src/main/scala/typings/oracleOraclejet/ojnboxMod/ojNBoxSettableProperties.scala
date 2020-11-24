package typings.oracleOraclejet.ojnboxMod

import typings.oracleOraclejet.anon.CellDefaults
import typings.oracleOraclejet.anon.HighlightedCount
import typings.oracleOraclejet.anon.`15`
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typings.oracleOraclejet.ojnboxMod.ojNBox.Cell
import typings.oracleOraclejet.ojnboxMod.ojNBox.Column
import typings.oracleOraclejet.ojnboxMod.ojNBox.CountLabelContext
import typings.oracleOraclejet.ojnboxMod.ojNBox.Row
import typings.oracleOraclejet.oracleOraclejetStrings.acrossCells
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.color
import typings.oracleOraclejet.oracleOraclejetStrings.counts
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.ifRequired
import typings.oracleOraclejet.oracleOraclejetStrings.indicatorColor
import typings.oracleOraclejet.oracleOraclejetStrings.indicatorIconColor
import typings.oracleOraclejet.oracleOraclejetStrings.indicatorIconPattern
import typings.oracleOraclejet.oracleOraclejetStrings.indicatorIconShape
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
import typings.oracleOraclejet.oracleOraclejetStrings.withinCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojNBoxSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  
  var animationOnDataChange: auto | none = js.native
  
  var animationOnDisplay: auto | none = js.native
  
  var as: String = js.native
  
  var cellContent: counts | auto = js.native
  
  var cellMaximize: off | on = js.native
  
  var cells: js.Array[Cell] | js.Promise[js.Array[Cell]] | Null = js.native
  
  var columns: js.Array[Column] | js.Promise[js.Array[Column]] | Null = js.native
  
  var columnsTitle: String = js.native
  
  def countLabel(context: CountLabelContext): String | Null = js.native
  
  var data: (DataProvider[K, D]) | Null = js.native
  
  var groupAttributes: color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape = js.native
  
  var groupBehavior: acrossCells | none | withinCell = js.native
  
  var hiddenCategories: js.Array[String] = js.native
  
  var highlightMatch: any | all = js.native
  
  var highlightedCategories: js.Array[String] = js.native
  
  var hoverBehavior: dim | none = js.native
  
  var labelTruncation: ifRequired | on = js.native
  
  var maximizedColumn: String = js.native
  
  var maximizedRow: String = js.native
  
  var otherColor: String = js.native
  
  var otherThreshold: Double = js.native
  
  var rows: js.Array[Row] | js.Promise[js.Array[Row]] | Null = js.native
  
  var rowsTitle: String = js.native
  
  var selection: js.Array[K] = js.native
  
  var selectionMode: none | single | multiple = js.native
  
  var styleDefaults: CellDefaults = js.native
  
  var tooltip: `15`[K] = js.native
  
  var touchResponse: touchStart | auto = js.native
  
  @JSName("translations")
  var translations_ojNBoxSettableProperties: HighlightedCount = js.native
}
object ojNBoxSettableProperties {
  
  @scala.inline
  def apply[K, D](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    as: String,
    cellContent: counts | auto,
    cellMaximize: off | on,
    columnsTitle: String,
    countLabel: CountLabelContext => String | Null,
    groupAttributes: color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape,
    groupBehavior: acrossCells | none | withinCell,
    hiddenCategories: js.Array[String],
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    labelTruncation: ifRequired | on,
    maximizedColumn: String,
    maximizedRow: String,
    otherColor: String,
    otherThreshold: Double,
    rowsTitle: String,
    selection: js.Array[K],
    selectionMode: none | single | multiple,
    styleDefaults: CellDefaults,
    tooltip: `15`[K],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: HighlightedCount
  ): ojNBoxSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], cellContent = cellContent.asInstanceOf[js.Any], cellMaximize = cellMaximize.asInstanceOf[js.Any], columnsTitle = columnsTitle.asInstanceOf[js.Any], countLabel = js.Any.fromFunction1(countLabel), groupAttributes = groupAttributes.asInstanceOf[js.Any], groupBehavior = groupBehavior.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], labelTruncation = labelTruncation.asInstanceOf[js.Any], maximizedColumn = maximizedColumn.asInstanceOf[js.Any], maximizedRow = maximizedRow.asInstanceOf[js.Any], otherColor = otherColor.asInstanceOf[js.Any], otherThreshold = otherThreshold.asInstanceOf[js.Any], rowsTitle = rowsTitle.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNBoxSettableProperties[K, D]]
  }
  
  @scala.inline
  implicit class ojNBoxSettablePropertiesOps[Self <: ojNBoxSettableProperties[_, _], K, D] (val x: Self with (ojNBoxSettableProperties[K, D])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimationOnDataChange(value: auto | none): Self = this.set("animationOnDataChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = this.set("animationOnDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellContent(value: counts | auto): Self = this.set("cellContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellMaximize(value: off | on): Self = this.set("cellMaximize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsTitle(value: String): Self = this.set("columnsTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountLabel(value: CountLabelContext => String | Null): Self = this.set("countLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupAttributes(value: color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape): Self = this.set("groupAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupBehavior(value: acrossCells | none | withinCell): Self = this.set("groupBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenCategoriesVarargs(value: String*): Self = this.set("hiddenCategories", js.Array(value :_*))
    
    @scala.inline
    def setHiddenCategories(value: js.Array[String]): Self = this.set("hiddenCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightMatch(value: any | all): Self = this.set("highlightMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedCategoriesVarargs(value: String*): Self = this.set("highlightedCategories", js.Array(value :_*))
    
    @scala.inline
    def setHighlightedCategories(value: js.Array[String]): Self = this.set("highlightedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBehavior(value: dim | none): Self = this.set("hoverBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelTruncation(value: ifRequired | on): Self = this.set("labelTruncation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximizedColumn(value: String): Self = this.set("maximizedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximizedRow(value: String): Self = this.set("maximizedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherColor(value: String): Self = this.set("otherColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherThreshold(value: Double): Self = this.set("otherThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsTitle(value: String): Self = this.set("rowsTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionVarargs(value: K*): Self = this.set("selection", js.Array(value :_*))
    
    @scala.inline
    def setSelection(value: js.Array[K]): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: none | single | multiple): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleDefaults(value: CellDefaults): Self = this.set("styleDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: `15`[K]): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchResponse(value: touchStart | auto): Self = this.set("touchResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: HighlightedCount): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsVarargs(value: Cell*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[Cell] | js.Promise[js.Array[Cell]]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsNull: Self = this.set("cells", null)
    
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[Column] | js.Promise[js.Array[Column]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsNull: Self = this.set("columns", null)
    
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    
    @scala.inline
    def setRowsVarargs(value: Row*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[Row] | js.Promise[js.Array[Row]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsNull: Self = this.set("rows", null)
  }
}
