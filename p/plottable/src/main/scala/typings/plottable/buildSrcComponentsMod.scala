package typings.plottable

import typings.plottable.buildSrcComponentsComponentMod.Component
import typings.plottable.buildSrcComponentsLabelMod.LabelFontSizePx
import typings.plottable.buildSrcScalesMod.Color
import typings.plottable.buildSrcScalesMod.InterpolatedColor
import typings.plottable.buildSrcScalesScaleMod.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcComponentsMod {
  
  @JSImport("plottable/build/src/components", "AxisLabel")
  @js.native
  /**
    * @constructor
    * @param {string} [text]
    * @param {number} [angle] One of -90/0/90. 0 is horizontal.
    */
  open class AxisLabel ()
    extends typings.plottable.buildSrcComponentsLabelMod.AxisLabel {
    def this(text: String) = this()
    def this(text: String, angle: Double) = this()
    def this(text: Unit, angle: Double) = this()
  }
  /* static members */
  object AxisLabel {
    
    @JSImport("plottable/build/src/components", "AxisLabel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/components", "AxisLabel.AXIS_LABEL_CLASS")
    @js.native
    def AXIS_LABEL_CLASS: String = js.native
    inline def AXIS_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AXIS_LABEL_CLASS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/components", "DragBoxLayer")
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
  open class DragBoxLayer ()
    extends typings.plottable.buildSrcComponentsDragBoxLayerMod.DragBoxLayer
  
  @JSImport("plottable/build/src/components", "DragLineLayer")
  @js.native
  open class DragLineLayer[D] protected ()
    extends typings.plottable.buildSrcComponentsDragLineLayerMod.DragLineLayer[D] {
    def this(orientation: String) = this()
  }
  
  @JSImport("plottable/build/src/components", "Gridlines")
  @js.native
  /**
    * @constructor
    * @param {Scale} xScale The scale to base the x gridlines on. Pass null if no gridlines are desired.
    * @param {Scale} yScale The scale to base the y gridlines on. Pass null if no gridlines are desired.
    */
  open class Gridlines ()
    extends typings.plottable.buildSrcComponentsGridlinesMod.Gridlines {
    def this(xScale: Scale[Any, Any]) = this()
    def this(xScale: Null, yScale: Scale[Any, Any]) = this()
    def this(xScale: Scale[Any, Any], yScale: Scale[Any, Any]) = this()
  }
  
  @JSImport("plottable/build/src/components", "Group")
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
  open class Group ()
    extends typings.plottable.buildSrcComponentsGroupMod.Group {
    def this(components: js.Array[Component]) = this()
  }
  
  @JSImport("plottable/build/src/components", "GuideLineLayer")
  @js.native
  open class GuideLineLayer[D] protected ()
    extends typings.plottable.buildSrcComponentsGuideLineLayerMod.GuideLineLayer[D] {
    def this(orientation: String) = this()
  }
  /* static members */
  object GuideLineLayer {
    
    @JSImport("plottable/build/src/components", "GuideLineLayer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/components", "GuideLineLayer.ORIENTATION_HORIZONTAL")
    @js.native
    def ORIENTATION_HORIZONTAL: String = js.native
    inline def ORIENTATION_HORIZONTAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIENTATION_HORIZONTAL")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/components", "GuideLineLayer.ORIENTATION_VERTICAL")
    @js.native
    def ORIENTATION_VERTICAL: String = js.native
    inline def ORIENTATION_VERTICAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIENTATION_VERTICAL")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/components", "InterpolatedColorLegend")
  @js.native
  open class InterpolatedColorLegend protected ()
    extends typings.plottable.buildSrcComponentsInterpolatedColorLegendMod.InterpolatedColorLegend {
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
  /* static members */
  object InterpolatedColorLegend {
    
    @JSImport("plottable/build/src/components", "InterpolatedColorLegend")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The css class applied to the legend labels.
      */
    @JSImport("plottable/build/src/components", "InterpolatedColorLegend.LEGEND_LABEL_CLASS")
    @js.native
    def LEGEND_LABEL_CLASS: String = js.native
    inline def LEGEND_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_LABEL_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/components", "InterpolatedColorLegend._DEFAULT_NUM_SWATCHES")
    @js.native
    def _DEFAULT_NUM_SWATCHES: Any = js.native
    inline def _DEFAULT_NUM_SWATCHES_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_NUM_SWATCHES")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/components", "InterpolatedColorLegend._ensureOrientation")
    @js.native
    def _ensureOrientation: Any = js.native
    inline def _ensureOrientation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ensureOrientation")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/components", "Label")
  @js.native
  /**
    * A Label is a Component that displays a single line of text.
    *
    * @constructor
    * @param {string} [displayText=""] The text of the Label.
    * @param {number} [angle=0] The angle of the Label in degrees (-90/0/90). 0 is horizontal.
    */
  open class Label ()
    extends typings.plottable.buildSrcComponentsLabelMod.Label {
    def this(displayText: String) = this()
    def this(displayText: String, angle: Double) = this()
    def this(displayText: Unit, angle: Double) = this()
  }
  /* static members */
  object Label {
    
    @JSImport("plottable/build/src/components", "Label")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/components", "Label._DEFAULT_FONT_SIZE_PX")
    @js.native
    def _DEFAULT_FONT_SIZE_PX: LabelFontSizePx = js.native
    inline def _DEFAULT_FONT_SIZE_PX_=(x: LabelFontSizePx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_FONT_SIZE_PX")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/components", "Label._MAX_FONT_SIZE_PX")
    @js.native
    def _MAX_FONT_SIZE_PX: LabelFontSizePx = js.native
    inline def _MAX_FONT_SIZE_PX_=(x: LabelFontSizePx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_FONT_SIZE_PX")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/components", "Label._MIN_FONT_SIZE_PX")
    @js.native
    def _MIN_FONT_SIZE_PX: LabelFontSizePx = js.native
    inline def _MIN_FONT_SIZE_PX_=(x: LabelFontSizePx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MIN_FONT_SIZE_PX")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/components", "Legend")
  @js.native
  open class Legend protected ()
    extends typings.plottable.buildSrcComponentsLegendMod.Legend {
    /**
      * The Legend consists of a series of entries, each with a color and label taken from the Color Scale.
      *
      * @constructor
      * @param {Scale.Color} scale
      */
    def this(colorScale: Color) = this()
  }
  /* static members */
  object Legend {
    
    @JSImport("plottable/build/src/components", "Legend")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The css class applied to each legend entry
      */
    @JSImport("plottable/build/src/components", "Legend.LEGEND_ENTRY_CLASS")
    @js.native
    def LEGEND_ENTRY_CLASS: String = js.native
    inline def LEGEND_ENTRY_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_ENTRY_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each legend row
      */
    @JSImport("plottable/build/src/components", "Legend.LEGEND_ROW_CLASS")
    @js.native
    def LEGEND_ROW_CLASS: String = js.native
    inline def LEGEND_ROW_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_ROW_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each legend symbol
      */
    @JSImport("plottable/build/src/components", "Legend.LEGEND_SYMBOL_CLASS")
    @js.native
    def LEGEND_SYMBOL_CLASS: String = js.native
    inline def LEGEND_SYMBOL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_SYMBOL_CLASS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/components", "PlotGroup")
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
  open class PlotGroup ()
    extends typings.plottable.buildSrcComponentsPlotGroupMod.PlotGroup {
    def this(components: js.Array[Component]) = this()
  }
  
  @JSImport("plottable/build/src/components", "PropertyMode")
  @js.native
  object PropertyMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.plottable.buildSrcComponentsSelectionBoxLayerMod.PropertyMode & Double] = js.native
    
    /* 1 */ val PIXEL: typings.plottable.buildSrcComponentsSelectionBoxLayerMod.PropertyMode.PIXEL & Double = js.native
    
    /* 0 */ val VALUE: typings.plottable.buildSrcComponentsSelectionBoxLayerMod.PropertyMode.VALUE & Double = js.native
  }
  
  @JSImport("plottable/build/src/components", "SelectionBoxLayer")
  @js.native
  open class SelectionBoxLayer ()
    extends typings.plottable.buildSrcComponentsSelectionBoxLayerMod.SelectionBoxLayer
  
  @JSImport("plottable/build/src/components", "Table")
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
  open class Table ()
    extends typings.plottable.buildSrcComponentsTableMod.Table {
    def this(rows: js.Array[js.Array[js.UndefOr[Component | Null]]]) = this()
  }
  /* static members */
  object Table {
    
    @JSImport("plottable/build/src/components", "Table")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/components", "Table._calcComponentWeights")
    @js.native
    def _calcComponentWeights: Any = js.native
    inline def _calcComponentWeights_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_calcComponentWeights")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/components", "Table._calcProportionalSpace")
    @js.native
    def _calcProportionalSpace: Any = js.native
    inline def _calcProportionalSpace_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_calcProportionalSpace")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/components", "Table._fixedSpace")
    @js.native
    def _fixedSpace: Any = js.native
    inline def _fixedSpace_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_fixedSpace")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/components", "TitleLabel")
  @js.native
  /**
    * @constructor
    * @param {string} [text]
    * @param {number} [angle] One of -90/0/90. 0 is horizontal.
    */
  open class TitleLabel ()
    extends typings.plottable.buildSrcComponentsLabelMod.TitleLabel {
    def this(text: String) = this()
    def this(text: String, angle: Double) = this()
    def this(text: Unit, angle: Double) = this()
  }
  /* static members */
  object TitleLabel {
    
    @JSImport("plottable/build/src/components", "TitleLabel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/components", "TitleLabel.TITLE_LABEL_CLASS")
    @js.native
    def TITLE_LABEL_CLASS: String = js.native
    inline def TITLE_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TITLE_LABEL_CLASS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/components", "WrappedLabel")
  @js.native
  /**
    * A Label is a Component that displays a single line of text.
    *
    * @constructor
    * @param {string} [displayText=""] The text of the Label.
    * @param {number} [angle=0] The angle of the Label in degrees (-90/0/90). 0 is horizontal.
    */
  open class WrappedLabel ()
    extends typings.plottable.buildSrcComponentsWrappedLabelMod.WrappedLabel {
    def this(displayText: String) = this()
    def this(displayText: String, angle: Double) = this()
    def this(displayText: Unit, angle: Double) = this()
  }
  
  @JSImport("plottable/build/src/components", "XDragBoxLayer")
  @js.native
  /**
    * An XDragBoxLayer is a DragBoxLayer whose size can only be set in the X-direction.
    * The y-values of the bounds() are always set to 0 and the height() of the XDragBoxLayer.
    *
    * @constructor
    */
  open class XDragBoxLayer ()
    extends typings.plottable.buildSrcComponentsXDragBoxLayerMod.XDragBoxLayer
  
  @JSImport("plottable/build/src/components", "YDragBoxLayer")
  @js.native
  /**
    * A YDragBoxLayer is a DragBoxLayer whose size can only be set in the Y-direction.
    * The x-values of the bounds() are always set to 0 and the width() of the YDragBoxLayer.
    *
    * @constructor
    */
  open class YDragBoxLayer ()
    extends typings.plottable.buildSrcComponentsYDragBoxLayerMod.YDragBoxLayer
}
