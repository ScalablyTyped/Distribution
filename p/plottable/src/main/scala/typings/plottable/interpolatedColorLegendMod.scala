package typings.plottable

import typings.plottable.componentMod.Component
import typings.plottable.formattersMod.Formatter
import typings.plottable.scalesMod.InterpolatedColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interpolatedColorLegendMod {
  
  @JSImport("plottable/build/src/components/interpolatedColorLegend", "InterpolatedColorLegend")
  @js.native
  class InterpolatedColorLegend protected () extends Component {
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
    
    /* private */ var _expands: js.Any = js.native
    
    /* private */ var _formatter: js.Any = js.native
    
    /* private */ def _generateTicks(numSwatches: js.Any): js.Any = js.native
    
    /* private */ def _isVertical(): js.Any = js.native
    
    /* private */ var _lowerLabel: js.Any = js.native
    
    /* private */ var _measurer: js.Any = js.native
    
    /* private */ var _orientation: js.Any = js.native
    
    /* private */ var _redrawCallback: js.Any = js.native
    
    /* private */ var _scale: js.Any = js.native
    
    /* private */ var _swatchBoundingBox: js.Any = js.native
    
    /* private */ var _swatchContainer: js.Any = js.native
    
    /* private */ var _textPadding: js.Any = js.native
    
    /* private */ var _upperLabel: js.Any = js.native
    
    /* private */ var _wrapper: js.Any = js.native
    
    /* private */ var _writer: js.Any = js.native
    
    /**
      * Gets whether the InterpolatedColorLegend expands to occupy all offered space in the long direction
      */
    def expands(): Boolean = js.native
    /**
      * Sets whether the InterpolatedColorLegend expands to occupy all offered space in the long direction
      *
      * @param {expands} boolean
      * @returns {InterpolatedColorLegend} The calling InterpolatedColorLegend.
      */
    def expands(expands: Boolean): this.type = js.native
    
    /**
      * Gets the Formatter for the labels. The domain ticks will be passed through the formatter
      * before being displayed.
      */
    def formatter(): Formatter = js.native
    /**
      * Sets the Formatter for the labels. The domain ticks will be passed through the formatter
      * before being displayed.
      *
      * @param {Formatter} formatter
      * @returns {InterpolatedColorLegend} The calling InterpolatedColorLegend.
      */
    def formatter(formatter: Formatter): this.type = js.native
    
    /**
      * Gets the orientation.
      */
    def orientation(): String = js.native
    /**
      * Sets the orientation.
      *
      * @param {string} orientation One of "horizontal"/"left"/"right".
      * @returns {InterpolatedColorLegend} The calling InterpolatedColorLegend.
      */
    def orientation(orientation: String): this.type = js.native
  }
  /* static members */
  object InterpolatedColorLegend {
    
    @JSImport("plottable/build/src/components/interpolatedColorLegend", "InterpolatedColorLegend")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The css class applied to the legend labels.
      */
    @JSImport("plottable/build/src/components/interpolatedColorLegend", "InterpolatedColorLegend.LEGEND_LABEL_CLASS")
    @js.native
    def LEGEND_LABEL_CLASS: String = js.native
    inline def LEGEND_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_LABEL_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/components/interpolatedColorLegend", "InterpolatedColorLegend._DEFAULT_NUM_SWATCHES")
    @js.native
    def _DEFAULT_NUM_SWATCHES: js.Any = js.native
    inline def _DEFAULT_NUM_SWATCHES_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_NUM_SWATCHES")(x.asInstanceOf[js.Any])
    
    inline def _ensureOrientation(orientation: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_ensureOrientation")(orientation.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
