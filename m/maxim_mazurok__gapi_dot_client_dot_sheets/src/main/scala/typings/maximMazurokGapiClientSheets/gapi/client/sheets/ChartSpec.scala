package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSpec extends StObject {
  
  /** The alternative text that describes the chart. This is often used for accessibility. */
  var altText: js.UndefOr[String] = js.native
  
  /** The background color of the entire chart. Not applicable to Org charts. */
  var backgroundColor: js.UndefOr[Color] = js.native
  
  /** The background color of the entire chart. Not applicable to Org charts. If background_color is also set, this field takes precedence. */
  var backgroundColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** A basic chart specification, can be one of many kinds of charts. See BasicChartType for the list of all charts this supports. */
  var basicChart: js.UndefOr[BasicChartSpec] = js.native
  
  /** A bubble chart specification. */
  var bubbleChart: js.UndefOr[BubbleChartSpec] = js.native
  
  /** A candlestick chart specification. */
  var candlestickChart: js.UndefOr[CandlestickChartSpec] = js.native
  
  /** If present, the field contains data source chart specific properties. */
  var dataSourceChartProperties: js.UndefOr[DataSourceChartProperties] = js.native
  
  /** The filters applied to the source data of the chart. Only supported for data source charts. */
  var filterSpecs: js.UndefOr[js.Array[FilterSpec]] = js.native
  
  /** The name of the font to use by default for all chart text (e.g. title, axis labels, legend). If a font is specified for a specific part of the chart it will override this font name. */
  var fontName: js.UndefOr[String] = js.native
  
  /** Determines how the charts will use hidden rows or columns. */
  var hiddenDimensionStrategy: js.UndefOr[String] = js.native
  
  /** A histogram chart specification. */
  var histogramChart: js.UndefOr[HistogramChartSpec] = js.native
  
  /** True to make a chart fill the entire space in which it's rendered with minimum padding. False to use the default padding. (Not applicable to Geo and Org charts.) */
  var maximized: js.UndefOr[Boolean] = js.native
  
  /** An org chart specification. */
  var orgChart: js.UndefOr[OrgChartSpec] = js.native
  
  /** A pie chart specification. */
  var pieChart: js.UndefOr[PieChartSpec] = js.native
  
  /** A scorecard chart specification. */
  var scorecardChart: js.UndefOr[ScorecardChartSpec] = js.native
  
  /** The order to sort the chart data by. Only a single sort spec is supported. Only supported for data source charts. */
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.native
  
  /** The subtitle of the chart. */
  var subtitle: js.UndefOr[String] = js.native
  
  /** The subtitle text format. Strikethrough and underline are not supported. */
  var subtitleTextFormat: js.UndefOr[TextFormat] = js.native
  
  /** The subtitle text position. This field is optional. */
  var subtitleTextPosition: js.UndefOr[TextPosition] = js.native
  
  /** The title of the chart. */
  var title: js.UndefOr[String] = js.native
  
  /** The title text format. Strikethrough and underline are not supported. */
  var titleTextFormat: js.UndefOr[TextFormat] = js.native
  
  /** The title text position. This field is optional. */
  var titleTextPosition: js.UndefOr[TextPosition] = js.native
  
  /** A treemap chart specification. */
  var treemapChart: js.UndefOr[TreemapChartSpec] = js.native
  
  /** A waterfall chart specification. */
  var waterfallChart: js.UndefOr[WaterfallChartSpec] = js.native
}
object ChartSpec {
  
  @scala.inline
  def apply(): ChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSpec]
  }
  
  @scala.inline
  implicit class ChartSpecMutableBuilder[Self <: ChartSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorStyle(value: ColorStyle): Self = StObject.set(x, "backgroundColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorStyleUndefined: Self = StObject.set(x, "backgroundColorStyle", js.undefined)
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBasicChart(value: BasicChartSpec): Self = StObject.set(x, "basicChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicChartUndefined: Self = StObject.set(x, "basicChart", js.undefined)
    
    @scala.inline
    def setBubbleChart(value: BubbleChartSpec): Self = StObject.set(x, "bubbleChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleChartUndefined: Self = StObject.set(x, "bubbleChart", js.undefined)
    
    @scala.inline
    def setCandlestickChart(value: CandlestickChartSpec): Self = StObject.set(x, "candlestickChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandlestickChartUndefined: Self = StObject.set(x, "candlestickChart", js.undefined)
    
    @scala.inline
    def setDataSourceChartProperties(value: DataSourceChartProperties): Self = StObject.set(x, "dataSourceChartProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceChartPropertiesUndefined: Self = StObject.set(x, "dataSourceChartProperties", js.undefined)
    
    @scala.inline
    def setFilterSpecs(value: js.Array[FilterSpec]): Self = StObject.set(x, "filterSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSpecsUndefined: Self = StObject.set(x, "filterSpecs", js.undefined)
    
    @scala.inline
    def setFilterSpecsVarargs(value: FilterSpec*): Self = StObject.set(x, "filterSpecs", js.Array(value :_*))
    
    @scala.inline
    def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
    
    @scala.inline
    def setHiddenDimensionStrategy(value: String): Self = StObject.set(x, "hiddenDimensionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenDimensionStrategyUndefined: Self = StObject.set(x, "hiddenDimensionStrategy", js.undefined)
    
    @scala.inline
    def setHistogramChart(value: HistogramChartSpec): Self = StObject.set(x, "histogramChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistogramChartUndefined: Self = StObject.set(x, "histogramChart", js.undefined)
    
    @scala.inline
    def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximizedUndefined: Self = StObject.set(x, "maximized", js.undefined)
    
    @scala.inline
    def setOrgChart(value: OrgChartSpec): Self = StObject.set(x, "orgChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgChartUndefined: Self = StObject.set(x, "orgChart", js.undefined)
    
    @scala.inline
    def setPieChart(value: PieChartSpec): Self = StObject.set(x, "pieChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieChartUndefined: Self = StObject.set(x, "pieChart", js.undefined)
    
    @scala.inline
    def setScorecardChart(value: ScorecardChartSpec): Self = StObject.set(x, "scorecardChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScorecardChartUndefined: Self = StObject.set(x, "scorecardChart", js.undefined)
    
    @scala.inline
    def setSortSpecs(value: js.Array[SortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
    
    @scala.inline
    def setSortSpecsVarargs(value: SortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value :_*))
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleTextFormat(value: TextFormat): Self = StObject.set(x, "subtitleTextFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleTextFormatUndefined: Self = StObject.set(x, "subtitleTextFormat", js.undefined)
    
    @scala.inline
    def setSubtitleTextPosition(value: TextPosition): Self = StObject.set(x, "subtitleTextPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleTextPositionUndefined: Self = StObject.set(x, "subtitleTextPosition", js.undefined)
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextFormat(value: TextFormat): Self = StObject.set(x, "titleTextFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextFormatUndefined: Self = StObject.set(x, "titleTextFormat", js.undefined)
    
    @scala.inline
    def setTitleTextPosition(value: TextPosition): Self = StObject.set(x, "titleTextPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextPositionUndefined: Self = StObject.set(x, "titleTextPosition", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTreemapChart(value: TreemapChartSpec): Self = StObject.set(x, "treemapChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreemapChartUndefined: Self = StObject.set(x, "treemapChart", js.undefined)
    
    @scala.inline
    def setWaterfallChart(value: WaterfallChartSpec): Self = StObject.set(x, "waterfallChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaterfallChartUndefined: Self = StObject.set(x, "waterfallChart", js.undefined)
  }
}
