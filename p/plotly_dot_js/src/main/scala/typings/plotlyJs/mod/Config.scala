package typings.plotlyJs.mod

import typings.plotlyJs.PartialEdits
import typings.plotlyJs.Partialfilenamestringscal
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /** DO autosize once regardless of layout.autosize (use default width or height values otherwise) */
  var autosizable: Boolean
  /** display the mode bar (true, false, or 'hover') */
  var displayModeBar: hover | Boolean
  /** add the plotly logo on the end of the mode bar */
  var displaylogo: Boolean
  /** double click interaction (false, 'reset', 'autosize' or 'reset+autosize') */
  var doubleClick: resetPlussignautosize | reset | autosize | `false`
  /** we can edit titles, move annotations, etc */
  var editable: Boolean
  var edits: PartialEdits
  /** if we DO autosize, do we fill the container or the screen? */
  var fillFrame: Boolean
  /** if we DO autosize, set the frame margins in percents of plot size */
  var frameMargins: Double
  /** Set global transform to be applied to all traces with no specification needed */
  var globalTransforms: js.Array[_]
  /** text appearing in the sendData link */
  var linkText: String
  /** Which localization should we use? Should be a string like 'en' or 'en-US' */
  var locale: String
  /**
  	 * Turn all console logging on or off (errors will be thrown)
  	 * This should ONLY be set via Plotly.setPlotConfig
  	 */
  var logging: Boolean | `0` | `1` | `2`
  /**
  	 * Mapbox access token (required to plot mapbox trace types)
  	 * If using an Mapbox Atlas server, set this option to '',
  	 * so that plotly.js won't attempt to authenticate to the public Mapbox server.
  	 */
  var mapboxAccessToken: String
  /**
  	 * fully custom mode bar buttons as nested array, where the outer
  	 * arrays represents button groups, and the inner arrays have
  	 * buttons config objects or names of default buttons
  	 * (see ./components/modebar/buttons.js for more info)
  	 */
  var modeBarButtons: (js.Array[js.Array[ModeBarButton | ModeBarDefaultButtons]]) | `false`
  /** add mode bar button using config objects (see ./components/modebar/buttons.js for list of arguments) */
  var modeBarButtonsToAdd: js.Array[ModeBarButton | ModeBarDefaultButtons]
  /** remove mode bar button by name (see ./components/modebar/buttons.js for the list of names) */
  var modeBarButtonsToRemove: js.Array[ModeBarDefaultButtons]
  /** increase the pixel ratio for Gl plot images */
  var plotGlPixelRatio: Double
  /** set the length of the undo/redo queue */
  var queueLength: Double
  /** Make the chart responsive to window size */
  var responsive: Boolean
  /** mousewheel or two-finger scroll zooms the plot */
  var scrollZoom: Boolean
  /** if we show a link, does it contain data or just link to a plotly file? */
  var sendData: Boolean
  /** enable axis pan/zoom drag handles */
  var showAxisDragHandles: Boolean
  /** enable direct range entry at the pan/zoom drag points (drag handles must be enabled above) */
  var showAxisRangeEntryBoxes: Boolean
  /** link to open this plot in plotly */
  var showLink: Boolean
  /** false or function adding source(s) to linkText <text> */
  var showSources: Boolean
  /** new users see some hints about interactivity */
  var showTips: Boolean
  /** no interactivity, for export or image generation */
  var staticPlot: Boolean
  /** override the defaults for the toImageButton */
  var toImageButtonOptions: Partialfilenamestringscal
  /** URL to topojson files used in geo charts */
  var topojsonURL: String
  /**
  	 * function to add the background color to a different container
  	 * or 'opaque' to ensure there's white behind it
  	 */
  def setBackground(): String | opaque | transparent
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
    queueLength: Double,
    responsive: Boolean,
    scrollZoom: Boolean,
    sendData: Boolean,
    setBackground: () => String | opaque | transparent,
    showAxisDragHandles: Boolean,
    showAxisRangeEntryBoxes: Boolean,
    showLink: Boolean,
    showSources: Boolean,
    showTips: Boolean,
    staticPlot: Boolean,
    toImageButtonOptions: Partialfilenamestringscal,
    topojsonURL: String
  ): Config = {
    val __obj = js.Dynamic.literal(autosizable = autosizable.asInstanceOf[js.Any], displayModeBar = displayModeBar.asInstanceOf[js.Any], displaylogo = displaylogo.asInstanceOf[js.Any], doubleClick = doubleClick.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], edits = edits.asInstanceOf[js.Any], fillFrame = fillFrame.asInstanceOf[js.Any], frameMargins = frameMargins.asInstanceOf[js.Any], globalTransforms = globalTransforms.asInstanceOf[js.Any], linkText = linkText.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], mapboxAccessToken = mapboxAccessToken.asInstanceOf[js.Any], modeBarButtons = modeBarButtons.asInstanceOf[js.Any], modeBarButtonsToAdd = modeBarButtonsToAdd.asInstanceOf[js.Any], modeBarButtonsToRemove = modeBarButtonsToRemove.asInstanceOf[js.Any], plotGlPixelRatio = plotGlPixelRatio.asInstanceOf[js.Any], queueLength = queueLength.asInstanceOf[js.Any], responsive = responsive.asInstanceOf[js.Any], scrollZoom = scrollZoom.asInstanceOf[js.Any], sendData = sendData.asInstanceOf[js.Any], setBackground = js.Any.fromFunction0(setBackground), showAxisDragHandles = showAxisDragHandles.asInstanceOf[js.Any], showAxisRangeEntryBoxes = showAxisRangeEntryBoxes.asInstanceOf[js.Any], showLink = showLink.asInstanceOf[js.Any], showSources = showSources.asInstanceOf[js.Any], showTips = showTips.asInstanceOf[js.Any], staticPlot = staticPlot.asInstanceOf[js.Any], toImageButtonOptions = toImageButtonOptions.asInstanceOf[js.Any], topojsonURL = topojsonURL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Config]
  }
}

