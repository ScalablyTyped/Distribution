package typings.oracleOraclejet.ojnboxMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.CellDefaults
import typings.oracleOraclejet.anon.HighlightedCount
import typings.oracleOraclejet.anon.`15`
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
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
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojnbox.ojNBoxSettableProperties<K, D>> */
@js.native
trait ojNBoxSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var animationOnDataChange: js.UndefOr[auto | none] = js.native
  var animationOnDisplay: js.UndefOr[auto | none] = js.native
  var as: js.UndefOr[String] = js.native
  var cellContent: js.UndefOr[counts | auto] = js.native
  var cellMaximize: js.UndefOr[off | on] = js.native
  var cells: js.UndefOr[js.Array[Cell] | js.Promise[js.Array[Cell]] | Null] = js.native
  var columns: js.UndefOr[js.Array[Column] | js.Promise[js.Array[Column]] | Null] = js.native
  var columnsTitle: js.UndefOr[String] = js.native
  var countLabel: js.UndefOr[js.Function1[/* context */ CountLabelContext, String | Null]] = js.native
  var data: js.UndefOr[(DataProvider[K, D]) | Null] = js.native
  var groupAttributes: js.UndefOr[
    color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape
  ] = js.native
  var groupBehavior: js.UndefOr[acrossCells | none | withinCell] = js.native
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.native
  var highlightMatch: js.UndefOr[any | all] = js.native
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.native
  var hoverBehavior: js.UndefOr[dim | none] = js.native
  var labelTruncation: js.UndefOr[ifRequired | on] = js.native
  var maximizedColumn: js.UndefOr[String] = js.native
  var maximizedRow: js.UndefOr[String] = js.native
  var otherColor: js.UndefOr[String] = js.native
  var otherThreshold: js.UndefOr[Double] = js.native
  var rows: js.UndefOr[js.Array[Row] | js.Promise[js.Array[Row]] | Null] = js.native
  var rowsTitle: js.UndefOr[String] = js.native
  var selection: js.UndefOr[js.Array[K]] = js.native
  var selectionMode: js.UndefOr[none | single | multiple] = js.native
  var styleDefaults: js.UndefOr[CellDefaults] = js.native
  var tooltip: js.UndefOr[`15`[K]] = js.native
  var touchResponse: js.UndefOr[touchStart | auto] = js.native
  var trackResize: js.UndefOr[on | off] = js.native
  var translations: js.UndefOr[HighlightedCount] = js.native
}

object ojNBoxSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](): ojNBoxSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojNBoxSettablePropertiesLenient[K, D]]
  }
  @scala.inline
  implicit class ojNBoxSettablePropertiesLenientOps[Self <: ojNBoxSettablePropertiesLenient[_, _], K, D] (val x: Self with (ojNBoxSettablePropertiesLenient[K, D])) extends AnyVal {
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
    def deleteAnimationOnDataChange: Self = this.set("animationOnDataChange", js.undefined)
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = this.set("animationOnDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOnDisplay: Self = this.set("animationOnDisplay", js.undefined)
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setCellContent(value: counts | auto): Self = this.set("cellContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellContent: Self = this.set("cellContent", js.undefined)
    @scala.inline
    def setCellMaximize(value: off | on): Self = this.set("cellMaximize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellMaximize: Self = this.set("cellMaximize", js.undefined)
    @scala.inline
    def setCellsVarargs(value: Cell*): Self = this.set("cells", js.Array(value :_*))
    @scala.inline
    def setCells(value: js.Array[Cell] | js.Promise[js.Array[Cell]]): Self = this.set("cells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
    @scala.inline
    def setCellsNull: Self = this.set("cells", null)
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Column] | js.Promise[js.Array[Column]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setColumnsNull: Self = this.set("columns", null)
    @scala.inline
    def setColumnsTitle(value: String): Self = this.set("columnsTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnsTitle: Self = this.set("columnsTitle", js.undefined)
    @scala.inline
    def setCountLabel(value: /* context */ CountLabelContext => String | Null): Self = this.set("countLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCountLabel: Self = this.set("countLabel", js.undefined)
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    @scala.inline
    def setGroupAttributes(value: color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape): Self = this.set("groupAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupAttributes: Self = this.set("groupAttributes", js.undefined)
    @scala.inline
    def setGroupBehavior(value: acrossCells | none | withinCell): Self = this.set("groupBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupBehavior: Self = this.set("groupBehavior", js.undefined)
    @scala.inline
    def setHiddenCategoriesVarargs(value: String*): Self = this.set("hiddenCategories", js.Array(value :_*))
    @scala.inline
    def setHiddenCategories(value: js.Array[String]): Self = this.set("hiddenCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenCategories: Self = this.set("hiddenCategories", js.undefined)
    @scala.inline
    def setHighlightMatch(value: any | all): Self = this.set("highlightMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightMatch: Self = this.set("highlightMatch", js.undefined)
    @scala.inline
    def setHighlightedCategoriesVarargs(value: String*): Self = this.set("highlightedCategories", js.Array(value :_*))
    @scala.inline
    def setHighlightedCategories(value: js.Array[String]): Self = this.set("highlightedCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightedCategories: Self = this.set("highlightedCategories", js.undefined)
    @scala.inline
    def setHoverBehavior(value: dim | none): Self = this.set("hoverBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverBehavior: Self = this.set("hoverBehavior", js.undefined)
    @scala.inline
    def setLabelTruncation(value: ifRequired | on): Self = this.set("labelTruncation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelTruncation: Self = this.set("labelTruncation", js.undefined)
    @scala.inline
    def setMaximizedColumn(value: String): Self = this.set("maximizedColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximizedColumn: Self = this.set("maximizedColumn", js.undefined)
    @scala.inline
    def setMaximizedRow(value: String): Self = this.set("maximizedRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximizedRow: Self = this.set("maximizedRow", js.undefined)
    @scala.inline
    def setOtherColor(value: String): Self = this.set("otherColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherColor: Self = this.set("otherColor", js.undefined)
    @scala.inline
    def setOtherThreshold(value: Double): Self = this.set("otherThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherThreshold: Self = this.set("otherThreshold", js.undefined)
    @scala.inline
    def setRowsVarargs(value: Row*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[Row] | js.Promise[js.Array[Row]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setRowsNull: Self = this.set("rows", null)
    @scala.inline
    def setRowsTitle(value: String): Self = this.set("rowsTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowsTitle: Self = this.set("rowsTitle", js.undefined)
    @scala.inline
    def setSelectionVarargs(value: K*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[K]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setSelectionMode(value: none | single | multiple): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setStyleDefaults(value: CellDefaults): Self = this.set("styleDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleDefaults: Self = this.set("styleDefaults", js.undefined)
    @scala.inline
    def setTooltip(value: `15`[K]): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTouchResponse(value: touchStart | auto): Self = this.set("touchResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchResponse: Self = this.set("touchResponse", js.undefined)
    @scala.inline
    def setTrackResize(value: on | off): Self = this.set("trackResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackResize: Self = this.set("trackResize", js.undefined)
    @scala.inline
    def setTranslations(value: HighlightedCount): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}

