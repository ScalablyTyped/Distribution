package typings.plottable.plottableMod

import typings.plottable.buildSrcScalesMod.Color
import typings.plottable.buildSrcScalesMod.InterpolatedColor
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
    extends typings.plottable.buildSrcComponentsMod.AxisLabel {
    def this(text: String) = this()
    def this(text: String, angle: Double) = this()
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
    extends typings.plottable.buildSrcComponentsMod.DragBoxLayer
  
  @js.native
  class DragLineLayer[D] protected ()
    extends typings.plottable.buildSrcComponentsMod.DragLineLayer[D] {
    def this(orientation: String) = this()
  }
  
  @js.native
  class Gridlines ()
    extends typings.plottable.buildSrcComponentsMod.Gridlines {
    def this(xScale: typings.plottable.buildSrcScalesScaleMod.Scale[_, _]) = this()
    def this(xScale: Null, yScale: typings.plottable.buildSrcScalesScaleMod.Scale[_, _]) = this()
    /**
      * @constructor
      * @param {Scale} xScale The scale to base the x gridlines on. Pass null if no gridlines are desired.
      * @param {Scale} yScale The scale to base the y gridlines on. Pass null if no gridlines are desired.
      */
    def this(
      xScale: typings.plottable.buildSrcScalesScaleMod.Scale[_, _],
      yScale: typings.plottable.buildSrcScalesScaleMod.Scale[_, _]
    ) = this()
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
    extends typings.plottable.buildSrcComponentsMod.Group {
    def this(components: js.Array[typings.plottable.buildSrcComponentsComponentMod.Component]) = this()
  }
  
  @js.native
  class GuideLineLayer[D] protected ()
    extends typings.plottable.buildSrcComponentsMod.GuideLineLayer[D] {
    def this(orientation: String) = this()
  }
  
  @js.native
  class InterpolatedColorLegend protected ()
    extends typings.plottable.buildSrcComponentsMod.InterpolatedColorLegend {
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
    def this(interpolatedColorScale: InterpolatedColor) = this()
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
    extends typings.plottable.buildSrcComponentsMod.Label {
    def this(displayText: String) = this()
    def this(displayText: String, angle: Double) = this()
  }
  
  @js.native
  class Legend protected ()
    extends typings.plottable.buildSrcComponentsMod.Legend {
    /**
      * The Legend consists of a series of entries, each with a color and label taken from the Color Scale.
      *
      * @constructor
      * @param {Scale.Color} scale
      */
    def this(colorScale: Color) = this()
  }
  
  @js.native
  class PlotGroup ()
    extends typings.plottable.buildSrcComponentsMod.PlotGroup
  
  @js.native
  class SelectionBoxLayer ()
    extends typings.plottable.buildSrcComponentsMod.SelectionBoxLayer
  
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
    extends typings.plottable.buildSrcComponentsMod.Table {
    def this(rows: js.Array[
            js.Array[js.UndefOr[typings.plottable.buildSrcComponentsComponentMod.Component | Null]]
          ]) = this()
  }
  
  @js.native
  /**
    * @constructor
    * @param {string} [text]
    * @param {number} [angle] One of -90/0/90. 0 is horizontal.
    */
  class TitleLabel ()
    extends typings.plottable.buildSrcComponentsMod.TitleLabel {
    def this(text: String) = this()
    def this(text: String, angle: Double) = this()
  }
  
  @js.native
  class WrappedLabel ()
    extends typings.plottable.buildSrcComponentsMod.WrappedLabel
  
  @js.native
  /**
    * An XDragBoxLayer is a DragBoxLayer whose size can only be set in the X-direction.
    * The y-values of the bounds() are always set to 0 and the height() of the XDragBoxLayer.
    *
    * @constructor
    */
  class XDragBoxLayer ()
    extends typings.plottable.buildSrcComponentsMod.XDragBoxLayer
  
  @js.native
  /**
    * A YDragBoxLayer is a DragBoxLayer whose size can only be set in the Y-direction.
    * The x-values of the bounds() are always set to 0 and the width() of the YDragBoxLayer.
    *
    * @constructor
    */
  class YDragBoxLayer ()
    extends typings.plottable.buildSrcComponentsMod.YDragBoxLayer
  
  /* static members */
  @js.native
  object AxisLabel extends js.Object {
    var AXIS_LABEL_CLASS: String = js.native
  }
  
  /* static members */
  @js.native
  object GuideLineLayer extends js.Object {
    var ORIENTATION_HORIZONTAL: String = js.native
    var ORIENTATION_VERTICAL: String = js.native
  }
  
  /* static members */
  @js.native
  object InterpolatedColorLegend extends js.Object {
    /**
      * The css class applied to the legend labels.
      */
    var LEGEND_LABEL_CLASS: String = js.native
    var _DEFAULT_NUM_SWATCHES: js.Any = js.native
    /* private */ def _ensureOrientation(orientation: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Legend extends js.Object {
    /**
      * The css class applied to each legend entry
      */
    var LEGEND_ENTRY_CLASS: String = js.native
    /**
      * The css class applied to each legend row
      */
    var LEGEND_ROW_CLASS: String = js.native
    /**
      * The css class applied to each legend symbol
      */
    var LEGEND_SYMBOL_CLASS: String = js.native
  }
  
  @js.native
  object PropertyMode extends js.Object {
    /* 1 */ val PIXEL: typings.plottable.buildSrcComponentsSelectionBoxLayerMod.PropertyMode.PIXEL with Double = js.native
    /* 0 */ val VALUE: typings.plottable.buildSrcComponentsSelectionBoxLayerMod.PropertyMode.VALUE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.plottable.buildSrcComponentsSelectionBoxLayerMod.PropertyMode with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object Table extends js.Object {
    /* private */ def _calcComponentWeights(setWeights: js.Any, componentGroups: js.Any, fixityAccessor: js.Any): js.Any = js.native
    /* private */ def _calcProportionalSpace(weights: js.Any, freeSpace: js.Any): js.Any = js.native
    /* private */ def _fixedSpace(componentGroup: js.Any, fixityAccessor: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object TitleLabel extends js.Object {
    var TITLE_LABEL_CLASS: String = js.native
  }
  
}

