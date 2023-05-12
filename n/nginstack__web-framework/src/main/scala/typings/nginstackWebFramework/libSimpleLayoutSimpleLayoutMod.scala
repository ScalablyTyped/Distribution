package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.ALL
import typings.nginstackWebFramework.anon.ContentToAccumulate
import typings.nginstackWebFramework.anon.Group
import typings.nginstackWebFramework.anon.Id
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSimpleLayoutSimpleLayoutMod {
  
  inline def apply(responseObject: Any, skinScriptKeyOrUrl: String): Unit = (^.asInstanceOf[js.Dynamic].apply(responseObject.asInstanceOf[js.Any], skinScriptKeyOrUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(responseObject: Any, skinScriptKeyOrUrl: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(responseObject.asInstanceOf[js.Any], skinScriptKeyOrUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/simple-layout/SimpleLayout", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SimpleLayout {
    def this(responseObject: Any, skinScriptKeyOrUrl: String) = this()
    def this(responseObject: Any, skinScriptKeyOrUrl: Double) = this()
  }
  @JSImport("@nginstack/web-framework/lib/simple-layout/SimpleLayout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/simple-layout/SimpleLayout", "LAYOUT_COUNT")
  @js.native
  def LAYOUT_COUNT: Double = js.native
  inline def LAYOUT_COUNT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYOUT_COUNT")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/web-framework/lib/simple-layout/SimpleLayout", "columnsTotalByGroupId")
  @js.native
  def columnsTotalByGroupId: Any = js.native
  inline def columnsTotalByGroupId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("columnsTotalByGroupId")(x.asInstanceOf[js.Any])
  
  type Event = typings.nginstackEngine.libEventEventMod.^
  
  type Grid = typings.nginstackWebFramework.libGridGridMod.^
  
  @js.native
  trait SimpleLayout extends StObject {
    
    /* private */ var MAX_FILTER_VALUE_ : Any = js.native
    
    /* private */ var _addGroupField: Any = js.native
    
    /* private */ var _fillResultSet: Any = js.native
    
    /* private */ var _formatCustomColumnPaddingCss: Any = js.native
    
    /* private */ var _formatCustomFontSizeCss: Any = js.native
    
    /* private */ var _groupsToResultSet: Any = js.native
    
    /* private */ var _layoutId: Any = js.native
    
    /* private */ var _prepareExport: Any = js.native
    
    /* private */ var _prepareImgTagsToSendEmail: Any = js.native
    
    /* private */ var accumulator: Any = js.native
    
    /* private */ var arAccumulators: Any = js.native
    
    /* private */ var arColumns: Any = js.native
    
    /* private */ var arData: Any = js.native
    
    /* private */ var arGroups: Any = js.native
    
    /* private */ var arRowData: Any = js.native
    
    var autoSanitize: Boolean = js.native
    
    /* private */ var autoSanitize_ : Any = js.native
    
    /* private */ var availableWidth: Any = js.native
    
    var baseFontSize: String = js.native
    
    /* private */ var bottomMargin: Any = js.native
    
    def breakPage(): Unit = js.native
    
    /* private */ var buffer_ : Any = js.native
    
    /* private */ var buffering: Any = js.native
    
    var buttonWidth: Double = js.native
    
    /* private */ var calculatedWidth: Any = js.native
    
    /* private */ var clearColumnsAccumulatorsAndLastContent: Any = js.native
    
    def close(): Unit = js.native
    
    /* private */ var collapsed: Any = js.native
    
    /* private */ var collapsedRows: Any = js.native
    
    /* private */ var colsAuto: Any = js.native
    
    def column(name: String): typings.nginstackWebFramework.libSimpleLayoutColumnMod.^ = js.native
    def column(name: String, options: Any): typings.nginstackWebFramework.libSimpleLayoutColumnMod.^ = js.native
    
    var columnPadding: String = js.native
    
    var columns: typings.nginstackEngine.libStringStringListMod.^ = js.native
    
    /* private */ var columnsTotalByGroupId: Any = js.native
    
    /* private */ var columnsWithMerge_ : Any = js.native
    
    /* private */ var countSeqColumn: Any = js.native
    
    /* private */ var cssContentForEmail_ : Any = js.native
    
    /* private */ var cssExtractor_ : Any = js.native
    
    /* private */ var currentGroupCount: Any = js.native
    
    /* private */ var currentGroupCountBeforeDynamicFields_ : Any = js.native
    
    /* private */ var currentGroupId: Any = js.native
    
    /* private */ var currentGroupIndex: Any = js.native
    
    /* private */ var currentNodeId: Any = js.native
    
    /* private */ var currentPage: Any = js.native
    
    /* private */ var currentParentNodeId: Any = js.native
    
    var dataExporter: Any = js.native
    
    /* private */ var defaultOnCss: Any = js.native
    
    /* private */ var defaultOnFooter: Any = js.native
    
    /* private */ var defaultOnHeader: Any = js.native
    
    /* private */ var emptyDataSet: Any = js.native
    
    def end(): Unit = js.native
    def end(totalLabel: Any): Unit = js.native
    def end(totalLabel: Any, messageWhenEmpty: Any): Unit = js.native
    def end(totalLabel: Any, messageWhenEmpty: Any, resetColumns: Any): Unit = js.native
    def end(totalLabel: Any, messageWhenEmpty: Unit, resetColumns: Any): Unit = js.native
    def end(totalLabel: Unit, messageWhenEmpty: Any): Unit = js.native
    def end(totalLabel: Unit, messageWhenEmpty: Any, resetColumns: Any): Unit = js.native
    def end(totalLabel: Unit, messageWhenEmpty: Unit, resetColumns: Any): Unit = js.native
    
    /* private */ var endPage: Any = js.native
    
    /* private */ var endRecord: Any = js.native
    
    var enterpriseLogo: Double = js.native
    
    var enterpriseName: Any = js.native
    
    var filters: js.Array[Group] = js.native
    
    var filtersDisplay: ALL = js.native
    
    /* private */ var firstLineToFooter: Any = js.native
    
    /* private */ var firstRecord: Any = js.native
    
    var footer: typings.nginstackWebFramework.libSimpleLayoutFooterMod.^ = js.native
    
    var footerComplement: String | Null = js.native
    
    var footerImage: Double | Null = js.native
    
    /* private */ var formatClassAttr_ : Any = js.native
    
    /* private */ var formatFiltersToHeader_ : Any = js.native
    
    def formatImageTag(uri: String): String = js.native
    def formatImageTag(uri: String, opt_options: Id): String = js.native
    def formatImageTag(uri: Double): String = js.native
    def formatImageTag(uri: Double, opt_options: Id): String = js.native
    
    /* private */ var getCurrentColumnToWrite_ : Any = js.native
    
    /* private */ var getEmailObject: Any = js.native
    
    def group(name: String, link: typings.nginstackWebFramework.libAnchorLinkMod.^, displayFormat: String): Any = js.native
    
    var groupColors: js.Array[Any] = js.native
    
    var groupExpansionLevel: Double = js.native
    
    var groups: typings.nginstackEngine.libStringStringListMod.^ = js.native
    
    /* private */ var hasRemainContent: Any = js.native
    
    var header: typings.nginstackWebFramework.libSimpleLayoutHeaderMod.^ = js.native
    
    var headerComplement: String | Null = js.native
    
    /* private */ var height: Any = js.native
    
    /* private */ var indexColumn: Any = js.native
    
    /* private */ var initializationChars: Any = js.native
    
    /* private */ var internalNewRecord: Any = js.native
    
    /* private */ var internalWriteColumn: Any = js.native
    
    /* private */ var isTreeLayout: Any = js.native
    
    /* private */ var lastColumnsBuffer: Any = js.native
    
    /* private */ var lastGroupLength_ : Any = js.native
    
    /* private */ var layoutTxtGrid: Any = js.native
    
    /* private */ var layoutTxtWidth: Any = js.native
    
    /* private */ var leftMargin: Any = js.native
    
    /* private */ var lineBlack: Any = js.native
    
    var lineCount: Any = js.native
    
    var logoInteq: Double = js.native
    
    /* private */ var mailMessage_ : Any = js.native
    
    /* private */ var mergeDuplicated_ : Any = js.native
    
    /* private */ var mustHaveBuffer_ : Any = js.native
    
    var mustIncludeCssFiles: Boolean = js.native
    
    var negativeInRed: Boolean = js.native
    
    /* private */ var newLine: Any = js.native
    
    def newRecord(
      opt_checkGroup: js.UndefOr[js.Array[Any]],
      opt_groupTotalLabel: js.UndefOr[js.Array[Any]],
      opt_showLineTop: js.UndefOr[Boolean],
      opt_showLineBottom: js.UndefOr[Boolean],
      opt_treeNodeId: js.UndefOr[Double],
      opt_parentTreeNodeId: js.UndefOr[Double],
      opt_patterns: js.UndefOr[js.Array[String]]
    ): Boolean | Unit = js.native
    
    def newTreeRecord(treeNodeId: Double, parentTreeNodeId: Double): Unit = js.native
    def newTreeRecord(treeNodeId: Double, parentTreeNodeId: Double, opt_collapsed: Boolean): Unit = js.native
    
    /* private */ var nextColumnWithTotalContent: Any = js.native
    
    var onCss: Event = js.native
    
    var onFooter: Event = js.native
    
    var onHeader: Event = js.native
    
    var path: String = js.native
    
    /* private */ var prepareWriteFromBuffer: Any = js.native
    
    var printFontSize: String = js.native
    
    var process: Any = js.native
    
    var recordColors: js.Array[Any] = js.native
    
    /* private */ var recordCount: Any = js.native
    
    def reset(resetColumnsAndGroups: Boolean): Unit = js.native
    
    /* private */ var resetTreeInfo: Any = js.native
    
    /* private */ var resizeGroups: Any = js.native
    
    var responseObject: Any = js.native
    
    var resultSet: typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* private */ var rightMargin: Any = js.native
    
    /* private */ var setColumnHeader: Any = js.native
    
    /* private */ var setupLayoutTxt: Any = js.native
    
    var showDateTime: Boolean = js.native
    
    var showEnterpriseName: Boolean = js.native
    
    var showFooter: Boolean = js.native
    
    var showHeader: Boolean = js.native
    
    var showHeaderAlwaysOnTop: Boolean = js.native
    
    /* private */ var showLineBottom: Any = js.native
    
    /* private */ var showLineTop: Any = js.native
    
    var showOnlyFilledVariables: Boolean = js.native
    
    var showPath: Boolean = js.native
    
    var showTreeRoot: Boolean = js.native
    
    var showUserAndDataBaseName: Boolean = js.native
    
    var showVariables: Boolean = js.native
    
    /* private */ var start: Any = js.native
    
    /* private */ var startOrEndGroup: Any = js.native
    
    /* private */ var startPage: Any = js.native
    
    /* private */ var started: Any = js.native
    
    def stats(): SimpleLayoutStats = js.native
    
    /* private */ var textPrinterDriver: Any = js.native
    
    var title: String = js.native
    
    /* private */ var topMargin: Any = js.native
    
    /* private */ var totalLabel: Any = js.native
    
    /* private */ var totalWasWritten_ : Any = js.native
    
    /* private */ var treeBegin: Any = js.native
    
    /* private */ var treeColumnIndex_ : Any = js.native
    
    /* private */ var treeEnd: Any = js.native
    
    var treeExpansionLevel: Double = js.native
    
    /* private */ var treeNewRecord: Any = js.native
    
    var treeRecordCount: Double = js.native
    
    var treeStarted: Boolean = js.native
    
    /* private */ var treeWriteColumn: Any = js.native
    
    /* private */ var treeWriteLink: Any = js.native
    
    /* private */ var treeWriteRow: Any = js.native
    
    /* private */ var unloadBuffer: Any = js.native
    
    /* private */ var unloadingBuffer: Any = js.native
    
    var variableGrid: Grid = js.native
    
    var width: String = js.native
    
    /* private */ var withTotal: Any = js.native
    
    def write(content: String): Unit = js.native
    def write(content: String, opt_newLine: Boolean): Unit = js.native
    
    def writeColumn(content: String, opt_options: Unit, args: Any*): Unit = js.native
    def writeColumn(content: String, opt_options: ContentToAccumulate, args: Any*): Unit = js.native
    def writeColumn(content: js.Date, opt_options: Unit, args: Any*): Unit = js.native
    def writeColumn(content: js.Date, opt_options: ContentToAccumulate, args: Any*): Unit = js.native
    def writeColumn(content: Double, opt_options: Unit, args: Any*): Unit = js.native
    def writeColumn(content: Double, opt_options: ContentToAccumulate, args: Any*): Unit = js.native
    
    /* private */ var writeColumnsHeader: Any = js.native
    
    def writeImage(uri: String): Unit = js.native
    def writeImage(uri: String, opt_options: Double): Unit = js.native
    def writeImage(uri: String, opt_options: Record[Any, Any]): Unit = js.native
    def writeImage(uri: Double): Unit = js.native
    def writeImage(uri: Double, opt_options: Double): Unit = js.native
    def writeImage(uri: Double, opt_options: Record[Any, Any]): Unit = js.native
    
    def writeLink(
      content: String | Double | js.Date,
      opt_linkParameters: js.UndefOr[js.Array[Any]],
      opt_contentToAccumulate: js.UndefOr[Double],
      opt_css: js.UndefOr[String],
      opt_showLineTop: js.UndefOr[Boolean],
      opt_showLineBottom: js.UndefOr[Boolean],
      opt_convertToHtmlString: js.UndefOr[Boolean]
    ): Unit = js.native
    
    var writingEmail: Boolean = js.native
  }
  
  trait SimpleLayoutStats extends StObject {
    
    var bufferLength: Any
  }
  object SimpleLayoutStats {
    
    inline def apply(bufferLength: Any): SimpleLayoutStats = {
      val __obj = js.Dynamic.literal(bufferLength = bufferLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleLayoutStats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleLayoutStats] (val x: Self) extends AnyVal {
      
      inline def setBufferLength(value: Any): Self = StObject.set(x, "bufferLength", value.asInstanceOf[js.Any])
    }
  }
}
