package typings
package plottableLib.plottableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Components")
@js.native
object ComponentsNs extends js.Object {
  @js.native
  /**
    * @constructor
    * @param {string} [text]
    * @param {number} [angle] One of -90/0/90. 0 is horizontal.
    */
  class AxisLabel ()
    extends plottableLib.buildSrcComponentsMod.AxisLabel {
    def this(text: java.lang.String) = this()
    def this(text: java.lang.String, angle: scala.Double) = this()
  }
  
  @js.native
  /**
    * Constructs a DragBoxLayer.
    *
    * A DragBoxLayer is a SelectionBoxLayer with a built-in Drag Interaction.
    * A drag gesture will set the Bounds of the box.
    * If resizing is enabled using resizable(true), the edges of box can be repositioned.
    *
    * @constructor
    */
  class DragBoxLayer ()
    extends plottableLib.buildSrcComponentsMod.DragBoxLayer
  
  @js.native
  class DragLineLayer[D] protected ()
    extends plottableLib.buildSrcComponentsMod.DragLineLayer[D] {
    def this(orientation: java.lang.String) = this()
  }
  
  @js.native
  class Gridlines ()
    extends plottableLib.buildSrcComponentsMod.Gridlines {
    def this(xScale: plottableLib.buildSrcScalesScaleMod.Scale[_, _]) = this()
    /**
      * @constructor
      * @param {Scale} xScale The scale to base the x gridlines on. Pass null if no gridlines are desired.
      * @param {Scale} yScale The scale to base the y gridlines on. Pass null if no gridlines are desired.
      */
    def this(xScale: plottableLib.buildSrcScalesScaleMod.Scale[_, _], yScale: plottableLib.buildSrcScalesScaleMod.Scale[_, _]) = this()
    def this(xScale: scala.Null, yScale: plottableLib.buildSrcScalesScaleMod.Scale[_, _]) = this()
  }
  
  @js.native
  /**
    * Constructs a Group.
    *
    * A Group contains Components that will be rendered on top of each other.
    * Components added later will be rendered above Components already in the Group.
    *
    * @constructor
    * @param {Component[]} [components=[]] Components to be added to the Group.
    */
  class Group ()
    extends plottableLib.buildSrcComponentsMod.Group {
    def this(components: js.Array[plottableLib.buildSrcComponentsComponentMod.Component]) = this()
  }
  
  @js.native
  class GuideLineLayer[D] protected ()
    extends plottableLib.buildSrcComponentsMod.GuideLineLayer[D] {
    def this(orientation: java.lang.String) = this()
  }
  
  @js.native
  class InterpolatedColorLegend protected ()
    extends plottableLib.buildSrcComponentsMod.InterpolatedColorLegend {
    /**
      * Creates an InterpolatedColorLegend.
      *
      * The InterpolatedColorLegend consists of a sequence of swatches that show the
      * associated InterpolatedColor Scale sampled at various points.
      * Two labels show the maximum and minimum values of the InterpolatedColor Scale.
      *
      * @constructor
      * @param {Scales.InterpolatedColor} interpolatedColorScale
      */
    def this(interpolatedColorScale: plottableLib.buildSrcScalesMod.InterpolatedColor) = this()
  }
  
  @js.native
  /**
    * A Label is a Component that displays a single line of text.
    *
    * @constructor
    * @param {string} [displayText=""] The text of the Label.
    * @param {number} [angle=0] The angle of the Label in degrees (-90/0/90). 0 is horizontal.
    */
  class Label ()
    extends plottableLib.buildSrcComponentsMod.Label {
    def this(displayText: java.lang.String) = this()
    def this(displayText: java.lang.String, angle: scala.Double) = this()
  }
  
  @js.native
  class Legend protected ()
    extends plottableLib.buildSrcComponentsMod.Legend {
    /**
      * The Legend consists of a series of entries, each with a color and label taken from the Color Scale.
      *
      * @constructor
      * @param {Scale.Color} scale
      */
    def this(colorScale: plottableLib.buildSrcScalesMod.Color) = this()
  }
  
  @js.native
  class PlotGroup ()
    extends plottableLib.buildSrcComponentsMod.PlotGroup
  
  @js.native
  class SelectionBoxLayer ()
    extends plottableLib.buildSrcComponentsMod.SelectionBoxLayer
  
