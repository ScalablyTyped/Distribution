package typings.plottable

import typings.d3Time.mod.CountableTimeInterval
import typings.plottable.buildSrcScalesQuantitativeScaleMod.QuantitativeScale
import typings.plottable.buildSrcScalesScaleMod.Scale
import typings.plottable.buildSrcScalesTickGeneratorsMod.ITickGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcScalesMod {
  
  @JSImport("plottable/build/src/scales", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/scales", "Category")
  @js.native
  /**
    * A Category Scale maps strings to numbers.
    *
    * @constructor
    */
  open class Category ()
    extends typings.plottable.buildSrcScalesCategoryScaleMod.Category
  /* static members */
  object Category {
    
    @JSImport("plottable/build/src/scales", "Category")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/scales", "Category._convertToPlottableInnerPadding")
    @js.native
    def _convertToPlottableInnerPadding: Any = js.native
    inline def _convertToPlottableInnerPadding_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_convertToPlottableInnerPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/scales", "Category._convertToPlottableOuterPadding")
    @js.native
    def _convertToPlottableOuterPadding: Any = js.native
    inline def _convertToPlottableOuterPadding_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_convertToPlottableOuterPadding")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/scales", "Color")
  @js.native
  /**
    * A Color Scale maps string values to color hex values expressed as a string.
    *
    * @constructor
    * @param {string} [scaleType] One of "Category10"/"Category20"/"Category20b"/"Category20c".
    *   (see https://github.com/mbostock/d3/wiki/Ordinal-Scales#categorical-colors)
    *   If not supplied, reads the colors defined using CSS -- see plottable.css.
    */
  open class Color ()
    extends typings.plottable.buildSrcScalesColorScaleMod.Color {
    def this(scaleType: String) = this()
  }
  /* static members */
  object Color {
    
    @JSImport("plottable/build/src/scales", "Color")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/scales", "Color._LOOP_LIGHTEN_FACTOR")
    @js.native
    def _LOOP_LIGHTEN_FACTOR: Any = js.native
    inline def _LOOP_LIGHTEN_FACTOR_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LOOP_LIGHTEN_FACTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/scales", "Color._MAXIMUM_COLORS_FROM_CSS")
    @js.native
    def _MAXIMUM_COLORS_FROM_CSS: Any = js.native
    inline def _MAXIMUM_COLORS_FROM_CSS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAXIMUM_COLORS_FROM_CSS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/scales", "Color._getPlottableColors")
    @js.native
    def _getPlottableColors: Any = js.native
    inline def _getPlottableColors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getPlottableColors")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/scales", "Color._plottableColorCache")
    @js.native
    def _plottableColorCache: Any = js.native
    inline def _plottableColorCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_plottableColorCache")(x.asInstanceOf[js.Any])
    
    inline def invalidateColorCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateColorCache")().asInstanceOf[Unit]
  }
  
  @JSImport("plottable/build/src/scales", "InterpolatedColor")
  @js.native
  /**
    * An InterpolatedColor Scale maps numbers to color hex values, expressed as strings.
    *
    * @param {string} [scaleType="linear"] One of "linear"/"log"/"sqrt"/"pow".
    */
  open class InterpolatedColor ()
    extends typings.plottable.buildSrcScalesInterpolatedColorScaleMod.InterpolatedColor {
    def this(scaleType: String) = this()
  }
  /* static members */
  object InterpolatedColor {
    
    @JSImport("plottable/build/src/scales", "InterpolatedColor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/scales", "InterpolatedColor.BLUES")
    @js.native
    def BLUES: js.Array[String] = js.native
    inline def BLUES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUES")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/scales", "InterpolatedColor.POSNEG")
    @js.native
    def POSNEG: js.Array[String] = js.native
    inline def POSNEG_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSNEG")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/scales", "InterpolatedColor.REDS")
    @js.native
    def REDS: js.Array[String] = js.native
    inline def REDS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REDS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/scales", "Linear")
  @js.native
  /**
    * @constructor
    */
  open class Linear ()
    extends typings.plottable.buildSrcScalesLinearScaleMod.Linear
  
  @JSImport("plottable/build/src/scales", "Log")
  @js.native
  /**
    * @constructor
    */
  open class Log ()
    extends typings.plottable.buildSrcScalesLogScaleMod.Log {
    def this(base: Double) = this()
  }
  
  @JSImport("plottable/build/src/scales", "ModifiedLog")
  @js.native
  /**
    * A ModifiedLog Scale acts as a regular log scale for large numbers.
    * As it approaches 0, it gradually becomes linear.
    * Consequently, a ModifiedLog Scale can process 0 and negative numbers.
    *
    * For x >= base, scale(x) = log(x).
    *
    * For 0 < x < base, scale(x) will become more and more
    * linear as it approaches 0.
    *
    * At x == 0, scale(x) == 0.
    *
    * For negative values, scale(-x) = -scale(x).
    *
    * The range and domain for the scale should also be set, using the
    * range() and domain() accessors, respectively.
    *
    * For `range`, provide a two-element array giving the minimum and
    * maximum of values produced when scaling.
    *
    * For `domain` provide a two-element array giving the minimum and
    * maximum of the values that will be scaled.
    *
    * @constructor
    * @param {number} [base=10]
    *        The base of the log. Must be > 1.
    *
    */
  open class ModifiedLog ()
    extends typings.plottable.buildSrcScalesModifiedLogScaleMod.ModifiedLog {
    def this(base: Double) = this()
  }
  
  object TickGenerators {
    
    @JSImport("plottable/build/src/scales", "TickGenerators")
    @js.native
    val ^ : js.Any = js.native
    
    inline def integerTickGenerator(): ITickGenerator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("integerTickGenerator")().asInstanceOf[ITickGenerator[Double]]
    
    inline def intervalTickGenerator(interval: Double): ITickGenerator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("intervalTickGenerator")(interval.asInstanceOf[js.Any]).asInstanceOf[ITickGenerator[Double]]
  }
  
  @JSImport("plottable/build/src/scales", "Time")
  @js.native
  /**
    * A Time Scale maps Date objects to numbers.
    *
    * @constructor
    */
  open class Time ()
    extends typings.plottable.buildSrcScalesTimeScaleMod.Time
  /* static members */
  object Time {
    
    @JSImport("plottable/build/src/scales", "Time")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Transforms the Plottable TimeInterval string into a d3 time interval equivalent.
      * If the provided TimeInterval is incorrect, the default is d3.timeYear
      */
    inline def timeIntervalToD3Time(timeInterval: String, useUTC: Boolean): CountableTimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("timeIntervalToD3Time")(timeInterval.asInstanceOf[js.Any], useUTC.asInstanceOf[js.Any])).asInstanceOf[CountableTimeInterval]
  }
  
  inline def isTransformable(scale: Any): /* is plottable.plottable/build/src/scales.ITransformableScale */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransformable")(scale.asInstanceOf[js.Any]).asInstanceOf[/* is plottable.plottable/build/src/scales.ITransformableScale */ Boolean]
  
  type IIncludedValuesProvider[D] = js.Function2[/* scale */ Scale[D, Any], /* ignoreAnchorState */ js.UndefOr[Boolean], js.Array[D]]
  
  type IPaddingExceptionsProvider[D] = js.Function1[/* scale */ QuantitativeScale[D], js.Array[D]]
  
  trait ITransformableScale extends StObject {
    
    /**
      * Returns the current transformed domain of the scale. This must be a
      * numerical range in the same coordinate space used for
      * `scaleTransformation`.
      */
    def getTransformationDomain(): js.Tuple2[Double, Double]
    
    /**
      * Gets the full extent of the transformation domain.
      */
    def getTransformationExtent(): js.Tuple2[Double, Double]
    
    /**
      * Returns value in *Transformation Space* for the provided *screen space*.
      */
    def invertedTransformation(value: Double): Double
    
    /**
      * Translates the scale by a number of pixels.
      *
      * @param {number} [translateAmount] The translation amount in screen space
      */
    def pan(translateAmount: Double): Unit
    
    /**
      * Returns value in *screen space* for the given domain value.
      */
    def scaleTransformation(value: Double): Double
    
    /**
      * Directly set the transformation domain. Instead of calling `.zoom` or
      * `.pan` perform calculations relative to the current domain, this can but
      * used to pan/zoom to an exact domain interval (in transformation space).
      */
    def setTransformationDomain(domain: js.Tuple2[Double, Double]): Unit
    
    /**
      * Apply the magnification with the floating point `magnifyAmount` centered
      * at the `centerValue` coordinate.
      *
      * @param {number} [magnifyAmount] The floating point zoom amount. `1.0` is
      * no zoom change.
      * @param {number} [centerValue] The coordinate of the mouse in screen
      * space.
      */
    def zoom(magnifyAmount: Double, centerValue: Double): Unit
  }
  object ITransformableScale {
    
    inline def apply(
      getTransformationDomain: () => js.Tuple2[Double, Double],
      getTransformationExtent: () => js.Tuple2[Double, Double],
      invertedTransformation: Double => Double,
      pan: Double => Unit,
      scaleTransformation: Double => Double,
      setTransformationDomain: js.Tuple2[Double, Double] => Unit,
      zoom: (Double, Double) => Unit
    ): ITransformableScale = {
      val __obj = js.Dynamic.literal(getTransformationDomain = js.Any.fromFunction0(getTransformationDomain), getTransformationExtent = js.Any.fromFunction0(getTransformationExtent), invertedTransformation = js.Any.fromFunction1(invertedTransformation), pan = js.Any.fromFunction1(pan), scaleTransformation = js.Any.fromFunction1(scaleTransformation), setTransformationDomain = js.Any.fromFunction1(setTransformationDomain), zoom = js.Any.fromFunction2(zoom))
      __obj.asInstanceOf[ITransformableScale]
    }
    
    extension [Self <: ITransformableScale](x: Self) {
      
      inline def setGetTransformationDomain(value: () => js.Tuple2[Double, Double]): Self = StObject.set(x, "getTransformationDomain", js.Any.fromFunction0(value))
      
      inline def setGetTransformationExtent(value: () => js.Tuple2[Double, Double]): Self = StObject.set(x, "getTransformationExtent", js.Any.fromFunction0(value))
      
      inline def setInvertedTransformation(value: Double => Double): Self = StObject.set(x, "invertedTransformation", js.Any.fromFunction1(value))
      
      inline def setPan(value: Double => Unit): Self = StObject.set(x, "pan", js.Any.fromFunction1(value))
      
      inline def setScaleTransformation(value: Double => Double): Self = StObject.set(x, "scaleTransformation", js.Any.fromFunction1(value))
      
      inline def setSetTransformationDomain(value: js.Tuple2[Double, Double] => Unit): Self = StObject.set(x, "setTransformationDomain", js.Any.fromFunction1(value))
      
      inline def setZoom(value: (Double, Double) => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction2(value))
    }
  }
}
