package typings.plottable

import typings.plottable.scaleMod.Scale
import typings.plottable.scalesMod.ITransformableScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoryScaleMod {
  
  @JSImport("plottable/build/src/scales/categoryScale", "Category")
  @js.native
  /**
    * A Category Scale maps strings to numbers.
    *
    * @constructor
    */
  open class Category ()
    extends Scale[String, Double]
       with ITransformableScale {
    
    /* private */ var _d3Scale: Any = js.native
    
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
    /* private */ var _d3TransformationScale: Any = js.native
    
    /* private */ var _innerPadding: Any = js.native
    
    /* private */ var _outerPadding: Any = js.native
    
    /* private */ var _range: Any = js.native
    
    /**
      * Converts a width or height in *Transformation Space* into *Screen Space*.
      */
    /* protected */ def _rescaleBand(band: Double): Double = js.native
    
    /* private */ var _setBands: Any = js.native
    
    /**
      * Return a clone of this category scale that holds the same pan/zoom, padding, domain and range, but
      * without any included values providers.
      */
    def cloneWithoutProviders(): Category = js.native
    
    /**
      * Returns the current transformed domain of the scale. This must be a
      * numerical range in the same coordinate space used for
      * `scaleTransformation`.
      */
    /* CompleteClass */
    override def getTransformationDomain(): js.Tuple2[Double, Double] = js.native
    
    /**
      * Gets the full extent of the transformation domain.
      */
    /* CompleteClass */
    override def getTransformationExtent(): js.Tuple2[Double, Double] = js.native
    
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
      * Returns value in *Transformation Space* for the provided *screen space*.
      */
    /* CompleteClass */
    override def invertedTransformation(value: Double): Double = js.native
    
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
    
    /**
      * Translates the scale by a number of pixels.
      *
      * @param {number} [translateAmount] The translation amount in screen space
      */
    /* CompleteClass */
    override def pan(translateAmount: Double): Unit = js.native
    
    def range(values: js.Tuple2[Double, Double]): this.type = js.native
    
    /**
      * Returns the width of the range band.
      *
      * @returns {number} The range band width
      */
    def rangeBand(): Double = js.native
    
    /**
      * Returns value in *screen space* for the given domain value.
      */
    /* CompleteClass */
    override def scaleTransformation(value: Double): Double = js.native
    
    /**
      * Directly set the transformation domain. Instead of calling `.zoom` or
      * `.pan` perform calculations relative to the current domain, this can but
      * used to pan/zoom to an exact domain interval (in transformation space).
      */
    /* CompleteClass */
    override def setTransformationDomain(domain: js.Tuple2[Double, Double]): Unit = js.native
    
    /**
      * Returns the step width of the scale.
      *
      * The step width is the pixel distance between adjacent values in the domain.
      *
      * @returns {number}
      */
    def stepWidth(): Double = js.native
    
    /**
      * Apply the magnification with the floating point `magnifyAmount` centered
      * at the `centerValue` coordinate.
      *
      * @param {number} [magnifyAmount] The floating point zoom amount. `1.0` is
      * no zoom change.
      * @param {number} [centerValue] The coordinate of the mouse in screen
      * space.
      */
    /* CompleteClass */
    override def zoom(magnifyAmount: Double, centerValue: Double): Unit = js.native
  }
  /* static members */
  object Category {
    
    @JSImport("plottable/build/src/scales/categoryScale", "Category")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/scales/categoryScale", "Category._convertToPlottableInnerPadding")
    @js.native
    def _convertToPlottableInnerPadding: Any = js.native
    inline def _convertToPlottableInnerPadding_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_convertToPlottableInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/scales/categoryScale", "Category._convertToPlottableOuterPadding")
    @js.native
    def _convertToPlottableOuterPadding: Any = js.native
    inline def _convertToPlottableOuterPadding_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_convertToPlottableOuterPadding")(x.asInstanceOf[js.Any])
  }
}
