package typings.plottable.mod

import typings.plottable.scalesMod.Color
import typings.plottable.scalesMod.InterpolatedColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Components {
  
  @JSImport("plottable", "Components.AxisLabel")
  @js.native
  /**
    * @constructor
    * @param {string} [text]
    * @param {number} [angle] One of -90/0/90. 0 is horizontal.
    */
  class AxisLabel ()
    extends typings.plottable.componentsMod.AxisLabel {
    def this(text: String) = this()
    def this(text: String, angle: Double) = this()
    def this(text: Unit, angle: Double) = this()
  }
  /* static members */
  object AxisLabel {
    
    @JSImport("plottable", "Components.AxisLabel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Components.AxisLabel.AXIS_LABEL_CLASS")
    @js.native
    def AXIS_LABEL_CLASS: String = js.native
    inline def AXIS_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AXIS_LABEL_CLASS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Components.DragBoxLayer")
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
    extends typings.plottable.componentsMod.DragBoxLayer
  
  @JSImport("plottable", "Components.DragLineLayer")
  @js.native
  class DragLineLayer[D] protected ()
    extends typings.plottable.componentsMod.DragLineLayer[D] {
    def this(orientation: String) = this()
  }
  
  @JSImport("plottable", "Components.Gridlines")
  @js.native
  /**
    * @constructor
    * @param {Scale} xScale The scale to base the x gridlines on. Pass null if no gridlines are desired.
    * @param {Scale} yScale The scale to base the y gridlines on. Pass null if no gridlines are desired.
    */
  class Gridlines ()
    extends typings.plottable.componentsMod.Gridlines {
    def this(xScale: typings.plottable.scaleMod.Scale[js.Any, js.Any]) = this()
    def this(xScale: Null, yScale: typings.plottable.scaleMod.Scale[js.Any, js.Any]) = this()
    def this(
      xScale: typings.plottable.scaleMod.Scale[js.Any, js.Any],
      yScale: typings.plottable.scaleMod.Scale[js.Any, js.Any]
    ) = this()
  }
  
  @JSImport("plottable", "Components.Group")
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
    extends typings.plottable.componentsMod.Group {
    def this(components: js.Array[typings.plottable.componentMod.Component]) = this()
  }
  
  @JSImport("plottable", "Components.GuideLineLayer")
  @js.native
  class GuideLineLayer[D] protected ()
    extends typings.plottable.componentsMod.GuideLineLayer[D] {
    def this(orientation: String) = this()
  }
  /* static members */
  object GuideLineLayer {
    
    @JSImport("plottable", "Components.GuideLineLayer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Components.GuideLineLayer.ORIENTATION_HORIZONTAL")
    @js.native
    def ORIENTATION_HORIZONTAL: String = js.native
    inline def ORIENTATION_HORIZONTAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIENTATION_HORIZONTAL")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Components.GuideLineLayer.ORIENTATION_VERTICAL")
    @js.native
    def ORIENTATION_VERTICAL: String = js.native
    inline def ORIENTATION_VERTICAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIENTATION_VERTICAL")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Components.InterpolatedColorLegend")
  @js.native
  class InterpolatedColorLegend protected ()
    extends typings.plottable.componentsMod.InterpolatedColorLegend {
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
    
    @JSImport("plottable", "Components.InterpolatedColorLegend")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The css class applied to the legend labels.
      */
    @JSImport("plottable", "Components.InterpolatedColorLegend.LEGEND_LABEL_CLASS")
    @js.native
    def LEGEND_LABEL_CLASS: String = js.native
    inline def LEGEND_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_LABEL_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Components.InterpolatedColorLegend._DEFAULT_NUM_SWATCHES")
    @js.native
    def _DEFAULT_NUM_SWATCHES: js.Any = js.native
    inline def _DEFAULT_NUM_SWATCHES_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_NUM_SWATCHES")(x.asInstanceOf[js.Any])
    
    inline def _ensureOrientation(orientation: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_ensureOrientation")(orientation.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @JSImport("plottable", "Components.Label")
  @js.native
  /**
    * A Label is a Component that displays a single line of text.
    *
    * @constructor
    * @param {string} [displayText=""] The text of the Label.
    * @param {number} [angle=0] The angle of the Label in degrees (-90/0/90). 0 is horizontal.
    */
  class Label ()
    extends typings.plottable.componentsMod.Label {
    def this(displayText: String) = this()
    def this(displayText: String, angle: Double) = this()
    def this(displayText: Unit, angle: Double) = this()
  }
  
  @JSImport("plottable", "Components.Legend")
  @js.native
  class Legend protected ()
    extends typings.plottable.componentsMod.Legend {
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
    
    @JSImport("plottable", "Components.Legend")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The css class applied to each legend entry
      */
    @JSImport("plottable", "Components.Legend.LEGEND_ENTRY_CLASS")
    @js.native
    def LEGEND_ENTRY_CLASS: String = js.native
    inline def LEGEND_ENTRY_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_ENTRY_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each legend row
      */
    @JSImport("plottable", "Components.Legend.LEGEND_ROW_CLASS")
    @js.native
    def LEGEND_ROW_CLASS: String = js.native
    inline def LEGEND_ROW_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_ROW_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each legend symbol
      */
    @JSImport("plottable", "Components.Legend.LEGEND_SYMBOL_CLASS")
    @js.native
    def LEGEND_SYMBOL_CLASS: String = js.native
    inline def LEGEND_SYMBOL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_SYMBOL_CLASS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Components.PlotGroup")
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
  class PlotGroup ()
    extends typings.plottable.componentsMod.PlotGroup {
    def this(components: js.Array[typings.plottable.componentMod.Component]) = this()
  }
  
  @JSImport("plottable", "Components.PropertyMode")
  @js.native
  object PropertyMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.plottable.selectionBoxLayerMod.PropertyMode & Double] = js.native
    
    /* 1 */ val PIXEL: typings.plottable.selectionBoxLayerMod.PropertyMode.PIXEL & Double = js.native
    
    /* 0 */ val VALUE: typings.plottable.selectionBoxLayerMod.PropertyMode.VALUE & Double = js.native
  }
  
  @JSImport("plottable", "Components.SelectionBoxLayer")
  @js.native
  class SelectionBoxLayer ()
    extends typings.plottable.componentsMod.SelectionBoxLayer
  
  @JSImport("plottable", "Components.Table")
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
    extends typings.plottable.componentsMod.Table {
    def this(rows: js.Array[js.Array[js.UndefOr[typings.plottable.componentMod.Component | Null]]]) = this()
  }
  /* static members */
  object Table {
    
    @JSImport("plottable", "Components.Table")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _calcComponentWeights(setWeights: js.Any, componentGroups: js.Any, fixityAccessor: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_calcComponentWeights")(setWeights.asInstanceOf[js.Any], componentGroups.asInstanceOf[js.Any], fixityAccessor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def _calcProportionalSpace(weights: js.Any, freeSpace: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_calcProportionalSpace")(weights.asInstanceOf[js.Any], freeSpace.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def _fixedSpace(componentGroup: js.Any, fixityAccessor: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_fixedSpace")(componentGroup.asInstanceOf[js.Any], fixityAccessor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @JSImport("plottable", "Components.TitleLabel")
  @js.native
  /**
    * @constructor
    * @param {string} [text]
    * @param {number} [angle] One of -90/0/90. 0 is horizontal.
    */
  class TitleLabel ()
    extends typings.plottable.componentsMod.TitleLabel {
    def this(text: String) = this()
    def this(text: String, angle: Double) = this()
    def this(text: Unit, angle: Double) = this()
  }
  /* static members */
  object TitleLabel {
    
    @JSImport("plottable", "Components.TitleLabel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Components.TitleLabel.TITLE_LABEL_CLASS")
    @js.native
    def TITLE_LABEL_CLASS: String = js.native
    inline def TITLE_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TITLE_LABEL_CLASS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Components.WrappedLabel")
  @js.native
  /**
    * A Label is a Component that displays a single line of text.
    *
    * @constructor
    * @param {string} [displayText=""] The text of the Label.
    * @param {number} [angle=0] The angle of the Label in degrees (-90/0/90). 0 is horizontal.
    */
  class WrappedLabel ()
    extends typings.plottable.componentsMod.WrappedLabel {
    def this(displayText: String) = this()
    def this(displayText: String, angle: Double) = this()
    def this(displayText: Unit, angle: Double) = this()
  }
  
  @JSImport("plottable", "Components.XDragBoxLayer")
  @js.native
  /**
    * An XDragBoxLayer is a DragBoxLayer whose size can only be set in the X-direction.
    * The y-values of the bounds() are always set to 0 and the height() of the XDragBoxLayer.
    *
    * @constructor
    */
  class XDragBoxLayer ()
    extends typings.plottable.componentsMod.XDragBoxLayer
  
  @JSImport("plottable", "Components.YDragBoxLayer")
  @js.native
  /**
    * A YDragBoxLayer is a DragBoxLayer whose size can only be set in the Y-direction.
    * The x-values of the bounds() are always set to 0 and the width() of the YDragBoxLayer.
    *
    * @constructor
    */
  class YDragBoxLayer ()
    extends typings.plottable.componentsMod.YDragBoxLayer
}