  @js.native
  /**
    * A Table combines Components in the form of a grid. A
    * common case is combining a y-axis, x-axis, and the plotted data via
    * ```typescript
    * new Table([[yAxis, plot],
    *            [null,  xAxis]]);
    * ```
    *
    * @constructor
    * @param {(Component|null|undefined)[][]} [rows=[]] A 2-D array of Components to be added to the Table.
    *   null can be used if a cell is empty.
    */
  class Table ()
    extends plottableLib.buildSrcComponentsMod.Table {
    def this(rows: js.Array[
          js.Array[js.UndefOr[plottableLib.buildSrcComponentsComponentMod.Component | scala.Null]]
        ]) = this()
  }
  
  @js.native
  /**
    * @constructor
    * @param {string} [text]
    * @param {number} [angle] One of -90/0/90. 0 is horizontal.
    */
  class TitleLabel ()
    extends plottableLib.buildSrcComponentsMod.TitleLabel {
    def this(text: java.lang.String) = this()
    def this(text: java.lang.String, angle: scala.Double) = this()
  }
  
  @js.native
  class WrappedLabel ()
    extends plottableLib.buildSrcComponentsMod.WrappedLabel
  
  @js.native
  /**
    * An XDragBoxLayer is a DragBoxLayer whose size can only be set in the X-direction.
    * The y-values of the bounds() are always set to 0 and the height() of the XDragBoxLayer.
    *
    * @constructor
    */
  class XDragBoxLayer ()
    extends plottableLib.buildSrcComponentsMod.XDragBoxLayer
  
  @js.native
  /**
    * A YDragBoxLayer is a DragBoxLayer whose size can only be set in the Y-direction.
    * The x-values of the bounds() are always set to 0 and the width() of the YDragBoxLayer.
    *
    * @constructor
    */
  class YDragBoxLayer ()
    extends plottableLib.buildSrcComponentsMod.YDragBoxLayer
  
  @js.native
  object AxisLabel extends js.Object {
    var AXIS_LABEL_CLASS: java.lang.String = js.native
  }
  
  @js.native
  object GuideLineLayer extends js.Object {
    var ORIENTATION_HORIZONTAL: java.lang.String = js.native
    var ORIENTATION_VERTICAL: java.lang.String = js.native
  }
  
  @js.native
  object InterpolatedColorLegend extends js.Object {
    /**
      * The css class applied to the legend labels.
      */
    var LEGEND_LABEL_CLASS: java.lang.String = js.native
    var _DEFAULT_NUM_SWATCHES: js.Any = js.native
    /* private */ def _ensureOrientation(orientation: js.Any): js.Any = js.native
  }
  
  @js.native
  object Legend extends js.Object {
    /**
      * The css class applied to each legend entry
      */
    var LEGEND_ENTRY_CLASS: java.lang.String = js.native
    /**
      * The css class applied to each legend row
      */
    var LEGEND_ROW_CLASS: java.lang.String = js.native
    /**
      * The css class applied to each legend symbol
      */
    var LEGEND_SYMBOL_CLASS: java.lang.String = js.native
  }
  
  @js.native
  object PropertyMode extends js.Object {
    /* 1 */ val PIXEL: plottableLib.buildSrcComponentsSelectionBoxLayerMod.PropertyMode.PIXEL with scala.Double = js.native
    /* 0 */ val VALUE: plottableLib.buildSrcComponentsSelectionBoxLayerMod.PropertyMode.VALUE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        plottableLib.buildSrcComponentsSelectionBoxLayerMod.PropertyMode with scala.Double
      ] = js.native
  }
  
  @js.native
  object Table extends js.Object {
    /* private */ def _calcComponentWeights(setWeights: js.Any, componentGroups: js.Any, fixityAccessor: js.Any): js.Any = js.native
    /* private */ def _calcProportionalSpace(weights: js.Any, freeSpace: js.Any): js.Any = js.native
    /* private */ def _fixedSpace(componentGroup: js.Any, fixityAccessor: js.Any): js.Any = js.native
  }
  
  @js.native
  object TitleLabel extends js.Object {
    var TITLE_LABEL_CLASS: java.lang.String = js.native
  }
  
  type PropertyMode = plottableLib.buildSrcComponentsSelectionBoxLayerMod.PropertyMode
}

