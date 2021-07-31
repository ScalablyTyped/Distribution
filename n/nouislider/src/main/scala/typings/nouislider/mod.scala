package typings.nouislider

import org.scalablytyped.runtime.StringDictionary
import typings.nouislider.nouisliderNumbers.`0`
import typings.nouislider.nouisliderNumbers.`1`
import typings.nouislider.nouisliderNumbers.`2`
import typings.nouislider.nouisliderStrings.count
import typings.nouislider.nouisliderStrings.horizontal
import typings.nouislider.nouisliderStrings.lower
import typings.nouislider.nouisliderStrings.ltr
import typings.nouislider.nouisliderStrings.positions
import typings.nouislider.nouisliderStrings.range
import typings.nouislider.nouisliderStrings.rtl
import typings.nouislider.nouisliderStrings.steps
import typings.nouislider.nouisliderStrings.upper
import typings.nouislider.nouisliderStrings.values
import typings.nouislider.nouisliderStrings.vertical
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nouislider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * To create a slider, call noUiSlider.create() with an element and your options.
    */
  @scala.inline
  def create(target: HTMLElement, options: Options): noUiSlider = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[noUiSlider]
  
  type Callback = js.Function3[
    /* values */ js.Array[js.Any], 
    /* handle */ Double, 
    /* unencodedValues */ js.Array[Double], 
    Unit
  ]
  
  @js.native
  trait Instance
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var noUiSlider: typings.nouislider.mod.noUiSlider = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Set the animate option to false to prevent the slider from animating to a new value with when calling .val().
      */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The animationDuration option can be used to set the animation speed assumed by the slider library.
      * In addition to this, you must manually set the CSS (-webkit-)transition property for the .noUi-state-tap .noUi-origin selector.
      */
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * All values on the slider are part of a range. The range has a minimum and maximum value.
      */
    var behaviour: js.UndefOr[String] = js.undefined
    
    /**
      * The connect option can be used to control the bar between the handles or the edges of the slider.
      * If you are using one handle, set the value to either `upper` or `lower`.
      * For sliders with 2 or more handles, pass an array with a boolean for every connecting element,
      * including the edges of the slider. The length of this array must match the handle `count + 1`.
      * Setting `true` sets the bars between the handles, but not between the handles and the sliders edges.
      */
    var connect: js.UndefOr[lower | upper | Boolean | js.Array[Boolean]] = js.undefined
    
    /**
      * By default the sliders are top-to-bottom and left-to-right,
      * but you can change this using the direction option,
      * which decides where the upper side of the slider is.
      */
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    /**
      * To format the slider output, noUiSlider offers a format option.
      * Simply specify to and from functions to encode and decode the values.
      * See manual formatting to the right for usage information.
      * By default, noUiSlider will format output with 2 decimals.
      */
    var format: js.UndefOr[js.Object | (js.Function1[/* repeated */ js.Any, js.Any])] = js.undefined
    
    /**
      * The limit option is the opposite of the margin option,
      * limiting the maximum distance between two handles.
      * As with the margin option, the limit option can only be used on linear sliders.
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * When using two handles, the minimum distance between the handles can be set using the margin option.
      * The margin value is relative to the value set in 'range'.
      * This option is only available on standard linear sliders.
      */
    var margin: js.UndefOr[Double] = js.undefined
    
    /**
      * The orientation setting can be used to set the slider to "vertical" or "horizontal".
      * Set dimensions! Vertical sliders don't assume a default height, so you'll need to set one.
      * You can use any unit you want, including % or px.
      */
    var orientation: js.UndefOr[vertical | horizontal] = js.undefined
    
    /**
      * Padding limits how close to the slider edges handles can be.
      */
    var padding: js.UndefOr[Double] = js.undefined
    
    /**
      * Allows you to generate points along the slider.
      */
    var pips: js.UndefOr[PipsOptions] = js.undefined
    
    /**
      * All values on the slider are part of a range. The range has a minimum and maximum value.
      * The minimum value cannot be equal to the maximum value.
      */
    var range: StringDictionary[Double | js.Array[Double]]
    
    /**
      * When a non-linear slider has been configured, the snap option can be set to true to force the slider to jump
      * between the specified values.
      */
    var snap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The start option sets the number of handles and their start positions, relative to range.
      */
    var start: Double | (js.Array[js.Array[Double] | Double])
    
    /**
      * By default, the slider slides fluently.
      * In order to make the handles jump between intervals, you can use this option.
      * The step option is relative to the values provided to range.
      */
    var step: js.UndefOr[Double] = js.undefined
    
    /**
      * noUiSlider can provide a basic tooltip without using its events system.
      * Set the tooltips option to true to enable.
      * This option can also accept formatting options to format the tooltips content.
      * In that case, pass an array with a formatter for each handle, true to use the default or false to display no tooltip.
      */
    var tooltips: js.UndefOr[Boolean | js.Object | (js.Function1[/* repeated */ js.Any, js.Any])] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(
      range: StringDictionary[Double | js.Array[Double]],
      start: Double | (js.Array[js.Array[Double] | Double])
    ): Options = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setBehaviour(value: String): Self = StObject.set(x, "behaviour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviourUndefined: Self = StObject.set(x, "behaviour", js.undefined)
      
      @scala.inline
      def setConnect(value: lower | upper | Boolean | js.Array[Boolean]): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      @scala.inline
      def setConnectVarargs(value: Boolean*): Self = StObject.set(x, "connect", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setFormat(value: js.Object | (js.Function1[/* repeated */ js.Any, js.Any])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction1(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPips(value: PipsOptions): Self = StObject.set(x, "pips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipsUndefined: Self = StObject.set(x, "pips", js.undefined)
      
      @scala.inline
      def setRange(value: StringDictionary[Double | js.Array[Double]]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnap(value: Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      @scala.inline
      def setStart(value: Double | (js.Array[js.Array[Double] | Double])): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setTooltips(value: Boolean | js.Object | (js.Function1[/* repeated */ js.Any, js.Any])): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipsFunction1(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "tooltips", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nouislider.nouisliderNumbers.`0`
    - typings.nouislider.nouisliderNumbers.`1`
    - typings.nouislider.nouisliderNumbers.`2`
  */
  trait PipFilterResult extends StObject
  object PipFilterResult {
    
    @scala.inline
    def LargeValue: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def NoValue: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def SmallValue: `2` = 2.asInstanceOf[`2`]
  }
  
  trait PipsOptions extends StObject {
    
    /**
      * Range Mode: percentage for range mode
      * Step Mode: step number for steps
      * Positions Mode: percentage-based positions on the slider
      * Count Mode: positions between pips
      */
    var density: js.UndefOr[Double] = js.undefined
    
    /**
      * Step Mode: The filter option can be used to filter the generated pips.
      * The filter function must return 0 (no value), 1 (large value) or 2 (small value).
      */
    var filter: js.UndefOr[js.Function1[/* repeated */ js.Any, PipFilterResult]] = js.undefined
    
    /**
      * format for step mode
      * see noUiSlider format
      */
    var format: js.UndefOr[js.Object | (js.Function1[/* repeated */ js.Any, js.Any])] = js.undefined
    
    /**
      * The 'range' mode uses the slider range to determine where the pips should be. A pip is generated for every percentage specified.
      *
      * The 'steps', like 'range', uses the slider range. In steps mode, a pip is generated for every step.
      * The 'filter' option can be used to filter the generated pips from the 'steps' options'
      * The filter function must return 0 (no value), 1 (large value) or 2 (small value).
      *
      * In 'positions' mode, pips are generated at percentage-based positions on the slider.
      * Optionally, the stepped option can be set to true to match the pips to the slider steps.
      *
      * The 'count' mode can be used to generate a fixed number of pips. As with positions mode, the stepped option can be used.
      *
      * The 'values' mode is similar to positions, but it accepts values instead of percentages. The stepped option can be used for this mode.
      *
      */
    var mode: range | steps | positions | count | values
    
    /**
      * stepped option for positions, values and count mode
      */
    var stepped: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * values for positions and values mode
      * number pips for count mode
      */
    var values: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object PipsOptions {
    
    @scala.inline
    def apply(mode: range | steps | positions | count | values): PipsOptions = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipsOptions]
    }
    
    @scala.inline
    implicit class PipsOptionsMutableBuilder[Self <: PipsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
      
      @scala.inline
      def setFilter(value: /* repeated */ js.Any => PipFilterResult): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFormat(value: js.Object | (js.Function1[/* repeated */ js.Any, js.Any])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction1(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setMode(value: range | steps | positions | count | values): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepped(value: Boolean): Self = StObject.set(x, "stepped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSteppedUndefined: Self = StObject.set(x, "stepped", js.undefined)
      
      @scala.inline
      def setValues(value: Double | js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  /**
    * Update options that can not be updated will be ignored without errors.
    * The value null can be used to unset a previously set value.
    */
  /* Inlined std.Partial<nouislider.nouislider.Options> */
  trait UpdateOptions extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var behaviour: js.UndefOr[String] = js.undefined
    
    var connect: js.UndefOr[lower | upper | Boolean | js.Array[Boolean]] = js.undefined
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var format: js.UndefOr[js.Object | (js.Function1[/* repeated */ js.Any, js.Any])] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Double] = js.undefined
    
    var orientation: js.UndefOr[vertical | horizontal] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var pips: js.UndefOr[PipsOptions] = js.undefined
    
    var range: js.UndefOr[StringDictionary[Double | js.Array[Double]]] = js.undefined
    
    var snap: js.UndefOr[Boolean] = js.undefined
    
    var start: js.UndefOr[Double | (js.Array[js.Array[Double] | Double])] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var tooltips: js.UndefOr[Boolean | js.Object | (js.Function1[/* repeated */ js.Any, js.Any])] = js.undefined
  }
  object UpdateOptions {
    
    @scala.inline
    def apply(): UpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOptions]
    }
    
    @scala.inline
    implicit class UpdateOptionsMutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setBehaviour(value: String): Self = StObject.set(x, "behaviour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviourUndefined: Self = StObject.set(x, "behaviour", js.undefined)
      
      @scala.inline
      def setConnect(value: lower | upper | Boolean | js.Array[Boolean]): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      @scala.inline
      def setConnectVarargs(value: Boolean*): Self = StObject.set(x, "connect", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setFormat(value: js.Object | (js.Function1[/* repeated */ js.Any, js.Any])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction1(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPips(value: PipsOptions): Self = StObject.set(x, "pips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipsUndefined: Self = StObject.set(x, "pips", js.undefined)
      
      @scala.inline
      def setRange(value: StringDictionary[Double | js.Array[Double]]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setSnap(value: Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      @scala.inline
      def setStart(value: Double | (js.Array[js.Array[Double] | Double])): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStartVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setTooltips(value: Boolean | js.Object | (js.Function1[/* repeated */ js.Any, js.Any])): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipsFunction1(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "tooltips", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
    }
  }
  
  @js.native
  trait noUiSlider extends StObject {
    
    /**
      * Destroy's the slider.
      */
    def destroy(): Unit = js.native
    
    /**
      * To get the current slider value. For one-handle sliders, calling .get() will return the value.
      * For two-handle sliders, an array[value, value] will be returned.
      */
    def get(): String | js.Array[String] = js.native
    
    /**
      * Unbind event to the slider.
      */
    def off(eventName: String): Unit = js.native
    
    /**
      * Bind event to the slider.
      */
    def on(eventName: String, callback: Callback): Unit = js.native
    
    /**
      * Exposes the options used to create the noUiSlider instance
      */
    var options: Options = js.native
    
    /**
      * To return to the initial slider values, you can use the .reset() method. This will only reset the slider values.
      */
    def reset(): Unit = js.native
    
    def set(value: js.Array[Double | Null]): Unit = js.native
    /**
      * noUiSlider will keep your values within the slider range, which saves you a bunch of validation.
      * If you have configured the slider to use one handle, you can change the current value by passing
      * a number to the .set() method. If you have two handles, pass an array. One-handled sliders
      * will also accept arrays. Within an array, you can set one position to null
      * if you want to leave a handle unchanged.
      */
    def set(value: Double): Unit = js.native
    
    /**
      * `noUiSlider` has an update method that can change the `margin`,
      * `padding`, `limit`, `step`, `range`, `pips`, `tooltips`, `animate` and `snap` options.
      * All other options require changes to the slider's HTML or event bindings.
      * Options that can not be updated will be ignored without errors.
      * The value null can be used to unset a previously set value.
      * The `set` event fires when the slider values are restored.
      * If this is unwanted, you can pass false as the second parameter, `fireSetEvent`.
      * Note that if you initiate multiple sliders using the same options object
      * and update a subset of them later, this will move the options property out of sync
      * with the actual slider options.
      */
    def updateOptions(newOptions: UpdateOptions): Unit = js.native
    def updateOptions(newOptions: UpdateOptions, fireSetEvent: Boolean): Unit = js.native
  }
}
