package typings.plotlyJs.mod

import typings.plotlyJs.PartialFont
import typings.plotlyJs.PartialHoverLabel
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.end
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.onoff
import typings.plotlyJs.plotlyJsStrings.onout
import typings.plotlyJs.plotlyJsStrings.paper
import typings.plotlyJs.plotlyJsStrings.pixel
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.start
import typings.plotlyJs.plotlyJsStrings.top
import typings.plotlyJs.plotlyJsStrings.x
import typings.plotlyJs.plotlyJsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotations extends Label {
  /**
  	 * Sets the horizontal alignment of the `text` within the box.
  	 * Has an effect only if `text` spans more two or more lines
  	 * (i.e. `text` contains one or more <br> HTML tags) or if an
  	 * explicit width is set to override the text width.
  	 */
  var align: left | center | right
  /** Sets the color of the annotation arrow. */
  var arrowcolor: String
  /** Sets the end annotation arrow head style. */
  var arrowhead: Double
  /** Sets the annotation arrow head position. */
  var arrowside: end | start
  /**
  	 * Sets the size of the end annotation arrow head, relative to `arrowwidth`.
  	 * A value of 1 (default) gives a head about 3x as wide as the line.
  	 */
  var arrowsize: Double
  /** Sets the width (in px) of annotation arrow line. */
  var arrowwidth: Double
  /**
  	 * Sets the x component of the arrow tail about the arrow head.
  	 * If `axref` is `pixel`, a positive (negative)
  	 * component corresponds to an arrow pointing
  	 * from right to left (left to right).
  	 * If `axref` is an axis, this is an absolute value on that axis,
  	 * like `x`, NOT a relative value.
  	 */
  var ax: Double
  /**
  	 * Indicates in what terms the tail of the annotation (ax,ay)
  	 * is specified. If `pixel`, `ax` is a relative offset in pixels
  	 * from `x`. If set to an x axis id (e.g. *x* or *x2*), `ax` is
  	 * specified in the same terms as that axis. This is useful
  	 * for trendline annotations which should continue to indicate
  	 * the correct trend when zoomed.
  	 */
  var axref: pixel
  /**
  	 * Sets the y component of the arrow tail about the arrow head.
  	 * If `ayref` is `pixel`, a positive (negative)
  	 * component corresponds to an arrow pointing
  	 * from bottom to top (top to bottom).
  	 * If `ayref` is an axis, this is an absolute value on that axis,
  	 * like `y`, NOT a relative value.
  	 */
  var ay: Double
  /**
  	 * Indicates in what terms the tail of the annotation (ax,ay)
  	 * is specified. If `pixel`, `ay` is a relative offset in pixels
  	 * from `y`. If set to a y axis id (e.g. *y* or *y2*), `ay` is
  	 * specified in the same terms as that axis. This is useful
  	 * for trendline annotations which should continue to indicate
  	 * the correct trend when zoomed.
  	 */
  var ayref: pixel
  /** Sets the padding (in px) between the `text` and the enclosing border. */
  var borderpad: Double
  /** Sets the width (in px) of the border enclosing the annotation `text`. */
  var borderwidth: Double
  /**
  	 * Determines whether the annotation text box captures mouse move and click events,
  	 * or allows those events to pass through to data points in the plot that may be
  	 * behind the annotation. By default `captureevents` is *false* unless `hovertext`
  	 * is provided. If you use the event `plotly_clickannotation` without `hovertext`
  	 * you must explicitly enable `captureevents`.
  	 */
  var captureevents: Boolean
  /**
  	 * Makes this annotation respond to clicks on the plot.
  	 * If you click a data point that exactly matches the `x` and `y` values of this annotation,
  	 * and it is hidden (visible: false), it will appear. In *onoff* mode, you must click the same
  	 * point again to make it disappear, so if you click multiple points, you can show multiple
  	 * annotations. In *onout* mode, a click anywhere else in the plot (on another data point or not)
  	 * will hide this annotation. If you need to show/hide this annotation in response to different
  	 * `x` or `y` values, you can set `xclick` and/or `yclick`. This is useful for example to label
  	 * the side of a bar. To label markers though, `standoff` is preferred over `xclick` and `yclick`.
  	 */
  var clicktoshow: `false` | onoff | onout
  /**
  	 * Sets an explicit height for the text box. null (default) lets the
  	 * text set the box height. Taller text will be clipped.
  	 */
  var height: Double
  var hoverlabel: PartialHoverLabel
  /**
  	 * Sets text to appear when hovering over this annotation.
  	 * If omitted or blank, no hover label will appear.
  	 */
  var hovertext: String
  /** Sets the opacity of the annotation (text + arrow). */
  var opacity: Double
  /**
  	 * Determines whether or not the annotation is drawn with an arrow.
  	 * If *true*, `text` is placed near the arrow's tail.
  	 * If *false*, `text` lines up with the `x` and `y` provided.
  	 */
  var showarrow: Boolean
  /**
  	 * Sets a distance, in pixels, to move the end arrowhead away from the
  	 * position it is pointing at, for example to point at the edge of
  	 * a marker independent of zoom. Note that this shortens the arrow
  	 * from the `ax` / `ay` vector, in contrast to `xshift` / `yshift`
  	 * which moves everything by this amount.
  	 */
  var standoff: Double
  /** Sets the start annotation arrow head style. */
  var startarrowhead: Double
  /**
  	 * Sets the size of the start annotation arrow head, relative to `arrowwidth`.
  	 * A value of 1 (default) gives a head about 3x as wide as the line.
  	 */
  var startarrowsize: Double
  /**
  	 * Sets a distance, in pixels, to move the start arrowhead away from the
  	 * position it is pointing at, for example to point at the edge of
  	 * a marker independent of zoom. Note that this shortens the arrow
  	 * from the `ax` / `ay` vector, in contrast to `xshift` / `yshift`
  	 * which moves everything by this amount.
  	 */
  var startstandoff: Double
  /**
  	 * Sets the text associated with this annotation.
  	 * Plotly uses a subset of HTML tags to do things like
  	 * newline (<br>), bold (<b></b>), italics (<i></i>),
  	 * hyperlinks (<a href='...'></a>). Tags <em>, <sup>, <sub>
  	 * <span> are also supported.
  	 */
  var text: String
  /** Sets the angle at which the `text` is drawn with respect to the horizontal. */
  var textangle: String
  /**
  	 * Sets the vertical alignment of the `text` within the box.
  	 * Has an effect only if an explicit height is set to override the text height.
  	 */
  var valign: top | middle | bottom
  /** Determines whether or not this annotation is visible. */
  var visible: Boolean
  /**
  	 * Sets an explicit width for the text box. null (default) lets the
  	 * text set the box width. Wider text will be clipped.
  	 * There is no automatic wrapping; use <br> to start a new line.
  	 */
  var width: Double
  /**
  	 * Sets the annotation's x position.
  	 * If the axis `type` is *log*, then you must take the log of your desired range.
  	 * If the axis `type` is *date*, it should be date strings, like date data,
  	 * though Date objects and unix milliseconds will be accepted and converted to strings.
  	 * If the axis `type` is *category*, it should be numbers, using the scale where each
  	 * category is assigned a serial number from zero in the order it appears.
  	 */
  var x: Double | String
  /**
  	 * Sets the text box's horizontal position anchor
  	 * This anchor binds the `x` position to the *left*, *center* or *right* of the annotation.
  	 * For example, if `x` is set to 1, `xref` to *paper* and `xanchor` to *right* then the
  	 * right-most portion of the annotation lines up with the right-most edge of the plotting area.
  	 * If *auto*, the anchor is equivalent to *center* for data-referenced annotations or if there
  	 * is an arrow, whereas for paper-referenced with no arrow, the anchor picked corresponds to the closest side.
  	 */
  var xanchor: auto | left | center | right
  /**
  	 * Toggle this annotation when clicking a data point whose `x` value
  	 * is `xclick` rather than the annotation's `x` value.
  	 */
  var xclick: js.Any
  /**
  	 * Sets the annotation's x coordinate axis.
  	 * If set to an x axis id (e.g. *x* or *x2*), the `x` position refers to an x coordinate
  	 * If set to *paper*, the `x` position refers to the distance from
  	 * the left side of the plotting area in normalized coordinates
  	 * where 0 (1) corresponds to the left (right) side.
  	 */
  var xref: paper | x
  /**
  	 * Shifts the position of the whole annotation and arrow to the
  	 * right (positive) or left (negative) by this many pixels.
  	 */
  var xshift: Double
  /**
  	 * Sets the annotation's y position.
  	 * If the axis `type` is *log*, then you must take the log of your desired range.
  	 * If the axis `type` is *date*, it should be date strings, like date data,
  	 * though Date objects and unix milliseconds will be accepted and converted to strings.
  	 * If the axis `type` is *category*, it should be numbers, using the scale where each
  	 * category is assigned a serial number from zero in the order it appears.
  	 */
  var y: Double | String
  /**
  	 * Sets the text box's vertical position anchor
  	 * This anchor binds the `y` position to the *top*, *middle* or *bottom* of the annotation.
  	 * For example, if `y` is set to 1, `yref` to *paper* and `yanchor` to *top* then the
  	 * top-most portion of the annotation lines up with the top-most edge of the plotting area.
  	 * If *auto*, the anchor is equivalent to *middle* for data-referenced annotations or if
  	 * there is an arrow, whereas for paper-referenced with no arrow, the anchor picked
  	 * corresponds to the closest side.
  	 */
  var yanchor: auto | top | middle | bottom
  /**
  	 * Toggle this annotation when clicking a data point whose `y` value
  	 * is `yclick` rather than the annotation's `y` value.
  	 */
  var yclick: js.Any
  /**
  	 * Sets the annotation's y coordinate axis.
  	 * If set to an y axis id (e.g. *y* or *y2*), the `y` position refers to an y coordinate
  	 * If set to *paper*, the `y` position refers to the distance from
  	 * the bottom of the plotting area in normalized coordinates
  	 * where 0 (1) corresponds to the bottom (top).
  	 */
  var yref: paper | y
  /**
  	 * Shifts the position of the whole annotation and arrow up
  	 * (positive) or down (negative) by this many pixels.
  	 */
  var yshift: Double
}

