package typings.plottable

import typings.plottable.scaleMod.Scale
import typings.plottable.scalesMod.ITransformableScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/scales/categoryScale", JSImport.Namespace)
@js.native
object categoryScaleMod extends js.Object {
  
  @js.native
  /**
    * A Category Scale maps strings to numbers.
    *
    * @constructor
    */
  class Category ()
    extends Scale[String, Double]
       with ITransformableScale {
    
    var _d3Scale: js.Any = js.native
    
    /**
      * An additional linear scale to apply pan/zoom interactions to the category
      * scale. Pan/zoom requires a numerically invertable scale.
      *
      * This adds an intermediate coordinate space called the *Transformation
      * Space*. The conversion from data to screen coordinates is as follows:
      *
      * Data Space -> _d3Scale -> Transformation Space -> _d3TransformationScale -> Screen Space.
      *
      * The *Transformation Space* coordinates are initialized to [0, 1].
      *
      * Notably, range band calculations are internally computed in
      * *Transformation Space* and transformed to screen space in methods like
      * `rangeBand()` and `stepWidth()`.
      */
    var _d3TransformationScale: js.Any = js.native
    
    var _innerPadding: js.Any = js.native
    
    var _outerPadding: js.Any = js.native
    
    var _range: js.Any = js.native
    
    /**
      * Converts a width or height in *Transformation Space* into *Screen Space*.
      */
    /* protected */ def _rescaleBand(band: Double): Double = js.native
    
    /* private */ def _setBands(): js.Any = js.native
    
    /**
      * Return a clone of this category scale that holds the same pan/zoom, padding, domain and range, but
      * without any included values providers.
      */
    def cloneWithoutProviders(): Category = js.native
    
    /**
      * Gets the inner padding.
      *
      * The inner padding is defined as the padding in between bands on the scale,
      * expressed as a multiple of the rangeBand().
      *
      * @returns {number}
      */
    def innerPadding(): Double = js.native
    /**
      * Sets the inner padding.
      *
      * The inner padding is defined as the padding in between bands on the scale,
      * expressed as a multiple of the rangeBand().
      *
      * @returns {Category} The calling Category Scale.
      */
    def innerPadding(innerPadding: Double): this.type = js.native
    
    /**
      * Returns domain values that lie inside the given range.
      * @param range
      * @returns {string[]}
      */
    def invertRange(): js.Array[String] = js.native
    def invertRange(range: js.Tuple2[Double, Double]): js.Array[String] = js.native
    
    /**
      * Gets the outer padding.
      *
      * The outer padding is the padding in between the outer bands and the edges of the range,
      * expressed as a multiple of the rangeBand().
      *
      * @returns {number}
      */
    def outerPadding(): Double = js.native
    /**
      * Sets the outer padding.
      *
      * The outer padding is the padding in between the outer bands and the edges of the range,
      * expressed as a multiple of the rangeBand().
      *
      * @returns {Category} The calling Category Scale.
      */
    def outerPadding(outerPadding: Double): this.type = js.native
    
    def range(values: js.Tuple2[Double, Double]): this.type = js.native
    
    /**
      * Returns the width of the range band.
      *
      * @returns {number} The range band width
      */
    def rangeBand(): Double = js.native
    
    /**
      * Returns the step width of the scale.
      *
      * The step width is the pixel distance between adjacent values in the domain.
      *
      * @returns {number}
      */
    def stepWidth(): Double = js.native
  }
  /* static members */
  @js.native
  object Category extends js.Object {
    
    /* private */ def _convertToPlottableInnerPadding(d3InnerPadding: js.Any): js.Any = js.native
    
    /* private */ def _convertToPlottableOuterPadding(d3OuterPadding: js.Any, d3InnerPadding: js.Any): js.Any = js.native
  }
}
