package typings
package plottableLib.buildSrcComponentsGridlinesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/gridlines", "Gridlines")
@js.native
class Gridlines ()
  extends plottableLib.buildSrcComponentsComponentMod.Component {
  /**
       * @constructor
       * @param {Scale} xScale The scale to base the x gridlines on. Pass null if no gridlines are desired.
       * @param {Scale} yScale The scale to base the y gridlines on. Pass null if no gridlines are desired.
       */
  def this(xScale: plottableLib.buildSrcScalesScaleMod.Scale[_, _]) = this()
  /**
       * @constructor
       * @param {Scale} xScale The scale to base the x gridlines on. Pass null if no gridlines are desired.
       * @param {Scale} yScale The scale to base the y gridlines on. Pass null if no gridlines are desired.
       */
  def this(xScale: plottableLib.buildSrcScalesScaleMod.Scale[_, _], yScale: plottableLib.buildSrcScalesScaleMod.Scale[_, _]) = this()
  /**
       * @constructor
       * @param {Scale} xScale The scale to base the x gridlines on. Pass null if no gridlines are desired.
       * @param {Scale} yScale The scale to base the y gridlines on. Pass null if no gridlines are desired.
       */
  def this(xScale: scala.Null, yScale: plottableLib.buildSrcScalesScaleMod.Scale[_, _]) = this()
  var _betweenX: js.Any = js.native
  var _betweenY: js.Any = js.native
  var _renderCallback: js.Any = js.native
  var _xLinesContainer: js.Any = js.native
  var _xScale: js.Any = js.native
  var _yLinesContainer: js.Any = js.native
  var _yScale: js.Any = js.native
  /* private */ def _redrawXLines(): js.Any = js.native
  /* private */ def _redrawYLines(): js.Any = js.native
  /**
       * Gets the between flag for the x axis.
       *
       * @returns {boolean} The current state of betweenX
       */
  def betweenX(): scala.Boolean = js.native
  /**
       * Sets the between flag for the x axis. True causes gridlines to render
       * between ticks. False sets the causes the gridlines to render on the
       * ticks. Defaults to false.
       *
       * @param {boolean} betweenX
       * @returns {Gridlines} The calling Gridlines.
       */
  def betweenX(_betweenX: scala.Boolean): this.type = js.native
  /**
       * Gets the between flag for the y axis.
       *
       * @returns {boolean} The current state of betweenY
       */
  def betweenY(): scala.Boolean = js.native
  /**
     * Sets the between flag for the y axis. True causes gridlines to render
     * between ticks. False sets the causes the gridlines to render on the
     * ticks. Defaults to false.
     *
     * @param {boolean} betweenY
     * @returns {Gridlines} The calling Gridlines.
     */
  def betweenY(_betweenY: scala.Boolean): this.type = js.native
}

