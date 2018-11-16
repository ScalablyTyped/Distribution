package typings
package plotlyDotJsLib.plotlyDotJsMod

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
  var align: plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right
  /** Sets the color of the annotation arrow. */
  var arrowcolor: java.lang.String
  /** Sets the end annotation arrow head style. */
  var arrowhead: scala.Double
  /** Sets the annotation arrow head position. */
  var arrowside: plotlyDotJsLib.plotlyDotJsLibStrings.end | plotlyDotJsLib.plotlyDotJsLibStrings.start
  /**
  	 * Sets the size of the end annotation arrow head, relative to `arrowwidth`.
  	 * A value of 1 (default) gives a head about 3x as wide as the line.
  	 */
  var arrowsize: scala.Double
  /** Sets the width (in px) of annotation arrow line. */
  var arrowwidth: scala.Double
  /**
  	 * Sets the x component of the arrow tail about the arrow head.
  	 * If `axref` is `pixel`, a positive (negative)
  	 * component corresponds to an arrow pointing
  	 * from right to left (left to right).
  	 * If `axref` is an axis, this is an absolute value on that axis,
  	 * like `x`, NOT a relative value.
  	 */
  var ax: scala.Double
  /**
  	 * Indicates in what terms the tail of the annotation (ax,ay)
  	 * is specified. If `pixel`, `ax` is a relative offset in pixels
  	 * from `x`. If set to an x axis id (e.g. *x* or *x2*), `ax` is
  	 * specified in the same terms as that axis. This is useful
  	 * for trendline annotations which should continue to indicate
  	 * the correct trend when zoomed.
  	 */
  var axref: plotlyDotJsLib.plotlyDotJsLibStrings.pixel
  /**
  	 * Sets the y component of the arrow tail about the arrow head.
  	 * If `ayref` is `pixel`, a positive (negative)
  	 * component corresponds to an arrow pointing
  	 * from bottom to top (top to bottom).
  	 * If `ayref` is an axis, this is an absolute value on that axis,
  	 * like `y`, NOT a relative value.
  	 */
  var ay: scala.Double
  /**
  	 * Indicates in what terms the tail of the annotation (ax,ay)
  	 * is specified. If `pixel`, `ay` is a relative offset in pixels
  	 * from `y`. If set to a y axis id (e.g. *y* or *y2*), `ay` is
  	 * specified in the same terms as that axis. This is useful
  	 * for trendline annotations which should continue to indicate
  	 * the correct trend when zoomed.
  	 */
  var ayref: plotlyDotJsLib.plotlyDotJsLibStrings.pixel
  /** Sets the padding (in px) between the `text` and the enclosing border. */
  var borderpad: scala.Double
  /** Sets the width (in px) of the border enclosing the annotation `text`. */
  var borderwidth: scala.Double
  /**
  	 * Determines whether the annotation text box captures mouse move and click events,
  	 * or allows those events to pass through to data points in the plot that may be
  	 * behind the annotation. By default `captureevents` is *false* unless `hovertext`
  	 * is provided. If you use the event `plotly_clickannotation` without `hovertext`
  	 * you must explicitly enable `captureevents`.
  	 */
  var captureevents: scala.Boolean
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
  var clicktoshow: plotlyDotJsLib.plotlyDotJsLibNumbers.`false` | plotlyDotJsLib.plotlyDotJsLibStrings.onoff | plotlyDotJsLib.plotlyDotJsLibStrings.onout
  /**
  	 * Sets an explicit height for the text box. null (default) lets the
  	 * text set the box height. Taller text will be clipped.
  	 */
  var height: scala.Double
  var hoverlabel: stdLib.Partial[Label]
  /**
  	 * Sets text to appear when hovering over this annotation.
  	 * If omitted or blank, no hover label will appear.
  	 */
  var hovertext: java.lang.String
  /** Sets the opacity of the annotation (text + arrow). */
  var opacity: scala.Double
  /**
  	 * Determines whether or not the annotation is drawn with an arrow.
  	 * If *true*, `text` is placed near the arrow's tail.
  	 * If *false*, `text` lines up with the `x` and `y` provided.
  	 */
  var showarrow: scala.Boolean
  /**
  	 * Sets a distance, in pixels, to move the end arrowhead away from the
  	 * position it is pointing at, for example to point at the edge of
  	 * a marker independent of zoom. Note that this shortens the arrow
  	 * from the `ax` / `ay` vector, in contrast to `xshift` / `yshift`
  	 * which moves everything by this amount.
  	 */
  var standoff: scala.Double
  /** Sets the start annotation arrow head style. */
  var startarrowhead: scala.Double
  /**
  	 * Sets the size of the start annotation arrow head, relative to `arrowwidth`.
  	 * A value of 1 (default) gives a head about 3x as wide as the line.
  	 */
  var startarrowsize: scala.Double
  /**
  	 * Sets a distance, in pixels, to move the start arrowhead away from the
  	 * position it is pointing at, for example to point at the edge of
  	 * a marker independent of zoom. Note that this shortens the arrow
  	 * from the `ax` / `ay` vector, in contrast to `xshift` / `yshift`
  	 * which moves everything by this amount.
  	 */
  var startstandoff: scala.Double
  /**
  	 * Sets the text associated with this annotation.
  	 * Plotly uses a subset of HTML tags to do things like
  	 * newline (<br>), bold (<b></b>), italics (<i></i>),
  	 * hyperlinks (<a href='...'></a>). Tags <em>, <sup>, <sub>
  	 * <span> are also supported.
  	 */
  var text: java.lang.String
  /** Sets the angle at which the `text` is drawn with respect to the horizontal. */
  var textangle: java.lang.String
  /**
  	 * Sets the vertical alignment of the `text` within the box.
  	 * Has an effect only if an explicit height is set to override the text height.
  	 */
  var valign: plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
  /** Determines whether or not this annotation is visible. */
  var visible: scala.Boolean
  /**
  	 * Sets an explicit width for the text box. null (default) lets the
  	 * text set the box width. Wider text will be clipped.
  	 * There is no automatic wrapping; use <br> to start a new line.
  	 */
  var width: scala.Double
  /**
  	 * Sets the annotation's x position.
  	 * If the axis `type` is *log*, then you must take the log of your desired range.
  	 * If the axis `type` is *date*, it should be date strings, like date data,
  	 * though Date objects and unix milliseconds will be accepted and converted to strings.
  	 * If the axis `type` is *category*, it should be numbers, using the scale where each
  	 * category is assigned a serial number from zero in the order it appears.
  	 */
  var x: scala.Double | java.lang.String
  /**
  	 * Sets the text box's horizontal position anchor
  	 * This anchor binds the `x` position to the *left*, *center* or *right* of the annotation.
  	 * For example, if `x` is set to 1, `xref` to *paper* and `xanchor` to *right* then the
  	 * right-most portion of the annotation lines up with the right-most edge of the plotting area.
  	 * If *auto*, the anchor is equivalent to *center* for data-referenced annotations or if there
  	 * is an arrow, whereas for paper-referenced with no arrow, the anchor picked corresponds to the closest side.
  	 */
  var xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right
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
  var xref: plotlyDotJsLib.plotlyDotJsLibStrings.paper | plotlyDotJsLib.plotlyDotJsLibStrings.x
  /**
  	 * Shifts the position of the whole annotation and arrow to the
  	 * right (positive) or left (negative) by this many pixels.
  	 */
  var xshift: scala.Double
  /**
  	 * Sets the annotation's y position.
  	 * If the axis `type` is *log*, then you must take the log of your desired range.
  	 * If the axis `type` is *date*, it should be date strings, like date data,
  	 * though Date objects and unix milliseconds will be accepted and converted to strings.
  	 * If the axis `type` is *category*, it should be numbers, using the scale where each
  	 * category is assigned a serial number from zero in the order it appears.
  	 */
  var y: scala.Double | java.lang.String
  /**
  	 * Sets the text box's vertical position anchor
  	 * This anchor binds the `y` position to the *top*, *middle* or *bottom* of the annotation.
  	 * For example, if `y` is set to 1, `yref` to *paper* and `yanchor` to *top* then the
  	 * top-most portion of the annotation lines up with the top-most edge of the plotting area.
  	 * If *auto*, the anchor is equivalent to *middle* for data-referenced annotations or if
  	 * there is an arrow, whereas for paper-referenced with no arrow, the anchor picked
  	 * corresponds to the closest side.
  	 */
  var yanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
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
  var yref: plotlyDotJsLib.plotlyDotJsLibStrings.paper | plotlyDotJsLib.plotlyDotJsLibStrings.y
  /**
  	 * Shifts the position of the whole annotation and arrow up
  	 * (positive) or down (negative) by this many pixels.
  	 */
  var yshift: scala.Double
}

