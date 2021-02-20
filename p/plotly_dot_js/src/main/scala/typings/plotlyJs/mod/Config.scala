package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialEdits
import typings.plotlyJs.anon.Partialfilenamestringscal
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsNumbers.`0`
import typings.plotlyJs.plotlyJsNumbers.`1`
import typings.plotlyJs.plotlyJsNumbers.`2`
import typings.plotlyJs.plotlyJsStrings.autosize
import typings.plotlyJs.plotlyJsStrings.hover
import typings.plotlyJs.plotlyJsStrings.opaque
import typings.plotlyJs.plotlyJsStrings.reset
import typings.plotlyJs.plotlyJsStrings.resetPlussignautosize
import typings.plotlyJs.plotlyJsStrings.transparent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends StObject {
  
  /** DO autosize once regardless of layout.autosize (use default width or height values otherwise) */
  var autosizable: Boolean = js.native
  
  /** display the mode bar (true, false, or 'hover') */
  var displayModeBar: hover | Boolean = js.native
  
  /** add the plotly logo on the end of the mode bar */
  var displaylogo: Boolean = js.native
  
  /** double click interaction (false, 'reset', 'autosize' or 'reset+autosize') */
  var doubleClick: resetPlussignautosize | reset | autosize | `false` = js.native
  
  /** we can edit titles, move annotations, etc */
  var editable: Boolean = js.native
  
  var edits: PartialEdits = js.native
  
  /** if we DO autosize, do we fill the container or the screen? */
  var fillFrame: Boolean = js.native
  
  /** if we DO autosize, set the frame margins in percents of plot size */
  var frameMargins: Double = js.native
  
  /** Set global transform to be applied to all traces with no specification needed */
  var globalTransforms: js.Array[_] = js.native
  
  /** text appearing in the sendData link */
  var linkText: String = js.native
  
  /** Which localization should we use? Should be a string like 'en' or 'en-US' */
  var locale: String = js.native
  
  /**
    * Turn all console logging on or off (errors will be thrown)
    * This should ONLY be set via Plotly.setPlotConfig
    */
  var logging: Boolean | `0` | `1` | `2` = js.native
  
  /**
    * Mapbox access token (required to plot mapbox trace types)
    * If using an Mapbox Atlas server, set this option to '',
    * so that plotly.js won't attempt to authenticate to the public Mapbox server.
    */
  var mapboxAccessToken: String = js.native
  
  /**
    * fully custom mode bar buttons as nested array, where the outer
    * arrays represents button groups, and the inner arrays have
    * buttons config objects or names of default buttons
    * (see ./components/modebar/buttons.js for more info)
    */
  var modeBarButtons: (js.Array[js.Array[ModeBarButton | ModeBarDefaultButtons]]) | `false` = js.native
  
  /** add mode bar button using config objects (see ./components/modebar/buttons.js for list of arguments) */
  var modeBarButtonsToAdd: js.Array[ModeBarButton | ModeBarDefaultButtons] = js.native
  
  /** remove mode bar button by name (see ./components/modebar/buttons.js for the list of names) */
  var modeBarButtonsToRemove: js.Array[ModeBarDefaultButtons] = js.native
  
  /** increase the pixel ratio for Gl plot images */
  var plotGlPixelRatio: Double = js.native
  
  /**
    * When set it determines base URL for the 'Edit in Chart Studio' `showEditInChartStudio`/`showSendToCloud` mode bar button and the showLink/sendData on-graph link.
    * To enable sending your data to Chart Studio Cloud, you need to set both `plotlyServerURL` to 'https://chart-studio.plotly.com' and also set `showSendToCloud` to true.
    * @default ''
    */
  var plotlyServerURL: String = js.native
  
  /** set the length of the undo/redo queue */
  var queueLength: Double = js.native
  
  /** Make the chart responsive to window size */
  var responsive: Boolean = js.native
  
  /** mousewheel or two-finger scroll zooms the plot */
  var scrollZoom: Boolean = js.native
  
  /** if we show a link, does it contain data or just link to a plotly file? */
  var sendData: Boolean = js.native
  
  /**
    * function to add the background color to a different container
    * or 'opaque' to ensure there's white behind it
    */
  def setBackground(): String | opaque | transparent = js.native
  
  /** enable axis pan/zoom drag handles */
  var showAxisDragHandles: Boolean = js.native
  
  /** enable direct range entry at the pan/zoom drag points (drag handles must be enabled above) */
  var showAxisRangeEntryBoxes: Boolean = js.native
  
  /**
    * Same as `showSendToCloud`, but use a pencil icon instead of a floppy-disk.
    * Note that if both `showSendToCloud` and `showEditInChartStudio` are turned, only `showEditInChartStudio` will be honored.
    * @default false
    */
  var showEditInChartStudio: Boolean = js.native
  
  /** link to open this plot in plotly */
  var showLink: Boolean = js.native
  
  /**
    * Should we include a ModeBar button, labeled "Edit in Chart Studio",
    * that sends this chart to chart-studio.plotly.com (formerly plot.ly)
    * or another plotly server as specified by `plotlyServerURL` for editing, export, etc?
    * Prior to version 1.43.0 this button was included by default, now it is opt-in using this flag.
    * Note that this button can (depending on `plotlyServerURL` being set) send your data to an external server.
    * However that server does not persist your data until you arrive at the Chart Studio and explicitly click "Save".
    * @default false
    */
  var showSendToCloud: Boolean = js.native
  
  /** false or function adding source(s) to linkText <text> */
  var showSources: Boolean = js.native
  
  /** new users see some hints about interactivity */
  var showTips: Boolean = js.native
  
  /** no interactivity, for export or image generation */
  var staticPlot: Boolean = js.native
  
  /** override the defaults for the toImageButton */
  var toImageButtonOptions: Partialfilenamestringscal = js.native
  
  /** URL to topojson files used in geo charts */
  var topojsonURL: String = js.native
}
object Config {
  
