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
  open class InterpolatedColorLegend protected () extends Component {
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
    
    /* private */ var _expands: Any = js.native
    
    /* private */ var _formatter: Any = js.native
    
    /* private */ var _generateTicks: Any = js.native
    
    /* private */ var _isVertical: Any = js.native
    
    /* private */ var _lowerLabel: Any = js.native
    
    /* private */ var _measurer: Any = js.native
    
    /* private */ var _orientation: Any = js.native
    
    /* private */ var _redrawCallback: Any = js.native
    
    /* private */ var _scale: Any = js.native
    
    /* private */ var _swatchBoundingBox: Any = js.native
    
    /* private */ var _swatchContainer: Any = js.native
    
    /* private */ var _textPadding: Any = js.native
    
    /* private */ var _upperLabel: Any = js.native
    
    /* private */ var _wrapper: Any = js.native
    
    /* private */ var _writer: Any = js.native
    
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
    def _DEFAULT_NUM_SWATCHES: Any = js.native
    inline def _DEFAULT_NUM_SWATCHES_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_NUM_SWATCHES")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/components/interpolatedColorLegend", "InterpolatedColorLegend._ensureOrientation")
    @js.native
    def _ensureOrientation: Any = js.native
    inline def _ensureOrientation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ensureOrientation")(x.asInstanceOf[js.Any])
  }
}
