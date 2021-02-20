package typings.plottable

import typings.plottable.axisMod.Axis
import typings.plottable.axisMod.AxisOrientation
import typings.plottable.quantitativeScaleMod.QuantitativeScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numericAxisMod {
  
  @JSImport("plottable/build/src/axes/numericAxis", "Numeric")
  @js.native
  class Numeric protected () extends Axis[Double] {
    /**
      * Constructs a Numeric Axis.
      *
      * A Numeric Axis is a visual representation of a QuantitativeScale.
      *
      * @constructor
      * @param {QuantitativeScale} scale
      * @param {AxisOrientation} orientation Orientation of this Numeric Axis.
      */
    def this(scale: QuantitativeScale[Double], orientation: AxisOrientation) = this()
    
    /* private */ def _computeApproximateTextWidth(): js.Any = js.native
    
    /* private */ def _computeExactTextWidth(): js.Any = js.native
    
    /**
      * The method is responsible for evenly spacing the labels on the axis.
      * @return test to see if taking every `interval` recrangle from `rects`
      *         will result in labels not overlapping
      *
      * For top, bottom, left, right positioning of the thicks, we want the padding
      * between the labels to be 3x, such that the label will be  `padding` distance
      * from the tick and 2 * `padding` distance (or more) from the next tick:
      * see https://github.com/palantir/plottable/pull/1812
      */
    /* private */ def _hasOverlapWithInterval(interval: js.Any, rects: js.Any): js.Any = js.native
    
    /* private */ def _hideEndTickLabels(): js.Any = js.native
    
    /* private */ def _hideOverlappingTickLabels(): js.Any = js.native
    
    var _measurer: js.Any = js.native
    
    var _tickLabelPositioning: js.Any = js.native
    
    var _usesTextWidthApproximation: js.Any = js.native
    
    var _wrapper: js.Any = js.native
    
    /**
      * Gets the tick label position relative to the tick marks.
      *
      * @returns {string} The current tick label position.
      */
    def tickLabelPosition(): String = js.native
    /**
      * Sets the tick label position relative to the tick marks.
      *
      * @param {string} position "top"/"center"/"bottom" for a vertical Numeric Axis,
      *                          "left"/"center"/"right" for a horizontal Numeric Axis.
      * @returns {Numeric} The calling Numeric Axis.
      */
    def tickLabelPosition(position: String): this.type = js.native
    
    /**
      * Gets the approximate text width setting.
      *
      * @returns {boolean} The current text width approximation setting.
      */
    def usesTextWidthApproximation(): Boolean = js.native
    /**
      * Sets the approximate text width setting. Approximating text width
      * measurements can drastically speed up plot rendering, but the plot may
      * have extra white space that would be eliminated by exact measurements.
      * Additionally, very abnormal fonts may not approximate reasonably.
      *
      * @param {boolean} The new text width approximation setting.
      * @returns {Axes.Numeric} The calling Axes.Numeric.
      */
    def usesTextWidthApproximation(enable: Boolean): this.type = js.native
  }
}