  @scala.inline
  def apply(
    autosizable: Boolean,
    displayModeBar: hover | Boolean,
    displaylogo: Boolean,
    doubleClick: resetPlussignautosize | reset | autosize | `false`,
    editable: Boolean,
    edits: PartialEdits,
    fillFrame: Boolean,
    frameMargins: Double,
    globalTransforms: js.Array[_],
    linkText: String,
    locale: String,
    logging: Boolean | `0` | `1` | `2`,
    mapboxAccessToken: String,
    modeBarButtons: (js.Array[js.Array[ModeBarButton | ModeBarDefaultButtons]]) | `false`,
    modeBarButtonsToAdd: js.Array[ModeBarButton | ModeBarDefaultButtons],
    modeBarButtonsToRemove: js.Array[ModeBarDefaultButtons],
    plotGlPixelRatio: Double,
    plotlyServerURL: String,
    queueLength: Double,
    responsive: Boolean,
    scrollZoom: Boolean,
    sendData: Boolean,
    setBackground: () => String | opaque | transparent,
    showAxisDragHandles: Boolean,
    showAxisRangeEntryBoxes: Boolean,
    showEditInChartStudio: Boolean,
    showLink: Boolean,
    showSendToCloud: Boolean,
    showSources: Boolean,
    showTips: Boolean,
    staticPlot: Boolean,
    toImageButtonOptions: Partialfilenamestringscal,
    topojsonURL: String
  ): Config = {
    val __obj = js.Dynamic.literal(autosizable = autosizable.asInstanceOf[js.Any], displayModeBar = displayModeBar.asInstanceOf[js.Any], displaylogo = displaylogo.asInstanceOf[js.Any], doubleClick = doubleClick.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], edits = edits.asInstanceOf[js.Any], fillFrame = fillFrame.asInstanceOf[js.Any], frameMargins = frameMargins.asInstanceOf[js.Any], globalTransforms = globalTransforms.asInstanceOf[js.Any], linkText = linkText.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], mapboxAccessToken = mapboxAccessToken.asInstanceOf[js.Any], modeBarButtons = modeBarButtons.asInstanceOf[js.Any], modeBarButtonsToAdd = modeBarButtonsToAdd.asInstanceOf[js.Any], modeBarButtonsToRemove = modeBarButtonsToRemove.asInstanceOf[js.Any], plotGlPixelRatio = plotGlPixelRatio.asInstanceOf[js.Any], plotlyServerURL = plotlyServerURL.asInstanceOf[js.Any], queueLength = queueLength.asInstanceOf[js.Any], responsive = responsive.asInstanceOf[js.Any], scrollZoom = scrollZoom.asInstanceOf[js.Any], sendData = sendData.asInstanceOf[js.Any], setBackground = js.Any.fromFunction0(setBackground), showAxisDragHandles = showAxisDragHandles.asInstanceOf[js.Any], showAxisRangeEntryBoxes = showAxisRangeEntryBoxes.asInstanceOf[js.Any], showEditInChartStudio = showEditInChartStudio.asInstanceOf[js.Any], showLink = showLink.asInstanceOf[js.Any], showSendToCloud = showSendToCloud.asInstanceOf[js.Any], showSources = showSources.asInstanceOf[js.Any], showTips = showTips.asInstanceOf[js.Any], staticPlot = staticPlot.asInstanceOf[js.Any], toImageButtonOptions = toImageButtonOptions.asInstanceOf[js.Any], topojsonURL = topojsonURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutosizable(value: Boolean): Self = StObject.set(x, "autosizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayModeBar(value: hover | Boolean): Self = StObject.set(x, "displayModeBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplaylogo(value: Boolean): Self = StObject.set(x, "displaylogo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleClick(value: resetPlussignautosize | reset | autosize | `false`): Self = StObject.set(x, "doubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdits(value: PartialEdits): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillFrame(value: Boolean): Self = StObject.set(x, "fillFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameMargins(value: Double): Self = StObject.set(x, "frameMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTransforms(value: js.Array[_]): Self = StObject.set(x, "globalTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTransformsVarargs(value: js.Any*): Self = StObject.set(x, "globalTransforms", js.Array(value :_*))
    
    @scala.inline
    def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogging(value: Boolean | `0` | `1` | `2`): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapboxAccessToken(value: String): Self = StObject.set(x, "mapboxAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeBarButtons(value: (js.Array[js.Array[ModeBarButton | ModeBarDefaultButtons]]) | `false`): Self = StObject.set(x, "modeBarButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeBarButtonsToAdd(value: js.Array[ModeBarButton | ModeBarDefaultButtons]): Self = StObject.set(x, "modeBarButtonsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeBarButtonsToAddVarargs(value: (ModeBarButton | ModeBarDefaultButtons)*): Self = StObject.set(x, "modeBarButtonsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setModeBarButtonsToRemove(value: js.Array[ModeBarDefaultButtons]): Self = StObject.set(x, "modeBarButtonsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeBarButtonsToRemoveVarargs(value: ModeBarDefaultButtons*): Self = StObject.set(x, "modeBarButtonsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setModeBarButtonsVarargs(value: (js.Array[ModeBarButton | ModeBarDefaultButtons])*): Self = StObject.set(x, "modeBarButtons", js.Array(value :_*))
    
    @scala.inline
    def setPlotGlPixelRatio(value: Double): Self = StObject.set(x, "plotGlPixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotlyServerURL(value: String): Self = StObject.set(x, "plotlyServerURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueLength(value: Double): Self = StObject.set(x, "queueLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollZoom(value: Boolean): Self = StObject.set(x, "scrollZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendData(value: Boolean): Self = StObject.set(x, "sendData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetBackground(value: () => String | opaque | transparent): Self = StObject.set(x, "setBackground", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowAxisDragHandles(value: Boolean): Self = StObject.set(x, "showAxisDragHandles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAxisRangeEntryBoxes(value: Boolean): Self = StObject.set(x, "showAxisRangeEntryBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEditInChartStudio(value: Boolean): Self = StObject.set(x, "showEditInChartStudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLink(value: Boolean): Self = StObject.set(x, "showLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSendToCloud(value: Boolean): Self = StObject.set(x, "showSendToCloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSources(value: Boolean): Self = StObject.set(x, "showSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTips(value: Boolean): Self = StObject.set(x, "showTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticPlot(value: Boolean): Self = StObject.set(x, "staticPlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToImageButtonOptions(value: Partialfilenamestringscal): Self = StObject.set(x, "toImageButtonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopojsonURL(value: String): Self = StObject.set(x, "topojsonURL", value.asInstanceOf[js.Any])
  }
}