object Annotations {
  @scala.inline
  def apply(
    align: left | center | right,
    arrowcolor: String,
    arrowhead: Double,
    arrowside: end | start,
    arrowsize: Double,
    arrowwidth: Double,
    ax: Double,
    axref: pixel,
    ay: Double,
    ayref: pixel,
    bgcolor: String,
    bordercolor: String,
    borderpad: Double,
    borderwidth: Double,
    captureevents: Boolean,
    clicktoshow: `false` | onoff | onout,
    font: PartialFont,
    height: Double,
    hoverlabel: PartialHoverLabel,
    hovertext: String,
    opacity: Double,
    showarrow: Boolean,
    standoff: Double,
    startarrowhead: Double,
    startarrowsize: Double,
    startstandoff: Double,
    text: String,
    textangle: String,
    valign: top | middle | bottom,
    visible: Boolean,
    width: Double,
    x: Double | String,
    xanchor: auto | left | center | right,
    xclick: js.Any,
    xref: paper | x,
    xshift: Double,
    y: Double | String,
    yanchor: auto | top | middle | bottom,
    yclick: js.Any,
    yref: paper | y,
    yshift: Double
  ): Annotations = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], arrowcolor = arrowcolor.asInstanceOf[js.Any], arrowhead = arrowhead.asInstanceOf[js.Any], arrowside = arrowside.asInstanceOf[js.Any], arrowsize = arrowsize.asInstanceOf[js.Any], arrowwidth = arrowwidth.asInstanceOf[js.Any], ax = ax.asInstanceOf[js.Any], axref = axref.asInstanceOf[js.Any], ay = ay.asInstanceOf[js.Any], ayref = ayref.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderpad = borderpad.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], captureevents = captureevents.asInstanceOf[js.Any], clicktoshow = clicktoshow.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hoverlabel = hoverlabel.asInstanceOf[js.Any], hovertext = hovertext.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], showarrow = showarrow.asInstanceOf[js.Any], standoff = standoff.asInstanceOf[js.Any], startarrowhead = startarrowhead.asInstanceOf[js.Any], startarrowsize = startarrowsize.asInstanceOf[js.Any], startstandoff = startstandoff.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textangle = textangle.asInstanceOf[js.Any], valign = valign.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], xclick = xclick.asInstanceOf[js.Any], xref = xref.asInstanceOf[js.Any], xshift = xshift.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any], yclick = yclick.asInstanceOf[js.Any], yref = yref.asInstanceOf[js.Any], yshift = yshift.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Annotations]
  }
}

